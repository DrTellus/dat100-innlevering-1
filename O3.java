import java.util.Scanner;


public class O3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si et tall mellom 1 og 52.");
        int tall = scanner.nextInt();
        scanner.close();

        int t =1;
        long produkt = 1;

        while (t <= tall) {
            produkt *= t;
            System.out.println(t + " ! = " + produkt);
            t++;
        }





    }
}