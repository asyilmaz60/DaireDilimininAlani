import java.util.Scanner;

public class daire {

    public static void main(String[] args) {
        int aci, yaricap;
        double pi = 3.14, alan, cevre, aciHesaplama;
        /*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360    */  

        Scanner input = new Scanner(System.in);
        System.out.println("açı giriniz: ");
        aci = input.nextInt();

        System.out.println("yarı çap giriniz: ");
        yaricap = input.nextInt();

        alan = pi * yaricap* yaricap;

        cevre = 2 * pi * yaricap;

        aciHesaplama = (pi * (yaricap*yaricap) * aci)/360;

        System.out.println("dairenin alanı: "+ alan);
        System.out.println("dairenin çevresi: "+ cevre);
        //System.out.println("daire diliminin alanı: "+ aciHesaplama);
        



    }
}