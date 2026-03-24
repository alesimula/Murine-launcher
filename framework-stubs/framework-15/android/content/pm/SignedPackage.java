package android.content.pm;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
@android.annotation.FlaggedApi("android.permission.flags.enhanced_confirmation_mode_apis_enabled")
public class SignedPackage {
    public SignedPackage(java.lang.String p0, byte[] p1) {}
    public SignedPackage(android.content.pm.SignedPackageParcel p0) {}
    @android.annotation.NonNull
    public final android.content.pm.SignedPackageParcel getData() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public byte[] getCertificateDigest() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
