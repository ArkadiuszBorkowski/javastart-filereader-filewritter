import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testfile.txt";

        try (
            var fileWriter  = new FileWriter(fileName, true);   //jeśli dopisujemy flage true to nadpisujemy
            var writer = new BufferedWriter(fileWriter);
        ){
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
            // writer.close();  //lub flush() jesli dodajemy try with resources czyli z nawisami to nei trzeba zamykac
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
