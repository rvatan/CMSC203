//package assignment2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This is the driver class for the Toy Company assignment
 * @author Ramiz
 * @Date 2/25/2020
 */

public class Birthday {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company!");
		String enteredName = JOptionPane.showInputDialog("Please enter the child's name: ");
		String enteredAge = JOptionPane.showInputDialog("How old is the child?");
		int enteredAge1 = Integer.parseInt(enteredAge);
		String enteredToy = JOptionPane.showInputDialog("Is the toy a plushie, a book, or blocks?");
		Toy to = new Toy(enteredToy,enteredAge1);
		Random r = new Random();
		to.setToy(enteredToy);
		to.setAge(enteredAge1);
		boolean isOk = to.ageOK();
		to.setCost(enteredToy);
		double c1=0;
		double c2=0;
		double c3=0;
		double c4=0;
		if (isOk == true) {
			JOptionPane.showMessageDialog(null,"Good Choice!");
			String card = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
			if (card.equalsIgnoreCase("yes")) {
				to.addCard(card);
			}
			String balloon = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
			if (balloon.equalsIgnoreCase("yes")) {
				to.addBalloon(balloon);
			}
			c1 = to.getCost();
			JOptionPane.showMessageDialog(null,"The gift for " + enteredName + to.toString());
			String anotherToy = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
			if (anotherToy.equalsIgnoreCase("yes")) {
				do {
					String childName = JOptionPane.showInputDialog("Please enter the child's name: ");
					to.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old is the child?")));
					to.setToy(JOptionPane.showInputDialog("Is the toy a plushie, a book, or blocks?"));
					boolean isOk1 = to.ageOK();
					if (isOk1 == false) {
						String another = JOptionPane.showInputDialog("The Toy is not age-appropriate \nDo"
								+ " you want to buy another toy? yes or no");
						if (another.equalsIgnoreCase("yes")) {
							String t1 = JOptionPane.showInputDialog("Is the new toy a plushie, a book, or blocks?");
							to.setToy(t1);
							to.setCost(t1);
							String card1 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
							if (card1.equalsIgnoreCase("yes")) {
								to.addCard(card1);
							}
							String balloon1 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
							if (balloon1.equalsIgnoreCase("yes")) {
								to.addBalloon(balloon1);
							}
							c2 = to.getCost();
							JOptionPane.showMessageDialog(null,"The gift for " + childName + to.toString());
							anotherToy = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
						}
						else {
							String card2 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
							if (card2.equalsIgnoreCase("yes")) {
								to.addCard(card2);
							}
							String balloon2 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
							if (balloon2.equalsIgnoreCase("yes")) {
								to.addBalloon(balloon2);
							}
							JOptionPane.showMessageDialog(null,"The gift for " + childName + to.toString());
							c2 = to.getCost();
							anotherToy = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Good Choice!");
						String card3 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
						if (card3.equalsIgnoreCase("yes")) {
							to.addCard(card3);
						}
						String balloon3 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
						if (balloon3.equalsIgnoreCase("yes")) {
							to.addBalloon(balloon3);
						}
						c2 = to.getCost();
						JOptionPane.showMessageDialog(null,"The gift for " + childName + to.toString());
						anotherToy = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
					}
					c2++;
				} while (anotherToy.equalsIgnoreCase("yes"));
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"Invalid Choice! \n Please choose a proper toy!");
			String t2 = JOptionPane.showInputDialog("Is the toy a plushie, a book, or blocks?");
			to.setToy(t2);
			to.setCost(t2);
			String card4 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
			if (card4.equalsIgnoreCase("yes")) {
				to.addCard(card4);
			}
			String balloon4 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
			if (balloon4.equalsIgnoreCase("yes")) {
				to.addBalloon(balloon4);
			}
			c3 = to.getCost();
			JOptionPane.showMessageDialog(null,"The gift for " + enteredName + to.toString());
			String anotherToy1 = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
			if (anotherToy1.equalsIgnoreCase("yes")) {
				do {
					String childName1 = JOptionPane.showInputDialog("Please enter the child's name: ");
					to.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old is the child?")));
					to.setToy(JOptionPane.showInputDialog("Is the toy a plushie, a book, or blocks?"));
					boolean isOk2 = to.ageOK();
					if (isOk2 == false) {
						String another1 = JOptionPane.showInputDialog("The Toy is not age-appropriate \nDo"
								+ " you want to buy another toy? yes or no");
						if (another1.equalsIgnoreCase("yes")) {
							String t1 = JOptionPane.showInputDialog("Is the new toy a plushie, a book, or blocks?");
							to.setToy(t1);
							to.setCost(t1);
							String card5 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
							if (card5.equalsIgnoreCase("yes")) {
								to.addCard(card5);
							}
							String balloon5 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
							if (balloon5.equalsIgnoreCase("yes")) {
								to.addBalloon(balloon5);
							}
							c4 = to.getCost();
							JOptionPane.showMessageDialog(null,"The gift for " + childName1 + to.toString());
							anotherToy1 = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
						}
						else {
							String card6 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
							if (card6.equalsIgnoreCase("yes")) {
								to.addCard(card6);
							}
							String balloon6 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
							if (balloon6.equalsIgnoreCase("yes")) {
								to.addBalloon(balloon6);
							}
							c4 = to.getCost();
							JOptionPane.showMessageDialog(null,"The gift for " + childName1 + to.toString());
							anotherToy1 = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Good Choice!");
						String card7 = JOptionPane.showInputDialog("Do you want a card with the toy? Yes or No");
						if (card7.equalsIgnoreCase("yes")) {
							to.addCard(card7);
						}
						String balloon7 = JOptionPane.showInputDialog("Do you want a balloon with the toy? Yes or No");
						if (balloon7.equalsIgnoreCase("yes")) {
							to.addBalloon(balloon7);
						}
						c4 = to.getCost();
						JOptionPane.showMessageDialog(null,"The gift for " + childName1 + to.toString());
						anotherToy1 = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
					}
					c4++;
				} while (anotherToy1.equalsIgnoreCase("yes"));
			}
		}
		JOptionPane.showMessageDialog(null, "The total cost of your order is $" + (c1+c2+c3+c4));
		JOptionPane.showMessageDialog(null,"Order number is "+r.nextInt(100000)+"\nThe programmer: Ramiz Vatan");
	}
}
