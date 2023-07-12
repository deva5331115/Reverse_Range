import java.util.Scanner;

public class ReverseRange {
    public int [] Reverse(int[] arr,int start,int stop){
        int i=start;
        int j=stop;
        int temp=arr[start];
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();

        }
        int start=scan.nextInt();
        int end=scan.nextInt();
        if(end>array.length-1){
            System.out.println("Enter valid sub array");
        }
        else {
            ReverseRange range=new ReverseRange();
            range.Reverse(array,start,end);
            for (int arr:array
                 ) {
                System.out.println(arr);
            }

        }
    }
}
