package android.hardware;

public final class SensorPrivacyManager {
    private static final java.lang.Object sInstanceLock = null;
    private static android.hardware.SensorPrivacyManager sInstance;
    private final android.content.Context mContext = null;
    private final android.hardware.ISensorPrivacyManager mService = null;
    private final android.util.ArrayMap<android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener, android.hardware.ISensorPrivacyListener> mListeners = null;
    private SensorPrivacyManager(android.content.Context p0, android.hardware.ISensorPrivacyManager p1) {}
    public static android.hardware.SensorPrivacyManager getInstance(android.content.Context p0) { return null; }
    public void setSensorPrivacy(boolean p0) {}
    public void addSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    public void removeSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    public boolean isSensorPrivacyEnabled() { return false; }

    public static interface OnSensorPrivacyChangedListener {
        public void onSensorPrivacyChanged(boolean p0);
    }
}
