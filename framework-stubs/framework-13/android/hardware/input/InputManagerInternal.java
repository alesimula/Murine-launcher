package android.hardware.input;

public abstract class InputManagerInternal {
    public InputManagerInternal() {}
    public abstract void setDisplayViewports(java.util.List<android.hardware.display.DisplayViewport> p0);
    public abstract void setInteractive(boolean p0);
    public abstract void toggleCapsLock(int p0);
    public abstract void setPulseGestureEnabled(boolean p0);
    public abstract boolean transferTouchFocus(android.os.IBinder p0, android.os.IBinder p1);
    public abstract boolean setVirtualMousePointerDisplayId(int p0);
    public abstract int getVirtualMousePointerDisplayId();
    public abstract android.graphics.PointF getCursorPosition();
    public abstract void setPointerAcceleration(float p0, int p1);
    public abstract void setDisplayEligibilityForPointerCapture(int p0, boolean p1);
    public abstract void setPointerIconVisible(boolean p0, int p1);
    public abstract void registerLidSwitchCallback(android.hardware.input.InputManagerInternal.LidSwitchCallback p0);
    public abstract void unregisterLidSwitchCallback(android.hardware.input.InputManagerInternal.LidSwitchCallback p0);
    public abstract android.view.InputChannel createInputChannel(java.lang.String p0);
    public abstract void pilferPointers(android.os.IBinder p0);

    public static interface LidSwitchCallback {
        public void notifyLidSwitchChanged(long p0, boolean p1);
    }
}
