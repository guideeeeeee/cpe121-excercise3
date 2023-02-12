import java.util.Scanner;
public class ex3_1_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    int x =0;
    int i = -1,j;
    int neg =0,pos=0,total=0;
    System.out.print("Enter an integer, the input ends if it is 0:");
    do{
      i = i+1;
      x = sn.nextInt();
      if (x<0)
        neg = neg+1;
      else if(x>0)
        pos = pos+1;
      total = total+x;
    }while(x!=0);
    System.out.println("The number of positives is :"+pos);
    System.out.println("The number of negatives is :"+neg);
    System.out.println("The total is :"+total);
    System.out.println("The average is :"+(double)total/i);
  }
}