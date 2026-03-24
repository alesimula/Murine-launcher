package android.hardware.input;

public abstract class InputManagerInternal {
    public InputManagerInternal() {}
    public abstract boolean injectInputEvent(android.view.InputEvent p0, int p1);
    public abstract void setDisplayViewports(java.util.List<android.hardware.display.DisplayViewport> p0);
    public abstract void setInteractive(boolean p0);
    public abstract void toggleCapsLock(int p0);
    public abstract void setPulseGestureEnabled(boolean p0);
    public abstract boolean transferTouchFocus(android.os.IBinder p0, android.os.IBinder p1);
}
