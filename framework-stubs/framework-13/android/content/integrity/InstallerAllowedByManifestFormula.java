package android.content.integrity;

public class InstallerAllowedByManifestFormula extends android.content.integrity.IntegrityFormula implements android.os.Parcelable {
    public static final java.lang.String INSTALLER_CERTIFICATE_NOT_EVALUATED = "";
    public static final android.os.Parcelable.Creator<android.content.integrity.InstallerAllowedByManifestFormula> CREATOR = null;
    public InstallerAllowedByManifestFormula() { super(); }
    public int getTag() { return 0; }
    public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
    public boolean isAppCertificateFormula() { return false; }
    public boolean isAppCertificateLineageFormula() { return false; }
    public boolean isInstallerFormula() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
