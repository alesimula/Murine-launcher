package android.media;

public final class Session2Command implements android.os.Parcelable {
    public static final int COMMAND_CODE_CUSTOM = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.Session2Command> CREATOR = null;
    public Session2Command(int p0) {}
    public Session2Command(java.lang.String p0, android.os.Bundle p1) {}
    public int getCommandCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getCustomAction() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getCustomExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Result {
        public static final int RESULT_ERROR_UNKNOWN_ERROR = -1;
        public static final int RESULT_INFO_SKIPPED = 1;
        public static final int RESULT_SUCCESS = 0;
        public Result(int p0, android.os.Bundle p1) {}
        public int getResultCode() { return 0; }
        @android.annotation.Nullable
        public android.os.Bundle getResultData() { return null; }
    }
}
