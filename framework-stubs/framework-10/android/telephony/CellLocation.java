package android.telephony;

public abstract class CellLocation {
    public CellLocation() {}
    public static void requestLocationUpdate() {}
    @android.annotation.UnsupportedAppUsage
    public static android.telephony.CellLocation newFromBundle(android.os.Bundle p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public abstract void fillInNotifierBundle(android.os.Bundle p0);
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isEmpty();
    public abstract void setStateInvalid();
    public static android.telephony.CellLocation getEmpty() { return null; }
}
