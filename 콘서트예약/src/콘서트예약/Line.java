package 콘서트예약;
import java.util.Scanner;
public class Line{
	private Seat[]Sseat = new Seat[10];
	private Seat[]Aseat = new Seat[10];
	private Seat[]Bseat = new Seat[10];
	private Scanner sc = new Scanner(System.in);
	
	void InitialName() {
		for(int i=0;i<10;i++)Sseat[i]=new Seat("---");
		for(int i=0;i<10;i++)Aseat[i]=new Seat("---");
		for(int i=0;i<10;i++)Bseat[i]=new Seat("---");
	}
	
	void SseatRun() {
		System.out.print("S>> ");
		for(int i=0;i<10;i++) {
			System.out.print(" " +Sseat[i].getName());
		}
		System.out.print("\n이름>> ");
		String name=sc.nextLine();
		System.out.print("번호>> ");
		int number=sc.nextInt();
		
		Sseat[number]=new Seat(name);
	}
	
	void AseatRun() {
		System.out.print("A>> ");
		for(int i=0;i<10;i++) {
			System.out.print(" " +Aseat[i].getName());
		}
		System.out.print("\n이름>> ");
		String name=sc.nextLine();
		System.out.print("번호>> ");
		int number=sc.nextInt();
		
		Aseat[number]=new Seat(name);
	}
	
	void BseatRun() {
		System.out.print("B>> ");
		for(int i=0;i<10;i++) {
			System.out.print(" " + Bseat[i].getName());
		}
		System.out.print("\n이름>> ");
		String name=sc.nextLine();
		System.out.print("번호>> ");
		int number=sc.nextInt();
		
		Bseat[number]=new Seat(name);
	}
	
	void Lookup() {
		System.out.print("S>>");
		for(int i=0;i<10;i++) {
			System.out.print(" " +Sseat[i].getName());
		}
		System.out.println("");
		System.out.print("A>>");
		for(int i=0;i<10;i++) {
			System.out.print(" " +Aseat[i].getName());
		}
		System.out.println("");
		System.out.print("B>>");
		for(int i=0;i<10;i++) {
			System.out.print(" " +Bseat[i].getName());
		}
		System.out.println("");
	}
	
	void Cancel() {
		System.out.print("좌석 S:1, A:2, B:3 >> ");
		int user=sc.nextInt();
		String name;
		switch(user) {
		case 1:
			System.out.print("S>>");
			for(int i=0;i<10;i++) {
				System.out.print(" " +Sseat[i].getName());
			}
			System.out.println("");
			System.out.print("이름>> ");
			name=sc.nextLine();
			for(int i=0;i<Sseat.length;i++) {
				if(Sseat[i].getName().equals(name))
					Sseat[i]=new Seat("---");
				else
					System.out.println("해당하는 이름이 없습니다.");
			}
			break;
		case 2:
			System.out.print("A>>");
			for(int i=0;i<10;i++) {
				System.out.print(" " +Aseat[i].getName());
			}
			System.out.println("");
			System.out.print("이름>> ");
			name=sc.nextLine();
			for(int i=0;i<Aseat.length;i++) {
				if(Aseat[i].getName().equals(name))
					Aseat[i]=new Seat("---");
				else
					System.out.println("해당하는 이름이 없습니다.");
			}
			break;
		case 3:
			System.out.print("B>>");
			for(int i=0;i<10;i++) {
				System.out.print(" " +Bseat[i].getName());
			}
			System.out.println("");
			System.out.print("이름>> ");
			name=sc.nextLine();
			for(int i=0;i<Bseat.length;i++) {
				if(Bseat[i].getName().equals(name))
					Bseat[i]=new Seat("---");
				else
					System.out.println("해당하는 이름이 없습니다.");
			}
			break;
		}
	}
}