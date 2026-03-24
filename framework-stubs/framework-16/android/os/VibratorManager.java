package android.os;

public abstract class VibratorManager {
    protected final java.lang.String mPackageName = null;
    public VibratorManager() {}
    protected VibratorManager(android.content.Context p0) {}
    @android.annotation.NonNull
    public abstract int[] getVibratorIds();
    public boolean hasCapabilities(int p0) { return false; }
    @android.annotation.NonNull
    public abstract android.os.Vibrator getVibrator(int p0);
    @android.annotation.NonNull
    public abstract android.os.Vibrator getDefaultVibrator();
    @android.annotation.RequiresPermission("android.permission.VIBRATE_ALWAYS_ON")
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) { return false; }
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public final void vibrate(android.os.CombinedVibration p0) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public final void vibrate(android.os.CombinedVibration p0, android.os.VibrationAttributes p1) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4);
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4) {}
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void cancel();
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void cancel(int p0);
    @android.annotation.RequiresPermission(allOf={"android.permission.VIBRATE", "android.permission.VIBRATE_VENDOR_EFFECTS", "android.permission.START_VIBRATION_SESSIONS"})
    public void startVendorSession(int[] p0, android.os.VibrationAttributes p1, java.lang.String p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.vibrator.VendorVibrationSession.Callback p5) {}
}
