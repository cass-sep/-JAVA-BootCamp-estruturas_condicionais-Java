package condicional;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número entre 1 e 7:");
        dia = sc.nextInt();

        switch(dia){
            case 1:
            System.out.println("Você escolheu o domingo.");
            break;
            case 2:
            System.out.println("Você escolheu a segunda-feira.");
            break;
            case 3:
            System.out.println("Você escolheu a terça-feira.");
            break;
            case 4:
            System.out.println("Você escolheu a quarta-feira.");
            break;
            case 5:
            System.out.println("Você escolheu a quinta-feira.");
            break;
            case 6:
            System.out.println("Você escolheu a sexta-feira.");
            break;
            case 7:
            System.out.println("Você escolheu o sábado.");
            break;
            default:
            System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
