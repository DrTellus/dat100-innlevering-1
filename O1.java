import java.util.Scanner;

public class O1 { //forsøk to
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hva er bruttolønn? ");
        int brutto = scanner.nextInt();
//Henter inn data fra bruker og kaller den brutto
        //Her tar vi først vekk nullsktattetrinnet
        if (brutto <= 217_400) {
            System.out.println("Ingen trinnskatt.");
            scanner.close();
            return;//Lukker for-loopen
        }

        // grenser og satser for 2025
        final int g1 = 217_400, g2 = 306_050, g3 = 697_150, g4 = 942_400, g5 = 1_410_750;//Grenser
        final double s1 = 0.017, s2 = 0.040, s3 = 0.137, s4 = 0.167, s5 = 0.177;//satser

        // andel i hvert trinn (klipp med min/max)
        //0 Foran slik at alle tallene går oppover
        //Trekker minste fra største tall for å finne diff.
        int a1 = Math.max(0, Math.min(brutto, g2) - g1);
        int a2 = Math.max(0, Math.min(brutto, g3) - g2);
        int a3 = Math.max(0, Math.min(brutto, g4) - g3);
        int a4 = Math.max(0, Math.min(brutto, g5) - g4);
        int a5 = Math.max(0, brutto - g5);// Siste grunnbeløp

        double t1 = a1 * s1;//Ganger minste diff på nederste trinn med laveste prosentsats.
        double t2 = a2 * s2;// OSV
        double t3 = a3 * s3;
        double t4 = a4 * s4;
        double t5 = a5 * s5;

        double trinnskatt = t1 + t2 + t3 + t4 + t5;//Resultatene av de 5 trinnene.

        //Bruker printf for å effektivt kunne bruke formatering inne i parentesen.
        System.out.printf("Du skal betale %.2f kr i trinnskatt.%n", trinnskatt);
        scanner.close();//Lett å glemme denne
    }
}