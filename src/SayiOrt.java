import java.util.Scanner;
public class SayiOrt {
    public static void main(String[] args) {
/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
        int sayi,total=0,r,i=0;
        double ort=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        r= inp.nextInt();
        for(sayi=0; sayi<=r; sayi++) {
            if ((sayi % 3 == 0) & sayi % 4 == 0) {
                total = total + sayi;
                i++;
            }
        }
          ort= total/i;
            System.out.println(" 3 ve 4' bolunebilen sayilarin ortalamasi:  "+ort);



    }
}
