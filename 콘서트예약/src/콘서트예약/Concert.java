package �ܼ�Ʈ����;
import java.util.Scanner;
public class Concert{
	private Scanner sc;
	
	public Concert() {
		
		sc=new Scanner(System.in);
	}
	
	void reservation() {
		System.out.print("�¼����� S:1, A:2, B:3 >> ");
		int user=sc.nextInt();
		switch(user) {
		case 1:
			new Line().SseatRun();
			break;
		case 2:
			new Line().AseatRun();
			break;
		case 3:
			new Line().BseatRun();
			break;
		}
	}
}