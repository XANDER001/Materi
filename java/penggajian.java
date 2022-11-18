class data{
    // simpan data kedalam array
    String nama,divisi,jabatan;
    int total,tambahan;
    // public adalah access data yang bersifat bebas untuk diakses
    public void data_karyawan(){
        System.out.println("nama : "+nama+"\ndivisi : "+divisi+"\njabatan : "+jabatan);
    }
    void data_gaji(){

    }
    // non void dan penggunaan paramater yang menambahkan attribute didalam tunjangan() yang disertakan type datanya
    int tunjangan(int gaji,String jabatan){
        if (jabatan == "supervisor"){
            tambahan = 3000000;
            total = gaji+tambahan;
        }
        else if(jabatan == "manager"){
            tambahan = 5000000;
            total = gaji+tambahan;
        }
        return total;
    }
}
public class penggajian {
    public static void main(String[] args) {
        // 
        data a = new data();
        // dengan parameter
        System.out.println(""+(a.tunjangan(200000,"manager")));
        // tanpa parameter
        a.nama = "pikawi";
        a.divisi = "kepala negara konoha";
        a.jabatan = "supervisor";
        a.data_karyawan();
        
    }
}
