package android.content.integrity;

@android.annotation.SystemApi
public abstract class IntegrityFormula {
    public static final int COMPOUND_FORMULA_TAG = 0;
    public static final int STRING_ATOMIC_FORMULA_TAG = 1;
    public static final int LONG_ATOMIC_FORMULA_TAG = 2;
    public static final int BOOLEAN_ATOMIC_FORMULA_TAG = 3;
    public static final int INSTALLER_ALLOWED_BY_MANIFEST_FORMULA_TAG = 4;
    public abstract int getTag();
    public abstract boolean matches(android.content.integrity.AppInstallMetadata p0);
    public abstract boolean isAppCertificateFormula();
    public abstract boolean isAppCertificateLineageFormula();
    public abstract boolean isInstallerFormula();
    public static void writeToParcel(android.content.integrity.IntegrityFormula p0, android.os.Parcel p1, int p2) {}
    public static android.content.integrity.IntegrityFormula readFromParcel(android.os.Parcel p0) { return null; }
    public static android.content.integrity.IntegrityFormula any(android.content.integrity.IntegrityFormula... p0) { return null; }
    public static android.content.integrity.IntegrityFormula all(android.content.integrity.IntegrityFormula... p0) { return null; }
    public static android.content.integrity.IntegrityFormula not(android.content.integrity.IntegrityFormula p0) { return null; }
    IntegrityFormula() {}

    public static final class Application {
        public static android.content.integrity.IntegrityFormula packageNameEquals(java.lang.String p0) { return null; }
        public static android.content.integrity.IntegrityFormula certificatesContain(java.lang.String p0) { return null; }
        public static android.content.integrity.IntegrityFormula certificateLineageContains(java.lang.String p0) { return null; }
        public static android.content.integrity.IntegrityFormula versionCodeEquals(long p0) { return null; }
        public static android.content.integrity.IntegrityFormula versionCodeGreaterThan(long p0) { return null; }
        public static android.content.integrity.IntegrityFormula versionCodeGreaterThanOrEqualTo(long p0) { return null; }
        public static android.content.integrity.IntegrityFormula isPreInstalled() { return null; }
    }

    public static final class Installer {
        public static android.content.integrity.IntegrityFormula packageNameEquals(java.lang.String p0) { return null; }
        public static android.content.integrity.IntegrityFormula notAllowedByManifest() { return null; }
        public static android.content.integrity.IntegrityFormula certificatesContain(java.lang.String p0) { return null; }
    }

    public static final class SourceStamp {
        public static android.content.integrity.IntegrityFormula stampCertificateHashEquals(java.lang.String p0) { return null; }
        public static android.content.integrity.IntegrityFormula notTrusted() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Tag {
    }
}
