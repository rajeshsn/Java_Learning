package arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {

        public int removeDuplicate(int a[],int n){

            if (n==0 || n==1){
                return n;
            }
            int[] temp = new int[n];
            int b = 0;

            for(int i=0;i<n-1;i++){

            if (a[i] != a[i+1]){

                temp[b++]=a[i];
            }
            //System.out.println("after removing duplicate elements"+">>>>"+temp[b]);
        }
        temp[b++]=a[n-1];

        for (int i=0;i<b;i++){
            a[i]=temp[i];
        }
        return b;
        }


    public static void main(String[] args) {
        int arr[]={14,23,45,14,23,67,89,56,34,21,2,7,2};
        Arrays.sort(arr);
        int len =arr.length;
        RemoveDuplicateElements rde=new RemoveDuplicateElements();
       int length=rde.removeDuplicate(arr,len);
       // System.out.println(rde.-removeDuplicate(arr);
        for(int i=0;i<length;i++){

            System.out.println(arr[i]);
        }
    }
}
