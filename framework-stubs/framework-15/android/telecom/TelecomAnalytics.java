package android.telecom;

@android.annotation.SystemApi
public final class TelecomAnalytics implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.TelecomAnalytics> CREATOR = null;
    public TelecomAnalytics(java.util.List<android.telecom.TelecomAnalytics.SessionTiming> p0, java.util.List<android.telecom.ParcelableCallAnalytics> p1) {}
    public java.util.List<android.telecom.TelecomAnalytics.SessionTiming> getSessionTimings() { return null; }
    public java.util.List<android.telecom.ParcelableCallAnalytics> getCallAnalytics() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class SessionTiming extends android.telecom.TimedEvent<java.lang.Integer> implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.telecom.TelecomAnalytics.SessionTiming> CREATOR = null;
        public static final int ICA_ANSWER_CALL = 1;
        public static final int ICA_REJECT_CALL = 2;
        public static final int ICA_DISCONNECT_CALL = 3;
        public static final int ICA_HOLD_CALL = 4;
        public static final int ICA_UNHOLD_CALL = 5;
        public static final int ICA_MUTE = 6;
        public static final int ICA_SET_AUDIO_ROUTE = 7;
        public static final int ICA_CONFERENCE = 8;
        public static final int CSW_HANDLE_CREATE_CONNECTION_COMPLETE = 100;
        public static final int CSW_SET_ACTIVE = 101;
        public static final int CSW_SET_RINGING = 102;
        public static final int CSW_SET_DIALING = 103;
        public static final int CSW_SET_DISCONNECTED = 104;
        public static final int CSW_SET_ON_HOLD = 105;
        public static final int CSW_REMOVE_CALL = 106;
        public static final int CSW_SET_IS_CONFERENCED = 107;
        public static final int CSW_ADD_CONFERENCE_CALL = 108;
        public SessionTiming(int p0, long p1) { super(); }
        public java.lang.Integer getKey() { return null; }
        public long getTime() { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
