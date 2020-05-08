package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> favShows = new ArrayList();
		favShows.add("Money Hiest");
		favShows.add("Game of Thrones");
		favShows.add("Breaking Bad");
		favShows.add("Shameless");
		
		//Iterator iteration
		System.out.println("----Print using iterator-----");
		Iterator<String> tvshow = favShows.iterator();
		while(tvshow.hasNext()) {
			System.out.println(tvshow.next());
		}
		//using lambda java 8 
		System.out.println("----Print using lambda expression java 8-------");
		favShows.forEach(shows->{System.out.println(shows);
		});
		//using for each loop
		System.out.println("---Print using for each loop ------");
		for(String shows : favShows) {
			System.out.println(shows);
		}
		//using for loop
		System.out.println("---Print using for loop ------");
		for(int sh=0; sh<favShows.size(); sh++) {
			System.out.println(favShows.get(sh));
		}
		//using while loop
		System.out.println("---Print using while loop ------");
		int i = 0;
		while(i<favShows.size()) {
			System.out.println(favShows.get(i));
			i++;
		}
		

	}

}
