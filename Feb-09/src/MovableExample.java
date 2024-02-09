interface Movable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	void displayPos();
}

class MovablePoint implements Movable{
	int x,y,xSpeed,ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}


	
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}



	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y++;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y--;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x--;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x++;
	}
	

	@Override
	public void displayPos() {
		// TODO Auto-generated method stub
		System.out.println("("+x+", "+y+")");
	}
	
}

class MovableCircle implements Movable{
	
	int radius;
	MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
	}
	
	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}

	@Override
	public void displayPos() {
		// TODO Auto-generated method stub
		center.displayPos();
	}
	
}

public class MovableExample {
	public static void main(String[] args) {
		Movable point = new MovablePoint(0, 0, 0, 0);
		point.moveUp();
		point.displayPos();
		
		Movable circle = new MovableCircle(0, 0, 0, 0, 5);
		circle.moveDown();
		circle.displayPos();
	}
}
