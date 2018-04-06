package praktek0002;
public class ParallelogramAksi {
    public static void main(String[] args) {
        Parallelogram r1 = new Parallelogram();
        r1.alas = 13;
        r1.tinggi = 5;
        
        r1.cetakInfo();
        System.out.println("Luas Parallelogram = "+r1.hitungLuas());
        r1.cetakLuas();
    }
}
