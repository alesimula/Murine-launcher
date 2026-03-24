package android.content.pm;

@android.annotation.SystemApi
public final class SuspendDialogInfo implements android.os.Parcelable {
    public static final int BUTTON_ACTION_MORE_DETAILS = 0;
    public static final int BUTTON_ACTION_UNSUSPEND = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.SuspendDialogInfo> CREATOR = null;
    public int getIconResId() { return 0; }
    public int getTitleResId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTitle() { return null; }
    public int getDialogMessageResId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDialogMessage() { return null; }
    public int getNeutralButtonTextResId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getNeutralButtonText() { return null; }
    public int getNeutralButtonAction() { return 0; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.content.pm.SuspendDialogInfo restoreFromXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    SuspendDialogInfo(android.content.pm.SuspendDialogInfo.Builder p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setIcon(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setTitle(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setTitle(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setMessage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setMessage(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setNeutralButtonText(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setNeutralButtonText(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo.Builder setNeutralButtonAction(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.SuspendDialogInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ButtonAction {
    }
}
