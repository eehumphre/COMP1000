import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String noun;
		System.out.print("Noun: ");
		noun = scanner.nextLine();
		//System.out.println();

		System.out.print("Your new pet is a ");
		System.out.print(noun);
		
		String adjective;
        adjective = scanner.nextLine(); 
        System.out.print("adjective: "); 
        adjective = scanner.nextLine();  
        System.out.print("It is a very ");
        System.out.print(adjective);
        System.out.print(" pet.");
        String verb;
        verb = scanner.nextLine();
        System.out.print("Verb:");
        verb = scanner.nextLine();
        System.out.print("Your pet is ");
        System.out.print(verb ); 
        System.out.print(" away from you! You better go catch it!");
        System.out.print("You");
       
        int number;
        long start = System.nanoTime();
        noun = scanner.nextLine(); 
        System.out.println("Enter an age for your pet: ");
        number = scanner.nextShort(); 
       
        if (number < 100) {
        			System.out.println("Your pet is still alive! That's good. Dead pets are no fun." );

        		} else {
        			System.out.println("Your pet is dead! Why did you pick such an old age!?");
        		}}}
     