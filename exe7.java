import java.util.Scanner;
    public class exe7{
        public static int vogais(String palavra) {
            int vogal_quanti = 0;
            for(int i =0; i< palavra.length();i++){
                char c = Character.toLowerCase(palavra.charAt(i)); 
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogal_quanti++;
                }
            }
            return vogal_quanti; 
        }

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva sua palavra: ");
        String palavra = scanner.nextLine();
        int quantidadeVogais = vogais(palavra);
        System.out.println("A quantidades de vogais: "+ quantidadeVogais);
        scanner.close();
    }
    }