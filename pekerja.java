import java.time.LocalDate;
import java.time.Period;

public class pekerja extends manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public double getBonus(){
        Period bedaWaktu = Period.between(tahunMasuk, LocalDate.now());
        int lamaBekerja = bedaWaktu.getYears();

        if(lamaBekerja >= 0 && lamaBekerja <= 5){
            return gaji * (5.0/100);
        } else if(lamaBekerja > 5 && lamaBekerja <= 10){
            return gaji * (10.0/100);
        } else{
            return gaji * (15.0/100);
        }
    }
    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 20 * jumlahAnak;
    }
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }
    public String toString(){
        return (
                super.toString() +
                        "\ntahun masuk\t\t: " + this.tahunMasuk +
                        "\njumlah anak\t\t: " + this.jumlahAnak +
                        "\ngaji\t\t\t: " + this.gaji
        );
    }
}