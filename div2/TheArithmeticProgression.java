public class TheArithmeticProgression {
	public double minimumChange(int a, int b, int c) {

		int d1 = b -a;
		int d2 = c -b;

		if(d1==d2){ return 0.0;}

		return (double)Math.abs((d1-d2)/2.0);
	}
}