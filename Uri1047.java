import java.util.Scanner;
public class Uri1047{
public static void main(String arg[]){
   Scanner teclado= new Scanner(System.in);
   int HI,HF,MI,MF,DURT,DURH,DURM;

   HI = TECLADO.NEXTiNT();
   MI = TECLADO.NEXTiNT();
   HF = TECLADO.NEXTiNT();
   MF = TECLADO.NEXTiNT();
   
   DURT = (HF * 60 + MF) - (HI *60 + MI);

   if (DURT <=0){
       DURT = (DURT + (60*24));

   }
   DURH = DURT / 60;
   DURM = DURT % 60;
   System.out.println("O jogo durou "+DURH+" horas(s) e "+DURM+" minuto(s)");

}

}