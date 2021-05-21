package abs;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);		
		System.out.println("Circle area for raduis 5 is ="+c.calculateArea());
		c.setColor("red");
		System.out.println("this is circle color = "+c.getColor());
		
		Square s=new Square(4,5);
		s.calculateArea();
		System.out.println("Square area with length :4 and width:5 = "+s.calculateArea());
		s.setColor("Green");
		System.out.println("this is Square color = "+s.getColor());
	}

}
