import java.util.ArrayList;

public class Token {
  public static   boolean cheackOP(String ch)
  {
      return (ch.equals("(")||ch.equals(")")||ch.equals("+")||ch.equals("*")||ch.equals("-")||ch.equals("/"));
  }
  public static   boolean cheackOP(char ch)
  {
      return (ch=='('||ch==')'||ch=='+'||ch=='*'||ch=='-'||ch=='/');
  }
    
 public static ArrayList<String> TokenA(String text){
      ArrayList<String>token = new ArrayList<>();
      char ch=' ';
      String digiString="";
      int i=0;
      while (i<text.length()) {
        
        ch=text.charAt(i);
        if (ch==' ') 
        {i++;continue;}
        else if (cheackOP(ch)) {
            String c= ""+ch;
            token.add(c);
            i++;continue;
        }
        else{
            while (i<text.length()&&ch-'0'>=0&&ch-'0'<=9||ch=='.') {
             digiString=digiString+ch;
            
                i++;
                if (i<text.length()) {ch=text.charAt(i);}
                    
                
     
        }
        token.add(digiString);
        digiString="";
     

        
    }
        
      }


        return token;
    }


  }
