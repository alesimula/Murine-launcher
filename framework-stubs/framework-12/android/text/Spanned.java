package android.text;

public interface Spanned extends java.lang.CharSequence {
    public static final int SPAN_POINT_MARK_MASK = 51;
    public static final int SPAN_MARK_MARK = 17;
    public static final int SPAN_MARK_POINT = 18;
    public static final int SPAN_POINT_MARK = 33;
    public static final int SPAN_POINT_POINT = 34;
    public static final int SPAN_PARAGRAPH = 51;
    public static final int SPAN_INCLUSIVE_EXCLUSIVE = 17;
    public static final int SPAN_INCLUSIVE_INCLUSIVE = 18;
    public static final int SPAN_EXCLUSIVE_EXCLUSIVE = 33;
    public static final int SPAN_EXCLUSIVE_INCLUSIVE = 34;
    public static final int SPAN_COMPOSING = 256;
    public static final int SPAN_INTERMEDIATE = 512;
    public static final int SPAN_USER_SHIFT = 24;
    public static final int SPAN_USER = -16777216;
    public static final int SPAN_PRIORITY_SHIFT = 16;
    public static final int SPAN_PRIORITY = 16711680;
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2);
    public int getSpanStart(java.lang.Object p0);
    public int getSpanEnd(java.lang.Object p0);
    public int getSpanFlags(java.lang.Object p0);
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2);
}
