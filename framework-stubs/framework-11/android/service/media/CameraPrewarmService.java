package android.service.media;

public abstract class CameraPrewarmService extends android.app.Service {
    public static final java.lang.String ACTION_PREWARM = "android.service.media.CameraPrewarmService.ACTION_PREWARM";
    public static final int MSG_CAMERA_FIRED = 1;
    private final android.os.Handler mHandler = null;
    private boolean mCameraIntentFired;
    public CameraPrewarmService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public abstract void onPrewarm();
    public abstract void onCooldown(boolean p0);
}
