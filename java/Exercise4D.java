import java.lang.Math;
import javax.swing.JOptionPane;  
public class Exercise4D {
     public static void main(String[] args) {
            String input_B , input_h , input_B2 , input_h2 ;
			double x , y , area , x2 , y2 , area2 ; 
            //triangle 1
			input_B =  JOptionPane.showInputDialog("Input base : ");
			input_h =  JOptionPane.showInputDialog("Input height : ");
            x = Double.parseDouble(input_B);    
            y = Double.parseDouble(input_h);
            area = (1.0/2.0)*x*y;
            System.out.println("Area of triangle 1 : "+area);
            //triangle 2 
			input_B2 =  JOptionPane.showInputDialog("Input base2 : ");
			input_h2 =  JOptionPane.showInputDialog("Input height2 : ");
            x2 = Double.parseDouble(input_B2);    
            y2 = Double.parseDouble(input_h2);
            area2 = (1.0/2.0)*x2*y2;
            System.out.println("Area of triangle 2 : "+area2);
 }
 }
 //∞“π‘¥“ ‡‡ ß»√’ 64050065
