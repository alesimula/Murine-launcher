package android.hardware.radio.voice;

public class Call implements android.os.Parcelable {
    public int state;
    public int index;
    public int toa;
    public boolean isMpty;
    public boolean isMT;
    public byte als;
    public boolean isVoice;
    @java.lang.Deprecated
    public boolean isVoicePrivacy;
    public java.lang.String number;
    public int numberPresentation;
    public java.lang.String name;
    public int namePresentation;
    public android.hardware.radio.voice.UusInfo[] uusInfo;
    public int audioQuality;
    public java.lang.String forwardedNumber;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.Call> CREATOR = null;
    public static final int PRESENTATION_ALLOWED = 0;
    public static final int PRESENTATION_RESTRICTED = 1;
    public static final int PRESENTATION_UNKNOWN = 2;
    public static final int PRESENTATION_PAYPHONE = 3;
    public static final int STATE_ACTIVE = 0;
    public static final int STATE_HOLDING = 1;
    public static final int STATE_DIALING = 2;
    public static final int STATE_ALERTING = 3;
    public static final int STATE_INCOMING = 4;
    public static final int STATE_WAITING = 5;
    public Call() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
