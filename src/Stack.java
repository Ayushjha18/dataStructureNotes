public class Stack {

    private int[] arr = new int[10];
    int top;
    int size;

    public Stack() {
        top = -1;
        size = arr.length;
    }



    public void push(int data) {

       if (top < size - 1)
           arr[++top] = data;
       else
           System.out.println("Stack overflow");

    }

    public int pop() {
        if (top > -1) {
            return arr[top--];
        } else {
            System.out.println("Stack underflow");
        }
        return 0;
    }

    public int peek() {
        return arr[top];
    }
    public void printStack() {
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }


}
