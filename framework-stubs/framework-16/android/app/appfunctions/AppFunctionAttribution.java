package android.app.appfunctions;

@android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
public final class AppFunctionAttribution implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionAttribution> CREATOR = null;
    public static final int INTERACTION_TYPE_OTHER = 0;
    public static final int INTERACTION_TYPE_USER_QUERY = 1;
    public static final int INTERACTION_TYPE_USER_SCHEDULED = 2;
    public int getInteractionType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getCustomInteractionType() { return null; }
    @android.annotation.Nullable
    public java.lang.String getThreadId() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getInteractionUri() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        public android.app.appfunctions.AppFunctionAttribution.Builder setCustomInteractionType(java.lang.String p0) { return null; }
        public android.app.appfunctions.AppFunctionAttribution.Builder setThreadId(java.lang.String p0) { return null; }
        public android.app.appfunctions.AppFunctionAttribution.Builder setInteractionUri(android.net.Uri p0) { return null; }
        public android.app.appfunctions.AppFunctionAttribution build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractionType {
    }
}
