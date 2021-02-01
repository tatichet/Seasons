package myPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("What is current season?");
				
				String month = br.readLine();
		
	 Seasons season = Seasons.DEFAULT;
	
		switch (month) {
		case "December":
		case "January":
		case "February":
		season = Seasons.WINTER;
		break;
		case "March":
		case "April":
		case "May":
		season = Seasons.SPRING;
		break;
		case "June":
		case "Jule":
		case "August":
		season = Seasons.SUMMER;
		break;
		case "September":
		case "October":
		case "November":
		season = Seasons.AUTUMN;
		break;
		default:
			System.out.println("No this month");
		}
System.out.println("Current season is: " + season);
	} 
}
