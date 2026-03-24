package android.hardware.input;

public abstract class StickyModifierState {
    public StickyModifierState() {}
    public abstract boolean isShiftModifierOn();
    public abstract boolean isShiftModifierLocked();
    public abstract boolean isCtrlModifierOn();
    public abstract boolean isCtrlModifierLocked();
    public abstract boolean isMetaModifierOn();
    public abstract boolean isMetaModifierLocked();
    public abstract boolean isAltModifierOn();
    public abstract boolean isAltModifierLocked();
    public abstract boolean isAltGrModifierOn();
    public abstract boolean isAltGrModifierLocked();
}
