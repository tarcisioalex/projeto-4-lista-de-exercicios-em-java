import java.util.Scanner;
public class Q4{
  public static Scanner leia = new Scanner(System.in);
  public static void main(String[] args) {

    float salarioFixo;
    float valorVendas;
    float salarioTotal = 0;

    System.out.print("Olá, vamos calcular o seu salário total.\nDigite o valor de seu salário fixo: ");
    salarioFixo = leia.nextFloat();
    System.out.print("Qual o valor total das vendas que você realizou: ");
    valorVendas = leia.nextFloat();

    if (valorVendas <= 1500) {
      salarioTotal = (valorVendas*3/100) + salarioFixo;
    }else if (valorVendas > 1500) {
      salarioTotal = (valorVendas*5/100) + 45 + salarioFixo; //45 é 3% de 1500
    }else{
      System.out.println("Deu bug");
    }

    System.out.println("O seu salário total é de R$:" + salarioTotal);

  }
}
