import java.util.Scanner;

class Main {
  public static void main(String[] args) 
	{
		//Scanner print statment
		Scanner scan = new Scanner(System.in);
		//Print statement for name
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Welcome to Jared Theater " + name);
		//Print statements for what movie.
		System.out.println("What movie do you want to watch?");
		System.out.println("If you want to watch Godzilla vs King Kong please put 1.");
		System.out.println("If you want to watch Tom & Jerry please put 2");
		int whichMovie = scan.nextInt();
		//Print for name.
		System.out.println("How many people are coming with you?");
		int payPrice = scan.nextInt();
		
		int movie = priceMovie(payPrice);

		System.out.println("Thanks for watching. Your total is " + whatMovie(movie) + "$");
	}

	//Method that will tell them what movie will the person will watch.
	static int whatMovie(int movie)
	{
		if (movie == 1){
			System.out.println("\nGodzilla vs King Kong");
			return 10;
		}else if (movie == 2){
			System.out.println("\nTom & Jerry");
			return 10;
		}else {
			System.out.println("You can always rent a movie :)");
			return 0;
		}
	}	

	//method to give the price.
	static int priceMovie(int payPrice)
	{
		int movie = payPrice * 2;
		return movie;
	}
	






		
  
}