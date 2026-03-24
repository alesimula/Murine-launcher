package android.telephony;

@android.annotation.SystemApi
public final class LinkCapacityEstimate implements android.os.Parcelable {
    public static final int INVALID = -1;
    public static final int LCE_TYPE_PRIMARY = 0;
    public static final int LCE_TYPE_SECONDARY = 1;
    public static final int LCE_TYPE_COMBINED = 2;
    public static final android.os.Parcelable.Creator<android.telephony.LinkCapacityEstimate> CREATOR = null;
    public LinkCapacityEstimate(int p0, int p1, int p2) {}
    public LinkCapacityEstimate(android.os.Parcel p0) {}
    public int getType() { return 0; }
    public int getDownlinkCapacityKbps() { return 0; }
    public int getUplinkCapacityKbps() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LceType {
    }
}
