import javax.swing.JOptionPane;
public class ex3_5_1{
  public static void main(String[]args){
    Double x;
    Double xmean = 0.00,xfinal = 0.00,xall = 0.00;
    Double sd;
    String number = JOptionPane.showInputDialog("Enter the number of total students:");
    Double n = Double.parseDouble(number);
    for(int i =0;i<n;i++){
      String xer = JOptionPane.showInputDialog("Enter scores of students No "+(i+1));
      x = Double.parseDouble(xer);
      xall = xall+x;
      xmean = xmean+(x/n);
      xfinal = xfinal+Math.pow(x,2);
    }
    
    sd = Math.sqrt((xfinal-(2*xall*xmean)+(xmean*xmean*n))/n);
    JOptionPane.showMessageDialog(null,"Mean value of student score :"+xmean);
    JOptionPane.showMessageDialog(null,"S.D value of student score :"+sd);
  }
}