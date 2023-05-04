package Collection_27_april;
import java.util.*;
//Collection class in java are all generic type
// wap to store 100 numbers and print them 
//Set interface --> data is always unique means no duplicate 
public class SetExample {

	public static void main(String[] args) {
		 
		
		//HashSet<Integer> k= new HashSet<Integer>();
		
		HashSet  k= new HashSet();
		k.add(10);
		k.add(20.3f);
		
		k.add("neha");
		k.add(true);
		k.add(15);
		k.add(2773);
		k.add(13);
		k.remove(20);
		k.remove(2773);
		//System.out.println(k.contains(12));
		System.out.println(k);

	}

}
