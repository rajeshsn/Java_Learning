package arrays;

public class SumOfArray {
    int sum=0;
    public void sumArray(int a[],int n){

        for(int i=0;i<n;i++){

            sum =sum+a[i];

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a[] ={2,3,4,6,8,6};

        int len= a.length;
        SumOfArray soa=new SumOfArray();

        soa.sumArray(a,len);
    }
}
