package android.security.identity;

public class AccessControlProfile {
    android.security.identity.AccessControlProfileId getAccessControlProfileId() { return null; }
    long getUserAuthenticationTimeout() { return 0L; }
    boolean isUserAuthenticationRequired() { return false; }
    java.security.cert.X509Certificate getReaderCertificate() { return null; }

    public static final class Builder {
        public Builder(android.security.identity.AccessControlProfileId p0) {}
        public android.security.identity.AccessControlProfile.Builder setUserAuthenticationRequired(boolean p0) { return null; }
        public android.security.identity.AccessControlProfile.Builder setUserAuthenticationTimeout(long p0) { return null; }
        public android.security.identity.AccessControlProfile.Builder setReaderCertificate(java.security.cert.X509Certificate p0) { return null; }
        public android.security.identity.AccessControlProfile build() { return null; }
    }
}
