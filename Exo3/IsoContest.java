package Exo3;
import java.util.*;

public class IsoContest {
	public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.parseInt(N);
		
		LinkedList<Tuple> xs = new LinkedList<Tuple>();
		
		for(int i = 0; i < n; i++){
			
			line = sc.nextLine();
			if(line.contains("X")){
				int j = line.indexOf("X");
				Tuple tupleX = new Tuple(i,j);
				xs.add(tupleX);
			}
		}
		
		

}
	
	static public class Tuple{
		int i;
		int j;
		
		public Tuple(int i, int j){
			this.i=i;
			this.j=j;
		}
		
		public void surrounding(Tuple t){
			Tuple t1 = new Tuple(t.i-1, t.j-1);
			Tuple t2 = new Tuple(t.i-1, t.j-1); 
			Tuple t3 = new Tuple(t.i-1, t.j-1); 
			Tuple t4 = new Tuple(t.i-1, t.j-1); 
			Tuple t5 = new Tuple(t.i-1, t.j-1); 
			Tuple t6 = new Tuple(t.i-1, t.j-1); 
			Tuple t7 = new Tuple(t.i-1, t.j-1); 
			Tuple t8 = new Tuple(t.i-1, t.j-1); 

		}
		
		public boolean eligible(Tuple t, int n){
			if(t.i < 0 || t.i > n)
				return false;
			if(t.j < 0 || t.j > n)
				return false;
			return true;
		}
	}
}
