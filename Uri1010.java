import java.util.Scanner;
public class Uri1010{
   public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);

     int CODIGO1,NUMERO1,CODIGO2,NUMERO2;
     double VALOR1,VALOR2,TOTAL;

     //ENTRADA 1
     CODIGO1 = teclado.nextInt(); NUMERO1 = teclado.nextInt; VALOR1 = teclado.nextDouble();
     //ENTRADA 2
     CODIGO2 = teclado.nextInt(); NUMERO2 = teclado.nextInt; VALOR2 = teclado.nextDouble();

     //PROCESSAMENTO
     TOTAL = (VALOR1 * NUMERO1) + (VALOR2 * NUMERO2);
     
     //SAIDA
     System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);

   }

}
