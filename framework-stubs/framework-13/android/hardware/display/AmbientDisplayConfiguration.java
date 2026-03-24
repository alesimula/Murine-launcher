package android.hardware.display;

public class AmbientDisplayConfiguration {
    final android.util.SparseArray<java.util.Map<java.lang.String, java.lang.String>> mUsersInitialValues = null;
    public AmbientDisplayConfiguration(android.content.Context p0) {}
    public boolean enabled(int p0) { return false; }
    public boolean pulseOnNotificationEnabled(int p0) { return false; }
    public boolean pulseOnNotificationAvailable() { return false; }
    public boolean pickupGestureEnabled(int p0) { return false; }
    public boolean dozePickupSensorAvailable() { return false; }
    public boolean tapGestureEnabled(int p0) { return false; }
    public boolean tapSensorAvailable() { return false; }
    public boolean doubleTapGestureEnabled(int p0) { return false; }
    public boolean doubleTapSensorAvailable() { return false; }
    public boolean quickPickupSensorEnabled(int p0) { return false; }
    public boolean screenOffUdfpsEnabled(int p0) { return false; }
    public boolean wakeScreenGestureAvailable() { return false; }
    public boolean wakeLockScreenGestureEnabled(int p0) { return false; }
    public boolean wakeDisplayGestureEnabled(int p0) { return false; }
    public long getWakeLockScreenDebounce() { return 0L; }
    public java.lang.String doubleTapSensorType() { return null; }
    public java.lang.String[] tapSensorTypeMapping() { return null; }
    public java.lang.String longPressSensorType() { return null; }
    public java.lang.String udfpsLongPressSensorType() { return null; }
    public java.lang.String quickPickupSensorType() { return null; }
    public boolean pulseOnLongPressEnabled(int p0) { return false; }
    public boolean alwaysOnEnabled(int p0) { return false; }
    public boolean alwaysOnAvailable() { return false; }
    public boolean alwaysOnAvailableForUser(int p0) { return false; }
    public java.lang.String ambientDisplayComponent() { return null; }
    public boolean accessibilityInversionEnabled(int p0) { return false; }
    public boolean ambientDisplayAvailable() { return false; }
    public boolean dozeSuppressed(int p0) { return false; }
    public void disableDozeSettings(int p0) {}
    public void disableDozeSettings(boolean p0, int p1) {}
    public void restoreDozeSettings(int p0) {}
}
