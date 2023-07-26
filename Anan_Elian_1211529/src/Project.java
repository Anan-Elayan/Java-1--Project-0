import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double weight; //*weight in earth (enter the user)
	    double number_Planet;//*(order of planet)
		double weight_planets ;//*output (weight in planet)
		System.out.print("Please enter the your current earth weight: ");//*input weight
		weight = input.nextInt();
		System.out.println();
		System.out.print("I have information for the following Planets: "); //*order of planet
		System.out.println("\n\t1. venus \t 2. Mars \t 3. Jupiter \t\n \t4. Saturn \t 5. Uranus \t 6. Neptune\n");
		System.out.print("Please enter the numbr of Planet are you Visiting? ");//*number planet
		number_Planet = input.nextDouble();
		System.out.println("");
		
		if (number_Planet==1)//* check if number planet 1 == venus
		{
			weight_planets = weight*0.78;//*calculating
            System.out.printf("Your weight would be %2.2f pounds on that planet",weight_planets);//*print weight in planet			
		}
		else if (number_Planet==2)//* check if number planet 2 == Mars
		{
			weight_planets = weight*0.39;//*calculating
        System.out.printf("Your weight would be %2.2f pounds on that planet.",weight_planets);	//*print weight in planet			
		}
		else if (number_Planet==3)//* check if number planet 3 == Jupiter
		{
			weight_planets = weight*2.65;//*calculating
            System.out.printf("Your weight would be %2.2f pounds on that planet",weight_planets);//*print weight in planet		
		}
		else if (number_Planet==4) //* check if number planet 4== Saturnd
		{
			weight_planets = weight*1.17;//*calculating
            System.out.printf("Your weight would be %2.2f pounds on that planet",weight_planets);//*print weight in planet
        }		

		else if (number_Planet==5) //* check if number planet 5 == Uranus
		{
			weight_planets = weight*1.05;//*calculating
            System.out.printf("Your weight would be %2.2f pounds on that planet",weight_planets);//*print weight in planet			
		}
		else if (number_Planet==6) //* check if number planet 6 == Neptune
		{
			weight_planets = weight*1.23;//*calculating
            System.out.printf("Your weight would be %2.2f pounds on that planet",weight_planets);//*print weight in planet		
	    }
		else //* if the number entered is not above
			System.out.println("the number  entered is  incorrect, try again");

	}

}
