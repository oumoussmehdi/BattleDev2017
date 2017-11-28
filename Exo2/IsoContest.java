
/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/

package Exo2;

import java.util.*;

public class IsoContest {
	public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n =  Integer.parseInt(N);
		String p = sc.nextLine();
		int cheapestPrice = Integer.MAX_VALUE;
		for(int i= 0; i < n; i++){
			line = sc.nextLine();
			String[] l = line.split(" ");
			String prodName = l[0];
			int prodPrice = Integer.parseInt(l[1]);
			if(!p.equals(prodName))
				continue;
			else{
				if(prodPrice < cheapestPrice)
					cheapestPrice = prodPrice;
			}
		}

		System.out.println(cheapestPrice);	
		}
	
}

