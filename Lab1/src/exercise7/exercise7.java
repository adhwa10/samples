package exercise7;
import java.util.Scanner;
public class exercise7 {
	
	public static void main(String[] args) {
		double EarthWeight, MarsWeight;
        Scanner sc = new Scanner(System.in);
        System.out.print("Your weight in kg: ");
        EarthWeight = sc.nextDouble();
        MarsWeight = (EarthWeight/9.81)*3.711;

         System.out.println("Your weight in earth: " + EarthWeight + "kg");
         System.out.println("Your weight at mars: " + String.format("%.2f", MarsWeight ) + "kg");
         
        sc.close();

}
}