import ch.aplu.turtle.*;
import java.util.ArrayList;

public class DrawSquareAtAndSave{
    static void DrawSquareAtAndSave() {
        Turtle t1=new Turtle();
        Double[] pos=new Double[2];
        pos[0]=t1.getX();
        pos[1]=t1.getY();
        ArrayList<Double[]> posArr= new ArrayList<Double[]>();  
        for (int i=0;i<4;i++) {
            pos[0]=t1.getX();
            pos[1]=t1.getY();
            posArr.add(pos);
            t1.forward(100);
            t1.right(90);
            for(Double[] p: posArr){
                System.out.printf("(%.1f,%.1f)",p[0],p[1]);
            }
        }
    }
    public static void main(String[] args) {
        DrawSquareAtAndSave dsaas = new DrawSquareAtAndSave();
        dsaas.drawSquareAt();
    }
}