import java.util.Random;
import java.util.Scanner;

 public class Banco {
   
  public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);
    
    
    Random r = new Random();
    
    String titular;
    double iniciar;
    int conta =  r.nextInt(1000);
    

    System.out.print("Digite o nome do titular da conta: ");
     titular = in.nextLine();
    

    System.out.print("Digite o valor do depósito: ");
     iniciar = in.nextDouble();
    
    Conta minha_conta = new Conta(titular, conta, iniciar);
   
    minha_conta.iniciar();

       
    
   
    }
  }
