package android.app.prediction;

@android.annotation.SystemApi
public final class AppTarget implements android.os.Parcelable {
    private final android.app.prediction.AppTargetId mId = null;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mClassName = null;
    private final android.os.UserHandle mUser = null;
    private final android.content.pm.ShortcutInfo mShortcutInfo = null;
    private final int mRank = 0;
    public static final android.os.Parcelable.Creator<android.app.prediction.AppTarget> CREATOR = null;
    @java.lang.Deprecated
    public AppTarget(android.app.prediction.AppTargetId p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3) {}
    @java.lang.Deprecated
    public AppTarget(android.app.prediction.AppTargetId p0, android.content.pm.ShortcutInfo p1, java.lang.String p2) {}
    private AppTarget(android.app.prediction.AppTargetId p0, java.lang.String p1, android.os.UserHandle p2, android.content.pm.ShortcutInfo p3, java.lang.String p4, int p5) {}
    private AppTarget(android.os.Parcel p0) {}
    public android.app.prediction.AppTargetId getId() { return null; }
    public java.lang.String getClassName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.UserHandle getUser() { return null; }
    public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
    public int getRank() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private final android.app.prediction.AppTargetId mId = null;
        private java.lang.String mPackageName;
        private android.os.UserHandle mUser;
        private android.content.pm.ShortcutInfo mShortcutInfo;
        private java.lang.String mClassName;
        private int mRank;
        @java.lang.Deprecated
        @android.annotation.SystemApi
        public Builder(android.app.prediction.AppTargetId p0) {}
        @android.annotation.SystemApi
        public Builder(android.app.prediction.AppTargetId p0, java.lang.String p1, android.os.UserHandle p2) {}
        @android.annotation.SystemApi
        public Builder(android.app.prediction.AppTargetId p0, android.content.pm.ShortcutInfo p1) {}
        @java.lang.Deprecated
        public android.app.prediction.AppTarget.Builder setTarget(java.lang.String p0, android.os.UserHandle p1) { return null; }
        @java.lang.Deprecated
        public android.app.prediction.AppTarget.Builder setTarget(android.content.pm.ShortcutInfo p0) { return null; }
        public android.app.prediction.AppTarget.Builder setClassName(java.lang.String p0) { return null; }
        public android.app.prediction.AppTarget.Builder setRank(int p0) { return null; }
        public android.app.prediction.AppTarget build() { return null; }
    }
}
