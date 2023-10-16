import java.util.Scanner;

public class PemilihanPercobaan205 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input05 = new Scanner(System.in);
        //Masukkan inputan
        System.out.print("Nilai uas       : ");
        float uas = input05.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input05.nextFloat(); 
        System.out.print(" Nilai kuis   : ");
        float kuis = input05.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input05.nextFloat();

        //nilai akhir
         float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

         String grade = "";
         if (total > 100 || total < 0 ) {
            grade = "Nilai Tidak Valid";
         } else if ( total > 80 ){
            grade = "A (4.0)";
            grade += "(Sangat Baik)"; 
         } else if ( total > 73){
            grade = "B+ (3.5)";
            grade += "(Lebih dari Baik)";
         } else if ( total > 65){
            grade = "B (3.0)";
            grade += "Baik";
         }else if ( total > 60){
            grade = "C+ (2.5)";
            grade += "Lebih dari Cukup";
         } else if ( total > 50){
            grade = "C (2.0)";
            grade += "Cukup";
         } else if ( total > 39){
            grade = "D (1.0 )";
            grade += "Kurang";
         } else if ( total < 39 ){
            grade = "E (0)";
            grade += "Gagal";
         }

         System.out.println("Nilai akhir = " + total);
         System.out.println("Nilai huruf = " + grade);

         // String message = total < 65 ? "Remidi" : "Tidak remidi";

        // System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
    
}
