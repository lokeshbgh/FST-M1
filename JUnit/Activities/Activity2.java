package session1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Activity2 {

	@Test
	public void notEnoughFunds() {
		BankAccount bank= new BankAccount(10);
		Assertions.assertThrows(NotEnoughFundsException.class, () -> bank.withdraw(15),"Balance must be greater than amount of withdrawal");
	
		
	}
	@Test
	public void enoughFunds() {
		BankAccount bank=new BankAccount(100);
		Assertions.assertDoesNotThrow(() -> bank.withdraw(100));
	
	}
}
