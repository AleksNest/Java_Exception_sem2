import Taskjson.Books;
import Taskjson.FileService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Taskjson {

    public static <AbstractStringBuilder> void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        if (args.length != 1) {
            throw new RuntimeException("not find Path to file");
        }

        FileService service = new FileService();
        String url = args[0];

        Path downloadedFile;

        try {
            downloadedFile = service.downloadFile(url);
            ObjectMapper objectMapper = new ObjectMapper();
            List<Books> myObjects = Arrays.asList(objectMapper.readValue(Paths.get(downloadedFile.toUri()).toFile(), Books[].class));
            System.out.println("\n Data of Books.json:");
            //System.out.println(myObjects);
            for (Books data : myObjects) {
                System.out.println(data);
            }
        } catch (Exception e) {
            throw new RuntimeException("error of load file");
        }
    }
}


