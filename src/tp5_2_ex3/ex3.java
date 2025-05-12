package tp5_2_ex3;

import java.io.*;
import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\in.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        int nbLignes = 0;
        int nbMots = 0;
        int nbCaracteres = 0;

        String ligne;

        while ((ligne = br.readLine()) != null) {
            nbLignes++;

            nbCaracteres += ligne.length();

            StringTokenizer tokenizer = new StringTokenizer(ligne);
            nbMots += tokenizer.countTokens();
        }	

        br.close();

        System.out.println("Nombre de lignes      : " + nbLignes);
        System.out.println("Nombre de mots        : " + nbMots);
        System.out.println("Nombre de caractères  : " + nbCaracteres);
    }
}
