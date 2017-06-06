// YIDAN JIN 1694752
public class ParseDigits {
  
  
  public static void main(String[] args) { 
    int a = Integer.parseInt (args[0]);
    int b = Integer.parseInt (args[1]);
    int c = Integer.parseInt (args[2]);
    int d = Integer.parseInt (args[3]);
    int e = Integer.parseInt (args[4]);
    int sum = a+b+c+d+e;
    int product = a*b*c*d*e;
    System.out.println(sum);
    System.out.println(product);
    if(sum > product){
      System.out.println(sum);
    }else
      System.out.println(product);
  }
  
  
}
