import java.util.Scanner;
public class Pal{
    public static void main(String[]args) {
        //palindrome using loops
        Scanner input = new Scanner(System.in);
        String word = input.next();

        int forward = 0;
        int backward = word.length()-1;
        while(forward < backward){
            if (word.charAt(forward)!=word.charAt(backward)){

                System.out.println("Not a palindrome");
                break;

            }
            forward++;
            backward--;
                if(word.charAt(forward) == word.charAt(backward)){
                    System.out.println("Yes!! It is a palindrome.");
                }

        }

    }

