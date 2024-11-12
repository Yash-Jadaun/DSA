import java.util.Arrays;

public class cyclicSort {
    
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
             int correct = arr[i]-1;

             if(arr[i]!=arr[correct]){
                //swap
                swap(arr, i,correct);

             }
             else{
                continue;
             }
        }
    }


    public static void swap(int[] arr,int first,int second){
         int temp = arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
