import java.swing.JOptionPane;  
public class Java10 {
     public static void main(String[] args) {
          String input = JOptionPane.showInputDialog("Insert a string");
          int halfLength = input.length()   /2;

          String firstHalf = input.substring(0,halfLength);
          String secondHalf = input.substring(halfLength,input.length());
   
          String k = firstHalf.toUpperCase();
          String m = secondHalf.toLowerCase();

          System.out.println(k+m);

         System.exit(0);
 }//∞“π‘¥“ ‡‡ ß»√’ 64050065
}