Turtle t1 = new Turtle();
t1.home();
t1.clear();
for (int i=0;i<4;i++) {
 t1.fd(100);
 t1.right(90);
}
t1.clear();
import ch.aplu.turtle.*;
public class p1_TurtleSquare {
	static Turtle t1 = new Turtle();
	public static void drawSquare(int size) {
		for(int i=0;i<4;i++) {
			t1.forward(size);
			t1.right(90);
		}
	}
	public static void main(String[ ] args) {
		drawSquare(100);
	}
}