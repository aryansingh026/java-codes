import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class bubble_sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   
public static void main(String[] args){
    //System.out.println("Enter the numbers of an array: ");
    //Scanner sc = new Scanner(System.in);
    int arr[]= {7,8,3,1,2};
        //Buuble Sorting
    for(int i=0; i<arr.length-1; i++){
        for(int j=0;j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                //swapping
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    } 
    printArray(arr);
}
} 

/* 
import java.util.*;

class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};
       boolean swapped;

       //bubble sort
       for(int i=0; i<arr.length-1; i++) {
           swapped = false;
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swapped = true;
               }
           }
           // If no two elements were swapped by inner loop, then break
           if (!swapped) {
               break;
           }
       }

       printArray(arr);
   }
}
*/
