package arrays;
//***
//The selection sort algorithm sorts an array by repeatedly finding the minimum element
// (considering ascending order) from unsorted part and putting it at the beginning.
// The algorithm maintains two subarrays in a given array.
//
//1) The subarray which is already sorted.
//2) Remaining subarray which is unsorted.
//
//In every iteration of selection sort, the minimum element (considering ascending order)
// from the unsorted subarray is picked and moved to the sorted subarray.
//*********

public class SelectionSortArray {


    public void selectionSort(int a[],int n) {
        for (int i = 0; i < n - 1; i++) {
            int  iMin = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[iMin])
                    iMin = j;
            }
                int temp = a[i];
                a[i] = a[iMin];
                a[iMin] = temp;
            }

for (int i=0;i<n;i++){
       System.out.println("Sorted Array using selection sort" + ">>>>>>>>>" + " " + a[i]);

        }}
       //System.out.println("Sorted Array using selection sort"+ ">>>>>>>>>" +" "+a[i]);



    public static void main(String[] args) {

        int a[]={12,13,16,32,43,76,89,9,1};
        int len=a.length;

        SelectionSortArray ssa=new SelectionSortArray();

         ssa.selectionSort(a,len);


    }

}
