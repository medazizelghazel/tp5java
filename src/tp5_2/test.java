package tp5_2;
import java.io.*;
public class test {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\in.txt");
	    File outputFile = new File("C:\\Users\\LENOVO\\Desktop\\iset s2\\java\\out.txt");

	    FileReader in = new FileReader(inputFile);
	    FileWriter out = new FileWriter(outputFile);

	    int c;
	    while ((c = in.read()) != -1) {
	    	out.write(c);
	    }
	    in.close();
	    out.close();
	}
}