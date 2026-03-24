package android.icu.math;

public final class MathContext implements java.io.Serializable {
    public static final android.icu.math.MathContext DEFAULT = null;
    public static final int ENGINEERING = 2;
    public static final int PLAIN = 0;
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_UNNECESSARY = 7;
    public static final int ROUND_UP = 0;
    public static final int SCIENTIFIC = 1;
    public MathContext(int p0) {}
    public MathContext(int p0, int p1) {}
    public MathContext(int p0, int p1, boolean p2) {}
    public MathContext(int p0, int p1, boolean p2, int p3) {}
    public int getDigits() { return 0; }
    public int getForm() { return 0; }
    public boolean getLostDigits() { return false; }
    public int getRoundingMode() { return 0; }
    public java.lang.String toString() { return null; }
}
