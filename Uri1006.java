import java.util.Scanner;
public class Uri1006{
   public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
     double A,B,C,SOMA,MEDIA;

     //ENTRADA
     A = teclado.nextDouble();
     B = teclado.nextDouble();
     C = teclado.nextDouble();

     //PROCESSAMENTO    
     SOMA = A*2.0 + B*3.0 + C*5.0;
     MEDIA = SOMA / 10.0;

     //SAIDA
     System.out.printf("MEDIA = %.1f\n" , MEDIA);

   }

}