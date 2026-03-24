package android.telecom;

public class ConferenceParticipant implements android.os.Parcelable {
    private static final java.lang.String ANONYMOUS_INVALID_HOST = "anonymous.invalid";
    private final android.net.Uri mHandle = null;
    private final java.lang.String mDisplayName = null;
    private final android.net.Uri mEndpoint = null;
    private final int mState = 0;
    private long mConnectTime;
    private long mConnectElapsedTime;
    private int mCallDirection;
    public static final android.os.Parcelable.Creator<android.telecom.ConferenceParticipant> CREATOR = null;
    public ConferenceParticipant(android.net.Uri p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) {}
    public int describeContents() { return 0; }
    public int getParticipantPresentation() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public android.net.Uri getHandle() { return null; }
    public java.lang.String getDisplayName() { return null; }
    public android.net.Uri getEndpoint() { return null; }
    public int getState() { return 0; }
    public long getConnectTime() { return 0L; }
    public void setConnectTime(long p0) {}
    public long getConnectElapsedTime() { return 0L; }
    public void setConnectElapsedTime(long p0) {}
    public int getCallDirection() { return 0; }
    public void setCallDirection(int p0) {}
    public static android.net.Uri getParticipantAddress(android.net.Uri p0, java.lang.String p1) { return null; }
}
