package collection_1_may;

import java.util.*;


class Alpha implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		  return o1.ename.compareTo(o2.ename);//compareTo is string class method 
		  // it return 0 -1 or 1
		  
	}
	
}
public class PriorityEmployee {

	public static void main(String[] args) {
		Emp e= new Emp("neha","delhi");
		Emp e1= new Emp("amit","noida");
		Emp e2= new Emp("riya","delhi");
		Emp e3= new Emp("ashu","noida");
		Emp e4= new Emp("chatan","delhi");
		Emp e5= new Emp("bina","noida");
		Emp e6= new Emp("kamal","delhi");
		//by default uses comparator 
		
		PriorityQueue<Emp> r= new PriorityQueue<Emp>(new Alpha());
		r.add(e);//add method will call compare method in line 10
		r.add(e1);
		r.add(e2);
		r.add(e3);
		r.add(e4);
		r.add(e5);
		r.add(e6);
		//System.out.println(r);
		
		System.out.println(r.remove());
		System.out.println(r.remove());
		System.out.println(r.remove());
		System.out.println(r.remove());
	}

}
