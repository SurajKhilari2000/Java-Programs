package junit;

public class Apple {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean checkColor() {
		if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red"))
			return true;
		else
			return false;
	}
}
