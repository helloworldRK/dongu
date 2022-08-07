import java.util.Scanner;
public class KuvvetAlma {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("bir sayi giriniz");
        number = input.nextInt();

        System.out.println("Dordun Kuvvetleri; ");
        for (int i=1; i<=number; i*=4){
            System.out.println(i );
        }

        System.out.println("Besin Kuvvetleri; ");
        for (int i=1; i<=number; i*=5){
            System.out.println(i);
        }

    }
}