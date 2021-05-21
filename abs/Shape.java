package abs;
abstract class Shape {
	private String color;
	public abstract double calculateArea();
	public void setColor(String col) {
		this.color=col;
	}
	public String getColor() {
		return color;
	}
}
