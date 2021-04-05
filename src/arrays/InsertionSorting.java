package arrays;

//the lower part of an array is maintained to be sorted.
// An element which is to be 'insert'ed in this sorted sub-list,
// has to find its appropriate place and then it has to be inserted there. Hence the name, insertion sort.
//The array is searched sequentially and unsorted items are moved and inserted into the
// sorted sub-list (in the same array). This algorithm is not suitable for large data sets as its
// average and worst case complexity are of Ο(n2), where n is the number of items.
public class InsertionSorting {

    public void insertionSort(int a[],int n){

        for(int i=1;i<n-1;i++){

            int positionValue=a[i];
            int position=i;

            while(position>0 && a[position-1]>positionValue){

                int temp=a[position];
                a[position]=a[position-1];
                a[position-1]=temp;
                position--;

            }
            a[position]=positionValue;
        }

        for(int i=0;i<n;i++){

            System.out.println("Sorted Array using insertion sort" + ">>>>>>>>>" + " " + a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {21,1,23,43,1,11,23,56,65,76,89,12,34,33};

        int len = a.length;

        InsertionSorting is= new InsertionSorting();
        is.insertionSort(a,len);
    }
}
