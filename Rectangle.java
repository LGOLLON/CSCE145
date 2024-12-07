public class Rectangle extends Shapes implements Rectangleinterface{
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		this.height = 0;
		this.width = 0;
	}
	
	

	public void drawHere() {
		drawHorizontalLine();
		drawSides();
		drawHorizontalLine();
	}
	
	private void drawHorizontalLine() {
		this.skipSpaces(this.getOffset());
		
		for(int i = 0; i < this.width; i++) {
			System.out.println("*");
		}
		System.out.println();
	}
	
	private void drawSides(){
		for(int i = 0; i < this.height-2; i++) {
			this.skipSpaces(this.getOffset());
			System.out.println("*");
			this.skipSpaces(this.width-2);
			System.out.println("*");
		}
	}
	
	
	private void skipSpaces(int spaces) {
		for(int i = 0; i < spaces; i++) {
			System.out.print(" ");		
		}
	}
}
