
/**
 * Andrea Wang
 *
 **/
public class MyExample2 {
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        for (int a=0; a<=500; a+=20)
        {
             StdDraw.line(a, 0, 500, a);
             StdDraw.line(0, a, a, 500);
        }
       
    } 
}
