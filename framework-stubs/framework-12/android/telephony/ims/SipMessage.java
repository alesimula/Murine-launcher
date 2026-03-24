package android.telephony.ims;

@android.annotation.SystemApi
public final class SipMessage implements android.os.Parcelable {
    private static final boolean IS_DEBUGGING = Boolean.valueOf(false);
    private static final java.lang.String CRLF = "\r\n";
    private final java.lang.String mStartLine = null;
    private final java.lang.String mHeaderSection = null;
    private final byte[] mContent = null;
    private final java.lang.String mViaBranchParam = null;
    private final java.lang.String mCallIdParam = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipMessage> CREATOR = null;
    public SipMessage(java.lang.String p0, java.lang.String p1, byte[] p2) {}
    private SipMessage(android.os.Parcel p0) {}
    public java.lang.String getStartLine() { return null; }
    public java.lang.String getHeaderSection() { return null; }
    public byte[] getContent() { return null; }
    public java.lang.String getViaBranchParameter() { return null; }
    public java.lang.String getCallIdParameter() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private java.lang.String sanitizeStartLineRequest(java.lang.String p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public byte[] toEncodedMessage() { return null; }
}
