import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, number;
        number = input.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number+"Mukemmel sayi");
        }
        else {
            System.out.println(number+ "Mukemmel sayi degil");
        }
    }
}
