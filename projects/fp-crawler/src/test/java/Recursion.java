import org.junit.Test;

public class Recursion {
	
	@Test
	public void fibonacci(){
		for(int i =1;i<7;i++ ){
			System.out.println(add(i));
		}
	}
	
	public int add(int i){
		if(i==1 || i==2)
			return 1;
		return add(i-1)+add(i-2);
	}
}
