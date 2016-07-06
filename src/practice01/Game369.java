package practice01;

public class Game369 {

	public static void main(String[] args) {
		int count=1;
		
		int c=0;
		while(c<99){
		
		int number=0;
		String sNumber=String.valueOf(count);
		
			for(int i=0;i<sNumber.length();i++){
			if(sNumber.charAt(i)=='3' || sNumber.charAt(i)=='6' ||sNumber.charAt(i)=='9'){
				number=number+1;	
			}	
		}
			if(number!=0){
				System.out.print(sNumber+"  ");
			for(int j=0;j<number;j++){
				System.out.print("짝");
			}
			System.out.println();
			}
			
			count=Integer.parseInt(sNumber);
			c++;
			count++;
		
		}
		
	}
		
		
		
		
		//int number = 1244;
		//Numeric String -> int형으로 바꿀때 Integer.parseInt(String)
		//int-> String : String.valueOf(int)
		//String sNumber=String.valueOf(count);
		//System.out.println(sNumber);	
		//System.out.println(sNumber.length());		
		//char c = sNumber.charAt(0);
		
	

	}

