package android.hardware;

public final class SensorPrivacyManager {
    public static final java.lang.String EXTRA_SENSOR = null;
    public static final java.lang.String EXTRA_ALL_SENSORS = null;
    public static final int TOGGLE_TYPE_SOFTWARE = 1;
    public static final int TOGGLE_TYPE_HARDWARE = 2;
    public static android.hardware.SensorPrivacyManager getInstance(android.content.Context p0) { return null; }
    public static android.hardware.SensorPrivacyManager getInstance(android.content.Context p0, android.hardware.ISensorPrivacyManager p1) { return null; }
    public boolean supportsSensorToggle(int p0) { return false; }
    public boolean supportsSensorToggle(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, int p1, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(int p0, java.util.concurrent.Executor p1, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void addSensorPrivacyListener(java.util.concurrent.Executor p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void removeSensorPrivacyListener(int p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public void removeSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean isSensorPrivacyEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean isSensorPrivacyEnabled(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean areAnySensorPrivacyTogglesEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setSensorPrivacy(int p0, boolean p1) {}
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
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean requiresAuthentication() { return false; }
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
        default public void onSensorPrivacyChanged(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener.SensorPrivacyChangedParams p0) {}
        @java.lang.Deprecated
        public void onSensorPrivacyChanged(int p0, boolean p1);

        public static class SensorPrivacyChangedParams {
            public int getToggleType() { return 0; }
            public int getSensor() { return 0; }
            public boolean isEnabled() { return false; }
        }
    }

    public static class Sensors {
        public static final int MICROPHONE = 1;
        public static final int CAMERA = 2;

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
        public static final int SAFETY_CENTER = 6;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Source {
        }
    }

    public static class StateTypes {
        public static final int ENABLED = 1;
        public static final int DISABLED = 2;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StateType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToggleType {
    }
}
