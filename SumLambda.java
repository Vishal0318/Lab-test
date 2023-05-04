package Lambda_test;
//marker interface  - empty interface 
    interface xyz{}
    
//functional interface having only one method 

interface calculation
{
	int sum(int a,int b);
}

public class SumLambda {

	public static void main(String[] args) {
//we are creating method with body but without method name 
//this is lambda expression i.e shortcut way of creating a method 		
		calculation c = (a,b)-> a+b;
		
		System.out.println(c.sum(10,20));
		System.out.println(c.sum(22,33));
		
	}

}
