package by.htp.javales.homewrk03;

public class Customer {
	public int id;
	private String secondName;
	private String name;
	private String patronymic;
	private String address;
	private String cardNumber;
	private String accountNumber;

	public Customer(int id, String secondName, String name, String patronymic, String address, String cardNumber,
			String accountNumber) {
		this.id = id;
		this.secondName = secondName;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void show() {
		System.out.println("---------------------------------------");
		System.out.println("| ID: " + this.id);
		System.out.println("| Name: " + this.name);
		System.out.println("| Second Name: " + this.secondName);
		System.out.println("| Patronymic: " + this.patronymic);
		System.out.println("---------------------------------------");
		System.out.println("| Address: " + this.address);
		System.out.println("| Card Number: " + this.cardNumber);
		System.out.println("| Account Number: " + this.accountNumber);
		System.out.println("---------------------------------------");
	}

	public String closeAccount() {
		if (this.accountNumber != "n/a") {
			if (this.cardNumber == "n/a") {
				this.accountNumber = "n/a";
			} else {
				System.out.println("!!! You must cancel the card!!!");
			}
		}else {
			System.out.println("You don't have an open account.");
		}
		return accountNumber;
	}

	public String changeCardNumber() {
		if (this.cardNumber != "n/a") {
			this.cardNumber = "AB" + this.cardNumber + "CD";
		} else {
			System.out.println("You don't have a bank card.");
		}

		return cardNumber;
	}

}
