package com.nexturn.Hibernet;

import java.util.Scanner;

import com.nexturn.assignment1.DOA;
import com.nexturn.assignment1.Movie;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != 5) {
			System.out.println("Press 1: For Add movie ");
			System.out.println("Press 2: For Update Movie");
			System.out.println("Press 3: For Delete Movie");
			System.out.println("Press 4: For Get Movie Details");
			System.out.println("Press 5: For Exit");
			System.out.println("************");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Movie movie = new Movie();
				DOA movieDao = new DOA();
				movieDao.addMovie(movie);
				break;
			case 2:
				DOA movieDao3 = new DOA();
				movieDao3.updateMovie();
				break;
			case 3:
				DOA movieDao2 = new DOA();
				movieDao2.deleteMovie();
				break;
			case 4:
				DOA mDao = new DOA();
				System.out.println(mDao.getMovieDetails());
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter Valid Input");
			}
		}

	}

}
