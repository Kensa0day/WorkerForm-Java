package pbo_m14_5210411401;

public class Pegawai {
    private String Nama, no_pegawai, posisi, Gaji;
    
    public Pegawai() {
        
    }

    public Pegawai(String Nama, String no_pegawai, String posisi, String Gaji ) {
        this.Nama = Nama;
        this.no_pegawai = no_pegawai;
        this.Gaji = Gaji;
        this.posisi = posisi;
    }

    public String getNama() {
        return Nama;
    }

    public String getNo_pegawai() {
        return no_pegawai;
    }

    public String getPosisi() {
        return posisi;
    }

    public String getGaji() {
        return Gaji;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNo_pegawai(String no_pegawai) {
        this.no_pegawai = no_pegawai;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGaji(String Gaji) {
        this.Gaji = Gaji;
    }

}
