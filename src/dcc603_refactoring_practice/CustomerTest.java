package dcc603_refactoring_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testStatement() {
		Movie darkKnight = new Movie("Batman: Cavaleiro das Trevas", 0);
		Movie joker = new Movie("Coringa", 1);
		Movie insideOut = new Movie("Divertida Mente", 2);
		
		Rental firstRental = new Rental(darkKnight, 10);
		Rental secondRental = new Rental(insideOut, 5);
		Rental thirdRental = new Rental(joker, 10);
		
		Customer user = new Customer("Jonatas Cavalcante");
		user.addRental(firstRental);
		user.addRental(secondRental);
		user.addRental(thirdRental);
		
		String expectedResult = "Rental Record for Jonatas Cavalcante\n" + 
		"	Batman: Cavaleiro das Trevas	14.0\n" + 
		"	Divertida Mente	4.5\n" + 
		"	Coringa	30.0\n" + 
		"Amount owed is 48.5\n" + 
		"You earned 4 frequent renter points";
		
		assertTrue(user.statement().equals(expectedResult));
	}

}
