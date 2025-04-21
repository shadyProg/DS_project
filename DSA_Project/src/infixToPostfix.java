import java.util.ArrayList;
public class infixToPostfix {

    ArrayList<String>tokens = new ArrayList<>();
    ArrayList<String>outPut = new ArrayList<>();
    StackLL opStackLL; //because isn`t fixed size
    
    infixToPostfix(String text)
    {
        this.tokens=Token.TokenA(text);
        opStackLL=new StackLL();
        
        convert();
    }
    // method is private because is so 


 /*public void convert()
 {
    String temp="";
   
     while (i<tokens.size()) {
        temp=tokens.get(i);
        if (!Token.cheackOP(temp)) {
            outPut.add(temp);
            i++;
            continue;
        }
        else   {
            if ( temp.equals("(")) {
                i++;
                convert();
            }
           else if ( temp.equals(")")) {
            return;
                
            }
            else{

                if (opStackLL.isEmpty()&&i<tokens.size()) {
                    opStackLL.push(temp);
                    i++;
                    continue;
                }
                else{

                    if (op(temp)>op(opStackLL.peek())) {
                        opStackLL.push(temp);
                        
                    }
                    else{
                        outPut.add(opStackLL.pop());
                        opStackLL.push(temp);
                    }
                }

            }

            
        }

        
    }
  
    }*/
    public void convert() {
        int i=0;
        while (i < tokens.size()) {
            String temp = tokens.get(i);
            
            if (!Token.cheackOP(temp)) {
                outPut.add(temp);
                i++;
            }
            else if (temp.equals("(")) {
                opStackLL.push(temp);
                i++;
            }
            else if (temp.equals(")")) {
                while (!opStackLL.isEmpty() && !opStackLL.peek().equals("(")) {
                    outPut.add(opStackLL.pop());
                }
                if (!opStackLL.isEmpty() && opStackLL.peek().equals("(")) {
                    opStackLL.pop(); // Remove the '(' from stack
                }
                i++;
            }
            else { // It's an operator
                while (!opStackLL.isEmpty() && !opStackLL.peek().equals("(") && op(temp) <= op(opStackLL.peek())) {
                    outPut.add(opStackLL.pop());
                }
                opStackLL.push(temp);
                i++;
            }
        }
        
        // Pop all the remaining operators from the stack
        while (!opStackLL.isEmpty()) {
            outPut.add(opStackLL.pop());
        }
    }

    private int op(String ch){

        switch (ch) {
            case "+":
            return 1;
            case "-":
            return 1;
            case "*":
            return 2; 
            case "/":
            return 2;
            default:
            break;
        }

    return 0;
     }
     void display()
     {
        System.out.print("Postfix expression: ");
        for(String  cString : outPut){
            System.out.print(cString+" ");
        }
     }
}



