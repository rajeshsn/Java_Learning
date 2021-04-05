package arrays;
//{12,67,32,11,60,44,34}}
public class SortArray {
    int temp;

    public void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);

        }


    }
    public static void main(String[] args) {
        int a[]={23,45,78,98,56,21,1,102,34,22,165,76};
        SortArray sa= new SortArray();
           // System.out.println(sa.sort(a));
sa.sort(a);
    }
}
