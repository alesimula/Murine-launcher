package android.security.keystore;

public final class ParcelableKeyGenParameterSpec implements android.os.Parcelable {
    private static final int ALGORITHM_PARAMETER_SPEC_NONE = 1;
    private static final int ALGORITHM_PARAMETER_SPEC_RSA = 2;
    private static final int ALGORITHM_PARAMETER_SPEC_EC = 3;
    private final android.security.keystore.KeyGenParameterSpec mSpec = null;
    public static final android.os.Parcelable.Creator<android.security.keystore.ParcelableKeyGenParameterSpec> CREATOR = null;
    public ParcelableKeyGenParameterSpec(android.security.keystore.KeyGenParameterSpec p0) {}
    public int describeContents() { return 0; }
    private static void writeOptionalDate(android.os.Parcel p0, java.util.Date p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static java.util.Date readDateOrNull(android.os.Parcel p0) { return null; }
    private ParcelableKeyGenParameterSpec(android.os.Parcel p0) {}
    public android.security.keystore.KeyGenParameterSpec getSpec() { return null; }
}
