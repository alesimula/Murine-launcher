package android.text;

public abstract class SegmentFinder {
    public static final int DONE = -1;
    public SegmentFinder() {}
    public abstract int previousStartBoundary(int p0);
    public abstract int previousEndBoundary(int p0);
    public abstract int nextStartBoundary(int p0);
    public abstract int nextEndBoundary(int p0);

    public static class PrescribedSegmentFinder extends android.text.SegmentFinder {
        public PrescribedSegmentFinder(int[] p0) { super(); }
        public int previousStartBoundary(int p0) { return 0; }
        public int previousEndBoundary(int p0) { return 0; }
        public int nextStartBoundary(int p0) { return 0; }
        public int nextEndBoundary(int p0) { return 0; }
    }
}
