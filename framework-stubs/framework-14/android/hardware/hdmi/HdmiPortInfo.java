package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiPortInfo implements android.os.Parcelable {
    public static final int PORT_INPUT = 0;
    public static final int PORT_OUTPUT = 1;
    public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiPortInfo> CREATOR = null;
    @java.lang.Deprecated
    public HdmiPortInfo(int p0, int p1, int p2, boolean p3, boolean p4, boolean p5) {}
    public android.hardware.hdmi.HdmiPortInfo.Builder toBuilder() { return null; }
    public int getId() { return 0; }
    public int getType() { return 0; }
    public int getAddress() { return 0; }
    public boolean isCecSupported() { return false; }
    public boolean isMhlSupported() { return false; }
    public boolean isArcSupported() { return false; }
    public boolean isEarcSupported() { return false; }
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(int p0, int p1, int p2) {}
        public android.hardware.hdmi.HdmiPortInfo build() { return null; }
        public android.hardware.hdmi.HdmiPortInfo.Builder setCecSupported(boolean p0) { return null; }
        public android.hardware.hdmi.HdmiPortInfo.Builder setArcSupported(boolean p0) { return null; }
        public android.hardware.hdmi.HdmiPortInfo.Builder setEarcSupported(boolean p0) { return null; }
        public android.hardware.hdmi.HdmiPortInfo.Builder setMhlSupported(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PortType {
    }
}
