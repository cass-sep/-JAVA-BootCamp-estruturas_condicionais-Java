package condicional;
import java.util.Scanner;


public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;
        String resultado;

        System.out.println("Informe a 1ª nota:");
        n1 = sc.nextDouble();
        System.out.println("Informe a 2ª nota:");
        n2 = sc.nextDouble();
        System.out.println("Informe a 3ª nota:");
        n3 = sc.nextDouble();
        media = (n1 + n2 + n3) / 3;

        if(media >= 6.0){
            resultado = "aprovado";
        } else{
            resultado = "reprovado";
        }

        System.out.printf("\nO aluno obteve média de %.1f e foi %s.", media, resultado);
        System.out.println("\nEncerrado.");

        sc.close();
    }
}
