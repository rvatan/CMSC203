package lab4;
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Movie mo = new Movie();
		String ans;
		do {
			System.out.println("Enter the movie title: ");
			String x=a.next();
			mo.setTitle(x);
			System.out.println("Enter the movie's rating: ");
			String y=a.next();
			mo.setRating(y);
			System.out.println("Enter the number of tickets sold: ");
			int z= a.nextInt();
			mo.setSoldTickets(z);
			System.out.println(mo.toString());
			System.out.println("Do you want to enter another movie? (y or n)");
			ans = a.next(); 
		} while (ans.equals("y"));
		if (ans.equals("n")) {
			System.out.println("Goodbye!");
		}
		a.close();

	}

}
