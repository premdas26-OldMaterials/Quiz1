import java.util.Scanner;

public class Baseball {
	
	
	private int AB;
	private int H;
	private int doubles;
	private int triples;
	private int HR;
	private int R;
	private int BB;
	private String name;
	

	public static void main(String[] args) {
		Baseball stats = new Baseball();
	}
	
	public Baseball() {
		System.out.println("Enter a player last name and number of hits, at bats, doubles, triples, home runs, runs scored, and base on balls: ");
		Scanner input = new Scanner(System.in);
		name = input.next();
		H = input.nextInt();
		AB = input.nextInt();
		doubles = input.nextInt();
		triples = input.nextInt();
		HR = input.nextInt();
		R = input.nextInt();
		BB = input.nextInt();
		input.close();
		System.out.println("Name: " + name);
		System.out.println("BA :" + BA());
		System.out.println("OBP: "+ OBP());
		System.out.println("TB: " + TB());
		System.out.println("SLG: " + SLG());
		System.out.println("OPS: " + OPS());
	}
	
	public double BA() {
		return (double) H/AB;
	}
	
	public double OBP() {
		return (double) (H + BB)/(AB + BB);
	}
	
	public int TB() {
		int singles = H - doubles - triples - HR;
		return singles + 2*doubles + 3*triples + 4*HR;
	}
	
	public double SLG() {
		return (double) TB()/AB;
	}
	
	public double OPS() {
		return OBP() + SLG();
	}

}