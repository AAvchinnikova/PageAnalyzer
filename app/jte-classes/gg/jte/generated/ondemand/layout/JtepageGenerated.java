package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
import hexlet.code.dto.BasePage;
import hexlet.code.utils.NamedRoutes;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,33,33,34,34,34,34,35,35,35,37,37,39,39,39,44,44,44,47,47,47,4,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Content footer, BasePage page) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"\">\n<head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <title>Анализатор страниц</title>\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n</head>\n\n<body class=\"d-flex flex-column min-vh-100\">\n<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n    <div class=\"container-fluid\">\n        <a class=\"navbar-brand\" href=\"/\">Анализатор страниц</a>\n        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n            <div class=\"navbar-nav\">\n                <a class=\"nav-link\"");
		var __jte_html_attribute_0 = NamedRoutes.rootPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">Главная</a>\n                <a class=\"nav-link\"");
		var __jte_html_attribute_1 = NamedRoutes.urlsPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">Сайты</a>\n            </div>\n        </div>\n    </div>\n</nav>\n</body>\n<main>\n\n    ");
		if (page != null && page.getFlash() != null) {
			jteOutput.writeContent("\n        <div class=\"alert alert-");
			jteOutput.setContext("div", "class");
			jteOutput.writeUserContent(page.getFlashType());
			jteOutput.setContext("div", null);
			jteOutput.writeContent("\" role=\"alert\">\n            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(page.getFlash());
			jteOutput.writeContent("\n        </div>\n    ");
		}
		jteOutput.writeContent("\n\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n\n</main>\n<footer class=\"text-center text-lg-start bg-light text-muted fixed-bottom\">\n    <div class=\"text-center p-4\" style=\"background-color: rgba(0, 0, 0, 0.05);\">\n        ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(footer);
		jteOutput.writeContent("\n    </div>\n</footer>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.getOrDefault("content", null);
		Content footer = (Content)params.getOrDefault("footer", null);
		BasePage page = (BasePage)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, content, footer, page);
	}
}
