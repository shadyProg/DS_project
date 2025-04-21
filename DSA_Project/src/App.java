import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("enter the expression you want to convert to postfix");
        System.out.println("example: (2-1+3.2)*2");
        System.out.print(": ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        infixToPostfix obj= new infixToPostfix( expression);
        Stack obj2=new Stack();
        obj2.decimaloperations(obj.outPut);
       
        obj.display();
        System.out.println();
        obj2.display();


       
    }
}
