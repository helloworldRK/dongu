import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1, s2, a, b = 1, ebob = 1, ekok;
        System.out.println("Birinci sayiniz : ");
        s1 = input.nextInt();
        System.out.println("Ikinci sayiniz : ");
        s2 = input.nextInt();
        if (s1 > s2)
            a = s1;
        else
            a = s2;
        while (b < a)

        {
            if ((s1 % b == 0) && (s2 % b == 0))
                ebob = b;
            b++;
        }
        ekok = (s1 * s2) / ebob;
        System.out.println("Iki sayinin ebobu : " + ebob + " ve Ekok : " + ekok);
    }
}
