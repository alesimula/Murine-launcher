package android.security.keystore.recovery;

public final class TrustedRootCertificates {
    public static final java.lang.String GOOGLE_CLOUD_KEY_VAULT_SERVICE_V1_ALIAS = "GoogleCloudKeyVaultServiceV1";
    public static final java.lang.String TEST_ONLY_INSECURE_CERTIFICATE_ALIAS = "TEST_ONLY_INSECURE_CERTIFICATE_ALIAS";
    public static final java.lang.String INSECURE_KEY_ALIAS_PREFIX = "INSECURE_KEY_ALIAS_KEY_MATERIAL_IS_NOT_PROTECTED_";
    public static final java.lang.String INSECURE_PASSWORD_PREFIX = "INSECURE_PSWD_";
    @android.annotation.NonNull
    public static java.security.cert.X509Certificate getTestOnlyInsecureCertificate() { return null; }
    @android.annotation.NonNull
    public static java.util.Map<java.lang.String, java.security.cert.X509Certificate> getRootCertificates() { return null; }
    @android.annotation.NonNull
    public static java.security.cert.X509Certificate getRootCertificate(java.lang.String p0) { return null; }
}
