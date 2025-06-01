import java.util.Scanner;

class GLB {
    private double kecepatan;
    private double waktu;

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }
}

// Kelas utama
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GLB glb = new GLB();

        System.out.println("=== Kalkulator GLB (Gerak Lurus Beraturan) ===");
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double t = scanner.nextDouble();

        glb.setKecepatan(v);
        glb.setWaktu(t);

        double jarak = glb.hitungJarak();
        System.out.println("Jarak yang ditempuh: " + jarak + " meter");
    }
}
