import java.util.Scanner;

/**
 * PemilihanPercobaan305
 */
public class PemilihanPercobaan305 {

    public static void main(String[] args) {
        
        //Deklarasi Variabel
        double angka1, angka2, hasil;
        char operator;
        
        //Perintah Inputan
        Scanner input05 = new Scanner(System.in);
        System.out.println("Masukkan angka pertama");
        angka1 = input05.nextDouble();
        System.out.println("Masukkan Angka Kedua");
        angka2 = input05.nextDouble();
        System.out.println("Masukkan operator (+-*/): ");
        operator = input05.next().charAt(0);
        

        switch (operator) 
            {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
            default:
            System.out.println("Operator tidak valid");  
             
            }
    }
}