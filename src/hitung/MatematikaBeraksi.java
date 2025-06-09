package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika zaini = new Matematika(0, 2);
        
        System.out.println("Hasil Penjumlahan : "+zaini.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+zaini.setPengurangan());
        System.out.println("Hasil Perkalian   : "+zaini.setPerkalian());
        System.out.println("Hasil Pembagian   : "+zaini.setPembagian());
    }   
}
