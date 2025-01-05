//import java.util.*;

public class RandR
{
    
    private static long h = 987654321;

    private static void updatem()
    {
        h ^= (h << 21);
        h ^= (h >>> 35);
        h ^= (h << 4);
    }

    public static int randomInt(int min, int max)
    {
        updatem();
        return min + (int) (Math.abs(h) % (max - min + 1));
    }

    public static double randomDouble(double min, double max)
    {
        updatem();
        return min + (max - min) * (Math.abs(h) / (double) Long.MAX_VALUE);
    }

    public static void main(String[] args)
    {
        System.out.println("Random Integer [10, 50]: " + randomInt(10, 50));
        System.out.println("Random Double [1.5, 3.5]: " + randomDouble(1.5,3.5));
    }
    
}
