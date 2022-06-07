package condicional;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2;
        int opcao;

        System.out.println("Informe um valor:");
        v1 = sc.nextDouble();
        System.out.println("Informe um valor:");
        v2 = sc.nextDouble();

        System.out.println("\n\nCalculadora\n");
        System.out.println("Escolha um opção de calculo:");
        System.out.println("\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
            System.out.printf("%.1f + %.1f = %.1f", v1, v2, v1 + v2);
            break;
            case 2:
            System.out.printf("%.1f - %.1f = %.1f", v1, v2, v1 - v2);
            break;
            case 3:
            System.out.printf("%.1f * %.1f = %.1f", v1, v2, v1 * v2);
            break;
            case 4:
            System.out.printf("%.1f / %.1f = %.1f", v1, v2, v1 / v2);
            break;
            default:
            System.out.println("Opção Inválida.");
            // ba
        }
        sc.close();
    }
}
