package android.hardware.display;

public final class VirtualDisplay {
    private final android.hardware.display.DisplayManagerGlobal mGlobal = null;
    private final android.view.Display mDisplay = null;
    private android.hardware.display.IVirtualDisplayCallback mToken;
    private android.view.Surface mSurface;
    VirtualDisplay(android.hardware.display.DisplayManagerGlobal p0, android.view.Display p1, android.hardware.display.IVirtualDisplayCallback p2, android.view.Surface p3) {}
    public android.view.Display getDisplay() { return null; }
    public android.view.Surface getSurface() { return null; }
    public void setSurface(android.view.Surface p0) {}
    public void resize(int p0, int p1, int p2) {}
    public void release() {}
    public void setDisplayState(boolean p0) {}
    public java.lang.String toString() { return null; }

    public static abstract class Callback {
        public Callback() {}
        public void onPaused() {}
        public void onResumed() {}
        public void onStopped() {}
    }
}
