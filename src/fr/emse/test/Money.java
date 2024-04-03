package fr.emse.test;

class Money {
	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	public int amount() {
		return fAmount;
	}

	public String currency() {
		return fCurrency;
	}

	public MoneyBag add(Money m) {
		if (m.currency().equals(currency()))
		return new Money(amount() + m.amount(), currency());
		return new MoneyBag(this, m);
		}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Money money = (Money) obj;
	    return fAmount == money.fAmount && fCurrency.equals(money.fCurrency);
	}

}
