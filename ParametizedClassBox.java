package ClassObject;

public class ParametizedClassBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  Create a class Box that uses a parameterized method to initialize 
		  the dimensions of a box. (dimensions are width, height, depth of double type). 
		  The class should have a method that can return volume. Obtain an object and print the corresponding
          volume in main() function.
		 */
		
		Box obj = new Box(10,30,40);
		System.out.print(obj.calcVol());

	}

}

class Box{
	double width,height,depth;
	
	Box(int width,int height,int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double calcVol() {
		
		return width * height * depth;
	}
	
	
}
