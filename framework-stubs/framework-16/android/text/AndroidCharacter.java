package android.text;

@java.lang.Deprecated
public class AndroidCharacter {
    public static final int EAST_ASIAN_WIDTH_NEUTRAL = 0;
    public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = 1;
    public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = 2;
    public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = 3;
    public static final int EAST_ASIAN_WIDTH_NARROW = 4;
    public static final int EAST_ASIAN_WIDTH_WIDE = 5;
    public AndroidCharacter() {}
    public static native void getDirectionalities(char[] p0, byte[] p1, int p2);
    public static native int getEastAsianWidth(char p0);
    public static native void getEastAsianWidths(char[] p0, int p1, int p2, byte[] p3);
    public static native boolean mirror(char[] p0, int p1, int p2);
    public static native char getMirror(char p0);
}
