package android.app.prediction;

@android.annotation.SystemApi
public final class AppTarget implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.prediction.AppTarget> CREATOR = null;
    @java.lang.Deprecated
    public AppTarget(android.app.prediction.AppTargetId p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3) {}
    @java.lang.Deprecated
    public AppTarget(android.app.prediction.AppTargetId p0, android.content.pm.ShortcutInfo p1, java.lang.String p2) {}
    @android.annotation.NonNull
    public android.app.prediction.AppTargetId getId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getClassName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public android.os.UserHandle getUser() { return null; }
    @android.annotation.Nullable
    public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
    public int getRank() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        @java.lang.Deprecated
        @android.annotation.SystemApi
        public Builder(android.app.prediction.AppTargetId p0) {}
        @android.annotation.SystemApi
        public Builder(android.app.prediction.AppTargetId p0, java.lang.String p1, android.os.UserHandle p2) {}
        @android.annotation.SystemApi
        public Builder(android.app.prediction.AppTargetId p0, android.content.pm.ShortcutInfo p1) {}
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.app.prediction.AppTarget.Builder setTarget(java.lang.String p0, android.os.UserHandle p1) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.app.prediction.AppTarget.Builder setTarget(android.content.pm.ShortcutInfo p0) { return null; }
        @android.annotation.NonNull
        public android.app.prediction.AppTarget.Builder setClassName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.prediction.AppTarget.Builder setRank(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.prediction.AppTarget build() { return null; }
    }
}
