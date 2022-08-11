import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        int taban, kuvvet, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci degerini giriniz : ");
        taban = input.nextInt();
        System.out.print("Ikinci degerini giriniz : ");
        kuvvet = input.nextInt();
        //kuvveti bu sekil yazmamın sebebi degerini kullanicinin girmesi
        for (; kuvvet != 0; --kuvvet) {
            sonuc *= taban;
        }
        System.out.println(sonuc);
    }
}