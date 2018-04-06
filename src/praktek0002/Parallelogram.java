package praktek0002;
public class Parallelogram {
    double alas;
    double tinggi;
    
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
}
