package android.telecom;

@android.annotation.SystemApi
public class ParcelableCallAnalytics implements android.os.Parcelable {
    public static final int CALLTYPE_UNKNOWN = 0;
    public static final int CALLTYPE_INCOMING = 1;
    public static final int CALLTYPE_OUTGOING = 2;
    public static final int CDMA_PHONE = 1;
    public static final int GSM_PHONE = 2;
    public static final int IMS_PHONE = 4;
    public static final int SIP_PHONE = 8;
    public static final int THIRD_PARTY_PHONE = 16;
    public static final long MILLIS_IN_5_MINUTES = 300000L;
    public static final long MILLIS_IN_1_SECOND = 1000L;
    public static final int STILL_CONNECTED = -1;
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics> CREATOR = null;
    public ParcelableCallAnalytics(long p0, long p1, int p2, boolean p3, boolean p4, int p5, int p6, boolean p7, java.lang.String p8, boolean p9, java.util.List<android.telecom.ParcelableCallAnalytics.AnalyticsEvent> p10, java.util.List<android.telecom.ParcelableCallAnalytics.EventTiming> p11) {}
    public ParcelableCallAnalytics(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void setIsVideoCall(boolean p0) {}
    public void setVideoEvents(java.util.List<android.telecom.ParcelableCallAnalytics.VideoEvent> p0) {}
    public void setCallSource(int p0) {}
    public long getStartTimeMillis() { return 0L; }
    public long getCallDurationMillis() { return 0L; }
    public int getCallType() { return 0; }
    public boolean isAdditionalCall() { return false; }
    public boolean isInterrupted() { return false; }
    public int getCallTechnologies() { return 0; }
    public int getCallTerminationCode() { return 0; }
    public boolean isEmergencyCall() { return false; }
    public java.lang.String getConnectionService() { return null; }
    public boolean isCreatedFromExistingConnection() { return false; }
    public java.util.List<android.telecom.ParcelableCallAnalytics.AnalyticsEvent> analyticsEvents() { return null; }
    public java.util.List<android.telecom.ParcelableCallAnalytics.EventTiming> getEventTimings() { return null; }
    public boolean isVideoCall() { return false; }
    public java.util.List<android.telecom.ParcelableCallAnalytics.VideoEvent> getVideoEvents() { return null; }
    public int getCallSource() { return 0; }
    public int describeContents() { return 0; }

    public static final class AnalyticsEvent implements android.os.Parcelable {
        public static final int SET_SELECT_PHONE_ACCOUNT = 0;
        public static final int SET_ACTIVE = 1;
        public static final int SET_DISCONNECTED = 2;
        public static final int START_CONNECTION = 3;
        public static final int SET_DIALING = 4;
        public static final int BIND_CS = 5;
        public static final int CS_BOUND = 6;
        public static final int REQUEST_ACCEPT = 7;
        public static final int REQUEST_REJECT = 8;
        public static final int SCREENING_SENT = 100;
        public static final int SCREENING_COMPLETED = 101;
        public static final int DIRECT_TO_VM_INITIATED = 102;
        public static final int DIRECT_TO_VM_FINISHED = 103;
        public static final int BLOCK_CHECK_INITIATED = 104;
        public static final int BLOCK_CHECK_FINISHED = 105;
        public static final int FILTERING_INITIATED = 106;
        public static final int FILTERING_COMPLETED = 107;
        public static final int FILTERING_TIMED_OUT = 108;
        public static final int SKIP_RINGING = 200;
        public static final int SILENCE = 201;
        public static final int MUTE = 202;
        public static final int UNMUTE = 203;
        public static final int AUDIO_ROUTE_BT = 204;
        public static final int AUDIO_ROUTE_EARPIECE = 205;
        public static final int AUDIO_ROUTE_HEADSET = 206;
        public static final int AUDIO_ROUTE_SPEAKER = 207;
        public static final int CONFERENCE_WITH = 300;
        public static final int SPLIT_CONFERENCE = 301;
        public static final int SET_PARENT = 302;
        public static final int REQUEST_HOLD = 400;
        public static final int REQUEST_UNHOLD = 401;
        public static final int REMOTELY_HELD = 402;
        public static final int REMOTELY_UNHELD = 403;
        public static final int SET_HOLD = 404;
        public static final int SWAP = 405;
        public static final int REQUEST_PULL = 500;
        public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics.AnalyticsEvent> CREATOR = null;
        public AnalyticsEvent(int p0, long p1) {}
        AnalyticsEvent(android.os.Parcel p0) {}
        public int getEventName() { return 0; }
        public long getTimeSinceLastEvent() { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class EventTiming implements android.os.Parcelable {
        public static final int ACCEPT_TIMING = 0;
        public static final int REJECT_TIMING = 1;
        public static final int DISCONNECT_TIMING = 2;
        public static final int HOLD_TIMING = 3;
        public static final int UNHOLD_TIMING = 4;
        public static final int OUTGOING_TIME_TO_DIALING_TIMING = 5;
        public static final int BIND_CS_TIMING = 6;
        public static final int SCREENING_COMPLETED_TIMING = 7;
        public static final int DIRECT_TO_VM_FINISHED_TIMING = 8;
        public static final int BLOCK_CHECK_FINISHED_TIMING = 9;
        public static final int FILTERING_COMPLETED_TIMING = 10;
        public static final int FILTERING_TIMED_OUT_TIMING = 11;
        public static final int START_CONNECTION_TO_REQUEST_DISCONNECT_TIMING = 12;
        public static final int INVALID = 999999;
        public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics.EventTiming> CREATOR = null;
        public EventTiming(int p0, long p1) {}
        public int getName() { return 0; }
        public long getTime() { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class VideoEvent implements android.os.Parcelable {
        public static final int SEND_LOCAL_SESSION_MODIFY_REQUEST = 0;
        public static final int SEND_LOCAL_SESSION_MODIFY_RESPONSE = 1;
        public static final int RECEIVE_REMOTE_SESSION_MODIFY_REQUEST = 2;
        public static final int RECEIVE_REMOTE_SESSION_MODIFY_RESPONSE = 3;
        public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics.VideoEvent> CREATOR = null;
        public VideoEvent(int p0, long p1, int p2) {}
        VideoEvent(android.os.Parcel p0) {}
        public int getEventName() { return 0; }
        public long getTimeSinceLastEvent() { return 0L; }
        public int getVideoState() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
