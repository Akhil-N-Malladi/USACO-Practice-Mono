package problems.dsa.string;

import java.util.*;
public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            int n = sc.nextInt();
            int numA = 0;
            int numB = 0;
            sc.nextLine();
            char[] cards = sc.nextLine().toCharArray();
            for(char c:cards){
                if(c=='A'){
                    numA++;
                } else {
                    numB++;
                }
            }
            //System.out.println(n+"\t"+Arrays.toString(cards));
            if(cards[n-1]=='A'){            //Alice has the last card
                if(cards[0]=='A'){          //Alice has the first card
                    System.out.println("Alice1");
                } else {                    //Bob has the first card
                    if(numA>numB){          //Alice has more cards that Bob
                        System.out.println("Alice2");
                    } else if(numA==numB){  //Alice and bob have the same number of cards
                        System.out.println("Bob3");
                    } else {                //Alice has fewer cards than bob
                        System.out.println("Bob4");
                    }
                }
            } else {                        //Bob the last card
                if(cards[0]=='A'){          //Alice has the first card
                    if(numA>numB){          //Alice has more cards that Bob
                        System.out.println("Alice5");
                    } else if(numA==numB){  //Alice and bob have the same number of cards
                        System.out.println("Alice6");
                    } else {                //Alice has fewer cards than bob
                        System.out.println("Bob7");
                    }
                } else {                    //Bob has the first card
                    System.out.println("Bob8");
                }
            }

        }
    }
}