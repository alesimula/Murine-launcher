package android.hardware.input;

@android.annotation.SystemApi
public class VirtualMouse extends android.hardware.input.VirtualInputDevice {
    public VirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.hardware.input.IVirtualInputDevice p1) { super(null, null); }
    public void sendButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) {}
    public void sendScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) {}
    public void sendRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) {}
    @android.annotation.NonNull
    public android.graphics.PointF getCursorPosition() { return null; }
}
