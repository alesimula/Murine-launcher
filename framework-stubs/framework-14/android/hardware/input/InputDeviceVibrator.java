package android.hardware.input;

final class InputDeviceVibrator extends android.os.Vibrator {
    InputDeviceVibrator(int p0, int p1) { super(); }
    protected android.os.VibratorInfo getInfo() { return null; }
    public boolean hasVibrator() { return false; }
    public boolean isVibrating() { return false; }
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public boolean hasAmplitudeControl() { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
    public void cancel() {}
    public void cancel(int p0) {}

    private class OnVibratorStateChangedListenerDelegate extends android.os.IVibratorStateListener.Stub {
        OnVibratorStateChangedListenerDelegate(android.hardware.input.InputDeviceVibrator p0, android.os.Vibrator.OnVibratorStateChangedListener p1, java.util.concurrent.Executor p2) { super(); }
        public void onVibrating(boolean p0) {}
    }
}
