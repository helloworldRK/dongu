import java.util.Scanner;
public class TekSayiTop {
    public static void main(String[] args) {
        int sayi = 0, tot = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bir Sayi Giriniz: ");
            sayi = input.nextInt();
            if (sayi % 2 != 0) {
            tot+=sayi;
            }
        } while (sayi > 0) ;
        System.out.println("tek sayilarin toplami: "+tot);

    }
}

