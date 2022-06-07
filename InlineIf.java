package condicional;

import java.util.Scanner;

public class InlineIf {
    public static void main(String[] args){
        char genero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o gênero:");
        genero = sc.next().charAt(0);
        genero = Character.toUpperCase(genero);

        System.out.println((genero == 'F') ? "Feminino" : (genero == 'M') ? "Masculino" : "Não-Binário");

        sc.close();

    }
}
