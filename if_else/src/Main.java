public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            /*sayının 3'e ve 4'e aynı anda bölünüp bölünmediğini kontrol eder.
            eğer sayı her ikisine de bölünüyorsa hem 3'ün hemde 4'ün katıdır yazacak.
             */
            if (i%3==0 && i%4==0){
                System.out.println(i+" sayısı hem 3'ün hemde 4'ün katıdır.");
            /*sayının yalnız 3'e bölünüp bölünmediğini kontrol eder.
            eğer sayı 3'e bölünüyorsa hem 3'ün katıdır yazacak.
             */
            } else if (i%3==0) {
                System.out.println(i+" sayısı 3'ün katıdır.");
            /*sayının yalnız 4'e bölünüp bölünmediğini kontrol eder.
            eğer sayı 4'e bölünüyorsa hem 4'ün katıdır yazacak.
             */
            } else if (i%4==0) {
                System.out.println(i+" sayısı 4'ün katıdır.");

            }
        }
    }




}