package android.security.identity;

public abstract class CredentialDataResult {
    protected CredentialDataResult() {}
    @android.annotation.NonNull
    public abstract byte[] getDeviceNameSpaces();
    @android.annotation.Nullable
    public abstract byte[] getDeviceMac();
    @android.annotation.Nullable
    public byte[] getDeviceSignature() { return null; }
    @android.annotation.NonNull
    public abstract byte[] getStaticAuthenticationData();
    @android.annotation.NonNull
    public abstract android.security.identity.CredentialDataResult.Entries getDeviceSignedEntries();
    @android.annotation.NonNull
    public abstract android.security.identity.CredentialDataResult.Entries getIssuerSignedEntries();

    public static interface Entries {
        public static final int STATUS_OK = 0;
        public static final int STATUS_NO_SUCH_ENTRY = 1;
        public static final int STATUS_NOT_REQUESTED = 2;
        public static final int STATUS_NOT_IN_REQUEST_MESSAGE = 3;
        public static final int STATUS_USER_AUTHENTICATION_FAILED = 4;
        public static final int STATUS_READER_AUTHENTICATION_FAILED = 5;
        public static final int STATUS_NO_ACCESS_CONTROL_PROFILES = 6;
        @android.annotation.NonNull
        public java.util.Collection<java.lang.String> getNamespaces();
        @android.annotation.NonNull
        public java.util.Collection<java.lang.String> getEntryNames(java.lang.String p0);
        @android.annotation.NonNull
        public java.util.Collection<java.lang.String> getRetrievedEntryNames(java.lang.String p0);
        public int getStatus(java.lang.String p0, java.lang.String p1);
        @android.annotation.Nullable
        public byte[] getEntry(java.lang.String p0, java.lang.String p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Status {
        }
    }
}
