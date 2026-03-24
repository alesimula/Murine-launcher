package android.app.admin;

public final class PasswordMetrics implements android.os.Parcelable {
    public static final int MAX_ALLOWED_SEQUENCE = 3;
    public int credType;
    public int length;
    public int letters;
    public int upperCase;
    public int lowerCase;
    public int numeric;
    public int symbols;
    public int nonLetter;
    public int nonNumeric;
    public int seqLength;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.PasswordMetrics> CREATOR = null;
    public PasswordMetrics(int p0) {}
    public PasswordMetrics(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public static int sanitizeComplexityLevel(int p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.app.admin.PasswordMetrics computeForCredential(com.android.internal.widget.LockscreenCredential p0) { return null; }
    public static int maxLengthSequence(byte[] p0) { return 0; }
    public static android.app.admin.PasswordMetrics merge(java.util.List<android.app.admin.PasswordMetrics> p0) { return null; }
    public void maxWith(android.app.admin.PasswordMetrics p0) {}
    public static int complexityLevelToMinQuality(int p0) { return 0; }
    public int determineComplexity() { return 0; }
    public static java.util.List<com.android.internal.widget.PasswordValidationError> validateCredential(android.app.admin.PasswordMetrics p0, int p1, com.android.internal.widget.LockscreenCredential p2) { return null; }
    public static java.util.List<com.android.internal.widget.PasswordValidationError> validatePasswordMetrics(android.app.admin.PasswordMetrics p0, int p1, android.app.admin.PasswordMetrics p2) { return null; }
    public static android.app.admin.PasswordMetrics applyComplexity(android.app.admin.PasswordMetrics p0, boolean p1, int p2) { return null; }
    public static boolean isNumericOnly(java.lang.String p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface CharacterCatagory {
    }

    private static enum ComplexityBucket {
        BUCKET_HIGH,
        BUCKET_MEDIUM,
        BUCKET_LOW,
        BUCKET_NONE;
        int mComplexityLevel;
        boolean canHaveSequence() { return false; }
        int getMinimumLength(boolean p0) { return 0; }
        boolean allowsCredType(int p0) { return false; }
        static android.app.admin.PasswordMetrics.ComplexityBucket forComplexity(int p0) { return null; }
    }
}
