package android.safetycenter;

public final class SafetyEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyEvent> CREATOR = null;
    public static final int SAFETY_EVENT_TYPE_DEVICE_LOCALE_CHANGED = 500;
    public static final int SAFETY_EVENT_TYPE_DEVICE_REBOOTED = 600;
    public static final int SAFETY_EVENT_TYPE_REFRESH_REQUESTED = 200;
    public static final int SAFETY_EVENT_TYPE_RESOLVING_ACTION_FAILED = 400;
    public static final int SAFETY_EVENT_TYPE_RESOLVING_ACTION_SUCCEEDED = 300;
    public static final int SAFETY_EVENT_TYPE_SOURCE_STATE_CHANGED = 100;
    SafetyEvent() {}
    public int getType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getRefreshBroadcastId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSafetySourceIssueId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSafetySourceIssueActionId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.safetycenter.SafetyEvent p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetyEvent.Builder setRefreshBroadcastId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyEvent.Builder setSafetySourceIssueId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyEvent.Builder setSafetySourceIssueActionId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyEvent build() { return null; }
    }
}
