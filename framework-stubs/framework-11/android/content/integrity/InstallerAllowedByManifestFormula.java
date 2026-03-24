package android.content.integrity;

public class InstallerAllowedByManifestFormula extends android.content.integrity.IntegrityFormula implements android.os.Parcelable {
    public static final java.lang.String INSTALLER_CERTIFICATE_NOT_EVALUATED = "";
    public static final android.os.Parcelable.Creator<android.content.integrity.InstallerAllowedByManifestFormula> CREATOR = null;
    public InstallerAllowedByManifestFormula() { super(); }
    private InstallerAllowedByManifestFormula(android.os.Parcel p0) { super(); }
    public int getTag() { return 0; }
    public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
    public boolean isAppCertificateFormula() { return false; }
    public boolean isInstallerFormula() { return false; }
    private static boolean installerInAllowedInstallersFromManifest(android.content.integrity.AppInstallMetadata p0, java.util.Map<java.lang.String, java.lang.String> p1) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
