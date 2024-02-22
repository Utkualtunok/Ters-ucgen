import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Kullanıcı veri girişi
        System.out.print("Basamak sayısı giriniz : ");
        int n = inp.nextInt();
        //Ters üçgen döngüleri
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * i) - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}