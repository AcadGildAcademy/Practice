
public class Hello {

	
	//method
	public static void main(String[] args) {
		int i=1;
	
		while(i<=10){
			System.out.println(i);
			
			for(int j=0;j<=3;j++)
			{
			//i=i+2;	
			    if(j==2){
		        break;
		        //
		}
			
		System.out.println("The value of i after increment by 2 - "+i+" j  value"+j);
			}
			i++;
		}
		
	}
}
