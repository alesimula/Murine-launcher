package android.hardware.input;

public class InputDeviceVibratorManager extends android.os.VibratorManager implements android.hardware.input.InputManager.InputDeviceListener {
    public InputDeviceVibratorManager(int p0) { super(); }
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceRemoved(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    @android.annotation.NonNull
    public int[] getVibratorIds() { return null; }
    @android.annotation.NonNull
    public android.os.Vibrator getVibrator(int p0) { return null; }
    @android.annotation.NonNull
    public android.os.Vibrator getDefaultVibrator() { return null; }
    public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
    public void cancel() {}
    public void cancel(int p0) {}
}
