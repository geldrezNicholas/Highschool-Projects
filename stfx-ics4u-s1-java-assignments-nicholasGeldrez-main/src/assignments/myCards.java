package assignments;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.ImageIcon;

public class myCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> orderedCards = new ArrayList();

		ArrayList<Integer> gameBoard = new ArrayList();

		int number = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 2; j++) {

				orderedCards.add(i);

			}

		}

		System.out.println(orderedCards);

		for (int j = 0; j < 16; j++) {

			number = (int) ((Math.random() * orderedCards.size()));

			gameBoard.add(orderedCards.get(number));
			orderedCards.remove(orderedCards.get(number));

		}

		System.out.println(orderedCards);
		System.out.println(gameBoard);

	}

}
