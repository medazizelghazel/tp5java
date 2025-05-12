package tp5_2_ex4;
import java.io.*;

public class ex4 {

    public static void cryptage(String cheminSource, String cheminDestination) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\in.txt");
        FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\out.txt");

        int caractere;
        while ((caractere = reader.read()) != -1) {
            writer.write(caractere + 1); 
        }
        
        reader.close();
        writer.close();

        System.out.println("Cryptage terminé avec succès !");
    }

    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\Users.txt";
        String destination = "C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\Users_cryptes.txt";

        cryptage(source, destination);
    }
}
