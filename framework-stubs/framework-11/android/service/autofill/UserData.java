package android.service.autofill;

public final class UserData implements android.service.autofill.FieldClassificationUserData, android.os.Parcelable {
    private static final java.lang.String TAG = "UserData";
    private static final int DEFAULT_MAX_USER_DATA_SIZE = 50;
    private static final int DEFAULT_MAX_CATEGORY_COUNT = 10;
    private static final int DEFAULT_MAX_FIELD_CLASSIFICATION_IDS_SIZE = 10;
    private static final int DEFAULT_MIN_VALUE_LENGTH = 3;
    private static final int DEFAULT_MAX_VALUE_LENGTH = 100;
    private final java.lang.String mId = null;
    private final java.lang.String[] mCategoryIds = null;
    private final java.lang.String[] mValues = null;
    private final java.lang.String mDefaultAlgorithm = null;
    private final android.os.Bundle mDefaultArgs = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.String> mCategoryAlgorithms = null;
    private final android.util.ArrayMap<java.lang.String, android.os.Bundle> mCategoryArgs = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.UserData> CREATOR = null;
    private UserData(android.service.autofill.UserData.Builder p0) {}
    public java.lang.String getFieldClassificationAlgorithm() { return null; }
    public android.os.Bundle getDefaultFieldClassificationArgs() { return null; }
    public java.lang.String getFieldClassificationAlgorithmForCategory(java.lang.String p0) { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String[] getCategoryIds() { return null; }
    public java.lang.String[] getValues() { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.String> getFieldClassificationAlgorithms() { return null; }
    public android.util.ArrayMap<java.lang.String, android.os.Bundle> getFieldClassificationArgs() { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static void dumpConstraints(java.lang.String p0, java.io.PrintWriter p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static int getMaxUserDataSize() { return 0; }
    public static int getMaxFieldClassificationIdsSize() { return 0; }
    public static int getMaxCategoryCount() { return 0; }
    public static int getMinValueLength() { return 0; }
    public static int getMaxValueLength() { return 0; }
    private static int getInt(java.lang.String p0, int p1) { return 0; }

    public static final class Builder {
        private final java.lang.String mId = null;
        private final java.util.ArrayList<java.lang.String> mCategoryIds = null;
        private final java.util.ArrayList<java.lang.String> mValues = null;
        private java.lang.String mDefaultAlgorithm;
        private android.os.Bundle mDefaultArgs;
        private android.util.ArrayMap<java.lang.String, java.lang.String> mCategoryAlgorithms;
        private android.util.ArrayMap<java.lang.String, android.os.Bundle> mCategoryArgs;
        private boolean mDestroyed;
        private final android.util.ArraySet<java.lang.String> mUniqueCategoryIds = null;
        private final android.util.ArraySet<java.lang.String> mUniqueValueCategoryPairs = null;
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public android.service.autofill.UserData.Builder setFieldClassificationAlgorithm(java.lang.String p0, android.os.Bundle p1) { return null; }
        public android.service.autofill.UserData.Builder setFieldClassificationAlgorithmForCategory(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return null; }
        public android.service.autofill.UserData.Builder add(java.lang.String p0, java.lang.String p1) { return null; }
        private void addMapping(java.lang.String p0, java.lang.String p1) {}
        private java.lang.String checkNotEmpty(java.lang.String p0, java.lang.String p1) { return null; }
        private void checkValidValue(java.lang.String p0) {}
        public android.service.autofill.UserData build() { return null; }
        private void throwIfDestroyed() {}
    }
}
