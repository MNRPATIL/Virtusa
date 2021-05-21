package abs;
class Circle extends Shape {
	
	  int radius;
	  Circle(){		  
	  }
	  Circle(int r){
		  this.radius=r; 
		  }
	public double calculateArea() {
		return 3.14*radius*radius;
	}
}
