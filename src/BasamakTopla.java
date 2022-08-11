import java.util.Scanner;
public class BasamakTopla {
    public static void main(String[] args) {
        int num,total=0,a=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Basamaklarinin Toplanmasini Istediginiz Sayi: ");
        num= input.nextInt();
        while(num !=0){
            total=total+ (num%10);
            num /= 10;
            ++a;
        }
        System.out.println("Basamaklarin Toplami: "+total);
    }
}

