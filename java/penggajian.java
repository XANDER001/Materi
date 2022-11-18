import java.util.Scanner;

class murid{
    String nama,kelas,NISN,pilihan2;
    int pilihan,spp,pangkal,gedung;
    Scanner murid_input = new Scanner(System.in);
    void data_murid(){
        System.out.println("Selamat datang di system pembayaran SPP");
        System.out.print("Masukan nama : ");
        nama = murid_input.next();
        System.out.print("Masukan Kelas : ");
        kelas = murid_input.next();
        System.out.print("Masukan NISN : ");
        NISN = murid_input.next();
    }
    void data_menu(){
        while (true){
            System.out.println("1.Pembayaran SPP\n2.Pembayaran Uang Pangkal\n3.Pembayaran Uang Gedung");
            System.out.print("Masukan Pilihan : ");
            pilihan = murid_input.nextInt();
            if (pilihan == 1){
                System.out.println("Selamat datang "+nama);
                System.out.print("silahkan masukan nominal pembayaran : ");
                spp = murid_input.nextInt();
            }
            else if (pilihan == 2){
                System.out.println("Selamat datang "+nama);
                System.out.print("silahkan masukan nominal pembayaran : ");
                pangkal = murid_input.nextInt();

            }
            else if (pilihan == 3){
                System.out.println("Selamat datang "+nama);
                System.out.print("silahkan masukan nominal pembayaran : ");
                gedung = murid_input.nextInt();
            }
        System.out.print("input lagi ? (y/n)");
        pilihan2 = murid_input.next();
        if (pilihan2.equals("y")){
            System.out.println("");
        }
        else{
            break;
        }
        }
    }
}
class pembayaran{
    int a,b;
    int bayarspp(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a+b);
        return a+b;
    }
}

public class buah {
    public static void main(String[] args) {
        murid display = new murid();
        pembayaran payment = new pembayaran();
        display.data_murid();
        display.data_menu();
        System.out.print("total semua adalah : ");
        payment.bayarspp(display.spp, display.gedung);
    }
    
}
