package android.telephony.gsm;

@java.lang.Deprecated
public class GsmCellLocation extends android.telephony.CellLocation {
    private int mLac;
    private int mCid;
    private int mPsc;
    public GsmCellLocation() { super(); }
    public GsmCellLocation(android.os.Bundle p0) { super(); }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getPsc() { return 0; }
    public void setStateInvalid() {}
    public void setLacAndCid(int p0, int p1) {}
    public void setPsc(int p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private static boolean equalsHandlesNulls(java.lang.Object p0, java.lang.Object p1) { return false; }
    public void fillInNotifierBundle(android.os.Bundle p0) {}
    public boolean isEmpty() { return false; }
}
