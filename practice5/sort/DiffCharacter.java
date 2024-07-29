package practice5.sort;

import java.util.Scanner;

public class DiffCharacter {
    public static void charcount(String s){
        int alphacount=0;
        int numberscount=0;
        int specialcount=0;
        int spacecount=0;
        char[] letters = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(letters[i])){
                alphacount++;
            }
            else if(Character.isDigit(letters[i])){
                numberscount++;
            }
            else if(Character.isSpaceChar(letters[i])){
                spacecount++;
            }
            else{
                specialcount++;
            }
        }
        System.out.println("Count of Alphabets : "+ alphacount);
         System.out.println("Count of Numbers : "+ numberscount);
          System.out.println("Count of SpecialCharacters : "+ specialcount);
           System.out.println("Count of Spaces : "+ specialcount);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter String :");
        String s= sc.nextLine();
        charcount(s);

    }
}
