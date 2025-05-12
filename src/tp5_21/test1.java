package tp5_21;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        File source = new File("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\image.jpg");
        File destination = new File("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\image_copy.jpg");

        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination);

        byte[] buffer = new byte[1024];
        int longueur;

        while ((longueur = in.read(buffer)) > 0) {
            out.write(buffer, 0, longueur);
        }

        in.close();
        out.close();

        System.out.println("Image copiée avec succès !");
    }
}
