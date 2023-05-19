public class manager extends pekerja{
    private String departemen;
    manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }
    @Override
    public double getTunjangan() {
        return super.getTunjangan() + ((10.0/100) * getGaji());
    }
    public String toString(){
        return(
                super.toString() +
                        "\ndepartemen\t\t: " + this.departemen
        );
    }
}