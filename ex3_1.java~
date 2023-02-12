import java.util.Scanner;
public class ex3_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    int[] x = new int[100];
    int i = -1,j;
    int neg =0,pos=0,total=0;
    System.out.print("Enter an integer, the input ends if it is 0:");
    do{
      i = i+1;
      x[i] = sn.nextInt();
      System.out.printf("x[%d] = %d \n",i,x[i]);
    }while(x[i]!=0);
    for(j = 0;j < i;j++){
      if (x[j]<0)
        neg = neg+1;
      else
        pos = pos+1;
      total = total+x[j];
    }
    System.out.println("The number of positives is :"+pos);
    System.out.println("The number of negatives is :"+neg);
    System.out.println("The total is :"+total);
    System.out.println("The average is :"+(double)total/j);
  }
}