package android.security;

public final class FileIntegrityManager {
    public FileIntegrityManager(android.content.Context p0, android.security.IFileIntegrityService p1) {}
    public boolean isApkVeritySupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.fsverity_api")
    @android.annotation.SuppressLint("StreamFiles")
    public void setupFsVerity(java.io.File p0) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.fsverity_api")
    @android.annotation.SuppressLint("StreamFiles")
    @android.annotation.Nullable
    public byte[] getFsVerityDigest(java.io.File p0) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.INSTALL_PACKAGES", "android.permission.REQUEST_INSTALL_PACKAGES"})
    public boolean isAppSourceCertificateTrusted(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateEncodingException { return false; }
}
