
public class TimerProgram {

	public static void main(String[] args) {

		Timer t = new Timer();

		t.addSeconds(50);
		t.addSeconds(25);
		System.out.println(t);

		t.addSeconds(50);
		System.out.println(t);

		t.addSeconds(-3);
		t.addSeconds(65);
		System.out.println(t);

		t.reset();
		t.addSeconds(55);
		t.addSeconds(55);
		t.addSeconds(55);
		t.addSeconds(55);

		System.out.println(t);

	}

}
