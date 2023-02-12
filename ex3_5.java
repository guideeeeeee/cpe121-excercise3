import javax.swing.JOptionPane;
public class ex3_5{
  public static void main(String[]args){
    Double[] x = new Double[100];
    Double xi = 0.00,xmean = 0.00,xall= 0.00,xfinal = 0.00;
    Double sd;
    String number = JOptionPane.showInputDialog("Enter the number of total students:");
    Double n = Double.parseDouble(number);
    for(int i =0;i<n;i++){
      String xer = JOptionPane.showInputDialog("Enter scores of students No "+(i+1));
      x[i] = Double.parseDouble(xer);
      xall = xall+x[i];
    }
    xmean = xall/n;
    for(int i =0;i<n;i++){
      xfinal = xfinal+(Math.pow((x[i]-xmean),2));
    }
    sd = Math.sqrt(xfinal/n);
    JOptionPane.showMessageDialog(null,"Mean value of student score :"+xmean);
    JOptionPane.showMessageDialog(null,"S.D value of student score :"+sd);
  }
}