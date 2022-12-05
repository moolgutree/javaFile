package w;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// 임의로 입력받은 금액에 대해서 현금(지폐 및 동전)의 개수를 구하는 프로그램을 작성하시오.
		System.out.println("돈 입력: ");
		
		Scanner scn = new Scanner(System.in);
		
		String moneyString = scn.next(); 			// 숫자 사이에 ,가 들어갈 수 있으니까
		
		moneyString = moneyString.replace("원", ""); // 숫자가 아닌값 공백으로 바꾸기
		moneyString = moneyString.replace(",", ""); // 숫자가 아닌값 공백으로 바꾸기
		
		int money = Integer.parseInt(moneyString);  // 문자를 숫자로 바꾸어주는 것
		
		
		Moneycount myMoney = new Moneycount(money);
		myMoney.display();
	}

}
