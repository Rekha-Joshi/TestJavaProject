package classesandObjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder rekha = new AccountHolder();
		
		rekha.firstname = "Rekha";
		rekha.lastname = "Joshi";
		rekha.age = 34;
		rekha.accountBalance = 23459;
		rekha.testEligibiltyForCreditCard();
		System.out.println("Is Rekha eligible for Credit Card: "+rekha.eligibleforCreditCard);
				
	}

}
