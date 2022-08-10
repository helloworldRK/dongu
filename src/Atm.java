import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String user, pass;
        Scanner input = new Scanner(System.in);
        int right = 3, total = 1500, select;
        if (right > 0) {
            System.out.print("Kullanici Adiniz :");
            user = input.nextLine();
            System.out.print("Parolaniz : ");
            pass = input.nextLine();
            System.out.println("Para yatirma 1, " + "\nPara  cekme 2,\nBakiye sorgulama 3,\n Cikis 4 .");
            if (user.equals("rabia") && pass.equals("123")) {
                System.out.print("Bankamiza hosgeldin.");
                System.out.print("Lutfen islem seciniz : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Para miktari: ");
                        int b = input.nextInt();
                        total += b;
                        System.out.print("Bakiyeniz " + total);
                        break;
                    case 2:
                        System.out.println("Çekme istediğiniz tutar: ");
                        int h = input.nextInt();
                        if (h > total) {
                            System.out.println("Yetersiz bakiye");
                            break;
                        } else {
                            total -= h;
                            System.out.println("Bakiyeniz: " + total);
                        }
                        break;

                    case 3:
                        System.out.println("Mevcut Bakiyeniz: " + total);
                        break;
                    case 4:
                        System.out.println("Cikis yaptiniz iyi günler...");
                        break;
                }

            } else {
                right--;
                System.out.println("Kalan hakkiniz:" + right);
            }
            if (right == 0) {
                System.out.println("Hesabiniz bloke oldu.Bankanizi arayiniz.");
            }
        }
    }
}


