
package hexlet.code.utils;

import hexlet.code.model.Url;
import hexlet.code.repository.CheckRepository;

import java.sql.Timestamp;
import java.util.NoSuchElementException;
import java.util.Optional;

public class UrlService {
    public static Optional<Integer> getStatusCode(Url url)  {
        if (CheckRepository.findExisting(url.getId())) {
            var list = CheckRepository.find(Math.toIntExact(url.getId()));
            return Optional.of(list.get(list.size() - 1).getStatusCode());
        }
        return Optional.empty();
    }
    public static Optional<Timestamp> getCheckCreatedAt(Url url) {
        if (CheckRepository.findExisting(url.getId())) {
            var list = CheckRepository.find(Math.toIntExact(url.getId()));
            if (!list.isEmpty()) {
                return Optional.of(list.get(list.size() - 1).getCreatedAt());
            }
        }
        return Optional.empty();
    }

    public static String getCreateAt(Url url) {
        if (getCheckCreatedAt(url).isPresent()) {
            return FormattedTime.formattedTime(UrlService.getCheckCreatedAt(url).orElseThrow(()
                    -> new NoSuchElementException("Created_at element not found!")));
        }
        return null;
    }

    public static Integer getStatus(Url url) {
        if (getStatusCode(url).isPresent()) {
            return getStatusCode(url).orElseThrow(()
                    -> new NoSuchElementException("Status element not found!"));
        }
        return null;
    }
}
