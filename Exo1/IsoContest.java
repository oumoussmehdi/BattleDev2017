/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/

package Exo1;
import java.util.*;

public class IsoContest {
	public static void main( String[] argv ) throws Exception {
		String line;
		int[] counter = new int[2];
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();

		int n = Integer.parseInt(N);
		for(int i =0; i < n; i++){
			line = sc.nextLine();

			String[] sarr = line.split(" ");
			int a = Integer.parseInt(sarr[0]);
			int b = Integer.parseInt(sarr[1]);
			if(a>b)
				counter[0]++;
			else if(a<b)
				counter[1]++;
		}
		
		if(counter[0]>counter[1])
			System.out.println("A");
		else 
			System.out.println("B");

	}
}