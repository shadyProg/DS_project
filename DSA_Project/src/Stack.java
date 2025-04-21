import java.util.ArrayList;


public class Stack {
    Nodes top2;
    int counter=0;
    boolean isempty(){
        return (top2==null);
    }
    double pop() {
        if (top2 != null) {
            double rsa = top2.Data;
            top2 = top2.Next;
            counter--;
            return rsa;
        }
        return -1;
    }

    void push(double value) {
        Nodes newnode = new Nodes(value);
        if (isempty()) {
            newnode.Next = null;
            top2 = newnode;
        } else {
            newnode.Next = top2;
            top2 = newnode;
        }
        counter++;
    }
    void decimaloperations(ArrayList<String> arr) {
        int s = arr.size();

        for (int i = 0; i < s; i++) {
            String element = arr.get(i);
            if (Token.cheackOP(element)) {
               
                if (element.equals("+")) {
                    push(pop() + pop());
                } else if (element.equals("-")) {
                    double x = pop();
                    double y = pop();
                    push(y - x);
                } else if (element.equals("*")) {
                    push(pop() * pop());
                } else if (element.equals("/")) {
                    double x = pop();
                    double y = pop();
                    push(y / x);
                }
            } else {
               push(Double.parseDouble(element)); 

            }}
        
    }
    public void display() {
        Nodes temp = top2;
        System.out.print("result: ");
        while (temp != null) {
            System.out.print(temp.Data);
            temp = temp.Next;
        }
        System.out.println();
    }
}
