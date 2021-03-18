package exercise8;
import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//input list of human
		System.out.print("list of people:");
		int HumanCount = sc.nextInt();
		
		humanlist humans = new humanlist();
		human[] human = new human[6];
		for(int i = 0; i < HumanCount; i++ ) {
		human[i] = new human();
		
		//input the human weight
		System.out.print("\nhuman weight(in KG) : ");
		double weight = sc.nextDouble();
		human[i].setWeightOnEarth(weight);
		
		//weight calculator earth to mars
		WeightCalculator weightcal = new WeightCalculator();
		int weightInInt = ((int)(weightcal.getWeightOnMars(human[i].getWeightOnEarth()*100))+5);
		human[i].setWeightOnMars((double)weightInInt/100);
		
		humans.people.add(human[i]);
		}
		
		//display the weight on earth and weight on mars by using the arrayList
		for(int i = 0; i < humans.people.size(); i++) {
			
		System.out.println("\n\n Weight on Earth is : " + humans.people.get(i).getWeightOnEarth() + "KG");
		System.out.println("Weight on Mars is : " + humans.people.get(i).getWeightOnMars()+ "KG");
		
		}
		sc.close();
	}
}