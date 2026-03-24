package android.adservices.cobalt;

public final class EncryptedCobaltEnvelopeParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.cobalt.EncryptedCobaltEnvelopeParams> CREATOR = null;
    public static final int ENVIRONMENT_DEV = 1;
    public static final int ENVIRONMENT_PROD = 0;
    public EncryptedCobaltEnvelopeParams(int p0, int p1, byte[] p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public byte[] getCipherText() { return null; }
    @android.annotation.NonNull
    public int getEnvironment() { return 0; }
    @android.annotation.NonNull
    public int getKeyIndex() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
