package Github;

import java.util.Scanner;

public class AntrianTeller {
    public int [] call = {1, 2, 3, 4, 5};
    public int counter = 5;
    public String input;
    public void tampilan(){
        System.out.println("Selamat datang di aplikasi antrian teller");
        System.out.println("     T1    T2   T3   T4   T5");
        System.out.println("     Nomor 00"+call[0]+", di teller T1");
        System.out.println("     Nomor 00"+call[1]+", di teller T2");
        System.out.println("     Nomor 00"+call[2]+", di teller T3");
        System.out.println("     Nomor 00"+call[3]+", di teller T4");
        System.out.println("     Nomor 00"+call[4]+", di teller T5");
    }
    public String pembukaan(){
        tampilan();
        proses();
        return "Program Selesai";
    }
    public String proses(){
        String kataTerakhir = "Program Berakhir, Semoga Harimu Menyenangkan :D";
        System.out.println("Silahkan tekan tombol T1 s.d T5 untuk antrian selanjutnya");
        System.out.println("Tekan (N) untuk keluar program");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        if (input.equalsIgnoreCase("T1")){
            counter = counter+1;
            call[0] = counter;
            Scanner input = new Scanner(System.in);
            tampilan();
            proses();
        } else if(input.equalsIgnoreCase("T2")){
            counter = counter+1;
            call[1] = counter;
            Scanner input = new Scanner(System.in);
            tampilan();
            proses();
        } else if(input.equalsIgnoreCase("T3")){
            counter = counter+1;
            call[2] = counter;
            Scanner input = new Scanner(System.in);
            tampilan();
            proses();
        } else if(input.equalsIgnoreCase("T4")){
            counter = counter+1;
            call[3] = counter;
            Scanner input = new Scanner(System.in);
            tampilan();
            proses();
        } else if(input.equalsIgnoreCase("T5")){
            counter = counter+1;
            call[4] = counter;
            Scanner input = new Scanner(System.in);
            tampilan();
            proses();
        } else {
            end();
        }
        return kataTerakhir;
    }
    public void end(){
        boolean ending = true;
        Scanner sc = new Scanner(System.in);
        if (ending = true){
            System.out.println("Apa Anda Yakin Ingin Keluar?");
            System.out.println("Tekan (Y) Untuk Keluar Program");
            System.out.println("Tekan (N) Untuk Kembali");
            System.out.println("Tekan (X) Untuk Kembali Ke Menu Awal");
            String cpt = sc.next();
            if (cpt.equalsIgnoreCase("Y")){
                ending = false;
            } else if (cpt.equalsIgnoreCase("N")) {
                tampilan();
                proses();
            } else {
                counter = 5;
                call[0] = 1;
                call[1] = 2;
                call[2] = 3;
                call[3] = 4;
                call[4] = 5;
                pembukaan();
            }
        }
    }
}
