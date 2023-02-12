import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex3_4{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a,x,n:");
    Double a = sn.nextDouble();
    Double x = sn.nextDouble();
    int n = sn.nextInt();
    switch(n){
      case 0:
        JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+" is "+(a*(1)));
        break;
      case 1:
        JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+" is "+(a*(x)));
        break;
      case 2:
        JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+" is "+(a*(x*x)));
        break;
      case 3:
        JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+" is "+(a*(x*x*x)));
        break;
      case 4:
        JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+" is "+(a*(x*x*x*x)));
        break;
      case 5:
        JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+" is "+(a*(x*x*x*x*x)));
        break;
      default:
        JOptionPane.showMessageDialog(null,"Error");
        break;
        
    }
  }
}