import java.util.Scanner;
public class Q8{
  public static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {

    String codUsuario = "sertanejo";
    String senha = "C3c@9999";

    System.out.print("Olá\nDigite o seu nome de usuário: ");
    while(!codUsuario.equals(ler.next())){
      System.out.print("Usuário não existente\nDigite novamente seu nome de usuário: ");
    }
    System.out.print("Usuário confirmado\nDigite sua senha: ");
    while(!senha.equals(ler.next())){
      System.out.print("Senha incorreta\nDigite novamente: ");
    }
    System.out.println("Acesso permitido");
  }
}
