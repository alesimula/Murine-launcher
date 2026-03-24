package android.hardware.radio.sim;

public class AppStatus implements android.os.Parcelable {
    public int appType;
    public int appState;
    public int persoSubstate;
    public java.lang.String aidPtr;
    public java.lang.String appLabelPtr;
    public boolean pin1Replaced;
    public int pin1;
    public int pin2;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.AppStatus> CREATOR = null;
    public static final int APP_STATE_UNKNOWN = 0;
    public static final int APP_STATE_DETECTED = 1;
    public static final int APP_STATE_PIN = 2;
    public static final int APP_STATE_PUK = 3;
    public static final int APP_STATE_SUBSCRIPTION_PERSO = 4;
    public static final int APP_STATE_READY = 5;
    public static final int APP_TYPE_UNKNOWN = 0;
    public static final int APP_TYPE_SIM = 1;
    public static final int APP_TYPE_USIM = 2;
    public static final int APP_TYPE_RUIM = 3;
    public static final int APP_TYPE_CSIM = 4;
    public static final int APP_TYPE_ISIM = 5;
    public AppStatus() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
