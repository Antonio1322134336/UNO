import java.util.Random;
import java.util.Scanner;
public class UNOpt2 {
    
    public static void main(String[] args) {
        int cartas=128;
        int baraja[] = new int [cartas];
        for (int x=0;x<cartas;x++){
        baraja [x]= (int)(Math.random()*11+0);
        //System.out.println(baraja[x]);
    }
        int jugador1[] = new int [80];
        System.out.println("Jugador 1:");
        for(int x=0;x<7;x++){
        jugador1[x]=baraja[x];
            if (jugador1[x]==0){
            System.out.print("0"+"-");}
            if (jugador1[x]==1){
            System.out.print("1"+"-");}
            if (jugador1[x]==2){
            System.out.print("2"+"-");}
            if (jugador1[x]==3){
            System.out.print("3"+"-");}
            if (jugador1[x]==4){
            System.out.print("4"+"-");}
            if (jugador1[x]==5){
            System.out.print("5"+"-");}
            if (jugador1[x]==6){
            System.out.print("6"+"-");}
            if (jugador1[x]==7){
            System.out.print("7"+"-");}
            if (jugador1[x]==8){
            System.out.print("8"+"-");}
            if (jugador1[x]==9){
            System.out.print("9"+"-");}
            if (jugador1[x]==10){
            System.out.print("ø"+"-");}
            if (jugador1[x]==11){
            System.out.print("»"+"-");}
        }
        System.out.println("\n");
        int jugador2[] = new int [80];
        System.out.println("Jugador 2:");
        for(int x=0;x<7;x++){
        jugador2[x]=baraja[x+7];
            if (jugador2[x]==0){
            System.out.print("0"+"-");}
            if (jugador2[x]==1){
            System.out.print("1"+"-");}
            if (jugador2[x]==2){
            System.out.print("2"+"-");}
            if (jugador2[x]==3){
            System.out.print("3"+"-");}
            if (jugador2[x]==4){
            System.out.print("4"+"-");}
            if (jugador2[x]==5){
            System.out.print("5"+"-");}
            if (jugador2[x]==6){
            System.out.print("6"+"-");}
            if (jugador2[x]==7){
            System.out.print("7"+"-");}
            if (jugador2[x]==8){
            System.out.print("8"+"-");}
            if (jugador2[x]==9){
            System.out.print("9"+"-");}
            if (jugador2[x]==10){
            System.out.print("ø"+"-");}
            if (jugador2[x]==11){
            System.out.print("»"+"-");}
        }
        System.out.println("\n");
        int jugador3[] = new int [80];
        System.out.println("Jugador 3:");
        for(int x=0;x<7;x++){
        jugador3[x]=baraja[x+14];
            if (jugador3[x]==0){
            System.out.print("0"+"-");}
            if (jugador3[x]==1){
            System.out.print("1"+"-");}
            if (jugador3[x]==2){
            System.out.print("2"+"-");}
            if (jugador3[x]==3){
            System.out.print("3"+"-");}
            if (jugador3[x]==4){
            System.out.print("4"+"-");}
            if (jugador3[x]==5){
            System.out.print("5"+"-");}
            if (jugador3[x]==6){
            System.out.print("6"+"-");}
            if (jugador3[x]==7){
            System.out.print("7"+"-");}
            if (jugador3[x]==8){
            System.out.print("8"+"-");}
            if (jugador3[x]==9){
            System.out.print("9"+"-");}
            if (jugador3[x]==10){
            System.out.print("ø"+"-");}
            if (jugador3[x]==11){
            System.out.print("»"+"-");}
        }
        System.out.println("\n");
        int jugador4[] = new int [80];
        System.out.println("Jugador 4:");
        for(int x=0;x<7;x++){
        jugador4[x]=baraja[x+21];
            if (jugador4[x]==0){
            System.out.print("0"+"-");}
            if (jugador4[x]==1){
            System.out.print("1"+"-");}
            if (jugador4[x]==2){
            System.out.print("2"+"-");}
            if (jugador4[x]==3){
            System.out.print("3"+"-");}
            if (jugador4[x]==4){
            System.out.print("4"+"-");}
            if (jugador4[x]==5){
            System.out.print("5"+"-");}
            if (jugador4[x]==6){
            System.out.print("6"+"-");}
            if (jugador4[x]==7){
            System.out.print("7"+"-");}
            if (jugador4[x]==8){
            System.out.print("8"+"-");}
            if (jugador4[x]==9){
            System.out.print("9"+"-");}
            if (jugador4[x]==10){
            System.out.print("ø"+"-");}
            if (jugador4[x]==11){
            System.out.print("»"+"-");}
        }
        int M = 28;
        boolean repetir=false;
        System.out.println("\n");
        System.out.println("\n"+"Carta inicial");
        System.out.println(baraja[M]);
        while(repetir=true){
        System.out.println("\n"+"Turno jugador 1");
        Scanner carta1 = new Scanner(System.in);
        System.out.println("Escribe la carta a regalar");
        int regalo1 = carta1.nextInt();
        switch (baraja[M]){
            case 0:
                while (regalo1==9||regalo1==0||regalo1==1){
                    repetir=true;
                        break;
                }
            case 1:
                while (regalo1==0||regalo1==1||regalo1==2){
                    repetir=true;
                        break;
                }
            case 2:
                if (regalo1==1||regalo1==2||regalo1==3){
                    repetir=true;
                        break;
                }
            case 3:
                if (regalo1==2||regalo1==3||regalo1==4){
                    repetir=true;
                        break;
                }
            case 4:
                if (regalo1==3||regalo1==4||regalo1==5){
                    repetir=true;
                        break;
                }
            case 5:
                if (regalo1==4||regalo1==5||regalo1==6){
                    repetir=true;
                        break;
                }
            case 6:
                if (regalo1==5||regalo1==6||regalo1==7){
                    repetir=true;
                        break;
                }
            case 7:
                if (regalo1==6||regalo1==7||regalo1==8){
                    repetir=true;
                        break;
                }
            case 8:
                if (regalo1==7||regalo1==8||regalo1==9){
                    repetir=true;
                        break;
                }
            case 9:
                if (regalo1==8||regalo1==9||regalo1==0){
                    repetir=true;
                        break;
                }
            case 10:
                if (regalo1==10){
                    break;
                }
            case 11:
                if (regalo1==11){
                    break;
                }
            default:
                System.out.println("error");
                }}
        M++;
        System.out.println("saliste del switch");
  }

 }
