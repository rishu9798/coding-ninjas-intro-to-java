/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
22
333
4444
55555
Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666
*/

package pattern1;

import java.util.Scanner;

public class j {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n){
			int j = 1;
			while(j <= i){
				System.out.print(i);
				j = j+1;
			}
			System.out.println();
			i = i+1;
			}
	

		
	}

}
}
