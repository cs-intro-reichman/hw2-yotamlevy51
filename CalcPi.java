// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args [0]);
	    double p = 0;
	 
	 
	     for (int i = 0; i < N; i ++) {
	     	p = p + Math.pow(-1, i)/ ((2 * i) + 1);
	     }
	    System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pi, approximated:     " + (p*4));
	}
}
