import java.util.Scanner;

public class exe1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();


         System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        int numt = num1;
        num1 = num2;
        num2 = numt;
//acho que nao teria como dar erro nesse codigo nao importa qual numero a pessoa coloque mesmo 
// sendo 0 ou negativo a troca independe da entrada

        System.out.println(num1 + " e " + num2);

    scanner.close();
    }
}