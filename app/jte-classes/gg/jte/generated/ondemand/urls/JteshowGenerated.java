package gg.jte.generated.ondemand.urls;
import hexlet.code.dto.UrlPage;
import hexlet.code.utils.FormattedTime;
import hexlet.code.utils.NamedRoutes;
public final class JteshowGenerated {
	public static final String JTE_NAME = "urls/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,6,6,11,11,15,15,15,22,22,22,30,30,30,38,38,38,45,45,45,45,45,45,45,45,45,49,49,73,73,77,77,77,80,80,80,83,83,83,86,86,86,89,89,89,92,92,92,96,96,98,98,102,102,102,102,106,106,106,106,106,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UrlPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <body class=\"d-flex flex-column min-vh-100\">\n    <main class=\"flex-grow-1\">\n        <div class=\"mx-auto p-4 py-md-5\">\n            <h1>Сайт: ");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getUrl().getName());
				jteOutput.writeContent("</h1>\n            <table class=\"table table-bordered table-hover mt-3\">\n                <tr>\n                    <td>\n                        ID\n                    </td>\n                    <td>\n                        ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUrl().getId());
				jteOutput.writeContent("\n                    </td>\n                </tr>\n                <tr>\n                    <td>\n                        Имя\n                    </td>\n                    <td>\n                        ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUrl().getName());
				jteOutput.writeContent("\n                    </td>\n                </tr>\n                <tr>\n                    <td>\n                        Дата создания\n                    </td>\n                    <td>\n                        ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(FormattedTime.formattedTime(page.getUrl().getCreatedAt()));
				jteOutput.writeContent("\n                    </td>\n                </tr>\n            </table>\n            <br>\n            <h2>Проверки</h2>\n\n            <form");
				var __jte_html_attribute_0 = NamedRoutes.checkPath(page.getUrl().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\n                <button type=\"submit\" class=\"btn btn-primary\">Проверить</button>\n            </form>\n\n            ");
				if (page.getUrlChecks() != null) {
					jteOutput.writeContent("\n                <table class=\"table table-bordered table-hover mt-3\">\n                    <thead>\n                    <tr>\n                        <td>\n                            ID\n                        </td>\n                        <td>\n                            Код ответа\n                        </td>\n                        <td>\n                            Title\n                        </td>\n                        <td>\n                            H1\n                        </td>\n                        <td>\n                            Description\n                        </td>\n                        <td>\n                            Дата проверки\n                        </td>\n                    </tr>\n                    </thead>\n                    ");
					for (var singlePage : page.getUrlChecks()) {
						jteOutput.writeContent("\n                        <tbody>\n                        <tr>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getUrlId());
						jteOutput.writeContent("\n                            </td>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getStatusCode());
						jteOutput.writeContent("\n                            </td>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getTitle());
						jteOutput.writeContent("\n                            </td>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getH1());
						jteOutput.writeContent("\n                            </td>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getDescription());
						jteOutput.writeContent("\n                            </td>\n                            <td>\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(FormattedTime.formattedTime(singlePage.getCreatedAt()));
						jteOutput.writeContent("\n                            </td>\n                        </tr>\n                        </tbody>\n                    ");
					}
					jteOutput.writeContent("\n                </table>\n            ");
				}
				jteOutput.writeContent("\n        </div>\n    </main>\n    </body>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"footer\">\n        <p>Thanks for visiting, come again soon!</p>\n    </div>\n");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UrlPage page = (UrlPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
