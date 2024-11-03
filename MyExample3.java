
/**
 * Andrea Wang
 */

public class MyExample3 {
    public static void main(String[] args) {
        StdDraw.setScale(0, 500);
        int radius = 350; 
        while (radius >= 0) {
        
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(250, 250, radius);
            radius -= 20;  

            
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(250, 250, radius);
            radius -= 20; 
        }
    }
}
