import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter fw = new FileWriter("C:/Users/Furkan/Desktop/data.txt");
        fw.write("1\n2\n3\n5\n7\n9");
        FileReader read = new FileReader("C:/Users/Furkan/Desktop/data.txt");
        int i;
        while ((i = read.read()) != -1) {
            System.out.print((char) i);
        }
        read.close();
        fw.close();
    }

    public String pokemon() {
        return """


                """;
    }
}
