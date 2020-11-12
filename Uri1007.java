import java.util.Scanner;
public class Uri1007{
   public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
     double A,B,C,D,DIFERENCA;

     //ENTRADA
     A = teclado.nextInt();
     B = teclado.nextInt();
     C = teclado.nextInt();
     D = teclado.nextInt();

     //PROCESSAMENTO
     DIFERENCA = (A *B - C * D);

     //SAIDA
     System.out.println("DIFERENCA = " + DIFERENCA);

   }

}   
