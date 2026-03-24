package android.app;

public class ReceiverInfo implements android.os.Parcelable {
    public android.content.Intent intent;
    public java.lang.String data;
    public android.os.Bundle extras;
    public boolean assumeDelivered;
    public int sendingUser;
    public int processState;
    public int resultCode;
    public int sendingUid;
    public java.lang.String sendingPackage;
    public boolean registered;
    public android.content.IIntentReceiver receiver;
    public boolean ordered;
    public boolean sticky;
    public android.content.pm.ActivityInfo activityInfo;
    public android.content.res.CompatibilityInfo compatInfo;
    public boolean sync;
    public static final android.os.Parcelable.Creator<android.app.ReceiverInfo> CREATOR = null;
    public ReceiverInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
