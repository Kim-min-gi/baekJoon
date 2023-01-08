import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m;
		h= sc.nextInt();
		m= sc.nextInt();
		m = m-45;
		
		if(m<0) {
			if(h==0) {
				h=24;
			}
			h--;
			m= 60+m;
		}
		System.out.println(h+" "+m);	
	}
}
