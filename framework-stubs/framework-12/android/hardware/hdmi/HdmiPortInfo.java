package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiPortInfo implements android.os.Parcelable {
    public static final int PORT_INPUT = 0;
    public static final int PORT_OUTPUT = 1;
    private final int mId = 0;
    private final int mType = 0;
    private final int mAddress = 0;
    private final boolean mCecSupported = false;
    private final boolean mArcSupported = false;
    private final boolean mMhlSupported = false;
    public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiPortInfo> CREATOR = null;
    public HdmiPortInfo(int p0, int p1, int p2, boolean p3, boolean p4, boolean p5) {}
    public int getId() { return 0; }
    public int getType() { return 0; }
    public int getAddress() { return 0; }
    public boolean isCecSupported() { return false; }
    public boolean isMhlSupported() { return false; }
    public boolean isArcSupported() { return false; }
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
