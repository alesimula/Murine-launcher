package android.telecom;

public final class CallAudioState implements android.os.Parcelable {
    public static final int ROUTE_EARPIECE = 1;
    public static final int ROUTE_BLUETOOTH = 2;
    public static final int ROUTE_WIRED_HEADSET = 4;
    public static final int ROUTE_SPEAKER = 8;
    public static final int ROUTE_STREAMING = 16;
    public static final int ROUTE_WIRED_OR_EARPIECE = 5;
    public static final int ROUTE_ALL = 31;
    public static final android.os.Parcelable.Creator<android.telecom.CallAudioState> CREATOR = null;
    public CallAudioState(boolean p0, int p1, int p2) {}
    public CallAudioState(boolean p0, int p1, int p2, android.bluetooth.BluetoothDevice p3, java.util.Collection<android.bluetooth.BluetoothDevice> p4) {}
    public CallAudioState(android.telecom.CallAudioState p0) {}
    public CallAudioState(android.telecom.AudioState p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean isMuted() { return false; }
    public int getRoute() { return 0; }
    public int getSupportedRouteMask() { return 0; }
    public android.bluetooth.BluetoothDevice getActiveBluetoothDevice() { return null; }
    public java.util.Collection<android.bluetooth.BluetoothDevice> getSupportedBluetoothDevices() { return null; }
    public static java.lang.String audioRouteToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallAudioRoute {
    }
}
