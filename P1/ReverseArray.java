package P1;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int length = arr.length;
        int reverseArr[] = new int[length];
        int index=0;
        for(int i=length-1;i>=0;i--)
        {
            reverseArr[index++] = arr[i];
        }
        for(int i=0;i<reverseArr.length;i++)
        {
            System.out.print(reverseArr[i]+" ");
        }

    }
}
