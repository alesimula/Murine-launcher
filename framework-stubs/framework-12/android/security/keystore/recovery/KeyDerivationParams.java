package android.security.keystore.recovery;

@android.annotation.SystemApi
public final class KeyDerivationParams implements android.os.Parcelable {
    private final int mAlgorithm = 0;
    private final byte[] mSalt = null;
    private final int mMemoryDifficulty = 0;
    public static final int ALGORITHM_SHA256 = 1;
    public static final int ALGORITHM_SCRYPT = 2;
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyDerivationParams> CREATOR = null;
    public static android.security.keystore.recovery.KeyDerivationParams createSha256Params(byte[] p0) { return null; }
    public static android.security.keystore.recovery.KeyDerivationParams createScryptParams(byte[] p0, int p1) { return null; }
    private KeyDerivationParams(int p0, byte[] p1) {}
    private KeyDerivationParams(int p0, byte[] p1, int p2) {}
    public int getAlgorithm() { return 0; }
    public byte[] getSalt() { return null; }
    public int getMemoryDifficulty() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected KeyDerivationParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyDerivationAlgorithm {
    }
}
