package android.graphics;

public class PathIterator implements java.util.Iterator<android.graphics.PathIterator.Segment> {
    public static final int VERB_MOVE = 0;
    public static final int VERB_LINE = 1;
    public static final int VERB_QUAD = 2;
    public static final int VERB_CONIC = 3;
    public static final int VERB_CUBIC = 4;
    public static final int VERB_CLOSE = 5;
    public static final int VERB_DONE = 6;
    PathIterator(android.graphics.Path p0) {}
    @android.annotation.NonNull
    public int next(float[] p0, int p1) { return 0; }
    public boolean hasNext() { return false; }
    @android.annotation.NonNull
    public int peek() { return 0; }
    @android.annotation.NonNull
    public android.graphics.PathIterator.Segment next() { return null; }

    public static class Segment {
        @android.annotation.NonNull
        public int getVerb() { return 0; }
        @android.annotation.NonNull
        public float[] getPoints() { return null; }
        public float getConicWeight() { return 0.0f; }
        Segment(int p0, float[] p1, float p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Verb {
    }
}
