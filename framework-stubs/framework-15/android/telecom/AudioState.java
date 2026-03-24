package android.telecom;

@java.lang.Deprecated
@android.annotation.SystemApi
public class AudioState implements android.os.Parcelable {
    public static final int ROUTE_EARPIECE = 1;
    public static final int ROUTE_BLUETOOTH = 2;
    public static final int ROUTE_WIRED_HEADSET = 4;
    public static final int ROUTE_SPEAKER = 8;
    public static final int ROUTE_WIRED_OR_EARPIECE = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.AudioState> CREATOR = null;
    public AudioState(boolean p0, int p1, int p2) {}
    public AudioState(android.telecom.AudioState p0) {}
    public AudioState(android.telecom.CallAudioState p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static java.lang.String audioRouteToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isMuted() { return false; }
    public int getRoute() { return 0; }
    public int getSupportedRouteMask() { return 0; }
}
