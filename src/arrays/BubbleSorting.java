package arrays;

//****Bubble Sort is the simplest sorting algorithm that works by repeatedly
// swapping the adjacent elements if they are in wrong order.

public class BubbleSorting {

    public void bubbleSort(int a[],int n){

        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){

                if(a[j]>a[j+1]){

                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){

            System.out.println("Sorted Array using Bubble sort" + ">>>>>>>>>" + " " + a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] ={12,34,52,44,11,10,6,5,1,89,102};
        int len= a.length;
        BubbleSorting bs = new BubbleSorting();

        bs.bubbleSort(a,len);
    }
}
