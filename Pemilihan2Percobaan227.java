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
            if ((sudut1 == 90)  || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");} 
            else{
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");}
            }
            else
            {System.out.println("Bukan Segitiga");}
        }
    }