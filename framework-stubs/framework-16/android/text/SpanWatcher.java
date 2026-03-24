package android.text;

public interface SpanWatcher extends android.text.NoCopySpan {
    public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3);
    public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3);
    public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5);
}
