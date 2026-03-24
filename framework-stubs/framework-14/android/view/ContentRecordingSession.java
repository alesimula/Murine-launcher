package android.view;

public final class ContentRecordingSession implements android.os.Parcelable {
    public static final int RECORD_CONTENT_DISPLAY = 0;
    public static final int RECORD_CONTENT_TASK = 1;
    public static final android.os.Parcelable.Creator<android.view.ContentRecordingSession> CREATOR = null;
    public static android.view.ContentRecordingSession createDisplaySession(int p0) { return null; }
    public static android.view.ContentRecordingSession createTaskSession(android.os.IBinder p0) { return null; }
    public static boolean isValid(android.view.ContentRecordingSession p0) { return false; }
    public static boolean isProjectionOnSameDisplay(android.view.ContentRecordingSession p0, android.view.ContentRecordingSession p1) { return false; }
    public static java.lang.String recordContentToString(int p0) { return null; }
    ContentRecordingSession(int p0, int p1, int p2, android.os.IBinder p3, boolean p4) {}
    public int getVirtualDisplayId() { return 0; }
    public int getContentToRecord() { return 0; }
    public int getDisplayToRecord() { return 0; }
    public android.os.IBinder getTokenToRecord() { return null; }
    public boolean isWaitingForConsent() { return false; }
    public android.view.ContentRecordingSession setVirtualDisplayId(int p0) { return null; }
    public android.view.ContentRecordingSession setContentToRecord(int p0) { return null; }
    public android.view.ContentRecordingSession setDisplayToRecord(int p0) { return null; }
    public android.view.ContentRecordingSession setTokenToRecord(android.os.IBinder p0) { return null; }
    public android.view.ContentRecordingSession setWaitingForConsent(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    ContentRecordingSession(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        public android.view.ContentRecordingSession.Builder setVirtualDisplayId(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setContentToRecord(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setDisplayToRecord(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setTokenToRecord(android.os.IBinder p0) { return null; }
        public android.view.ContentRecordingSession.Builder setWaitingForConsent(boolean p0) { return null; }
        public android.view.ContentRecordingSession build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecordContent {
    }
}
