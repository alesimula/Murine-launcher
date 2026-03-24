package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class Icon implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.Icon> CREATOR = null;
    Icon(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public android.graphics.drawable.Icon getIcon() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getContentDescription() { return null; }
    public boolean shouldTint() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(android.graphics.drawable.Icon p0) {}
        @android.annotation.NonNull
        public android.app.smartspace.uitemplatedata.Icon.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.smartspace.uitemplatedata.Icon.Builder setShouldTint(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.smartspace.uitemplatedata.Icon build() { return null; }
    }
}
