package android.hardware.display;

public final class VirtualDisplay {
    VirtualDisplay(android.hardware.display.DisplayManagerGlobal p0, android.view.Display p1, android.hardware.display.IVirtualDisplayCallback p2, android.view.Surface p3) {}
    public android.view.Display getDisplay() { return null; }
    public android.view.Surface getSurface() { return null; }
    public android.hardware.display.IVirtualDisplayCallback getToken() { return null; }
    public void setSurface(android.view.Surface p0) {}
    public void resize(int p0, int p1, int p2) {}
    public void release() {}
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_display_rotation_api")
    public void setRotation(int p0) {}
    public java.lang.String toString() { return null; }

    public static abstract class Callback {
        public Callback() {}
        public void onPaused() {}
        public void onResumed() {}
        public void onStopped() {}
    }
}
