package android.graphics;

public class Interpolator {
    private int mValueCount;
    private int mFrameCount;
    private long native_instance;
    public Interpolator(int p0) {}
    public Interpolator(int p0, int p1) {}
    public void reset(int p0) {}
    public void reset(int p0, int p1) {}
    public final int getKeyFrameCount() { return 0; }
    public final int getValueCount() { return 0; }
    public void setKeyFrame(int p0, int p1, float[] p2) {}
    public void setKeyFrame(int p0, int p1, float[] p2, float[] p3) {}
    public void setRepeatMirror(float p0, boolean p1) {}
    public android.graphics.Interpolator.Result timeToValues(float[] p0) { return null; }
    public android.graphics.Interpolator.Result timeToValues(int p0, float[] p1) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    private static native long nativeConstructor(int p0, int p1);
    private static native void nativeDestructor(long p0);
    private static native void nativeReset(long p0, int p1, int p2);
    private static native void nativeSetKeyFrame(long p0, int p1, int p2, float[] p3, float[] p4);
    private static native void nativeSetRepeatMirror(long p0, float p1, boolean p2);
    private static native int nativeTimeToValues(long p0, int p1, float[] p2);

    public static enum Result {
        NORMAL,
        FREEZE_START,
        FREEZE_END;
        private Result() {}
    }
}
