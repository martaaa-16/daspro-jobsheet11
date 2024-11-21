import java.util.Scanner;
public class Percobaan515 {
    
    //fungsi hitung Luas
    public static int hitungLuas(int p, int l) {
        int L = p * l;
        return L;
    }

    //fungsi hitung Volume
    public static int hitungVolume(int t, int a, int b) {
        int vol = hitungLuas(a, b) * t;
        return vol;
    }

    //fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        
        L = hitungLuas(p, l);
        System.out.print("\nLuas persegi panjang adalah " + L);
        
        vol = hitungVolume(t, p, l);
        System.out.print("\nVolume balok adalah " + vol);
    }
}