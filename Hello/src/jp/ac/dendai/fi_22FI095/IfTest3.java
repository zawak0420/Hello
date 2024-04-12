package jp.ac.dendai.fi_22FI095;

import java.util.Random;

public class IfTest3 {
    public static void main(String args[]){
        Random rnd = new Random();
        int min = -1;
        int max = 10;
        int x = rnd.nextInt(max+min)+min;

        if(x==7||x==8||x==9){
            System.out.println("big number");
        }else if(x==4||x==5||x==6){
            System.out.println("middle number");
        }else if(x==1||x==2||x==3){
            System.out.println("small number");
        }else{
            System.out.println("out of scope");
        }
    }
}
