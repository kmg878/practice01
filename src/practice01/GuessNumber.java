package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		while(true){
		 Random random =new Random();
		int number =random.nextInt(100)+1;	
		System.out.println(number);
		int rTemp=1; int hTemp=100;
		
		 int i=1;
	  while(true){
		 
		System.out.println("수를 정하였습니다 맞추세요  (1-100)");
		Scanner scanner= new Scanner(System.in);
		System.out.print(i+">>");
		int inPut = scanner.nextInt();
		  if(inPut==number){
			  System.out.println("정답입니다.");
			  break;
		  }else if(inPut>number){
			  hTemp=inPut;
			  System.out.println(hTemp+"-"+rTemp);
			  System.out.println("더 낮게"); 
			 
			  
		  }else if(inPut<number){
			  rTemp=inPut;
			  System.out.println(hTemp+"-"+rTemp);
			  System.out.println("더 높게");
			  
		  }
		 i++;
	  }
	  System.out.println("다시 하고 싶으면 y ,다시 하기 싫으면  n");
	  Scanner scanner= new Scanner(System.in);
	  String answer = scanner.next();
	  if( answer.equals("n") ){
		  break;
	  }
	  
		}
		
		
		
		

	}
}