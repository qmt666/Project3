import java.util.Scanner;

public class Project3 {
  static Scanner input = new Scanner(System.in);
  
  static double height = input.nextDouble();
  
  static int weight = input.nextInt();
  
  static int age = input.nextInt();
  
  static String gender = input.next();
  static double BMI;
  public static void main(String[] args) {
    useBMI();
    BodyFatRate();
  }
  public static void useBMI() {
    BMI = getBMI(height, weight);
  }
  public static double getBMI(double theHeight, int theWeight) {
    double result = theWeight/(theHeight*theHeight);
    //System.out.println(result);
    return result;
  }
  
  public static void BodyFatRate() {
    if(gender== "boy") {
      System.out.println(1.2*BMI+0.23*age-5.4-10.8*1);
    }
    else{
        System.out.println(1.2*BMI+0.23*age-5.4-10.8*0);
    }
   
  }
  
}