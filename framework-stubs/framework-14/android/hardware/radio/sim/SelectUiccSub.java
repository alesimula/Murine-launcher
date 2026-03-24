package android.hardware.radio.sim;

public class SelectUiccSub implements android.os.Parcelable {
    public int slot;
    public int appIndex;
    public int subType;
    public int actStatus;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.SelectUiccSub> CREATOR = null;
    public static final int SUBSCRIPTION_TYPE_1 = 0;
    public static final int SUBSCRIPTION_TYPE_2 = 1;
    public static final int SUBSCRIPTION_TYPE_3 = 2;
    public static final int ACT_STATUS_DEACTIVATE = 0;
    public static final int ACT_STATUS_ACTIVATE = 1;
    public SelectUiccSub() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
