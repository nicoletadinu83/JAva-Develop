package ex6_superscanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SuperScanner superScanner = new SuperScanner(System.in);

        String numeFiser = superScanner.getNumeFisier();
        String textDeScris = superScanner.getTextDeScris();
        superScanner.writeToFile("C:\\Users\\Niko\\Desktop\\Gabi.txt.txt", textDeScris);


        System.out.println(superScanner.readFromFile("C:\\Users\\Niko\\Desktop\\Gabi.txt.txt"));
    }
}
