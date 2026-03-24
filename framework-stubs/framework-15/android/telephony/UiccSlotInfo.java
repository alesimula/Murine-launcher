package android.telephony;

@android.annotation.SystemApi
public class UiccSlotInfo implements android.os.Parcelable {
    public static final int CARD_STATE_INFO_ABSENT = 1;
    public static final int CARD_STATE_INFO_PRESENT = 2;
    public static final int CARD_STATE_INFO_ERROR = 3;
    public static final int CARD_STATE_INFO_RESTRICTED = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.UiccSlotInfo> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    public UiccSlotInfo(boolean p0, boolean p1, java.lang.String p2, int p3, int p4, boolean p5) {}
    public UiccSlotInfo(boolean p0, java.lang.String p1, int p2, boolean p3, boolean p4, java.util.List<android.telephony.UiccPortInfo> p5) {}
    @java.lang.Deprecated
    public boolean getIsActive() { return false; }
    public boolean getIsEuicc() { return false; }
    public java.lang.String getCardId() { return null; }
    public int getCardStateInfo() { return 0; }
    @java.lang.Deprecated
    public int getLogicalSlotIdx() { return 0; }
    public boolean getIsExtendedApduSupported() { return false; }
    public boolean isRemovable() { return false; }
    @android.annotation.NonNull
    public java.util.Collection<android.telephony.UiccPortInfo> getPorts() { return null; }
    public void setLogicalSlotAccessRestricted(boolean p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CardStateInfo {
    }
}
