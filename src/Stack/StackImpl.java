package Stack;

public class StackImpl {

    int top = -1;
    int capacity = 10;
    int arr[] = new int[capacity];

    public boolean push(int data) {


        if (top == capacity - 1) {

            System.out.println("Stack is overflow");

            return false;
        } else {

            top = top + 1;
            arr[top] = data;
            System.out.println("item pushed");
            return true;
        }

    }

    public boolean pop() {

        if (top < 0) {

            System.out.println("Stack is empty");
            return false;
        } else {
            arr[top] =0;
            top = top - 1;

            System.out.println("Item is popped");

            return true;

        }
    }



    public void printStack(){

        for(int i=0;i<5;i++){

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
     //   int arr[] = new int[6];
        StackImpl si= new StackImpl();
        si.push(99);
        si.push(19);
        si.push(29);
        si.push(39);
        si.push(58);
        si.printStack();
        si.pop();
        si.printStack();
    }
}
