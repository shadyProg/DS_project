
    
public class StackLL {
    Node top = null;
 
    StackLL() {
    }
 
    boolean isEmpty() {
       return this.top == null;
    }
 
    void push(String value) {
       Node n = new Node(value);
       if (this.top == null) {
          this.top = n;
       } else {
          n.next = this.top;
          this.top = n;
       }
    }
 
    String pop() {
       if (this.isEmpty()) {
          System.out.println("Stack is empty, cannot pop");
          return null;
       } else {
          String value = this.top.data;
          this.top = this.top.next;
          return value;
       }
    }
    String peek(){
        
        return this.top.data;
    }
    void clear()
    {
      if (top!=null) {
         top=null;
      }
     
    }
} 

