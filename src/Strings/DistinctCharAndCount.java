package Strings;

import jdk.nashorn.internal.objects.NativeString;

public class DistinctCharAndCount {


    public void charCount(String input) {
        char arr[] = new char[input.length()];


        for (int i = 0; i < input.length(); i++) {

            arr[i]= input.charAt(i);

        }

        for(int j=0;j<arr.length;j++){

            for(int k=0;k<arr.length;k++){

                if(arr[k]<arr[k+1]){

                    char temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }

                System.out.println(arr[k]);
                }
            }


        }

    public static void main(String[] args) {

        DistinctCharAndCount dcc=new DistinctCharAndCount();
        String str="rajesh";
        dcc.charCount(str);
    }

    }

