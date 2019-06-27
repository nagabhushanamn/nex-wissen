package com;

//------------------------------------------------
// Team-1 : TxrService
//------------------------------------------------

class AccountBalanceException extends Exception {
	private double balance;

	public AccountBalanceException(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		return "No enough funds, balance = " + balance;
	}

}

class InvalidInputException extends Exception {
	public InvalidInputException(String message) {
		super(message);
	}
}

class TxrService {
	public boolean txr(double amount, String fromAccNum, String toAccNum)throws AccountBalanceException,InvalidInputException {
		// Load 'from' & 'to' accounts
		double fromAccBalance = 1000.00;
		boolean b = true;
		if (b) {
			throw new InvalidInputException("Invalid input");
		} else {
			if (fromAccBalance >= amount) {
				// ..
				return true;
			} else {
//			return false;
				throw new AccountBalanceException(fromAccBalance);
			}
		}
	}
}



//------------------------------------------------
//Team-2 : Flight-Ticket-Booking 
//------------------------------------------------

class FlightTicketBooking {

	private TxrService txrService = new TxrService();

	public void bookTicket() {

		double amount = 1000.00;
		String fromAccNum = "1";
		String toAccNum = "2";

		try {
			boolean b = txrService.txr(amount, fromAccNum, toAccNum);
			if (b) {
				System.out.println("Flight confirmed");
			}
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		} catch (AccountBalanceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

//------------------------------------------------
//Team-3 : Cargo 
//------------------------------------------------

public class Use_Case_Ex {

	public static void main(String[] args) {

		FlightTicketBooking ticketBooking = new FlightTicketBooking();
		ticketBooking.bookTicket();

	}

}
