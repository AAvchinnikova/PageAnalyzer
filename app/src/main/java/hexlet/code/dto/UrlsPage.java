
package hexlet.code.dto;

import hexlet.code.model.Url;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UrlsPage extends BasePage {
    private List<Url> urls;
}
