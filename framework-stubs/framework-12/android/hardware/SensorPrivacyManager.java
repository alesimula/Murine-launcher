package android.hardware;

public final class SensorPrivacyManager {
    private static final java.lang.String LOG_TAG = null;
    private android.os.IBinder token;
    public static final java.lang.String EXTRA_SENSOR = null;
    public static final java.lang.String EXTRA_ALL_SENSORS = null;
    private final android.util.SparseArray<java.lang.Boolean> mToggleSupportCache = null;
    private static final java.lang.Object sInstanceLock = null;
    private static android.hardware.SensorPrivacyManager sInstance;
    private final android.content.Context mContext = null;
    private final android.hardware.ISensorPrivacyManager mService = null;
    private final android.util.ArrayMap<android.hardware.SensorPrivacyManager.OnAllSensorPrivacyChangedListener, android.hardware.ISensorPrivacyListener> mListeners = null;
    private final android.util.ArrayMap<android.util.Pair<android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener, java.lang.Integer>, android.hardware.ISensorPrivacyListener> mIndividualListeners = null;
    private SensorPrivacyManager(android.content.Context p0, android.hardware.ISensorPrivacyManager p1) {}
    public static android.hardware.SensorPrivacyManager getInstance(android.content.Context p0) { return null; }
    public boolean supportsSensorToggle(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, int p1, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, java.util.concurrent.Executor p1, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p2) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, int p1, java.util.concurrent.Executor p2, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void removeSensorPrivacyListener(int p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean isSensorPrivacyEnabled(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean isSensorPrivacyEnabled(int p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setSensorPrivacy(int p0, int p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setSensorPrivacy(int p0, int p1, boolean p2, int p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setSensorPrivacyForProfileGroup(int p0, int p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setSensorPrivacyForProfileGroup(int p0, int p1, boolean p2, int p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void suppressSensorPrivacyReminders(int p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void suppressSensorPrivacyReminders(int p0, boolean p1, int p2) {}
    public void showSensorUseDialog(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setAllSensorPrivacy(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addAllSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnAllSensorPrivacyChangedListener p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void removeAllSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnAllSensorPrivacyChangedListener p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean isAllSensorPrivacyEnabled() { return false; }

    public static interface OnAllSensorPrivacyChangedListener {
        public void onAllSensorPrivacyChanged(boolean p0);
    }

    @android.annotation.SystemApi
    public static interface OnSensorPrivacyChangedListener {
        public void onSensorPrivacyChanged(int p0, boolean p1);
    }

    public static class Sensors {
        public static final int MICROPHONE = 1;
        public static final int CAMERA = 2;
        private Sensors() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Sensor {
        }
    }

    public static class Sources {
        public static final int QS_TILE = 1;
        public static final int SETTINGS = 2;
        public static final int DIALOG = 3;
        public static final int SHELL = 4;
        public static final int OTHER = 5;
        private Sources() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Source {
        }
    }
}
