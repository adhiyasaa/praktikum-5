public class main {
    public static void main(String[] args) {
        manusia m1 = new manusia("Ahmad", "3374C0613114990001", true, true);
        System.out.println(m1);
        System.out.println("===============================");
        manusia m2 = new manusia("Bunga", "33750712314970001", false, true);
        System.out.println(m2);
        System.out.println("===============================");
        manusia m3 = new manusia("Candra", "337403299149920001", true, false);
        System.out.println(m3);
        System.out.println("===============================");
        mahasiswaFILKOM mf1 = new mahasiswaFILKOM("2051304701021", 2.71, "Alberto Juliano", "337098765001", true, false);
        System.out.println(mf1);
        System.out.println("===============================");
        mahasiswaFILKOM mf2 = new mahasiswaFILKOM("215140200339", 3.29, "Silvia Bertha", "33710988270001", false, false);
        System.out.println(mf2);
        System.out.println("===============================");
        mahasiswaFILKOM mf3 = new mahasiswaFILKOM("225150700111039", 3.94, "Muhammad Adhiyasa Satya Putranto", "3374061212030001", true, false);
        System.out.println(mf3);
        System.out.println("===============================");
        pekerja p1 = new pekerja(1000, 2020, 8, 29, 2, "Alfred Johnson", "337409001112", true, true);
        System.out.println(p1);
        System.out.println("===============================");
        pekerja p2 = new pekerja(1500, 2013, 11, 15, 0, "Monica Gabrielle", "33749088220001", false, false);
        System.out.println(p2);
        System.out.println("===============================");
        pekerja p3 = new pekerja(3500, 2002, 12, 3, 10, "Joko Antoni", "32781918394", true, true);
        System.out.println(p3);
        System.out.println("===============================");
        manager mg1 = new manager("HRD", 7500, 2007, 9, 1, 0, "Michael Jordan", "39989384748", true, false);
        System.out.println(mg1);
        System.out.println("===============================");
    }
}