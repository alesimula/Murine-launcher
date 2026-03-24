package android.hardware;

public abstract class SensorPrivacyManagerInternal {
    public SensorPrivacyManagerInternal() {}
    public abstract boolean isSensorPrivacyEnabled(int p0, int p1);
    public abstract void addSensorPrivacyListener(int p0, int p1, android.hardware.SensorPrivacyManagerInternal.OnSensorPrivacyChangedListener p2);
    public abstract void addSensorPrivacyListenerForAllUsers(int p0, android.hardware.SensorPrivacyManagerInternal.OnUserSensorPrivacyChangedListener p1);
    public abstract void setPhysicalToggleSensorPrivacy(int p0, int p1, boolean p2);

    public static interface OnSensorPrivacyChangedListener {
        public void onSensorPrivacyChanged(boolean p0);
    }

    public static interface OnUserSensorPrivacyChangedListener {
        public void onSensorPrivacyChanged(int p0, boolean p1);
    }
}
