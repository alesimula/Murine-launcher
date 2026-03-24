package android.telephony;

public final class UiccCardInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.UiccCardInfo> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public UiccCardInfo(boolean p0, int p1, java.lang.String p2, int p3, boolean p4, boolean p5, java.util.List<android.telephony.UiccPortInfo> p6) {}
    public boolean isEuicc() { return false; }
    public int getCardId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getEid() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.lang.String getIccId() { return null; }
    @java.lang.Deprecated
    public int getSlotIndex() { return 0; }
    public int getPhysicalSlotIndex() { return 0; }
    public boolean isRemovable() { return false; }
    public boolean isMultipleEnabledProfilesSupported() { return false; }
    @android.annotation.NonNull
    public java.util.Collection<android.telephony.UiccPortInfo> getPorts() { return null; }
    public void setIccIdAccessRestricted(boolean p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
