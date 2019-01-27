import java.util.Scanner;

public class InputOutput {

    Scanner sc = new Scanner(System.in);
    private boolean check = false;
    private int n = 0;
//    private boolean range = n >= 100 && n <= 200;
//    private boolean devide = n % 3 == 0;

    void loadNumber() {
        while (!check) {
            System.out.println("Podaj liczbę");
            n = sc.nextInt();
            if (n >= 100 && n <= 200 && n % 3 == 0) {
                okNumber();
                check = true;
            }
            if (n > 200) {
                tooMuch();
            }
            if (n < 100) {
                tooSmall();
            }
            if ((n >= 100 && n <= 200) && n % 3 != 0) {
                okRandeNotDevide();
            }
        }
    }

    void okNumber() {
        System.out.println("Twoja liczba jest ok");
    }

    void tooMuch() {
        System.out.println("Podana liczba jest za duża");
    }

    void tooSmall() {
        System.out.println("Podana liczba jest za mała");
    }

    void okRandeNotDevide() {
        System.out.println("Liczba nie jest podzielna przez 3");
    }


}
