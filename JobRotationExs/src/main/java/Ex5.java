import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String ent= "";
        String outPut="";

        System.out.println("Informe a palavra: ");
        ent = ler.next();

        for(int i = ent.length() - 1; i>=0; i--){
            outPut += ent.charAt(i);
        }
        System.out.println(outPut);
    }

}
