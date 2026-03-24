package android.text;

public class SpanSet<E extends java.lang.Object> {
    private final java.lang.Class<? extends E> classType = null;
    int numberOfSpans;
    @android.annotation.UnsupportedAppUsage
    E[] spans;
    int[] spanStarts;
    int[] spanEnds;
    int[] spanFlags;
    SpanSet(java.lang.Class<? extends E> p0) {}
    public void init(android.text.Spanned p0, int p1, int p2) {}
    public boolean hasSpansIntersecting(int p0, int p1) { return false; }
    int getNextTransition(int p0, int p1) { return 0; }
    public void recycle() {}
}
