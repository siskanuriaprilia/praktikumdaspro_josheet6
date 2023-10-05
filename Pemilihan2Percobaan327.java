import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pemilihan2Percobaan327 {

    public static void main (String[] args) {
        Scanner input27 = new Scanner (System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan kategori : ");
        kategori = noAbsen.nextLine();
        System.out.println("Masukkan Besanya Penghasilan : ");
        penghasilan = noAbsen.nextLine();

        if (kategori.equalsIgnoreCase("pekerjaan")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
             System.out.println("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis"));
            if  (penghasilan <= 2500000) 
                 pajak = 0.15;
            else if (penghasilan <= 3500000)
                 pajak = 0.2;
            else 
                 pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih : " + gajiBersih);
    }else
            System.out.println("Masukkan Kategori Salah ");
        }

}
