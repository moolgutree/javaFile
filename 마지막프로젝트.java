package dy1024;

import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double total = 0;
		System.out.print("학생 수 : ");
		
		int people = scanner.nextInt();
		double[] arr = new double[people];
		
		for (int i = 0; i < people; i++) {
			System.out.print("학생" + (i + 1)+ "의 점수: ");
			arr[i] = scanner.nextDouble();
		}
		for(int i = 0; i < people; i++) {
			total += arr[i];
		}
		System.out.println("학생 평균" + total / people);
	}

}
