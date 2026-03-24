package android.hardware.display;

public class NightDisplayListener {
    public NightDisplayListener(android.content.Context p0) {}
    public NightDisplayListener(android.content.Context p0, android.os.Handler p1) {}
    public NightDisplayListener(android.content.Context p0, int p1, android.os.Handler p2) {}
    public void setCallback(android.hardware.display.NightDisplayListener.Callback p0) {}

    public static interface Callback {
        default public void onActivated(boolean p0) {}
        default public void onAutoModeChanged(int p0) {}
        default public void onCustomStartTimeChanged(java.time.LocalTime p0) {}
        default public void onCustomEndTimeChanged(java.time.LocalTime p0) {}
        default public void onColorTemperatureChanged(int p0) {}
    }
}
