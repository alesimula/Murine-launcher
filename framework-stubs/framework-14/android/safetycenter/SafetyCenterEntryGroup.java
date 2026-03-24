package android.safetycenter;

public final class SafetyCenterEntryGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterEntryGroup> CREATOR = null;
    SafetyCenterEntryGroup() {}
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSummary() { return null; }
    public int getSeverityLevel() { return 0; }
    public int getSeverityUnspecifiedIconType() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetyCenterEntry> getEntries() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.CharSequence p1) {}
        public Builder(android.safetycenter.SafetyCenterEntryGroup p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup.Builder setTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup.Builder setSummary(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup.Builder setSeverityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup.Builder setSeverityUnspecifiedIconType(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup.Builder setEntries(java.util.List<android.safetycenter.SafetyCenterEntry> p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntryGroup build() { return null; }
    }
}
