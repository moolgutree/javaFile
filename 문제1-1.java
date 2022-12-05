package w;

public class Moneycount {
	int money;
	
	
	int m50000;
	int m10000;
	int m5000;
	int m1000;
	int m500;
	int m100;
	int m50;
	int m10;
	int m5;
	int m1;
	
	public Moneycount(int money) {
		this.money = money;
	}

	public void calc() {
		m50000 = money / 50000;
		m10000 = (money % 50000) / 10000;
		m5000 = (money % 10000) / 5000;
		m1000 = (money % 5000) / 1000;
		m500 = (money % 1000) / 500;
		m100 = (money % 500) / 100;
		m50 = (money % 100) / 50;
		m10 = (money % 50) / 10;
		m5 = (money % 10) / 5;
		m1 = money % 5;
	}
	
	
	
	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("5만원 : ") .append(m50000) .append("장\n")
		.append("1만원 : ") .append(m10000) .append("장\n")
		.append("5천원 : ").append(m500).append("장\n")
		.append("1천원 : ").append(m1000).append("장\n")
		.append("5백원 : ").append(m500).append("장\n")
		.append("1백원 : ").append(m100).append("장\n")
		.append("50원 : ").append(m50).append("장\n")
		.append("10원 : ").append(m10).append("장\n")
		.append("5원 : ").append(m5).append("장\n")
		.append("1원 : ").append(m1).append("장\n");
	}
}
