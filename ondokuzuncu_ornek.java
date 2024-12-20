package JAVA101;
import java.util.Scanner;
public class ondokuzuncu_ornek {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);

        System.out.println("sınır değerini giriniz: ");
        n = input.nextInt();

        for (int i = 1;i<=n;i*=4){
                System.out.println("4ün katları: "+i);
            }
        for (int j = 1;j<=n;j*=5){
            System.out.println("5in katları: "+j);
        }
    }
}
