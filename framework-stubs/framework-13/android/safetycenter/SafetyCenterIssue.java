package android.safetycenter;

public final class SafetyCenterIssue implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterIssue> CREATOR = null;
    public static final int ISSUE_SEVERITY_LEVEL_CRITICAL_WARNING = 2300;
    public static final int ISSUE_SEVERITY_LEVEL_OK = 2100;
    public static final int ISSUE_SEVERITY_LEVEL_RECOMMENDATION = 2200;
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSubtitle() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getSummary() { return null; }
    public int getSeverityLevel() { return 0; }
    public boolean isDismissible() { return false; }
    public boolean shouldConfirmDismissal() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetyCenterIssue.Action> getActions() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Action implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterIssue.Action> CREATOR = null;
        @android.annotation.NonNull
        public java.lang.String getId() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getLabel() { return null; }
        @android.annotation.NonNull
        public android.app.PendingIntent getPendingIntent() { return null; }
        public boolean willResolve() { return false; }
        public boolean isInFlight() { return false; }
        @android.annotation.Nullable
        public java.lang.CharSequence getSuccessMessage() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action.Builder setId(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action.Builder setLabel(java.lang.CharSequence p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action.Builder setWillResolve(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action.Builder setIsInFlight(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action.Builder setSuccessMessage(java.lang.CharSequence p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetyCenterIssue.Action build() { return null; }
        }
    }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}
        public Builder(android.safetycenter.SafetyCenterIssue p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setSummary(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setSeverityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setDismissible(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setShouldConfirmDismissal(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue.Builder setActions(java.util.List<android.safetycenter.SafetyCenterIssue.Action> p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterIssue build() { return null; }
    }
}
