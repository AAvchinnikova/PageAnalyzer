@import hexlet.code.dto.UrlsPage
@import hexlet.code.utils.UrlService
@import hexlet.code.utils.NamedRoutes
@import hexlet.code.utils.FormattedTime
@import java.util.NoSuchElementException
@param UrlsPage page


@template.layout.page(
page = page,
content  = @`
    <div class="mx-auto p-4 py-md-5">
        <main>

            <h2>${"Сайты"}</h2>

            @if(page.getUrls().isEmpty())
                <p>Пока не добавлено ни одного сайта!</p>
            @else

                <table class="table table-striped">
                    <thead>
                    <tr>
                        <td>
                            ID
                        </td>
                        <td>
                            Имя
                        </td>
                        <td>
                            Последняя проверка
                        </td>
                        <td>
                            Код ответа
                        </td>
                    </tr>
                    </thead>
                    @for(var url : page.getUrls())
                        <tbody>
                        <tr>
                            <td>
                                ${url.getId()}
                            </td>
                            <td>
                                <a href="${NamedRoutes.urlPath(url.getId())}">${url.getName()} </a>
                            </td>
                            <td>
                                ${UrlService.getCreateAt(url)}
                            </td>
                            <td>
                                ${UrlService.getStatus(url)}
                            </td>
                        </tr>
                        </tbody>
                    @endfor
                </table>
            @endif
        </main>
    </div>
`
,
footer = @`
    <div class="footer">
        <p>Thanks for visiting, come again soon!</p>
    </div>
`
)