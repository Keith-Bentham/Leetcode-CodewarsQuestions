import java.util.Arrays;

/**
 * Created by Keith Bentham
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        if (area == 0) {
            return result;
        }
        int a = (int) Math.sqrt(area);
        while (area % a != 0) {
            a--;
        }
        int b = area / a;
        result[0] = b;
        result[1] = a;
        return result;
    }

    public static void main(String[] args) {
        ConstructRectangle cr = new ConstructRectangle();
        System.out.println("In op?: " + Arrays.toString(cr.constructRectangle(4)));
    }
}
