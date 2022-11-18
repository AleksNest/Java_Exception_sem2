package Taskjson;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileService {
    HttpClient client = HttpClient.newBuilder().build();

    public Path downloadFile(String sourceUrl) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(new URI(sourceUrl))
                .GET()
                .build();
        String fileName = sourceUrl.substring(sourceUrl.lastIndexOf('/') + 1);  // поиск имени файла в URL адресе

        HttpResponse<InputStream> response = client
                .send(httpRequest, responseInfo ->
                        HttpResponse.BodySubscribers.ofInputStream());

        if (response.statusCode() != 200) {
            throw new RuntimeException(("Error of load file"));
        }

        Path targertPath = new File("src/main/resources/" + File.separator + fileName).toPath(); // путь куда будем сохранять файл

        Files.deleteIfExists(targertPath);


        Files.copy(response.body(), targertPath); // копирование файла (то что получил от запроса) - response.body()  в путь на диск

        return targertPath;

    }
}