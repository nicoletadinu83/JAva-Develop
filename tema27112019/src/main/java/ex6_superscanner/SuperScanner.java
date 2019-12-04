package ex6_superscanner;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

import java.io.*;

public class SuperScanner implements Scanner {
    private String numeFisier;
    private String textDeScris;

    public Symbol next_token() throws Exception {
        return null;
    }

    public SuperScanner(InputStream in) {
        this.numeFisier = numeFisier;
        this.textDeScris = textDeScris;
    }

    public String getNumeFisier() {
        return numeFisier;
    }

    public void setNumeFisier(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public String getTextDeScris() {
        return textDeScris;
    }

    public void setTextDeScris(String textDeScris) {
        this.textDeScris = textDeScris;
    }

    public void writeToFile(String numeFisier, String textDeScris) throws IOException {
        File file1 = new File("C:\\Users\\Niko\\Desktop\\Gabi.txt.txt");
        FileWriter fileWriter = new FileWriter(file1, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("     /n  Textul acesta ar trebui introdus de la tastatura?");
        bufferedWriter.write("Sa vedem cum se scrie o noua linie");
        bufferedWriter.flush();
    }

    public  String readFromFile(String numeFisier) throws IOException {
        File file = new File("C:\\Users\\Niko\\Desktop\\Gabi.txt.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        return line;
    }
}



