import java.util.Scanner;
    public class exe4{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double [] numeros= new double[10];
        double [] rev_numeros= new double[10];
        for(int i=0; i<10;i++){
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
        for(int k=0; k<10;k++){
            rev_numeros[k] = numeros[9-k];
        }
        }
        System.out.println("A lista invertida fica: ");
        for (int k = 0; k < 10; k++) {
            System.out.println(rev_numeros[k]);
        }

        scanner.close();
    }




    }