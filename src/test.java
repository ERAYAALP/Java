import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        int mat,fiz,kim,turk,tar,muz;
        int ort;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik ders notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.println("Fizik ders notunuzu giriniz: ");
        fiz=input.nextInt();
        System.out.println("Kimya ders notunuzu giriniz: ");
        kim=input.nextInt();
        System.out.println("Türkçe ders notunuzu giriniz: ");
        turk= input.nextInt();
        System.out.println("Tarih ders notunuzu giriniz: ");
        tar=input.nextInt();
        System.out.println("Müzik ders notunuzu giriniz: ");
        muz=input.nextInt();
        ort=(mat+fiz+kim+turk+tar+muz)/6;
        System.out.println("Ders notlarınızın ortalaması: "+ort);
        String kosul = (ort>=60)? "Geçtiniz.":"Kaldınız";
        System.out.println(kosul);

    }
}
