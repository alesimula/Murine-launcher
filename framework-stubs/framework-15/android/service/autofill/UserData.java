package android.service.autofill;

public final class UserData implements android.service.autofill.FieldClassificationUserData, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.UserData> CREATOR = null;
    @android.annotation.Nullable
    public java.lang.String getFieldClassificationAlgorithm() { return null; }
    public android.os.Bundle getDefaultFieldClassificationArgs() { return null; }
    @android.annotation.Nullable
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

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        @android.annotation.NonNull
        public android.service.autofill.UserData.Builder setFieldClassificationAlgorithm(java.lang.String p0, android.os.Bundle p1) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.UserData.Builder setFieldClassificationAlgorithmForCategory(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.UserData.Builder add(java.lang.String p0, java.lang.String p1) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.UserData build() { return null; }
    }
}
