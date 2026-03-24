package android.net.wifi;

public final class MloLink implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.MloLink> CREATOR = null;
    public static final int INVALID_MLO_LINK_ID = -1;
    public static final int MLO_LINK_STATE_ACTIVE = 3;
    public static final int MLO_LINK_STATE_IDLE = 2;
    public static final int MLO_LINK_STATE_INVALID = 0;
    public static final int MLO_LINK_STATE_UNASSOCIATED = 1;
    public MloLink() {}
    public int getBand() { return 0; }
    public int getChannel() { return 0; }
    public int getLinkId() { return 0; }
    public int getState() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getApMacAddress() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getStaMacAddress() { return null; }
    public int getRxLinkSpeedMbps() { return 0; }
    public int getTxLinkSpeedMbps() { return 0; }
    public int getRssi() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
