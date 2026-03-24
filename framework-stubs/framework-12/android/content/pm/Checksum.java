package android.content.pm;

public final class Checksum implements android.os.Parcelable {
    public static final int TYPE_WHOLE_MERKLE_ROOT_4K_SHA256 = 1;
    @java.lang.Deprecated
    public static final int TYPE_WHOLE_MD5 = 2;
    @java.lang.Deprecated
    public static final int TYPE_WHOLE_SHA1 = 4;
    @java.lang.Deprecated
    public static final int TYPE_WHOLE_SHA256 = 8;
    @java.lang.Deprecated
    public static final int TYPE_WHOLE_SHA512 = 16;
    public static final int TYPE_PARTIAL_MERKLE_ROOT_1M_SHA256 = 32;
    public static final int TYPE_PARTIAL_MERKLE_ROOT_1M_SHA512 = 64;
    private final int mType = 0;
    private final byte[] mValue = null;
    public static final android.os.Parcelable.Creator<android.content.pm.Checksum> CREATOR = null;
    public static void writeToStream(java.io.DataOutputStream p0, android.content.pm.Checksum p1) throws java.io.IOException {}
    public static android.content.pm.Checksum readFromStream(java.io.DataInputStream p0) throws java.io.IOException { return null; }
    public Checksum(int p0, byte[] p1) {}
    public int getType() { return 0; }
    public byte[] getValue() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    Checksum(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TypeMask {
    }
}
