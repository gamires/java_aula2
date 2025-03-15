import java.util.Scanner;
    public class exe3{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        double [] numeros= new double[10];
        System.out.println("Digite um número:");
        numeros[0] = input.nextDouble();
        double maior = numeros[0];
        double menor = numeros[0];

        for(int i=1; i<10;i++){
            System.out.println("Digite um numero");
            numeros[i] = input.nextDouble();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        input.close();
        }
    
    }

    