
import java.util.Random;
public class Sierpinski
{
    
    public static void main(String[] args) {
        StdDraw.setScale(0, 1);  

        
        OrderedPair Pair1 = new OrderedPair(0.5, 0);  
        OrderedPair Pair2 = new OrderedPair(0, 1);    
        OrderedPair Pair3 = new OrderedPair(1, 1);   

        
        StdDraw.point(Pair1.getX(), Pair1.getY());
        StdDraw.point(Pair2.getX(), Pair2.getY());
        StdDraw.point(Pair3.getX(), Pair3.getY());

        double px = 0.5;
        double py = 0.5;
    
        Random random = new Random(); 
         

        for (int i = 0; i < 10000; i++) {
            int choice = random.nextInt(3);

            
            if (choice == 0) {
                px = (px + Pair1.getX()) / 2;
                py = (py + Pair1.getY()) / 2;
            } else if (choice == 1) {
                px = (px + Pair2.getX()) / 2;
                py = (py + Pair2.getY()) / 2;
            } else {
                px = (px + Pair3.getX()) / 2;
                py = (py + Pair3.getY()) / 2;
            }

            StdDraw.point(px, py);
        }
    }
}