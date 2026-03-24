package android.hardware.input;

public abstract class KeyboardBacklightState {
    public KeyboardBacklightState() {}
    public abstract int getBrightnessLevel();
    public abstract int getMaxBrightnessLevel();
}
