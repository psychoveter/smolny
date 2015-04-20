public class Vector{
	public double x;
	public double y;
	public void printVector(){
		System.out.println("Р’РµРєС‚РѕСЂ ("+x+";"+y+")");
	}
	public void vectorAddition(double a, double b) {
        x = x + a;
        y = y + b;
	}
	public void vectorSubstraction(double a, double b) {
        x = x - a;
        y = y - b;
  }
    public void vectorScalarMult(double c) {
        x = x * c;
        y = y * c;
  }
}
