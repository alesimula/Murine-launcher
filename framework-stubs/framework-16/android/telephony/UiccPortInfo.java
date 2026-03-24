package android.telephony;

public final class UiccPortInfo implements android.os.Parcelable {
    public static final java.lang.String ICCID_REDACTED = "FFFFFFFFFFFFFFFFFFFF";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.UiccPortInfo> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public UiccPortInfo(java.lang.String p0, int p1, int p2, boolean p3) {}
    @android.annotation.Nullable
    public java.lang.String getIccId() { return null; }
    public int getPortIndex() { return 0; }
    public boolean isActive() { return false; }
    public int getLogicalSlotIndex() { return 0; }
    public android.telephony.UiccPortInfo createSensitiveInfoSanitizedCopy() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
