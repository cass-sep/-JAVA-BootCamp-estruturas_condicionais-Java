package condicional;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        String classificacao;

        System.out.println("Informe o peso:");
        peso = sc.nextDouble();
        System.out.println("Informe a altura:");
        altura = sc.nextDouble();
        imc = peso / Math.pow(altura, 2);

        if(imc < 18.5){
            classificacao = "abaixo do peso";
        } else if(imc < 25){
            classificacao = "peso normal";
        } else if(imc < 30){
            classificacao = "sobrepeso";
        } else if(imc < 35){
            classificacao = "obesidade nível I";
        } else if(imc < 40){
            classificacao = "obesidade nível II";
        } else {
            classificacao = "obesidade mórbida";
        }

        System.out.printf("\nO seu IMC é %.2f e está classificado como %s.", imc, classificacao);
        sc.close();
    }
}
