import java.util.Scanner;

    public class Ex5 {

    public static int min(int a, int b){
        if (a<b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero a: ");
        int a = scanner.nextInt();
        System.out.println("Digite o numero b: ");
        int b = scanner.nextInt();
        int maior = max(a,b);
        int menor = min(a,b);
    
    System.out.println("o maior numero é: "+ maior );
    System.out.println("o menor numero é: "+ menor );
    scanner.close();
    }
}
