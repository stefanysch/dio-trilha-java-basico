import java.util.Scanner;
public class MediaDeNotas{

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        String aluno;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno = scanner.nextLine();

        System.out.println("Informe a primeira nota (Deve estar no intervalo de 0 a 10): ");
        nota1 = scanner.nextFloat();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota Inválida! Informe a primeira nota (Deve estar no intervalo de 0 a 10): ");
            nota1 = scanner.nextFloat();
        }
        System.out.println("A primeira nota é igual a: " + nota1);

        System.out.println("Informe a segunda nota (Deve estar no intervalo de 0 a 10): ");
        nota2 = scanner.nextFloat();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota Inválida! Informe a segunda nota (Deve estar no intervalo de 0 a 10): ");
            nota2 = scanner.nextFloat();
        }
        System.out.println("A segunda é igual a: " + nota2);

        System.out.println("Informe a terceira nota (Deve estar no intervalo de 0 a 10): ");
        nota3 = scanner.nextFloat();
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota Inválida! Informe a terceira nota (Deve estar no intervalo de 0 a 10): ");
            nota3 = scanner.nextFloat();
        }
        System.out.println("A terceira nota é igual a: " + nota3);

        System.out.println("Informe a quarta nota (Deve estar no intervalo de 0 a 10): ");
        nota4 = scanner.nextFloat();
        while (nota4 < 0 || nota4 > 10) {
            System.out.println("Nota Inválida! Informe a quarta nota (Deve estar no intervalo de 0 a 10): ");
            nota4 = scanner.nextFloat();
        }
        System.out.println("A quarta nota é igual a: " + nota4);

        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media >= 7) {
            System.out.println(aluno + " foi aprovado.");
        } else {
            System.out.println(aluno + " foi reprovado.");
        }
        System.out.println("Sua média foi: " + media);

        scanner.close(); 
    }
}