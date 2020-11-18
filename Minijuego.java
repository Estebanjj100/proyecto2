import java.util.*;
public class Minijuego{
   public static void main(String[] args){
      String bicho1="";
      String bicho2="";
      String bicho3="";
      String bicho4="";
      int vida1=0;
      int vida2=0;
      int vida3=0;
      int vida4=0;
      int na1=0;
      int na2=0;
      int na3=0;
      int na4=0;
      Scanner scan=new Scanner(System.in);
      String[][] bichos=new String[2][2]; 
      System.out.println("Cuantos bichos desea almacenar?");
      int b = scan.nextInt();
      if(b==1){
         System.out.println("Ingrese el numero 1 o 2 (1 = Bicho Normal y 2 = Bicho Alien)");
         na1 = scan.nextInt();
         if(na1==1){
            vida1=10;
            bicho1="BN - "+vida1;   
         }else if(na1==2){
            vida1=20;
            bicho1="BA - "+vida1;   
         }
         bichos[0][0]=bicho1;
         bichos[0][1]="       ";
         bichos[1][0]="       ";
         bichos[1][1]="       ";
      }else if(b==2){
         System.out.println("Ingrese el numero 1 o 2 para el primer bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na1 = scan.nextInt();
         System.out.println("Ingrese el numero 1 o 2 para el segundo bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na2 = scan.nextInt();
         if(na1==1){
            vida1=10;
            bicho1="BN - "+vida1; 
         }else if(na1==2){
            vida1=20;
            bicho1="BA - "+vida1; 
         }
         if(na2==1){
            vida2=10;
            bicho2="BN - "+vida2;  
         }else if(na2==2){
            vida2=20;
            bicho2="BA - "+vida2;  
         }
         bichos[0][0]=bicho1;
         bichos[0][1]=bicho2;
         bichos[1][0]="       ";
         bichos[1][1]="       ";
      }else if(b==3){
         System.out.println("Ingrese el numero 1 o 2 para el primer bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na1 = scan.nextInt();
         System.out.println("Ingrese el numero 1 o 2 para el segundo bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na2 = scan.nextInt();
         System.out.println("Ingrese el numero 1 o 2 para el tercer bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na3 = scan.nextInt();
         if(na1==1){
            vida1=10;
            bicho1="BN - "+vida1; 
         }else if(na1==2){
            vida1=20;
            bicho1="BA - "+vida1; 
         }
         if(na2==1){
            vida2=10;
            bicho2="BN - "+vida2;  
         }else if(na2==2){
            vida2=20;
            bicho2="BA - "+vida2;  
         }
         if(na3==1){
            vida3=10;
            bicho3="BN - "+vida3;   
         }else if(na3==2){
            vida3=20;
            bicho3="BA - "+vida3;  
         }
         bichos[0][0]=bicho1;
         bichos[0][1]=bicho2;
         bichos[1][0]=bicho3;
         bichos[1][1]="       ";
      }else if(b==4){
         System.out.println("Ingrese el numero 1 o 2 para el primer bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na1 = scan.nextInt();
         System.out.println("Ingrese el numero 1 o 2 para el segundo bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na2 = scan.nextInt();
         System.out.println("Ingrese el numero 1 o 2 para el tercer bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na3 = scan.nextInt();
         System.out.println("Ingrese el numero 1 o 2 para el cuarto bicho(1 = Bicho Normal y 2 = Bicho Alien)");
         na4 = scan.nextInt();
         if(na1==1){
            vida1=10;
            bicho1="BN - "+vida1; 
         }else if(na1==2){
            vida1=20;
            bicho1="BA - "+vida1; 
         }
         if(na2==1){
            vida2=10;
            bicho2="BN - "+vida2;  
         }else if(na2==2){
            vida2=20;
            bicho2="BA - "+vida2;  
         }
         if(na3==1){
            vida3=10;
            bicho3="BN - "+vida3;   
         }else if(na3==2){
            vida3=20;
            bicho3="BA - "+vida3;  
         }
         if(na4==1){
            vida4=10;
            bicho4="BN - "+vida4;   
         }else if(na4==2){
            vida4=20;
            bicho4="BA - "+vida4;  
         }
         bichos[0][0]=bicho1;
         bichos[0][1]=bicho2;
         bichos[1][0]=bicho3;
         bichos[1][1]=bicho4;
      }
      System.out.println("---------------------");
      System.out.println("| "+bichos[0][0]+" | "+bichos[0][1]+" |");
      System.out.println("| "+bichos[1][0]+" | "+bichos[1][1]+" |");
      System.out.println("---------------------");
      System.out.println("\nIniciando juego...");
      System.out.println("Digite la posicion a la cual desea disparar: ");
      int bala = scan.nextInt();
      while((vida1!=0)||(vida2!=0)||(vida3!=0)||(vida4!=0)){
         if((b==1)&&((vida1==0)||(vida2==0)||(vida3==0)||(vida4==0))){
            System.out.println("\nEsta posicion no tiene vida\n");
         }else if((b==2)&&((vida1==0)||(vida2==0)||(vida3==0)||(vida4==0))){
            System.out.println("\nEsta posicion no tiene vida\n");      
         }else if((b==3)&&((vida1==0)||(vida2==0)||(vida3==0)||(vida4==0))){
            System.out.println("\nEsta posicion no tiene vida\n");      
         }else if((b==4)&&((vida1==0)||(vida2==0)||(vida3==0)||(vida4==0))){
            System.out.println("\nEsta posicion no tiene vida\n");      
         }
         if((b==1)&&(bala==1)&&(vida1>0)){
            vida2=0;
            vida3=0;
            vida4=0;
            vida1=vida1-5;
            if(na1==1){
               bicho1="BN - "+vida1; 
            }else if(na1==2){
               bicho1="BA - "+vida1; 
            }
         }else if((b==2)&&(bala==1)&&(vida1>0)){
            vida3=0;
            vida4=0;
            vida1=vida1-5;
            vida2=vida2;
            if(na1==1){
               bicho1="BN - "+vida1; 
            }else if(na1==2){
               bicho1="BA - "+vida1; 
            }
         }else if((b==2)&&(bala==2)&&(vida2>0)){
            vida3=0;
            vida4=0;
            vida1=vida1;
            vida2=vida2-5;
            if(na2==1){
               bicho2="BN - "+vida2; 
            }else if(na2==2){
               bicho2="BA - "+vida2; 
            }
         }else if((b==3)&&(bala==1)&&(vida1>0)){
            vida4=0;      
            vida1=vida1-5;
            vida2=vida2;
            vida3=vida3;
            if(na1==1){
               bicho1="BN - "+vida1; 
            }else if(na1==2){
               bicho1="BA - "+vida1; 
            }
         }else if((b==3)&&(bala==2)&&(vida2>0)){
            vida4=0;      
            vida1=vida1;
            vida2=vida2-5;
            vida3=vida3;
            if(na2==1){
               bicho2="BN - "+vida2; 
            }else if(na2==2){
               bicho2="BA - "+vida2; 
            }
         }else if((b==3)&&(bala==3)&&(vida3>0)){
            vida4=0;      
            vida1=vida1;
            vida2=vida2;
            vida3=vida3-5;
            if(na3==1){
               bicho3="BN - "+vida3; 
            }else if(na3==2){
               bicho3="BA - "+vida3; 
            }
         }else if((b==4)&&(bala==1)&&(vida1>0)){
            vida1=vida1-5;
            vida2=vida2;
            vida3=vida3;
            vida4=vida4;
            if(na1==1){
               bicho1="BN - "+vida1; 
            }else if(na1==2){
               bicho1="BA - "+vida1; 
            }
         }else if((b==4)&&(bala==2)&&(vida2>0)){
            vida1=vida1;
            vida2=vida2-5;
            vida3=vida3;
            vida4=vida4;
            if(na2==1){
               bicho2="BN - "+vida2; 
            }else if(na2==2){
               bicho2="BA - "+vida2; 
            }
         }else if((b==4)&&(bala==3)&&(vida3>0)){
            vida1=vida1;
            vida2=vida2;
            vida3=vida3-5;
            vida4=vida4;
            if(na3==1){
               bicho3="BN - "+vida3; 
            }else if(na3==2){
               bicho3="BA - "+vida3; 
            }
         }else if((b==4)&&(bala==4)&&(vida4>0)){
            vida1=vida1;
            vida2=vida2;
            vida3=vida3;
            vida4=vida4-5;
            if(na4==1){
               bicho4="BN - "+vida4; 
            }else if(na4==2){
               bicho4="BA - "+vida4; 
            }
         }
         if(b==1){
            bichos[0][0]=bicho1;
            if(vida1<9){
               bichos[0][1]="      ";
            }else{
               bichos[0][1]="       ";
            }
            if(vida1<9){
               bichos[1][0]="      ";
            }else{
               bichos[1][0]="       ";
            }
            if(vida1<9){
               bichos[1][1]="      ";
            }else{
               bichos[1][1]="       ";
            }    
         }else if(b==2){
            bichos[0][0]=bicho1;
            bichos[0][1]=bicho2;
            if(vida1<9){
               bichos[1][0]="      ";
            }else{
               bichos[1][0]="       ";
            }
            if(vida2<9){
               bichos[1][1]="      ";
            }else{
               bichos[1][1]="       ";
            }  
         }else if(b==3){
            bichos[0][0]=bicho1;
            bichos[0][1]=bicho2;
            bichos[1][0]=bicho3;
            if(vida2<9){
               bichos[1][1]="      ";
            }else{
               bichos[1][1]="       ";
            } 
         }else if(b==4){
            bichos[0][0]=bicho1;
            bichos[0][1]=bicho2;
            bichos[1][0]=bicho3;
            bichos[1][1]=bicho4;
         }
         System.out.println("---------------------");
         System.out.println("| "+bichos[0][0]+" | "+bichos[0][1]+" |");
         System.out.println("| "+bichos[1][0]+" | "+bichos[1][1]+" |");
         System.out.println("---------------------");
         if((vida1==0)&&(vida2==0)&&(vida3==0)&&(vida4==0)){
            break;   
         }
         System.out.println("Digite la posicion a la cual desea disparar: ");
         bala = scan.nextInt();
      }
      System.out.println("\nNingun bicho se encuentra con vida");
      System.out.println("Fin del juego");
   }
}