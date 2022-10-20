import java.io.*;
import java.util.Scanner;

public class FileCreator2 {
    public static void main(String[] args)  {
        String fileName = "testfile.txt";

        FileReader fileReader = null;
        BufferedReader reader = null;

        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);

            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) !=null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Liczba wierszy w pliku "+ lines);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader !=null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
