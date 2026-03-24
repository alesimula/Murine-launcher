package android.hardware.radio.ims;

public class SrvccCall implements android.os.Parcelable {
    public int index;
    public int callType;
    public int callState;
    public int callSubstate;
    public int ringbackToneType;
    public boolean isMpty;
    public boolean isMT;
    public java.lang.String number;
    public int numPresentation;
    public java.lang.String name;
    public int namePresentation;
    public static final android.os.Parcelable.Creator<android.hardware.radio.ims.SrvccCall> CREATOR = null;
    public SrvccCall() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface CallSubState {
        public static final int NONE = 0;
        public static final int PREALERTING = 1;
    }

    public static @interface CallType {
        public static final int NORMAL = 0;
        public static final int EMERGENCY = 1;
    }

    public static @interface ToneType {
        public static final int NONE = 0;
        public static final int LOCAL = 1;
        public static final int NETWORK = 2;
    }
}
