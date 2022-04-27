import java.util.Scanner;
public class Q5{
  public static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {
    String nomeProduto;
    int estoqueMin;
    int estoqueMax;
    int estoqueAtual;
    int estoqueMed;
    String opcao;

    do {
      System.out.print("Qual o nome do produto?: ");
      nomeProduto = ler.next();
      System.out.print("Qual a quantidade máxima desse produto no estoque?: ");
      estoqueMax = ler.nextInt();
      System.out.print("Qual a quantidade mínima desse produto no estoque?: ");
      estoqueMin = ler.nextInt();
      System.out.print("Qual a quantidade atual desse produto no estoque?: ");
      estoqueAtual = ler.nextInt();

      estoqueMed = (estoqueMax + estoqueMin)/2;

      if(estoqueAtual >= estoqueMed){
        System.out.println("A quantidade de " + nomeProduto + " é maior que a média, não é necessário efetuar a compra.");
      }else{
        System.out.println("A quantidade de " + nomeProduto + " é menor que a média, é necessário efetuar a compra.");
      }

      System.out.print("Deseja efetuar a verificação novamente?(s - sim, n - não): ");
      opcao = ler.next();
    } while (opcao.equals("s"));
  }
}
