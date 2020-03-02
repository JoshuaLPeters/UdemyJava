public class MinAndMax {



    public static void main(String[] args) {

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println(myMinByte);
        System.out.println(myMaxByte);

        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println(myMaxInt);
        System.out.println(myMinInt);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        // We use the (short) to cast the default Integer to a short. In java numbers always default as an Integer.
        short myNewMinShort = (short)(myMinShort -1);
        // My taking the minimum value of a primative type and by subtracting 1 below the minimum; we loop back to the maximum
        // This is called underflow.

        short myNewMaxShort = (short)(myMaxShort + 1);
        // My taking the maximum value of a primative type and by adding 1 above the maximum; we loop back to the minimum.
        // This is called overflow.

        System.out.println(myMinShort);
        System.out.println(myMaxShort);
        System.out.println(myNewMinShort);
        System.out.println(myNewMaxShort);

        Float myMinFloat = Float.MIN_VALUE;
        Float myMaxFloat = Float.MAX_VALUE;
        System.out.println(myMaxFloat);
        System.out.println(myMinFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println(myMinDouble);
        System.out.println(myMaxDouble);

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println(myMinLong);
        System.out.println(myMaxLong);

    }
}
