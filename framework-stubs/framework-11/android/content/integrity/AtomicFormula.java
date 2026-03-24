package android.content.integrity;

public abstract class AtomicFormula extends android.content.integrity.IntegrityFormula {
    public static final int PACKAGE_NAME = 0;
    public static final int APP_CERTIFICATE = 1;
    public static final int INSTALLER_NAME = 2;
    public static final int INSTALLER_CERTIFICATE = 3;
    public static final int VERSION_CODE = 4;
    public static final int PRE_INSTALLED = 5;
    public static final int STAMP_TRUSTED = 6;
    public static final int STAMP_CERTIFICATE_HASH = 7;
    public static final int EQ = 0;
    public static final int GT = 1;
    public static final int GTE = 2;
    private final int mKey = 0;
    public AtomicFormula(int p0) { super(); }
    public int getKey() { return 0; }
    static java.lang.String keyToString(int p0) { return null; }
    static java.lang.String operatorToString(int p0) { return null; }
    private static boolean isValidKey(int p0) { return false; }

    public static final class BooleanAtomicFormula extends android.content.integrity.AtomicFormula implements android.os.Parcelable {
        private final java.lang.Boolean mValue = null;
        public static final android.os.Parcelable.Creator<android.content.integrity.AtomicFormula.BooleanAtomicFormula> CREATOR = null;
        public BooleanAtomicFormula(int p0) { super(0); }
        public BooleanAtomicFormula(int p0, boolean p1) { super(0); }
        BooleanAtomicFormula(android.os.Parcel p0) { super(0); }
        public int getTag() { return 0; }
        public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
        public boolean isAppCertificateFormula() { return false; }
        public boolean isInstallerFormula() { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.Boolean getValue() { return null; }
        private static boolean getBooleanMetadataValue(android.content.integrity.AppInstallMetadata p0, int p1) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Key {
    }

    public static final class LongAtomicFormula extends android.content.integrity.AtomicFormula implements android.os.Parcelable {
        private final java.lang.Long mValue = null;
        private final java.lang.Integer mOperator = null;
        public static final android.os.Parcelable.Creator<android.content.integrity.AtomicFormula.LongAtomicFormula> CREATOR = null;
        public LongAtomicFormula(int p0) { super(0); }
        public LongAtomicFormula(int p0, int p1, long p2) { super(0); }
        LongAtomicFormula(android.os.Parcel p0) { super(0); }
        public int getTag() { return 0; }
        public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
        public boolean isAppCertificateFormula() { return false; }
        public boolean isInstallerFormula() { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.Long getValue() { return null; }
        public java.lang.Integer getOperator() { return null; }
        private static boolean isValidOperator(int p0) { return false; }
        private static long getLongMetadataValue(android.content.integrity.AppInstallMetadata p0, int p1) { return 0L; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Operator {
    }

    public static final class StringAtomicFormula extends android.content.integrity.AtomicFormula implements android.os.Parcelable {
        private final java.lang.String mValue = null;
        private final java.lang.Boolean mIsHashedValue = null;
        public static final android.os.Parcelable.Creator<android.content.integrity.AtomicFormula.StringAtomicFormula> CREATOR = null;
        public StringAtomicFormula(int p0) { super(0); }
        public StringAtomicFormula(int p0, java.lang.String p1, boolean p2) { super(0); }
        public StringAtomicFormula(int p0, java.lang.String p1) { super(0); }
        StringAtomicFormula(android.os.Parcel p0) { super(0); }
        public int getTag() { return 0; }
        public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
        public boolean isAppCertificateFormula() { return false; }
        public boolean isInstallerFormula() { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String getValue() { return null; }
        public java.lang.Boolean getIsHashedValue() { return null; }
        private static java.util.List<java.lang.String> getMetadataValue(android.content.integrity.AppInstallMetadata p0, int p1) { return null; }
        private static java.lang.String hashValue(int p0, java.lang.String p1) { return null; }
        private static java.lang.String hash(java.lang.String p0) { return null; }
    }
}
