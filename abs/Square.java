package abs;

class Square extends Shape {
	int l;
	int b;
	Square(int l,int b){
		this.l=l;
		this.b=b;
	}

	public double calculateArea() {
		return l*b;
	}
}
