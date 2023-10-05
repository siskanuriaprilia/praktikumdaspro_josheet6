import java.util.Scanner;

public class Pemilihan2Percobaan227 {
    
    public static void main (String[] args) {
        Scanner input27 = new Scanner (System.in);
        
        System.out.println("Masukkan sudut1 == 90");
        System.out.println("Masukkan sudut2 == 90");
        System.out.println("Masukkan sudut3 == 90");

        totalSudut = sudut1 + sudut2 + sudut3;
        
        if (totalSudut == 180) {
            if ((sudut1 == 90)) ||(sudut2 == 90) || (sudut3 == 90) 
               System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
               System.out.println("Segitiga tersebut adalah bukan siku-siku");
        }else
            System.out.println("Bukan Segitiga");
}
}