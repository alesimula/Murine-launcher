package android.telephony;

public class SubscriptionInfo implements android.os.Parcelable {
    private static final int TEXT_SIZE = 16;
    private int mId;
    private java.lang.String mIccId;
    private int mSimSlotIndex;
    private java.lang.CharSequence mDisplayName;
    private java.lang.CharSequence mCarrierName;
    private int mCarrierId;
    private int mNameSource;
    private int mIconTint;
    private java.lang.String mNumber;
    private int mDataRoaming;
    private android.graphics.Bitmap mIconBitmap;
    private java.lang.String mMcc;
    private java.lang.String mMnc;
    private java.lang.String[] mEhplmns;
    private java.lang.String[] mHplmns;
    private java.lang.String mCountryIso;
    private boolean mIsEmbedded;
    private android.telephony.UiccAccessRule[] mNativeAccessRules;
    private android.telephony.UiccAccessRule[] mCarrierConfigAccessRules;
    private java.lang.String mCardString;
    private int mCardId;
    private boolean mIsOpportunistic;
    private android.os.ParcelUuid mGroupUUID;
    private java.lang.String mGroupOwner;
    private boolean mIsGroupDisabled;
    private int mProfileClass;
    private int mSubscriptionType;
    private boolean mAreUiccApplicationsEnabled;
    public static final android.os.Parcelable.Creator<android.telephony.SubscriptionInfo> CREATOR = null;
    public SubscriptionInfo(android.telephony.SubscriptionInfo p0) {}
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15) {}
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15, boolean p16, java.lang.String p17, int p18, int p19) {}
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15, int p16, boolean p17, java.lang.String p18, boolean p19, int p20, int p21, int p22, java.lang.String p23, android.telephony.UiccAccessRule[] p24, boolean p25) {}
    public int getSubscriptionId() { return 0; }
    public java.lang.String getIccId() { return null; }
    public void clearIccId() {}
    public int getSimSlotIndex() { return 0; }
    public int getCarrierId() { return 0; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public void setDisplayName(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getCarrierName() { return null; }
    public void setCarrierName(java.lang.CharSequence p0) {}
    public int getNameSource() { return 0; }
    public void setAssociatedPlmns(java.lang.String[] p0, java.lang.String[] p1) {}
    public android.graphics.Bitmap createIconBitmap(android.content.Context p0) { return null; }
    public int getIconTint() { return 0; }
    public void setIconTint(int p0) {}
    public java.lang.String getNumber() { return null; }
    public void clearNumber() {}
    public int getDataRoaming() { return 0; }
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getCountryIso() { return null; }
    public boolean isEmbedded() { return false; }
    public boolean isOpportunistic() { return false; }
    public android.os.ParcelUuid getGroupUuid() { return null; }
    public void clearGroupUuid() {}
    public java.util.List<java.lang.String> getEhplmns() { return null; }
    public java.util.List<java.lang.String> getHplmns() { return null; }
    public java.lang.String getGroupOwner() { return null; }
    @android.annotation.SystemApi
    public int getProfileClass() { return 0; }
    public int getSubscriptionType() { return 0; }
    @java.lang.Deprecated
    public boolean canManageSubscription(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public boolean canManageSubscription(android.content.Context p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.UiccAccessRule> getAccessRules() { return null; }
    public java.util.List<android.telephony.UiccAccessRule> getAllAccessRules() { return null; }
    public java.lang.String getCardString() { return null; }
    public void clearCardString() {}
    public int getCardId() { return 0; }
    public void setGroupDisabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isGroupDisabled() { return false; }
    @android.annotation.SystemApi
    public boolean areUiccApplicationsEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public static java.lang.String givePrintableIccid(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
