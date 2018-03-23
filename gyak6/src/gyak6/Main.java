package gyak6;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		gyak6 a=new gyak6(6,4);
		gyak6 b=new gyak6(3);
		gyak6 c=a;
		
		System.out.println(a+"\n"+b+"\n"+c);
		a.setside(5, 6);
		System.out.println(a+"\n"+b+"\n"+c);
		
		a.setBothside(3);
		System.out.println(a==b);
		System.out.println(a==c);
		
		System.out.println("");
		
		Random r=new Random();
		
		gyak6[] sq=new gyak6[10];
		gyak6 small=new gyak6(10);
		System.out.println("adjon meg két számot");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		gyak6 standard=new gyak6(num1,num2);
		
		
		for (int i = 0; i < sq.length; i++) {
			 sq[i]=new gyak6(1);
			sq[i].setside(r.nextInt(8)+2, r.nextInt(8)+2);
			System.out.println(sq[i]);
			if(sq[i].getArea()<small.getArea()) {
			small=sq[i];
			
			
			
		}
		

	}
		int count=0;
		System.out.println("\n"+small+"\n");

		for (int i = 0; i < sq.length; i++) {
			if(sq[i].getArea()<standard.getArea()) {
				count++;
				System.out.println(sq[i]);
			}
		}
		System.out.println(count);
		for (int i = 0; i < sq.length; i++) {
			if(sq[i].getArea()==standard.getArea()) {
				
				System.out.println(sq[i]);
				break;
			}
			else System.out.println("nincs iylen");
			break;
		}
}
}
