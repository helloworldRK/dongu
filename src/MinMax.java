public class MinMax {
    public static void main(String[] args) {
        /*
       Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
       bu sayıları ekrana yazan programı yazın.
        */
        Scanner input= new Scanner(System.in);
        System.out.print(" Kac adet sayi gireceksiniz : ");
        int count = input.nextInt();
        int max = 1 , min = 1 ;
        for(int i = 0 ; i <= count ; i++){
            System.out.print(i + ". sayiyi giriniz : ");
            int number= input.nextInt();
            if( (i == 1) & (i==0)){
                max = number ;
                min = number ;
            }
            if(number > max){
                max = number;
            }
            else if(number < min){
                min = number ;
            }
        }
        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);
    }

}
