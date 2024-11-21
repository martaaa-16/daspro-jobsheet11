import java.util.Scanner;

public class Kubus15 {
    //fungsi hitung Luas
    public static int hitungLuas(int s) {
        int L = s * s;
        return L;
    }

    //fungsi hitung Volume
    public static int hitungVolume(int s) {
        int vol = hitungLuas(s) * s;
        return vol;
    }

    //fungsi hitung Luas Permukaan
    public static int hitungLuasPermukaan(int s) {
        int luasPermukaan = 6 * hitungLuas(s);
        return luasPermukaan;
    }

    //fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol, luasPermukaan;
        System.out.print("Masukkan panjang sisi: ");
        s = input.nextInt();
        
        vol = hitungVolume(s);
        System.out.print("\nVolume kubus adalah " + vol);
        
        luasPermukaan = hitungLuasPermukaan(s);
        System.out.print("\nLuas permukaan kubus adalah " + luasPermukaan);
    }
}