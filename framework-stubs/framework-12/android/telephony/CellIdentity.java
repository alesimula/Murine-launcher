package android.telephony;

public abstract class CellIdentity implements android.os.Parcelable {
    public static final int INVALID_CHANNEL_NUMBER = 2147483647;
    public static final int MCC_LENGTH = 3;
    public static final int MNC_MIN_LENGTH = 2;
    public static final int MNC_MAX_LENGTH = 3;
    protected final java.lang.String mTag = null;
    protected final int mType = 0;
    protected final java.lang.String mMccStr = null;
    protected final java.lang.String mMncStr = null;
    protected java.lang.String mAlphaLong;
    protected java.lang.String mAlphaShort;
    protected java.lang.String mGlobalCellId;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentity> CREATOR = null;
    protected CellIdentity(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) {}
    public int describeContents() { return 0; }
    public int getType() { return 0; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public int getChannelNumber() { return 0; }
    public java.lang.CharSequence getOperatorAlphaLong() { return null; }
    public void setOperatorAlphaLong(java.lang.String p0) {}
    public java.lang.CharSequence getOperatorAlphaShort() { return null; }
    public void setOperatorAlphaShort(java.lang.String p0) {}
    public java.lang.String getGlobalCellId() { return null; }
    public boolean isSameCell(android.telephony.CellIdentity p0) { return false; }
    public java.lang.String getPlmn() { return null; }
    protected abstract void updateGlobalCellId();
    @android.annotation.SystemApi
    public abstract android.telephony.CellLocation asCellLocation();
    @android.annotation.SystemApi
    public abstract android.telephony.CellIdentity sanitizeLocationInfo();
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static boolean isValidPlmn(java.lang.String p0) { return false; }
    protected CellIdentity(java.lang.String p0, int p1, android.os.Parcel p2) {}
    protected void log(java.lang.String p0) {}
    protected static final int inRangeOrUnavailable(int p0, int p1, int p2) { return 0; }
    protected static final long inRangeOrUnavailable(long p0, long p1, long p2) { return 0L; }
    protected static final int inRangeOrUnavailable(int p0, int p1, int p2, int p3) { return 0; }
    private static boolean isMcc(java.lang.String p0) { return false; }
    private static boolean isMnc(java.lang.String p0) { return false; }
    public static android.telephony.CellIdentity create(android.hardware.radio.V1_0.CellIdentity p0) { return null; }
    public static android.telephony.CellIdentity create(android.hardware.radio.V1_2.CellIdentity p0) { return null; }
    public static android.telephony.CellIdentity create(android.hardware.radio.V1_5.CellIdentity p0) { return null; }
}
