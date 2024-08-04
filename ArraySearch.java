import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
        int[] marks ={67, 89, 76, 98, 71};
        int num = 89;
        boolean isInArray = false;
        for(int mark:marks){
            if(num==mark){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The number is present in the array");
        }
        else{
            System.out.println("The number is not present the array");
        }
    }
}
