package test;

import java.util.Scanner;

public class no {
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n<3){
            System.out.print(true);
        }
        else{
            int prev = s.nextInt();
            int curr = s.nextInt();
            
            int flag = 0;

            int diff = curr - prev;

            for(int i = 1; i<n-1; i++){
                if(curr - prev != diff){
                    System.out.print(false);
                    flag++;
                    break;
                }
                else{
                    prev = curr;
                    curr = s.nextInt();
                }
            }
            if(flag==0){System.out.print(true);}
            
        }

	}
}
