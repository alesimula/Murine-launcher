package android.telecom.Logging;

public class Session {
    public static final java.lang.String LOG_TAG = "Session";
    public static final java.lang.String START_SESSION = "START_SESSION";
    public static final java.lang.String START_EXTERNAL_SESSION = "START_EXTERNAL_SESSION";
    public static final java.lang.String CREATE_SUBSESSION = "CREATE_SUBSESSION";
    public static final java.lang.String CONTINUE_SUBSESSION = "CONTINUE_SUBSESSION";
    public static final java.lang.String END_SUBSESSION = "END_SUBSESSION";
    public static final java.lang.String END_SESSION = "END_SESSION";
    public static final java.lang.String SUBSESSION_SEPARATION_CHAR = "->";
    public static final java.lang.String SESSION_SEPARATION_CHAR_CHILD = "_";
    public static final java.lang.String EXTERNAL_INDICATOR = "E-";
    public static final java.lang.String TRUNCATE_STRING = "...";
    public static final int UNDEFINED = -1;
    public Session(java.lang.String p0, java.lang.String p1, long p2, boolean p3, java.lang.String p4) {}
    public void setSessionId(java.lang.String p0) {}
    public java.lang.String getShortMethodName() { return null; }
    public void setShortMethodName(java.lang.String p0) {}
    public void setIsExternal(boolean p0) {}
    public boolean isExternal() { return false; }
    public void setParentSession(android.telecom.Logging.Session p0) {}
    public void addChild(android.telecom.Logging.Session p0) {}
    public void removeChild(android.telecom.Logging.Session p0) {}
    public long getExecutionStartTimeMilliseconds() { return 0L; }
    public void setExecutionStartTimeMs(long p0) {}
    public android.telecom.Logging.Session getParentSession() { return null; }
    public java.util.ArrayList<android.telecom.Logging.Session> getChildSessions() { return null; }
    public boolean isSessionCompleted() { return false; }
    public boolean isStartedFromActiveSession() { return false; }
    public android.telecom.Logging.Session.Info getInfo() { return null; }
    public android.telecom.Logging.Session.Info getExternalInfo(java.lang.String p0) { return null; }
    public java.lang.String getOwnerInfo() { return null; }
    public java.lang.String getSessionId() { return null; }
    public void markSessionCompleted(long p0) {}
    public long getLocalExecutionTime() { return 0L; }
    public synchronized java.lang.String getNextChildId() { return null; }
    public java.lang.String printFullSessionTree() { return null; }
    public java.lang.String getFullMethodPath(boolean p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static class Info implements android.os.Parcelable {
        public final java.lang.String sessionId = null;
        public final java.lang.String methodPath = null;
        public final java.lang.String ownerInfo = null;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.telecom.Logging.Session.Info> CREATOR = null;
        public static android.telecom.Logging.Session.Info getInfo(android.telecom.Logging.Session p0) { return null; }
        public static android.telecom.Logging.Session.Info getExternalInfo(android.telecom.Logging.Session p0, java.lang.String p1) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
