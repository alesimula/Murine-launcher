package android.companion.datatransfer.continuity;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.enable_task_continuity")
public final class RemoteTask implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.datatransfer.continuity.RemoteTask> CREATOR = null;
    RemoteTask(android.companion.datatransfer.continuity.RemoteTask.Builder p0) {}
    RemoteTask(android.os.Parcel p0) {}
    public int getId() { return 0; }
    public int getDeviceId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getLabel() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Icon getIcon() { return null; }
    public boolean isHandoffEnabled() { return false; }
    @android.annotation.NonNull
    public java.lang.String getSourceDeviceName() { return null; }
    public int getLastUsedTimestampMillis() { return 0; }
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask.Builder setLabel(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask.Builder setDeviceId(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask.Builder setHandoffEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask.Builder setSourceDeviceName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask.Builder setLastUsedTimestampMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.datatransfer.continuity.RemoteTask build() { return null; }
    }
}
