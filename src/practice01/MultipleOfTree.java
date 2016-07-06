package practice01;

import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력");
		int number = scanner.nextInt();
		
		if(number%3==0){
			System.out.println("3의 배수 입니다.");
		}else{
			System.out.println("3의 배수가 아닙니다");
		}
		

	}
}
