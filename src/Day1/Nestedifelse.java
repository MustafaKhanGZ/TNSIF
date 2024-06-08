package Day1;

import java.util.Scanner;

public class Nestedifelse {
        public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            int a=10,b=20,c=30;
            
            if(a>b){
                if(a>c){
                    System.out.println(a);
                }
                else{
                    System.out.println(c);
                }
            }
            else{
                if(b>c){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }
        }
    }

