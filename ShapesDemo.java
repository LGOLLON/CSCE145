
public class ShapesDemo {

	public static void main(String[] args) {
		//Polymorphism
		
		Shapes[] sh = new Shapes[3];
		
		sh[0] = new Rectangle(2, 5, 15);
		
		sh[1] = new EquilateralTriangle(2, 7);
		
	}

}
