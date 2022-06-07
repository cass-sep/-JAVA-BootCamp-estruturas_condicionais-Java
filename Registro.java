package condicional;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, faltas;
        double n1, n2, n3, n4, media;
        String disciplina, resultado;

        System.out.println("Qual a disciplina:");
        disciplina = sc.next();
        System.out.println("Quantas aulas foram dadas?");
        quantidade = sc.nextInt();
        System.out.println("Informe as 4 notas:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        System.out.println("Quantidade de faltas:");
        faltas = sc.nextInt();
        media = (n1 + n2 + n3 + n4)/4;

        if(media >= 6.0 && faltas <=(quantidade*0.75))
            resultado = "aprovado";
        else
            resultado = "reprovado";
        
        System.out.printf("A disciplina de %s teve %d aulas.\n", disciplina, quantidade);
        System.out.printf("O aluno tirou %.1f, %.1f, %.1f e %.1f. Obteve média de %.1f.\n", n1, n2, n3, n4, media);
        System.out.printf("O aluno faltou %d vezes.\n", faltas);
        System.out.printf("O aluno está %s.", resultado);

        sc.close();

    }
}
