import java.util.Scanner;

public class Square10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Masukkan nilai N : ");
        int N = sc10.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
