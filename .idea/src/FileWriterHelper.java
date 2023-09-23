import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHelper {
    public static void writeToFile(ToyStore store, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                String id = store.get();
                if (id != null) {
                    writer.write(id);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
