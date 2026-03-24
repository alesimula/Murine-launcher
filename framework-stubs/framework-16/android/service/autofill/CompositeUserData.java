package android.service.autofill;

public final class CompositeUserData implements android.service.autofill.FieldClassificationUserData, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.CompositeUserData> CREATOR = null;
    public CompositeUserData(android.service.autofill.UserData p0, android.service.autofill.UserData p1) {}
    @android.annotation.Nullable
    public java.lang.String getFieldClassificationAlgorithm() { return null; }
    public android.os.Bundle getDefaultFieldClassificationArgs() { return null; }
    @android.annotation.Nullable
    public java.lang.String getFieldClassificationAlgorithmForCategory(java.lang.String p0) { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.String> getFieldClassificationAlgorithms() { return null; }
    public android.util.ArrayMap<java.lang.String, android.os.Bundle> getFieldClassificationArgs() { return null; }
    public java.lang.String[] getCategoryIds() { return null; }
    public java.lang.String[] getValues() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
