package hexlet.code.repository;

import hexlet.code.model.UrlCheck;
import hexlet.code.utils.FormattedTime;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CheckRepository extends BaseRepository {
    public static void saveCheck(UrlCheck urlCheck) throws SQLException {
        String sql = "INSERT INTO url_checks (url_id, status_code, title, h1, description, created_at) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try (var conn = dataSource.getConnection();
             var preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            var currentTime = FormattedTime.currentTime();
            Integer statusCode = urlCheck.getStatusCode();

            preparedStatement.setLong(1, urlCheck.getUrlId());
            preparedStatement.setInt(2, statusCode);
            preparedStatement.setString(3, urlCheck.getTitle());
            preparedStatement.setString(4, urlCheck.getH1());
            preparedStatement.setString(5, urlCheck.getDescription());
            preparedStatement.setTimestamp(6, currentTime);

            preparedStatement.executeUpdate();
            var generatedKeys = preparedStatement.getGeneratedKeys();
            // Устанавливаем ID в сохраненную сущность
            if (generatedKeys.next()) {
                urlCheck.setId(generatedKeys.getLong(1));
            } else {
                throw new SQLException("DB have not returned an id after saving an entity");
            }
        }
    }

    public static List<UrlCheck> find(Integer inputUrlId) {
        var sql = "SELECT * FROM url_checks WHERE url_id = ?";
        try (var conn = dataSource.getConnection();
             var stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, inputUrlId);
            var resultSet = stmt.executeQuery();
            var result = new ArrayList<UrlCheck>();
            while (resultSet.next()) {
                var id = resultSet.getLong("id");
                Long urlId = (long) resultSet.getInt("url_id");
                var statusCode = resultSet.getInt("status_code");
                var title = resultSet.getString("title");
                var h1 = resultSet.getString("h1");
                var description = resultSet.getString("description");

                UrlCheck urlCheck = new UrlCheck(id, statusCode, title, h1, description, urlId);
                urlCheck.setCreatedAt(resultSet.getTimestamp("created_at"));
                result.add(urlCheck);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    public static boolean findExisting(Long urlId) {
        var sql = "SELECT * FROM url_checks WHERE url_id = ?";
        try (var conn = dataSource.getConnection();
             var stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, Math.toIntExact(urlId));
            var resultSet = stmt.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
