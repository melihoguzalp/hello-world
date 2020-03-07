package multiplication.table;

public class Main {

	public static void main(String[] args) {
		
		
	int result=0;
		
		for(int i = 1; i<=9; i++) {
			//Nested Loop
			
			for(int j=i;j<=9;j++) {
				
				result = i*j;
				String formattedOutput = String.format("(%d x %d) = %d" , i , j,result);
				System.out.println(formattedOutput);
				
			}
						
		}
		
		

	}

}
