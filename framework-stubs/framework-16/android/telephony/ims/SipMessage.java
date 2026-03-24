package android.telephony.ims;

@android.annotation.SystemApi
public final class SipMessage implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipMessage> CREATOR = null;
    public SipMessage(java.lang.String p0, java.lang.String p1, byte[] p2) {}
    @android.annotation.NonNull
    public java.lang.String getStartLine() { return null; }
    @android.annotation.NonNull
    public java.lang.String getHeaderSection() { return null; }
    @android.annotation.NonNull
    public byte[] getContent() { return null; }
    @android.annotation.NonNull
    public java.lang.String getViaBranchParameter() { return null; }
    @android.annotation.Nullable
    public java.lang.String getCallIdParameter() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public byte[] toEncodedMessage() { return null; }
}
