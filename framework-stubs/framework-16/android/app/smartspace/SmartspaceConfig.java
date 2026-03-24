package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.smartspace.SmartspaceConfig> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public int getSmartspaceTargetCount() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getUiSurface() { return null; }
    @android.annotation.Nullable
    @android.annotation.SuppressLint("NullableCollection")
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(android.content.Context p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.smartspace.SmartspaceConfig.Builder setSmartspaceTargetCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.smartspace.SmartspaceConfig.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.smartspace.SmartspaceConfig build() { return null; }
    }
}
