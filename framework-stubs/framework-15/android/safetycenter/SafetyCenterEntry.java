package android.safetycenter;

public final class SafetyCenterEntry implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterEntry> CREATOR = null;
    public static final int ENTRY_SEVERITY_LEVEL_CRITICAL_WARNING = 3400;
    public static final int ENTRY_SEVERITY_LEVEL_OK = 3200;
    public static final int ENTRY_SEVERITY_LEVEL_RECOMMENDATION = 3300;
    public static final int ENTRY_SEVERITY_LEVEL_UNKNOWN = 3000;
    public static final int ENTRY_SEVERITY_LEVEL_UNSPECIFIED = 3100;
    public static final int SEVERITY_UNSPECIFIED_ICON_TYPE_NO_ICON = 0;
    public static final int SEVERITY_UNSPECIFIED_ICON_TYPE_NO_RECOMMENDATION = 2;
    public static final int SEVERITY_UNSPECIFIED_ICON_TYPE_PRIVACY = 1;
    SafetyCenterEntry() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.safetycenter.SafetyCenterEntry.IconAction getIconAction() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.Nullable
    public android.app.PendingIntent getPendingIntent() { return null; }
    public int getSeverityLevel() { return 0; }
    public int getSeverityUnspecifiedIconType() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSummary() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    public boolean isEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.CharSequence p1) {}
        public Builder(android.safetycenter.SafetyCenterEntry p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setIconAction(android.safetycenter.SafetyCenterEntry.IconAction p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setIconAction(int p0, android.app.PendingIntent p1) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setSeverityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setSeverityUnspecifiedIconType(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setSummary(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterEntry.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }

    public static final class IconAction implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterEntry.IconAction> CREATOR = null;
        public static final int ICON_ACTION_TYPE_GEAR = 30100;
        public static final int ICON_ACTION_TYPE_INFO = 30200;
        public IconAction(int p0, android.app.PendingIntent p1) {}
        public int describeContents() { return 0; }
        @android.annotation.NonNull
        public android.app.PendingIntent getPendingIntent() { return null; }
        public int getType() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
