package android.icu.util;

public interface RangeValueIterator {
    public boolean next(android.icu.util.RangeValueIterator.Element p0);
    public void reset();

    public static class Element {
        public int limit;
        public int start;
        public int value;
        public Element() {}
    }
}
