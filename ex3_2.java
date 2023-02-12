public class ex3_2{
  public static void main(String[]args){
    System.out.printf("Miles\tKilometers\t|\tKilometers\t\tMiles\n");
    for(int i = 1 ;i<=6;i++){
      System.out.printf("%d\t%.3f\t\t|\t%d\t\t\t%.3f\n",i,((float)i/0.621),((i+3)*5),(((i+3)*5)*0.621));
    }
    for(int i = 7 ;i<=10;i++){
      System.out.printf("%d\t%.3f\t|\t%d\t\t\t%.3f\n",i,((float)i/0.621),((i+3)*5),(((i+3)*5)*0.621));
    }
  }
}