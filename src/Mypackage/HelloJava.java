package Mypackage;

public class HelloJava {

	public static void main(String[] args) {
		System.out.println("Welcome back to OOPs with Java!");
//		Square sq  = new Square();
//		//sq.side = 12.5;
//		sq.setSide(12.5);
//		double a = sq.area();
//		System.out.println("Area:" +a + "sq meters");
//		double p = sq.perimeter();
//		System.out.println("Perimeter:" +p + "sq meters");
		Rectangle r = new Rectangle();
		r.a = 12;
		r.b = 13;
		int sq = r.area();
		int re = r.perimeter();
		System.out.println("Area:" +sq + "sq meters");
		System.out.println("Perimeter:" +re + "sq meters");
		
	}

}
