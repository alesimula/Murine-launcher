package android.hardware.display;

public class NightDisplayListener {
    private final android.content.Context mContext = null;
    private final android.hardware.display.ColorDisplayManager mManager = null;
    private final android.os.Handler mHandler = null;
    private final android.database.ContentObserver mContentObserver = null;
    private final int mUserId = 0;
    private android.hardware.display.NightDisplayListener.Callback mCallback;
    public NightDisplayListener(android.content.Context p0) {}
    public NightDisplayListener(android.content.Context p0, android.os.Handler p1) {}
    public NightDisplayListener(android.content.Context p0, int p1, android.os.Handler p2) {}
    public void setCallback(android.hardware.display.NightDisplayListener.Callback p0) {}
    private void setCallbackInternal(android.hardware.display.NightDisplayListener.Callback p0) {}

    public static interface Callback {
        default public void onActivated(boolean p0) {}
        default public void onAutoModeChanged(int p0) {}
        default public void onCustomStartTimeChanged(java.time.LocalTime p0) {}
        default public void onCustomEndTimeChanged(java.time.LocalTime p0) {}
        default public void onColorTemperatureChanged(int p0) {}
    }
}
