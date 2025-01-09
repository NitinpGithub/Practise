package P1;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,9};
        int length = arr.length;
        //Arrays.sort(arr);
        int temp=0;

        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
