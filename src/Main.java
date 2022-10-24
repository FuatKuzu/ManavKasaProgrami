import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float kg, topTutar, armut = 2.14f, elma = 3.67f,
                domates = 1.11f, muz = 0.95f ,patlican = 5.00f,
                alinanArm, alinanEl, alinanDom, alinanMuz, alinanPatl;

        Scanner inp = new Scanner(System.in);
            System.out.println("Kaç kilo armut aldınız? ");
            kg = inp.nextFloat();
            alinanArm= kg*armut;

            System.out.println("Kaç kilo elma aldınız? ");
            kg = inp.nextFloat();
            alinanEl=kg*elma;

            System.out.println("Kaç kilo domates aldınız? ");
            kg = inp.nextFloat();
            alinanDom=kg*domates;

            System.out.println("Kaç kilo muz aldınız? ");
            kg = inp.nextFloat();
            alinanMuz=kg*muz;

            System.out.println("Kaç kilo patlıcan aldınız? ");
            kg = inp.nextFloat();
            alinanPatl=kg*patlican;

        topTutar = alinanEl+alinanDom+alinanMuz+alinanPatl+alinanArm;
        System.out.println("Toplam tutar:5 "+topTutar);

    }
}