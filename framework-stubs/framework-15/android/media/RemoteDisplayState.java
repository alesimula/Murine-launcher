package android.media;

public final class RemoteDisplayState implements android.os.Parcelable {
    public static final java.lang.String SERVICE_INTERFACE = "com.android.media.remotedisplay.RemoteDisplayProvider";
    public static final int DISCOVERY_MODE_NONE = 0;
    public static final int DISCOVERY_MODE_PASSIVE = 1;
    public static final int DISCOVERY_MODE_ACTIVE = 2;
    public final java.util.ArrayList<android.media.RemoteDisplayState.RemoteDisplayInfo> displays = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.RemoteDisplayState> CREATOR = null;
    public RemoteDisplayState() {}
    RemoteDisplayState(android.os.Parcel p0) {}
    public boolean isValid() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class RemoteDisplayInfo implements android.os.Parcelable {
        public static final int STATUS_NOT_AVAILABLE = 0;
        public static final int STATUS_IN_USE = 1;
        public static final int STATUS_AVAILABLE = 2;
        public static final int STATUS_CONNECTING = 3;
        public static final int STATUS_CONNECTED = 4;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public java.lang.String id;
        public java.lang.String name;
        public java.lang.String description;
        public int status;
        public int volume;
        public int volumeMax;
        public int volumeHandling;
        public int presentationDisplayId;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.RemoteDisplayState.RemoteDisplayInfo> CREATOR = null;
        public RemoteDisplayInfo(java.lang.String p0) {}
        public RemoteDisplayInfo(android.media.RemoteDisplayState.RemoteDisplayInfo p0) {}
        RemoteDisplayInfo(android.os.Parcel p0) {}
        public boolean isValid() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
