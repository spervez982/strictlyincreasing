import java.util.Scanner; // Import the Scanner class

public class StringIncreasing{
    public static void main (String[] args){
    double[] array1 = {9,8,7,6,5,4,3,2,1};
    double[] array2 = {0,1,2,3,4,5,6,7,8,9};
    
    isStrictlyIncreasing(array1);
    isStrictlyIncreasing(array2);
}

    public static void isStrictlyIncreasing(double[] in){ 
        for(int i=0;i<in.length-1;i++){
            if(in[i+1] < in[i]){
                System.out.println("false");
            }
          else  System.out.println("True");
    }
    
    }
