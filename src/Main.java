import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vücut Kitle İndeksi Hesaplama Aracı");
        double kg, m;

        Scanner imput = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz : ");
        m = imput.nextDouble();
        System.out.print("Kilonuzu Giriniz : ");
        kg = imput.nextDouble();

        double vki = ((kg / (m * m)));
        System.out.printf("Vücut Kitle Endeksiniz : " + "%.2f\n",vki);

        if (vki<=15){ System.out.println("Çok ciddi derecede kilonuz düşüktür.");
        }
        else if (15<vki&&vki <=16){
            System.out.println("Ciddi derecede kilonuz düşüktür. ");
        }
        else if (16<vki&&vki<=18.5){
            System.out.println("Kilonuz düşüktür.");
        }
        else if (18.5<vki&&vki<=25) {
            System.out.println("Tebrikler.");
            System.out.println("İdeal kilo aralığındasınız.");
        }
        else if ((25<vki)&&(vki<=30)) {
            System.out.println("Kilonuz fazladır.");}
        else if ((30<vki)&&(vki<=35)){
            System.out.println("1.derecede (hafif) obezsiniz");
        }
        else if ((35<vki)&&(vki<=40)){
            System.out.println("2.derecede (ciddi) obezsiniz");
        }
        else if ((40<vki)){
            System.out.println("3.derecede (çok ciddi) obezsiniz");
        }
        else {
            System.out.println("Hatalı bir değer girdiniz.");
        }

        System.out.print("Erkeklerde ideal vücut kitle indeksi 20-25 aralığıdır.\n" + "Kadınlarda ideal vücut kitle indeksi 19-24 aralığıdır.");


    }
}