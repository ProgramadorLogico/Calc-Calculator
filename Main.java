import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    public static int subtracao(int A, int B) {
        return A - B;
    }  
    public static void print(int tipo, String texto) {
        if (tipo == 1) {
            System.out.println(texto);
        } else if (tipo == 2) {
            print(1, "");
            print(1, "========================");
            print(1, "");
        } else if (tipo == 3) {
            System.err.println(texto);
        }
    }
}