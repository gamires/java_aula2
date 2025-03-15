import java.util.Scanner;
public class exe2 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Digite uma letra: ");
 String letra = scanner.next();

if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
    System.out.println("A letra é uma vogal");
}
else{
    System.out.println("A letra é uma conconsoante");
}
}
}
