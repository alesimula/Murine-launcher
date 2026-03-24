package android.safetycenter;

public final class SafetySourceIssue implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceIssue> CREATOR = null;
    public static final int ISSUE_ACTIONABILITY_AUTOMATIC = 200;
    public static final int ISSUE_ACTIONABILITY_MANUAL = 0;
    public static final int ISSUE_ACTIONABILITY_TIP = 100;
    public static final int ISSUE_CATEGORY_ACCOUNT = 200;
    public static final int ISSUE_CATEGORY_DATA = 400;
    public static final int ISSUE_CATEGORY_DEVICE = 100;
    public static final int ISSUE_CATEGORY_GENERAL = 300;
    public static final int ISSUE_CATEGORY_PASSWORDS = 500;
    public static final int ISSUE_CATEGORY_PERSONAL_SAFETY = 600;
    public static final int NOTIFICATION_BEHAVIOR_DELAYED = 200;
    public static final int NOTIFICATION_BEHAVIOR_IMMEDIATELY = 300;
    public static final int NOTIFICATION_BEHAVIOR_NEVER = 100;
    public static final int NOTIFICATION_BEHAVIOR_UNSPECIFIED = 0;
    SafetySourceIssue() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetySourceIssue.Action> getActions() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getAttributionTitle() { return null; }
    @android.annotation.Nullable
    public android.safetycenter.SafetySourceIssue.Notification getCustomNotification() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeduplicationId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public int getIssueActionability() { return 0; }
    public int getIssueCategory() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getIssueTypeId() { return null; }
    public int getNotificationBehavior() { return 0; }
    @android.annotation.Nullable
    public android.app.PendingIntent getOnDismissPendingIntent() { return null; }
    public int getSeverityLevel() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSubtitle() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getSummary() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Action implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceIssue.Action> CREATOR = null;
        Action() {}
        public int describeContents() { return 0; }
        @android.annotation.Nullable
        public android.safetycenter.SafetySourceIssue.Action.ConfirmationDialogDetails getConfirmationDialogDetails() { return null; }
        @android.annotation.NonNull
        public java.lang.String getId() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getLabel() { return null; }
        @android.annotation.NonNull
        public android.app.PendingIntent getPendingIntent() { return null; }
        @android.annotation.Nullable
        public java.lang.CharSequence getSuccessMessage() { return null; }
        public boolean willResolve() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            public Builder(android.safetycenter.SafetySourceIssue.Action p0) {}
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action build() { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action.Builder setConfirmationDialogDetails(android.safetycenter.SafetySourceIssue.Action.ConfirmationDialogDetails p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action.Builder setSuccessMessage(java.lang.CharSequence p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Action.Builder setWillResolve(boolean p0) { return null; }
        }

        public static final class ConfirmationDialogDetails implements android.os.Parcelable {
            @android.annotation.NonNull
            public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceIssue.Action.ConfirmationDialogDetails> CREATOR = null;
            public ConfirmationDialogDetails(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2, java.lang.CharSequence p3) {}
            public int describeContents() { return 0; }
            @android.annotation.NonNull
            public java.lang.CharSequence getAcceptButtonText() { return null; }
            @android.annotation.NonNull
            public java.lang.CharSequence getDenyButtonText() { return null; }
            @android.annotation.NonNull
            public java.lang.CharSequence getText() { return null; }
            @android.annotation.NonNull
            public java.lang.CharSequence getTitle() { return null; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.CharSequence p1, java.lang.CharSequence p2, int p3, java.lang.String p4) {}
        public Builder(android.safetycenter.SafetySourceIssue p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder addAction(android.safetycenter.SafetySourceIssue.Action p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder clearActions() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setAttributionTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setCustomNotification(android.safetycenter.SafetySourceIssue.Notification p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setDeduplicationId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setIssueActionability(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setIssueCategory(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setNotificationBehavior(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setOnDismissPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceIssue.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
    }

    public static final class Notification implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceIssue.Notification> CREATOR = null;
        Notification() {}
        public int describeContents() { return 0; }
        @android.annotation.NonNull
        public java.util.List<android.safetycenter.SafetySourceIssue.Action> getActions() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getText() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getTitle() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.CharSequence p0, java.lang.CharSequence p1) {}
            public Builder(android.safetycenter.SafetySourceIssue.Notification p0) {}
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Notification.Builder addAction(android.safetycenter.SafetySourceIssue.Action p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Notification.Builder addActions(java.util.List<android.safetycenter.SafetySourceIssue.Action> p0) { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Notification build() { return null; }
            @android.annotation.NonNull
            public android.safetycenter.SafetySourceIssue.Notification.Builder clearActions() { return null; }
        }
    }
}
