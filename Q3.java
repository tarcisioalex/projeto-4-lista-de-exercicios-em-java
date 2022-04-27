import java.util.Scanner;
public class Q3{
  public static Scanner leia = new Scanner(System.in);
  public static void main(String[] args) {
    int horaIni;
    int horaTer;

    System.out.print("Digite a hora de inicio do jogo de xadrez: ");
    horaIni = leia.nextInt();
    while (horaIni > 24 || horaIni < 0){
      System.out.print("Horário digitado não pode ser maior que 24, digite novamente: ");
      horaIni = leia.nextInt();
    }
    System.out.print("Digite a hora de término do jogo de xadrez: ");
    horaTer = leia.nextInt();
    while (horaTer > 24 || horaTer < 0){
      System.out.print("Horário digitado não pode ser maior que 24, digite novamente: ");
      horaTer = leia.nextInt();
    }

    if (horaIni < horaTer ) {
      System.out.println("O jogo durou " + (horaTer - horaIni) + " horas.");
    }else if(horaIni > horaTer){
      System.out.println("O jogo durou " + ((24 - horaIni) + horaTer) + " horas.");
    }else{
      System.out.println("O jogo durou 24 horas, caramba.");
    }
    
  }
}
