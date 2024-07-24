package gg.jte.generated.ondemand.urls;
import hexlet.code.dto.UrlsPage;
import hexlet.code.utils.UrlService;
import hexlet.code.utils.NamedRoutes;
import hexlet.code.utils.FormattedTime;
import java.util.NoSuchElementException;
public final class JteindexGenerated {
	public static final String JTE_NAME = "urls/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,5,5,8,8,13,13,17,17,17,19,19,21,21,40,40,44,44,44,47,47,47,47,47,47,47,47,47,47,47,47,50,50,51,52,52,52,53,53,57,57,58,59,59,59,60,60,64,64,66,66,69,69,69,69,73,73,73,73,73,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UrlsPage page) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"mx-auto p-4 py-md-5\">\n        <main>\n\n            <h2>");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent("Сайты");
				jteOutput.writeContent("</h2>\n\n            ");
				if (page.getUrls().isEmpty()) {
					jteOutput.writeContent("\n                <p>Пока не добавлено ни одного сайта!</p>\n            ");
				} else {
					jteOutput.writeContent("\n\n                <table class=\"table table-striped\">\n                    <thead>\n                    <tr>\n                        <td>\n                            ID\n                        </td>\n                        <td>\n                            Имя\n                        </td>\n                        <td>\n                            Последняя проверка\n                        </td>\n                        <td>\n                            Код ответа\n                        </td>\n                    </tr>\n                    </thead>\n                    ");
					for (var url : page.getUrls()) {
						jteOutput.writeContent("\n                        <tbody>\n                        <tr>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(url.getId());
						jteOutput.writeContent("\n                            </td>\n                            <td>\n                                <a");
						var __jte_html_attribute_0 = NamedRoutes.urlPath(url.getId());
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(url.getName());
						jteOutput.writeContent(" </a>\n                            </td>\n                            <td>\n                                ");
						if (UrlService.getCheckCreatedAt(url).isPresent()) {
							jteOutput.writeContent("\n                                    ");
							jteOutput.setContext("td", null);
							jteOutput.writeUserContent(FormattedTime.formattedTime(UrlService.getCheckCreatedAt(url).orElseThrow(()
                                     -> new NoSuchElementException("Created_at element not found!"))));
							jteOutput.writeContent("\n                                ");
						}
						jteOutput.writeContent("\n\n                            </td>\n                            <td>\n                                ");
						if (UrlService.getStatusCode(url).isPresent()) {
							jteOutput.writeContent("\n                                    ");
							jteOutput.setContext("td", null);
							jteOutput.writeUserContent(UrlService.getStatusCode(url).orElseThrow(()
                                         -> new NoSuchElementException("Status element not found!")));
							jteOutput.writeContent("\n                                ");
						}
						jteOutput.writeContent("\n                            </td>\n                        </tr>\n                        </tbody>\n                    ");
					}
					jteOutput.writeContent("\n                </table>\n            ");
				}
				jteOutput.writeContent("\n        </main>\n    </div>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"footer\">\n        <p>Thanks for visiting, come again soon!</p>\n    </div>\n");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UrlsPage page = (UrlsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
