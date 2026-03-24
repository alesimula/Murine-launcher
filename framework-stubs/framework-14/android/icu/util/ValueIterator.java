package android.icu.util;

public interface ValueIterator {
    public boolean next(android.icu.util.ValueIterator.Element p0);
    public void reset();
    public void setRange(int p0, int p1);

    public static final class Element {
        public int integer;
        public java.lang.Object value;
        public Element() {}
    }
}
