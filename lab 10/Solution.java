import java.util.Scanner;
class Solution {
    public static int[] insertZero(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            count++;
        } else {
            count = 0;
        }
        
        if (count == 5) {
            int[] newArr = new int[arr.length + 1];
            for (int j = 0; j < i + 1; j++) {
                newArr[j] = arr[j];
            }
            newArr[i+1] = 0;
            for (int j = i + 1; j < arr.length; j++) {
                newArr[j+1] = arr[j];
            }
            arr = newArr;
            count = 0;
        }
    }
    return arr;
}
public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
    int[] array=new int[10];
    for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
    insertZero(array);
    for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}
}
}