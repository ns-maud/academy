package by.academy.homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		String[] suits = { "diamond", "hearts", "spades", "clubs" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

		int players = 0;
		int cardsQuantity = 52;

		Scanner scan = new Scanner(System.in);
		boolean check = false;

		while (check == false) {
			System.out.println("Введите число игроков: ");
			players = scan.nextInt();
			if (players * 5 >= cardsQuantity) {
				System.out.println("Число игроков превышает допустимое количество");
			} else if (players < 1) {
				System.out.println("Число игроков должно быть больше или равно 1");
			} else {
				check = true;
			}
		}
		
		scan.close();

		String[] deck = new String[cardsQuantity];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck[suits.length * j + i] = rank[j] + " " + suits[i];
			}
		}

		for (int i = 0; i < cardsQuantity; i++) {
			Random rand = new Random();
			int card = rand.nextInt(cardsQuantity);
			String temp = deck[card];
			deck[card] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < players * 5; i += 5) {
			for (int j = 0; j < 5; j++) {
				System.out.println(deck[i + j]);
			}
			System.out.println();
		}
	}
}
