import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, ortalama, artis = 0, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        a = input.nextInt();

        for (int i = 0; i <= a; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                artis++;
            }
        }

        ortalama = toplam / artis;
        System.out.println(ortalama);
    }
}