package assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		
		 // 1. Array of top 5 most populated countries
        String[] countries = {"China", "India", "United States", "Indonesia", "Pakistan"};
        System.out.println("Second most populated country: " + countries[1]);
        
        
        // 2. Array of top 10 most visited tourist attractions
        String[] attractions = {"Eiffel Tower", "Great Wall of China", "Statue of Liberty", "Machu Picchu", "Colosseum", 
                                "Taj Mahal", "Grand Canyon", "Louvre Museum", "Disneyland", "Times Square"};
        System.out.println("Number of tourist attractions: " + attractions.length);
        

        // 3. Map of 5 largest US cities and their populations
        Map<String, Integer> usCities = new HashMap<>();
        usCities.put("New York", 8419600);
        usCities.put("Los Angeles", 3980400);
        usCities.put("Chicago", 2716000);
        usCities.put("Houston", 2328000);
        usCities.put("Phoenix", 1690000);
        System.out.println("Largest US cities and populations: " + usCities);

        // 4. Array of 10 random integers using a different approach
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100); // Random numbers from 0 to 99
        }
        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Sum of 3rd and 5th values: " + (randomNumbers[2] + randomNumbers[4]));

        // 5. Array of top 5 highest-grossing movies
        String[] movies = {"Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens", "Avengers: Infinity War"};
        System.out.println("Third highest-grossing movie: " + movies[2]);

	}

}
