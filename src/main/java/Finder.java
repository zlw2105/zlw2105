public class Finder {
    public static Integer findMax(int[] intArray)
    {
        if (intArray == null || intArray.length == 0)
        {
            return null;
        }
        int max = intArray[0];
        for (int A = 0; A < intArray.length; A++) {
            if (intArray[A] > max){
                max = intArray[A];
            }
        }
        return max;
    }
    public static Integer findMin(int[] intArray)
    {
        if (intArray == null || intArray.length == 0)
        {
            return null;
        }
        int min = intArray[0];
        for (int A = 0; A < intArray.length; A++) {
            if (intArray[A] < min){
                min = intArray[A];
            }
        }
        return min;
    }
}