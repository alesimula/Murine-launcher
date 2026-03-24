package android.media.audiofx;

public class StreamDefaultEffect extends android.media.audiofx.DefaultEffect {
    private static final java.lang.String TAG = "StreamDefaultEffect-JAVA";
    @android.annotation.RequiresPermission(value="android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS", conditional=true)
    public StreamDefaultEffect(java.util.UUID p0, java.util.UUID p1, int p2, int p3) { super(); }
    public void release() {}
    protected void finalize() {}
    private final native int native_setup(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int[] p5);
    private final native void native_release(int p0);
}
