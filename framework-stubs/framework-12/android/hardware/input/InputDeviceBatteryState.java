package android.hardware.input;

public final class InputDeviceBatteryState extends android.hardware.BatteryState {
    private static final float NULL_BATTERY_CAPACITY = Float.NaN;
    private final android.hardware.input.InputManager mInputManager = null;
    private final int mDeviceId = 0;
    private final boolean mHasBattery = false;
    InputDeviceBatteryState(android.hardware.input.InputManager p0, int p1, boolean p2) { super(); }
    public boolean isPresent() { return false; }
    public int getStatus() { return 0; }
    public float getCapacity() { return 0.0f; }
}
