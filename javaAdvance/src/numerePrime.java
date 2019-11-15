import java.util.Scanner;
import java.util.*;

public class numerePrime {
    public static void main(String[] args) {

        System.out.println("Introduce a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        /*System.out.println("Introduce a divisor");
int i=scanner.nextInt();*/
        int i;
        for (i = 0; i < num; i++)
            if (num % i !=0) {
                System.out.println("The number is prime");
            } else {
                System.out.println("Is not  a prime number ");

            }


        /*asa cum este scris codul intoarce o exceptie; daca introduc eu divisorul-codul comentat mai sus ruleaza;
        ideal ar fi ca variabila num sa se imparta la toate numerele pozitive < decat ea insasi, iar daca  restul!=0 inseamna
        ca este nr. prim.
         */
    }


}