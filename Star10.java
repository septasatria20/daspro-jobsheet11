import java.util.Scanner;

public class Star10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Masukkan nilai N : ");
        int N = sc10.nextInt();

        for (int i=1; i<=N; i++) {
        System.out.print("*");
        }
    }    
}
