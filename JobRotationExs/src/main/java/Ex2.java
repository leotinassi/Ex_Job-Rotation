import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> listFibo = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        int num = 0;
        System.out.println("Informe o numero  para mostrar a sequencia: ");
        num = ler.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("(" + i + "):" + Ex2.fibo(i) + "\t");
            listFibo.add(Ex2.fibo(i));
        }
        if (listFibo.contains(num)){
            System.out.println("\n Este numero pertence a sequencia");
        }else{
            System.out.println("\n Este numero não pertence a sequencia");
        }


    }
}


