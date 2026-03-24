package android.content.pm;

public class VerifierDeviceIdentity implements android.os.Parcelable {
    private static final int LONG_SIZE = 13;
    private static final int GROUP_SIZE = 4;
    private final long mIdentity = 0L;
    private final java.lang.String mIdentityString = null;
    private static final char[] ENCODE = null;
    private static final char SEPARATOR = '-';
    public static final android.os.Parcelable.Creator<android.content.pm.VerifierDeviceIdentity> CREATOR = null;
    public VerifierDeviceIdentity(long p0) {}
    private VerifierDeviceIdentity(android.os.Parcel p0) {}
    public static android.content.pm.VerifierDeviceIdentity generate() { return null; }
    static android.content.pm.VerifierDeviceIdentity generate(java.util.Random p0) { return null; }
    private static final java.lang.String encodeBase32(long p0) { return null; }
    private static final long decodeBase32(byte[] p0) throws java.lang.IllegalArgumentException { return 0L; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public static android.content.pm.VerifierDeviceIdentity parse(java.lang.String p0) throws java.lang.IllegalArgumentException { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
