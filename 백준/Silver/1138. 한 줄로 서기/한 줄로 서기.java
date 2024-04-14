import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt(); // 사람수 입력
		int []tall=new int[N+1]; //키 1~N까지 사람의 왼쪽에 있는 자기보다 큰 사람수를 저장하는 배열 
		                         //tall[0]은 비워둔다 
		for(int i=1;i<N+1;i++) {
			tall[i]=scan.nextInt(); //tall[1]은 키가 1인 사람의 왼쪽에 있는 자기보다 큰 사람수 
		}
		
		List<Integer> line=new ArrayList<>(); // 줄을 세울 ArrayList line
		for(int i=N;i>=1;i--) {
			line.add(tall[i],i); //키가 i인 사람을 인덱스 tall[i]번째에 삽입한다 
		}
		
		for(Integer e: line)
			System.out.println(e);
	}
}