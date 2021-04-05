package arrays;


    public class MinMaxArray {
        int min;
        int max;
        int temp;
        public int minArray( int a[]){

            for (int i=0;i<a.length-1;i++){

                    if(a[i]<a[i+1]){

                            min =a[i];
                            a[i]=a[i+1];
                           a[i+1]=min;
                    }

                }

            return min;
        }

        public int maxValue(int b[]){

            for (int i=0;i<b.length-1;i++){

                    if(b[i]>b[i+1]){
                        max=b[i];
                        b[i]=b[i+1];
                        b[i+1]=max;
                    }

            }
            return max;
        }


        public static void main(String[] args) {
            int arr[] = {18,13,45,16,102,20,8,5,1,100,98};
            int arr1[] = {18,13,45,16,0,102,20,8,5,1,100,98};
            MinMaxArray mm= new MinMaxArray();
            System.out.println(mm.minArray(arr));
            System.out.println(mm.maxValue(arr1));
        }
    }


