package android.content.pm;

@java.lang.Deprecated
public class VerificationParams implements android.os.Parcelable {
    public static final int NO_UID = -1;
    private static final java.lang.String TO_STRING_PREFIX = "VerificationParams{";
    private final android.net.Uri mVerificationURI = null;
    private final android.net.Uri mOriginatingURI = null;
    private final android.net.Uri mReferrer = null;
    private final int mOriginatingUid = 0;
    private int mInstallerUid;
    public static final android.os.Parcelable.Creator<android.content.pm.VerificationParams> CREATOR = null;
    public VerificationParams(android.net.Uri p0, android.net.Uri p1, android.net.Uri p2, int p3) {}
    public android.net.Uri getVerificationURI() { return null; }
    public android.net.Uri getOriginatingURI() { return null; }
    public android.net.Uri getReferrer() { return null; }
    public int getOriginatingUid() { return 0; }
    public int getInstallerUid() { return 0; }
    public void setInstallerUid(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private VerificationParams(android.os.Parcel p0) {}
}
