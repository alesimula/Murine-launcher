package android.app.admin;

public class PasswordMetrics implements android.os.Parcelable {
    public static final int MAX_ALLOWED_SEQUENCE = 3;
    public int quality;
    public int length;
    public int letters;
    public int upperCase;
    public int lowerCase;
    public int numeric;
    public int symbols;
    public int nonLetter;
    public static final android.os.Parcelable.Creator<android.app.admin.PasswordMetrics> CREATOR = null;
    private static final int CHAR_LOWER_CASE = 0;
    private static final int CHAR_UPPER_CASE = 1;
    private static final int CHAR_DIGIT = 2;
    private static final int CHAR_SYMBOL = 3;
    public PasswordMetrics() {}
    public PasswordMetrics(int p0) {}
    public PasswordMetrics(int p0, int p1) {}
    public PasswordMetrics(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    private PasswordMetrics(android.os.Parcel p0) {}
    public static int complexityLevelToMinQuality(int p0) { return 0; }
    public static android.app.admin.PasswordMetrics getMinimumMetrics(int p0, int p1, int p2, boolean p3, boolean p4) { return null; }
    public static android.app.admin.PasswordMetrics getTargetQualityMetrics(int p0, int p1) { return null; }
    public static int getActualRequiredQuality(int p0, boolean p1, boolean p2) { return 0; }
    public static int sanitizeComplexityLevel(int p0) { return 0; }
    public boolean isDefault() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.app.admin.PasswordMetrics computeForCredential(int p0, byte[] p1) { return null; }
    public static android.app.admin.PasswordMetrics computeForPassword(byte[] p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    private boolean satisfiesBucket(android.app.admin.PasswordMetrics... p0) { return false; }
    public static int maxLengthSequence(byte[] p0) { return 0; }
    private static int categoryChar(char p0) { return 0; }
    private static int maxDiffCategory(int p0) { return 0; }
    public int determineComplexity() { return 0; }

    private static class PasswordComplexityBucket {
        private static final android.app.admin.PasswordMetrics.PasswordComplexityBucket HIGH = null;
        private static final android.app.admin.PasswordMetrics.PasswordComplexityBucket MEDIUM = null;
        private static final android.app.admin.PasswordMetrics.PasswordComplexityBucket LOW = null;
        private static final android.app.admin.PasswordMetrics.PasswordComplexityBucket NONE = null;
        private static final android.app.admin.PasswordMetrics.PasswordComplexityBucket[] BUCKETS = null;
        private final int mComplexityLevel = 0;
        private final android.app.admin.PasswordMetrics[] mMetrics = null;
        private PasswordComplexityBucket(int p0, android.app.admin.PasswordMetrics... p1) {}
        private static android.app.admin.PasswordMetrics.PasswordComplexityBucket complexityLevelToBucket(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface CharacterCatagory {
    }
}
