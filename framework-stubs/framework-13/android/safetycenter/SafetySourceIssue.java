package android.safetycenter;

public final class SafetySourceIssue implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceIssue> CREATOR = null;
    public static final int ISSUE_CATEGORY_ACCOUNT = 200;
    public static final int ISSUE_CATEGORY_DEVICE = 100;
    public static final int ISSUE_CATEGORY_GENERAL = 300;
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSubtitle() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getSummary() { return null; }
    public int getSeverityLevel() { return 0; }
    public int getIssueCategory() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetySourceIssue.Action> getActions() { return null; }
    @android.annotation.Nullable
    public android.app.PendingIntent getOnDismissPendingIntent() { return null; }
    @android.annotation.NonNull
    public java.lang.String getIssueTypeId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Action implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceIssue.Action> CREATOR = null;
        @android.annotation.NonNull
        public java.lang.String getId() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getLabel() { return null; }
        @android.annotation.NonNull
        public android.app.PendingIntent getPendingIntent() { return null; }
        public boolean willResolve() { return false; }
        @android.annotation.Nullable
        public java.lang.CharSequence getSuccessMessage() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action.Builder setWillResolve(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action.Builder setSuccessMessage(java.lang.CharSequence p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action build() { return null; }
        }
    }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.CharSequence p1, java.lang.CharSequence p2, int p3, java.lang.String p4) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setIssueCategory(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder addAction(android.safetycenter.SafetySourceIssue.Action p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder clearActions() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setOnDismissPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue build() { return null; }
    }
}
