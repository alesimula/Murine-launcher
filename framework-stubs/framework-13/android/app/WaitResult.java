package android.app;

public class WaitResult implements android.os.Parcelable {
    public static final int LAUNCH_STATE_UNKNOWN = 0;
    public static final int LAUNCH_STATE_COLD = 1;
    public static final int LAUNCH_STATE_WARM = 2;
    public static final int LAUNCH_STATE_HOT = 3;
    public static final int LAUNCH_STATE_RELAUNCH = 4;
    public static final int INVALID_DELAY = -1;
    public int result;
    public boolean timeout;
    public android.content.ComponentName who;
    public long totalTime;
    public int launchState;
    public static final android.os.Parcelable.Creator<android.app.WaitResult> CREATOR = null;
    public WaitResult() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public static java.lang.String launchStateToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LaunchState {
    }
}
