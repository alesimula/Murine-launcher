package android.telephony;

public final class UiccCardInfo implements android.os.Parcelable {
    private final boolean mIsEuicc = false;
    private final int mCardId = 0;
    private final java.lang.String mEid = null;
    private final java.lang.String mIccId = null;
    private final int mSlotIndex = 0;
    private final boolean mIsRemovable = false;
    public static final android.os.Parcelable.Creator<android.telephony.UiccCardInfo> CREATOR = null;
    private UiccCardInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public UiccCardInfo(boolean p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) {}
    public boolean isEuicc() { return false; }
    public int getCardId() { return 0; }
    public java.lang.String getEid() { return null; }
    public java.lang.String getIccId() { return null; }
    public int getSlotIndex() { return 0; }
    public android.telephony.UiccCardInfo getUnprivileged() { return null; }
    public boolean isRemovable() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
