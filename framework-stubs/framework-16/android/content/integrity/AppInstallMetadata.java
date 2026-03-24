package android.content.integrity;

public final class AppInstallMetadata {
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAppCertificates() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAppCertificateLineage() { return null; }
    @android.annotation.NonNull
    public java.lang.String getInstallerName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getInstallerCertificates() { return null; }
    public long getVersionCode() { return 0L; }
    public boolean isPreInstalled() { return false; }
    public boolean isStampPresent() { return false; }
    public boolean isStampVerified() { return false; }
    public boolean isStampTrusted() { return false; }
    public java.lang.String getStampCertificateHash() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getAllowedInstallersAndCertificates() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setAllowedInstallersAndCert(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setAppCertificates(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setAppCertificateLineage(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setInstallerName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setInstallerCertificates(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setVersionCode(long p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setIsPreInstalled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setIsStampPresent(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setIsStampVerified(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setIsStampTrusted(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata.Builder setStampCertificateHash(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.integrity.AppInstallMetadata build() { return null; }
    }
}
