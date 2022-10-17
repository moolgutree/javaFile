package day10017;

import java.util.Scanner;

public class sample01 {
	
	public static void main(String[] args) {
		
		System.out.println("show me the money!!");
		
		Scanner scanner = new Scanner(System.in);
		
		String rapper1;
		String rapper2;
		String rapper3;
		String rapper4;
		//all pass 확인
		
		System.out.println("심사위원1의 평가 입력");
		rapper1 = scanner.next();
		System.out.println("심사위원2의 평가 입력");
		rapper2 = scanner.next();
		System.out.println("심사위원3의 평가 입력");
		rapper3 = scanner.next();
		System.out.println("심사위원4의 평가 입력");
		rapper4 = scanner.next();
		
		if (rapper1.equals("pass") && rapper2.equals("pass") && rapper3.equals("pass") && rapper4.equals("pass")) {
			System.out.println(" all pass !!! ");
		}
		
		else if (rapper1.equals("pass") || rapper2.equals("pass") || rapper3.equals("pass") || rapper4.equals("pass")) {
			System.out.println(" pass !!! ");
		}
		
		else {
			System.out.println(" 불구덩이 !!! ");
		}
	}
	
}
