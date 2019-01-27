import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.println("Podaj liczbę");
            n = sc.nextInt();
            if ((n >= 100 && n <= 200) && n % 3 == 0) {
                System.out.println("Twoja liczba jest ok");
                check = true;
            }
            if (n > 200) {
                System.out.println("Podana liczba jest za duża");
            }
            if (n < 100) {
                System.out.println("Podana liczba jest za mała");
            }
            if ((n >= 100 && n <= 200) && n % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        }
    }
}
