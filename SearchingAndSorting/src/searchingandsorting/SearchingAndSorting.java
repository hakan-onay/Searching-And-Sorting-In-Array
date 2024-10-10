
package searchingandsorting;

import java.util.Scanner;


public class SearchingAndSorting {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array: ");
        int elementNumberOfArray = input.nextInt();
        
        int[] array = new int[elementNumberOfArray];
        
        for(int i=0; i<array.length; i++){
            
            System.out.println("Enter the elements of the array: ");
            array[i]=input.nextInt();
        }
        
        System.out.println("Array entered:");
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
            
        }
        System.out.println();
        
        System.out.println("Enter the element to search for:");
        int searchingNumber = input.nextInt();
        
        int counter = 0;
        for(int i=0; i<array.length; i++){
            if(searchingNumber==array[i]){
                System.out.println("Element found at index: "+(i));
                counter++;
            }
            
        }
        if(counter==0){
            System.out.println(searchingNumber+" is not in the array");
        }
        
        
        
        
        int temp = 0;
        System.out.println("Sorted Array:");
        
        
        for (int k = 0; k < array.length; k++) {
            for(int i=1; i<array.length; i++){
            
                if(array[i-1]>array[i]){
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
                
            }
        }
        
        for(int j=0; j<array.length; j++){
                    System.out.print(array[j]+" ");
                }
        
        
    }
    
}
