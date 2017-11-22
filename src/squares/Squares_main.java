package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x[] = {0.0, 0.3, 0.8, 1.3, 1.5, 1.9, 2.9};
		double y[] = {1.0, 1.3, 3.4, 5.1, 5.2, 8.3, 9.9};
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100000; i++) {
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		}
	}

}
