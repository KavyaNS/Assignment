package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_Collections {

	public static void main(String[] args) {
		
		//List collection
		List<String> countries = new ArrayList<String>();
		countries.add("China");
		countries.add("India");
		countries.add("United States");
		countries.add("Indonesia");
		countries.add("Pakistan");
		
		System.out.println("Top 2nd populated country : "+countries.get(1));
		System.out.println();
		
		//Set collection
		Set<String> touristplace = new HashSet<String>();
		touristplace.add("Eiffel Tower");
		touristplace.add("Great Wall of China");
		touristplace.add("Dubai");
		touristplace.add("Acropolis of Athens");
		touristplace.add("London");
		touristplace.add("The Great Pyramid of Giza");
		touristplace.add("Louvre Museum");
		touristplace.add("Huayna Picchu");
		touristplace.add("New York");
		touristplace.add("Taj Mahal");
		
		System.out.println("Size :"+touristplace.size());
		
		//Map collection
		Map<String,Integer> largestcity =  new HashMap<String, Integer>();
		largestcity.put("New York City", 8491079);
		largestcity.put("LA", 3928864);
		largestcity.put("Chicago", 2722389);
		largestcity.put("Houston", 2239558);
		largestcity.put("Philadelphia", 1560297);
		
		System.out.println("Top 5 largest cities of US and their populations : "+largestcity);
		
		int [] randomintegers = {1,3,7,9,2,4,6,0,8,10};
		int sum = randomintegers[2]+randomintegers[4];
		System.out.println("sum of 3rd and 5th integer in the array : "+sum);
		
		//
		
		List<String> highestgrossingmovie = new ArrayList<String>();
		highestgrossingmovie.add("Avatar");
		highestgrossingmovie.add("Avengers: Endgame");
		highestgrossingmovie.add("Avatar: The Way of Water");
		highestgrossingmovie.add("Titanic");
		highestgrossingmovie.add("Spider-Man: No Way Home");
		System.out.println("Top 3rd higest grossing movie : "+highestgrossingmovie.get(2));
		
		
		
		
		
		

	}

}
