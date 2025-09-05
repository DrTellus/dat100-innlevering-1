import java.util.Scanner;

public class O2b {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int elevnr = 1;

        for(; elevnr <= 10; elevnr++) {


            System.out.println("poengscore?");

            //  int poengscore = 0;
            int poengscore = scanner.nextInt();

            if (poengscore <= 39) {
                System.out.println("Karakter F");
            } else if (poengscore >= 40 && poengscore <= 49) {
                System.out.println("Karakter E");
            } else if (poengscore >= 50 && poengscore <= 59) {
                System.out.println("Karakter D");
            } else if (poengscore >= 60 && poengscore <= 79) {
                System.out.println("Karakter C");
            } else if (poengscore >= 80 && poengscore <= 89) {
                System.out.println("Karakter B");
            } else if (poengscore >= 90 && poengscore <= 100) {
                System.out.println("Karakter A");
            } else {
                System.out.println("Ugyldig");
            }


        }

    }


}