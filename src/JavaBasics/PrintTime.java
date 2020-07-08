package JavaBasics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintTime {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		
		//int Time = Integer.parseInt(dtf.format(now));
		
		System.out.println(now);

	}

}
