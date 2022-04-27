import java.util.Scanner;
public class Q2{
  public static Scanner leia = new Scanner(System.in);
  public static void main(String[] args) {

    int[] numeros = new int[3];
    int num1;
    int num2;
    int num3;

    System.out.print("Digite o primeiro número: ");
    num1 = leia.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = leia.nextInt();
    System.out.print("Digite o terceiro número: ");
    num3 = leia.nextInt();

    // colocar em ordem crescente utilizando apenas estruturas de condição.

    if (num1 < num2 && num1 < num3) {
      if (num2 < num3) {
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
      }else{
        numeros[0] = num1;
        numeros[1] = num3;
        numeros[2] = num2;
      }
    }else if (num2 < num1 && num2 < num3){
      if (num1 < num3) {
        numeros[0] = num2;
        numeros[1] = num1;
        numeros[2] = num3;
      }else{
        numeros[0] = num2;
        numeros[1] = num3;
        numeros[2] = num1;
      }
    }else if (num3 < num1 && num3 < num2){
      if (num1 < num2) {
        numeros[0] = num3;
        numeros[1] = num1;
        numeros[2] = num2;
      }else{
        numeros[0] = num3;
        numeros[1] = num2;
        numeros[2] = num1;
      }
    }else{
      System.out.println("Deu bug");
    }

    for (int i : numeros) {
      System.out.println(i);
    }
  }
}
