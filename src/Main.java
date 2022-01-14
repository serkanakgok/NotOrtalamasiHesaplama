import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = not.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = not.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = not.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = not.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tar = not.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = not.nextInt();

        double ortalama = (mat+fiz+kim+tur+tar
        +muz) /6.0;

        System.out.println();
        //ortalama 60'a eşit ya da büyükse
        System.out.println(ortalama>=60 ? "Sınıfı geçtiniz, ortalamanız: "+ortalama : "Sınıfta kaldınız, ortalamanız: "+ortalama);
    }
}