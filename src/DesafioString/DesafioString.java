package DesafioString;

public class DesafioString {

    public static void main(String[] args){

        String oldString = "Palmério";
        int index0 = 0;
        int index1 = 1;
        int index2 = 2;
        int index3 = 3;
        int index4 = 4;
        int index5 = 5;
        int index6 = 6;
        int index7 = 7;

        char[] charArray = oldString.toCharArray();
        charArray[index0] = 'o';
        charArray[index1] = 'i';
        charArray[index2] = 'r';
        charArray[index3] = 'é';
        charArray[index4] = 'm';
        charArray[index5] = 'l';
        charArray[index6] = 'a';
        charArray[index7] = 'P';

        String newString = String.valueOf(charArray);

        System.out.println(newString);

    }
}
