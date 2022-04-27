import java.util.Scanner;
public class Q7{
  public static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {

    int homem1;
    int homem2;
    int mulher1;
    int mulher2;

    System.out.print("Qual a idade do primeiro homem: ");
    homem1 = ler.nextInt();
    System.out.print("Qual a idade do segundo homem: ");
    homem2 = ler.nextInt();
    System.out.print("Qual a idade da primeira mulher: ");
    mulher1 = ler.nextInt();
    System.out.print("Qual a idade da segunda mulher: ");
    mulher2 = ler.nextInt();

    if(homem1 > homem2){
      if(mulher1 > mulher2){
        System.out.println("A soma das idades do homem mais velho com a mulher mais jovem é: " + (homem1 + mulher2));
        System.out.println("O produto das idade do homem mais jovem com a mulher mais velha é: " + (homem2 * mulher1));
      }else{
        System.out.println("A soma das idades do homem mais velho com a mulher mais jovem é: " + (homem1 + mulher1));
        System.out.println("O produto das idade do homem mais jovem com a mulher mais velha é: " + (homem2 * mulher2));
      }
    }else{
      if(mulher1 > mulher2){
        System.out.println("A soma das idades do homem mais velho com a mulher mais jovem é: " + (homem2 + mulher2));
        System.out.println("O produto das idade do homem mais jovem com a mulher mais velha é: " + (homem1 * mulher1));
      }else{
        System.out.println("A soma das idades do homem mais velho com a mulher mais jovem é: " + (homem2 + mulher1));
        System.out.println("O produto das idade do homem mais jovem com a mulher mais velha é: " + (homem1 * mulher2));
      }
    }
  }
}
