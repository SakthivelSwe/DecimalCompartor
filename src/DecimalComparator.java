public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one,double two) {
        long a = (long) (one * 1000);
        long b = (long) (two * 1000);

        if(a == b) {
            System.out.println(a);
            System.out.println(b);
            return true;
        }else {
            System.out.println(false);
            System.out.println(a);
            System.out.println(b);
            return false;
        }
    }
}
