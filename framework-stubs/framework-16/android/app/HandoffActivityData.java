package android.app;

@android.annotation.FlaggedApi("android.companion.enable_task_continuity")
public final class HandoffActivityData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.HandoffActivityData> CREATOR = null;
    @android.annotation.NonNull
    public android.content.ComponentName getComponentName() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getExtras() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getFallbackUri() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.companion.enable_task_continuity")
    public static final class Builder {
        public Builder(android.content.ComponentName p0) {}
        @android.annotation.NonNull
        public android.app.HandoffActivityData.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.HandoffActivityData.Builder setFallbackUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.app.HandoffActivityData build() { return null; }
    }
}
