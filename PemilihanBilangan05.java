import java.util.Scanner; 
/**
 * PemilihanBilangan05
 */
public class PemilihanBilangan05 {

    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan sebuah angka");
        int angka = sc.nextInt();

        // Menggunakan ternary operator 
String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
System.out.println("Angka " + angka + " termasuk bilangan " + jenisBilangan);


        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + "termasuk bilangan genap");
        }
        else 
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }

        
    }
}