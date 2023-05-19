public class manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin == true ? ("laki-laki") : "perempuan";
    }
    public String getNik() {
        return nik;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public double getTunjangan() {
        if (getMenikah()) {
            if (jenisKelamin == true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public String toString() {
        return ("\nnama\t\t\t: " + this.nama
                + "\nnik\t\t\t\t: " + this.nik
                + "\njenis kelamin\t: " + this.getJenisKelamin()
                + "\npendapatan\t\t: " + getPendapatan());
    }
}