package android.content.integrity;

public final class CompoundFormula extends android.content.integrity.IntegrityFormula implements android.os.Parcelable {
    public static final int AND = 0;
    public static final int OR = 1;
    public static final int NOT = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.integrity.CompoundFormula> CREATOR = null;
    public CompoundFormula(int p0, java.util.List<android.content.integrity.IntegrityFormula> p1) { super(); }
    CompoundFormula(android.os.Parcel p0) { super(); }
    public int getConnector() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.content.integrity.IntegrityFormula> getFormulas() { return null; }
    public int getTag() { return 0; }
    public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
    public boolean isAppCertificateFormula() { return false; }
    public boolean isAppCertificateLineageFormula() { return false; }
    public boolean isInstallerFormula() { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Connector {
    }
}
