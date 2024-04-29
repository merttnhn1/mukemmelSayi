public class Main {

  public static void main(String[] args) {

    /* Mükemmel sayı mı değil mi ?
     * Mükemmel sayı: kendisi dışında tam bölenlerinin toplamına eşit olan sayılardır.
     *  ör: 6=3+2+1 mükemmel sayıdır.*/
    int number = 28;
    int mukemmel = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        mukemmel = i + mukemmel;

      }

    }

    if (mukemmel == number) {
      System.out.println("Sayı mükemmel sayıdır.");
    } else {
      System.out.println("Sayı mükemmel sayı değildir.");
    }

  }

}