package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppBinary implements android.os.Parcelable {
    private static final java.lang.String TAG = "NanoAppBinary";
    private byte[] mNanoAppBinary;
    private int mHeaderVersion;
    private int mMagic;
    private long mNanoAppId;
    private int mNanoAppVersion;
    private int mFlags;
    private long mHwHubType;
    private byte mTargetChreApiMajorVersion;
    private byte mTargetChreApiMinorVersion;
    private boolean mHasValidHeader;
    private static final int EXPECTED_HEADER_VERSION = 1;
    private static final int EXPECTED_MAGIC_VALUE = 1330528590;
    private static final java.nio.ByteOrder HEADER_ORDER = null;
    private static final int HEADER_SIZE_BYTES = 40;
    private static final int NANOAPP_SIGNED_FLAG_BIT = 1;
    private static final int NANOAPP_ENCRYPTED_FLAG_BIT = 2;
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppBinary> CREATOR = null;
    public NanoAppBinary(byte[] p0) {}
    private void parseBinaryHeader() {}
    public byte[] getBinary() { return null; }
    public byte[] getBinaryNoHeader() { return null; }
    public boolean hasValidHeader() { return false; }
    public int getHeaderVersion() { return 0; }
    public long getNanoAppId() { return 0L; }
    public int getNanoAppVersion() { return 0; }
    public long getHwHubType() { return 0L; }
    public byte getTargetChreApiMajorVersion() { return 0; }
    public byte getTargetChreApiMinorVersion() { return 0; }
    public int getFlags() { return 0; }
    public boolean isSigned() { return false; }
    public boolean isEncrypted() { return false; }
    private NanoAppBinary(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
