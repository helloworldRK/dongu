import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner inp = new Scanner(System.in);
        int n,r,sonuc=0;
        int x=1,y=1,z=1;
        System.out.print("Birinci degerini giriniz : ");
        n = inp.nextInt();
        System.out.print("Ikinci degerini giriniz : ");
        r = inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            x*=i;
        }
        for(int i=1;i<=r;i++)
        {
            y*=i;
        }
        for(int i=1;i<=(n-r);i++)
        {
            z*=i;
        }
        sonuc=(x/(y*z));
        System.out.print("Kombinasyonu : "+sonuc);
    }
}
