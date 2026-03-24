package android.app.supervision;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
public final class SupervisionRecoveryInfo implements android.os.Parcelable {
    public static final java.lang.String EXTRA_SUPERVISION_RECOVERY_INFO = "android.app.supervision.extra.SUPERVISION_RECOVERY_INFO";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.supervision.SupervisionRecoveryInfo> CREATOR = null;
    public static final int STATE_PENDING = 0;
    public static final int STATE_VERIFIED = 1;
    public SupervisionRecoveryInfo(java.lang.String p0, java.lang.String p1, int p2, android.os.PersistableBundle p3) {}
    @android.annotation.NonNull
    public java.lang.String getAccountName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getAccountType() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getAccountData() { return null; }
    public int getState() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
