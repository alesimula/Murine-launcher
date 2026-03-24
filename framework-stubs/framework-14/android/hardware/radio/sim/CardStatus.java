package android.hardware.radio.sim;

public class CardStatus implements android.os.Parcelable {
    public int cardState;
    public int universalPinState;
    public int gsmUmtsSubscriptionAppIndex;
    public int cdmaSubscriptionAppIndex;
    public int imsSubscriptionAppIndex;
    public android.hardware.radio.sim.AppStatus[] applications;
    public java.lang.String atr;
    public java.lang.String iccid;
    public java.lang.String eid;
    public android.hardware.radio.config.SlotPortMapping slotMap;
    public int supportedMepMode;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.CardStatus> CREATOR = null;
    public static final int STATE_ABSENT = 0;
    public static final int STATE_PRESENT = 1;
    public static final int STATE_ERROR = 2;
    public static final int STATE_RESTRICTED = 3;
    public CardStatus() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
