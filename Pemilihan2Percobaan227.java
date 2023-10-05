import java.util.Scanner;

public class Pemilihan2Percobaan227 {
    
    public static void main (String[] args) {
        Scanner input27 = new Scanner (System.in);

        float totalSudut;

        System.out.println("Masukkan sudut1 :");
        float sudut1 =input27.nextFloat();
        System.out.println("Masukkan sudut2 :");
        float sudut2 =input27.nextFloat();
        System.out.println("Masukkan sudut3 :");
        float sudut3 =input27.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("total sudut yang dihasilkan : " + totalSudut);

        if (totalSudut == 180){
            if ((sudut1 == 90)  || (sudut2 == 90) || (sudut3 == 90))
            {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } 
            else if (sudut1 == 60 && sudut2 == 60 && sudut3 == 60)
            {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            }
            else if (sudut1 == sudut2 && sudut2 == sudut3 && sudut3 == sudut1)
            {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }
            else
            {
            System.out.println("Segitiga tersebut adalah sembarang");
            }
    }
    else
    {       
            System.out.println("Bukan Segitiga");
        }
    }
}
