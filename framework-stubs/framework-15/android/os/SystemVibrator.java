package android.os;

public class SystemVibrator extends android.os.Vibrator {
    public SystemVibrator(android.content.Context p0) { super(); }
    public android.os.VibratorInfo getInfo() { return null; }
    public boolean hasVibrator() { return false; }
    public boolean isVibrating() { return false; }
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public boolean hasAmplitudeControl() { return false; }
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.os.VibrationAttributes p4) { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
    public void performHapticFeedback(int p0, boolean p1, java.lang.String p2, boolean p3) {}
    public void cancel() {}
    public void cancel(int p0) {}

    public static class MultiVibratorStateListener {
        public MultiVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
        public boolean hasRegisteredListeners() { return false; }
        public void register(android.os.VibratorManager p0) {}
        public void unregister(android.os.VibratorManager p0) {}
        public void onVibrating(int p0, boolean p1) {}
    }

    private static class SingleVibratorStateListener implements android.os.Vibrator.OnVibratorStateChangedListener {
        SingleVibratorStateListener(android.os.SystemVibrator.MultiVibratorStateListener p0, int p1) {}
        public void onVibratorStateChanged(boolean p0) {}
    }
}
