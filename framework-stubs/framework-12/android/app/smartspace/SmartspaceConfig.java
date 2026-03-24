package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceConfig implements android.os.Parcelable {
    private final int mSmartspaceTargetCount = 0;
    private final java.lang.String mUiSurface = null;
    private java.lang.String mPackageName;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.app.smartspace.SmartspaceConfig> CREATOR = null;
    private SmartspaceConfig(java.lang.String p0, int p1, java.lang.String p2, android.os.Bundle p3) {}
    private SmartspaceConfig(android.os.Parcel p0) {}
    public java.lang.String getPackageName() { return null; }
    public int getSmartspaceTargetCount() { return 0; }
    public java.lang.String getUiSurface() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        private int mSmartspaceTargetCount;
        private final java.lang.String mUiSurface = null;
        private final java.lang.String mPackageName = null;
        private android.os.Bundle mExtras;
        @android.annotation.SystemApi
        public Builder(android.content.Context p0, java.lang.String p1) {}
        public android.app.smartspace.SmartspaceConfig.Builder setSmartspaceTargetCount(int p0) { return null; }
        public android.app.smartspace.SmartspaceConfig.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.smartspace.SmartspaceConfig build() { return null; }
    }
}
