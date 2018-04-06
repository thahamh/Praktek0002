package praktek0002;
public class Parallelogram {
    double alas;
    double tinggi;

    public Parallelogram() {
        alas = 8;
        tinggi=4;
    }
    
    void cetakInfo(){
        System.out.println("+-----------------+");
        System.out.println("alas   : "+alas);
        System.out.println("tinggi : "+tinggi);
        System.out.println("+-----------------+");
    }
    
    double hitungLuas(){
        double luas;
        luas = alas*tinggi;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah : "+hitungLuas());
    }
}
