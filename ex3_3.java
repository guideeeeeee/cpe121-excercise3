public class ex3_3{
  public static void main (String[]args){
    int a=1;
    for (int i = 1;i<=9;i++){
      for(int j = 9;j>i;j--){
        System.out.print("\t");
      }
      for(int k=0;k<((i-1)*2)+1;k++){
        System.out.print(a+"\t");
        a++;
      }
      System.out.println();
    }
  }
}