package Day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataProvider implements DataProvider{
    @Override
    public String getData() {
        try {
            return new String(Files.readAllBytes(Paths.get("src/data.txt")));
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Błąd: " + e.getMessage());
        }

        return "Błędne dane!";

    }
}
