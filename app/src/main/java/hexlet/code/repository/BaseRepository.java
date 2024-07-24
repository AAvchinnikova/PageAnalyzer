package hexlet.code.repository;

import com.zaxxer.hikari.HikariDataSource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BaseRepository {
    public static HikariDataSource dataSource;
}
