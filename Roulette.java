/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.roulette;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nunya
 */
public class Roulette {
private final static Random rand =new Random();
private static int chickendinner=rand.nextInt(37)+1;// rand num=1-38, winning number 1-36,0, 00 
private final static int  black[]={2,4,6,8,10,11,13,15,17,20,22,24,26,29,31,33,35};
private final static int red[]={1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amountbet;
        boolean win=false;
        int payout=0;
        String bet;
        int bettype;
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your bet amount:");
        amountbet=in.nextDouble();
        showrules();
        bet=in.next();
        if(bettype(bet)){
             bettype=Integer.parseInt(bet);
             //bet is a single integer
             //integer bets: 0, 00, 1-36, 112 (first 12), 212(2nd 12), 312(3rd 12)
             //118 (1-18), 1936 (19-36)
             /*
             four corners:
             1245
             2356
             4578
             5689
             781011
             891112
             10111314
             11121415
             13141617
             14151718
             16171920
             17182021
             19202223
             20212324
             22232526
             23242627
             25262829
             26272930
             28293132
             29303233
             31323435
             32333536
            
             
             */
             //need to add rest of bets, like snake bet, rows, etc
             if(bettype==chickendinner&&bettype!=118&&bettype!=1936&&bettype!=112&&bettype!=212&&bettype!=312){
             win=true;
             payout=36;
             }else if(bettype==118){
                if(chickendinner>0&&chickendinner<19){
                win=true;
                payout=2;} 
             }else if(bettype==1936){
                 if(chickendinner>18&&chickendinner<37){
                 win=true;
                 payout=2;}
             }else if(bettype==112){
                 if(chickendinner>0&&chickendinner<13){
                 win=true;
                 payout=2;  
                 }
             }else if(bettype==212){
                 if(chickendinner>12&&chickendinner<25){
                 win=true;
                 payout=2; 
                 }
             }else if(bettype==312){
                 if(chickendinner>24&&chickendinner<37){
                 win=true;
                 payout=2;
                 }
             }
        }else{// its a word, either even or odd or black or red
            if(bet.equals("red")){
                //wins if chickendinner is 
                //1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36
                for(int i=0;i<red.length;i++){
                    if(chickendinner==red[i]){
                    win=true;
                    payout=2;}//1:1 odds
                }
                //wins 2x bet
            }else if(bet.equals("black")){
                //wins if chicken dinner is
                //2,4,6,8,10,11,13,15,17,20,22,24,26,29,31,33,35
                for(int i=0;i<black.length;i++){
                    if(chickendinner==black[i]){
                    win=true;
                    payout=2;}
                }
                //wins 2x bet
            }else if(bet.equals("even")){
                if(chickendinner%2==0){
                win=true;
                payout=2;}
                //wins if chickendinner %2==0
                //wins 2x bet
            }else if(bet.equals("odd")){
                if(chickendinner%2!=0){
                    win=true;
                    payout=2;
                }
                //wins if chicken dinner %2 !=0
                //wins 2x bet
            }else if(bet.equals("corner")){
            System.out.println("Type the valid 4 numbers you wish to bet on");
            System.out.println("If you wish to see a list of the valid integers, press 'h'");
            int corner;
            corner=in.nextInt();
            switch(corner){
                case 1245:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 2356:
                    if(chickendinner==2||chickendinner==3||chickendinner==5||chickendinner==6){
                    }
                    break;
                case 4578:
                    if(chickendinner==4||chickendinner==5||chickendinner==7||chickendinner==8){
                    }
                    break;
                case 5689:
                    if(chickendinner==5||chickendinner==6||chickendinner==8||chickendinner==9){
                    }
                    break;
                case 781011:
                    if(chickendinner==7||chickendinner==8||chickendinner==10||chickendinner==11){
                    }
                    break;
                case 891112:
                    if(chickendinner==8||chickendinner==9||chickendinner==11||chickendinner==12){
                    }
                    break;
                case 10111314:
                    if(chickendinner==10||chickendinner==11||chickendinner==13||chickendinner==14){
                    }
                    break;
                case 11121415:
                    if(chickendinner==11||chickendinner==12||chickendinner==14||chickendinner==15){
                    }
                    break;
                case 13141617:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 14151718:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 16171920:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 17182021:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 19202223:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 20212324:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 22232526:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 23242627:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 25262829:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 26272930:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 28293132:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 29303233:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 31323435:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
                case 32333536:
                    if(chickendinner==1||chickendinner==2||chickendinner==4||chickendinner==5){
                    }
                    break;
            }
            cornerhelp();
            /*
            
            
            
            
            */
            }
        }
        if(win==true){
        System.out.print("You won:"+winnings(amountbet,payout));}
        if(win==false){
        System.out.println("The house always wins...");
        System.out.print("You lost:"+amountbet);}
        
    }
    public static double winnings(double btamt,int odds){
    return btamt*odds;}
    public static boolean bettype( String bt){
    boolean intornot=false;
    try{
        int btype=Integer.parseInt(bt);
        intornot=true;
        return intornot;
        }catch(NumberFormatException e){
            intornot=false;
        }
    return intornot;}
    public static void showrules(){
        System.out.println("For a single number bet, type the number (except 0 and 00);");
        System.out.println("If you want 0, type '37'\nIf you want 00, type '38'");
        System.out.println("For a first dozen bet, type '112'\nFor a 2nd dozen bet, type '212' ");
        System.out.println("For a 3rd dozen bet, type '312'\nFor a 1-18 bet, type '118' ");
        System.out.println("For a 19-36 bet, type '1936'\nFor an even bet, type 'even'");
        System.out.println("For an odd bet, type 'odd'");
        System.out.println("For a bet on red, type 'red'");
        System.out.println("For a bet on black, type 'black'");
        
    }
    public static void cornerhelp(){
    System.out.println("Appropriate bets:\n (Enter one of these combinations on integers)"+
                "1245\n" +
                "2356\n" +
                "4578\n" +
                "5689\n" +
                "781011\n" +
                "891112\n" +
                "10111314\n" +
                "11121415\n" +
                "13141617\n" +
                "14151718\n" +
                "16171920\n" +
                "17182021\n" +
                "19202223\n" +
                "20212324\n" +
                "22232526\n" +
                "23242627\n" +
                "25262829\n" +
                "26272930\n" +
                "28293132\n" +
                "29303233\n" +
                "31323435\n" +
                "32333536");
    }
}
/*
 if(bettype==1){
                 win=true;
             }else if(bettype==2){
                 win=true;
             }else if(bettype==3){
                 win=true;
             }else if(bettype==4){
                 win=true;
             }else if(bettype==5){
                 win=true;
             }else if(bettype==6){
                 win=true;
             }else if(bettype==7){
                 win=true;
             }else if(bettype==8){
                 win=true;
             }else if(bettype==9){
                 win=true;
             }else if(bettype==10){
                 win=true;
             }else if(bettype==11){
                 win=true;
             }else if(bettype==12){
                 win=true;
             }else if(bettype==13){
                 win=true;
             }else if(bettype==14){
                 win=true;
             }else if(bettype==15){
                 win=true;
             }else if(bettype==16){
                 win=true;
             }else if(bettype==17){
                 win=true;
             }else if(bettype==18){
                 win=true;
             }else if(bettype==19){
                 win=true;
             }else if(bettype==20){
                 win=true;
             }else if(bettype==21){
                 win=true;
             }else if(bettype==22){
                 win=true;
             }else if(bettype==23){
                 win=true;
             }else if(bettype==24){
                 win=true;
             }else if(bettype==25){
                 win=true;
             }else if(bettype==26){
                 win=true;
             }else if(bettype==27){
                 win=true;
             }else if(bettype==28){
                 win=true;
             }else if(bettype==29){
                 win=true;
             }else if(bettype==30){
                 win=true;
             }else if(bettype==31){
                 win=true;
             }else if(bettype==32){
                 win=true;
             }else if(bettype==33){
                 win=true;
             }else if(bettype==34){
                 win=true;
             }else if(bettype==35){
                 win=true;
             }else if(bettype==36){
                 win=true;
             }else if(bettype==37){
                win=true; 
             }else if(bettype==38){
                 win=true;
             }
*/
