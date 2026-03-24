package android.hardware.radio.ims;

public class ImsCall implements android.os.Parcelable {
    public int index;
    public int callType;
    public int accessNetwork;
    public int callState;
    public int direction;
    public boolean isHeldByRemote;
    public static final android.os.Parcelable.Creator<android.hardware.radio.ims.ImsCall> CREATOR = null;
    public ImsCall() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface CallState {
        public static final int ACTIVE = 0;
        public static final int HOLDING = 1;
        public static final int DIALING = 2;
        public static final int ALERTING = 3;
        public static final int INCOMING = 4;
        public static final int WAITING = 5;
        public static final int DISCONNECTING = 6;
        public static final int DISCONNECTED = 7;
    }

    public static @interface CallType {
        public static final int NORMAL = 0;
        public static final int EMERGENCY = 1;
    }

    public static @interface Direction {
        public static final int INCOMING = 0;
        public static final int OUTGOING = 1;
    }
}
