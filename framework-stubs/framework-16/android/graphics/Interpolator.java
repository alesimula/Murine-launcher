package android.graphics;

public class Interpolator {
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

    public static enum Result {
        NORMAL,
        FREEZE_START,
        FREEZE_END;
    }
}
