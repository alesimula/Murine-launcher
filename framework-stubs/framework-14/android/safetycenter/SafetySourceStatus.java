package android.safetycenter;

public final class SafetySourceStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceStatus> CREATOR = null;
    SafetySourceStatus() {}
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getSummary() { return null; }
    public int getSeverityLevel() { return 0; }
    @android.annotation.Nullable
    public android.app.PendingIntent getPendingIntent() { return null; }
    @android.annotation.Nullable
    public android.safetycenter.SafetySourceStatus.IconAction getIconAction() { return null; }
    public boolean isEnabled() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2) {}
        public Builder(android.safetycenter.SafetySourceStatus p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceStatus.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceStatus.Builder setIconAction(android.safetycenter.SafetySourceStatus.IconAction p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceStatus.Builder setEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceStatus build() { return null; }
    }

    public static final class IconAction implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceStatus.IconAction> CREATOR = null;
        public static final int ICON_TYPE_GEAR = 100;
        public static final int ICON_TYPE_INFO = 200;
        public IconAction(int p0, android.app.PendingIntent p1) {}
        public int getIconType() { return 0; }
        @android.annotation.NonNull
        public android.app.PendingIntent getPendingIntent() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
