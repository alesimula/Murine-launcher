package android.os;

public abstract class VibratorManager {
    public VibratorManager() {}
    protected VibratorManager(android.content.Context p0) {}
    public abstract int[] getVibratorIds();
    public abstract android.os.Vibrator getVibrator(int p0);
    public abstract android.os.Vibrator getDefaultVibrator();
    @android.annotation.RequiresPermission("android.permission.VIBRATE_ALWAYS_ON")
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) { return false; }
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public final void vibrate(android.os.CombinedVibration p0) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public final void vibrate(android.os.CombinedVibration p0, android.os.VibrationAttributes p1) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4);
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void cancel();
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void cancel(int p0);
}
