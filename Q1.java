import java.util.Scanner;
public class Q1{
  public static Scanner leia = new Scanner(System.in);
  public static void main(String[] args) {

    float nota1;
    float nota2;
    float media;

    System.out.print("Olá, vamos calcular a média do aluno\nDigite a primeira nota: ");
    nota1 = leia.nextFloat();
    while(nota1 < 0 || nota1 > 10){
      System.out.print("A nota digitada é inválida! Tente novamente: ");
      nota1 = leia.nextFloat();
    }
    System.out.print("Digite a segunda nota: ");
    nota2 = leia.nextFloat();
    while(nota2 < 0 || nota2 > 10){
      System.out.print("A nota digitada é inválida! Tente novamente: ");
      nota2 = leia.nextFloat();
    }

    media = (nota1 + nota2)/2;

    if(media > 7){
      System.out.println("O aluno está aprovado com média: " + media);
    }else{
      System.out.println("O aluno está reprovado com média: " + media);
    }

  }
}
