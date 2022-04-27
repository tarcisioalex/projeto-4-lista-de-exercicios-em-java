import java.util.Scanner;
public class Q6{
  public static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {

    int num1;
    int num2;
    int calculo;
    String resposta;

    System.out.print("Digite um número: ");
    num1 = ler.nextInt();
    System.out.print("Digite outro número: ");
    num2 = ler.nextInt();

    calculo = (num1*num2)+5;

    if(calculo <= 0){
      resposta = "A";
    }else if(calculo <= 100){
      resposta = "B";
    }else{
      resposta = "C";
    }
    System.out.println("A resposta é: " + resposta);

  }
}
