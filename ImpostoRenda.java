package condicional;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        double salario;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o valor do salário:");
        salario = sc.nextDouble();

        if(salario <= 1903.98){
            System.out.println("Você está isento do Imposto de Renda.");
        }else if(salario <= 2826.65){
            System.out.println("A alíquota do Imposto de Renda será de 7,5% ou R$142,80.");
        }
        else if(salario <= 3751.06){
            System.out.println("Alíquota do Imposto de Renda será de 15% ou R$354,80.");
        }
        else if(salario <= 4664.68){
            System.out.println("Alíquota do Imposto de Renda será de 22,5% ou R$636,13.");
        } else {
            System.out.println("Alíquota do Imposto de Renda será de 27,5% ou R$869,36.");

        }

        sc.close();
    }
}
