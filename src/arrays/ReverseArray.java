package arrays;

public class ReverseArray {
int temp;

    public void reverseArray(int a[]) {

        for (int i = a.length-1; i >=0; i--) {
                /*temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;*/

            System.out.println(a[i]);

        }
    }

    public void arrayReverse(int a[],int start,int end){

        while(start<end){

            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
      }
    }

    public static void main(String[] args) {
        int arr[]={10,12,34,45,67,19,21,23};

        int n=arr.length;

        ReverseArray ra=new ReverseArray();
        ra.arrayReverse(arr,0,n-1);

        for(int i=0;i<n;i++){

            System.out.println(arr[i]);
        }
    }
}
