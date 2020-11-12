import java.util.Scanner;

public class leituras{
  public static void main(String args[]){

      //preciso criar o componente
      Scanner teclado;
      teclado = new Scanner(System.in); // crio o componente apontando-o para o
                                    // dispositivo de entrada padrao (teclado)
      int valorInteiro;
      float valorReal;
      System.out.println("Por favor, digite um numero inteiro:");    
       valorInteiro = teclado.nextInt();
       System.out.println("O valor inteiro " + valorInteiro + " foi digitado ");

      System.out.println("agora digite um valor real:");
      valorReal = teclado.nextFloat();
      System.out.println("O valor real digitado vale "+valorReal);
      System.out.printf("O valor com duas casas decimais: %.2f\n ",valorReal);


  }

}