package android.security;

public final class FileIntegrityManager {
    public FileIntegrityManager(android.content.Context p0, android.security.IFileIntegrityService p1) {}
    public boolean isApkVeritySupported() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INSTALL_PACKAGES", "android.permission.REQUEST_INSTALL_PACKAGES"})
    public boolean isAppSourceCertificateTrusted(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateEncodingException { return false; }
}
