package android.content;

public class SyncInfo implements android.os.Parcelable {
    private static final android.accounts.Account REDACTED_ACCOUNT = null;
    @android.annotation.UnsupportedAppUsage
    public final int authorityId = 0;
    public final android.accounts.Account account = null;
    public final java.lang.String authority = null;
    public final long startTime = 0L;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.content.SyncInfo> CREATOR = null;
    public static android.content.SyncInfo createAccountRedacted(int p0, java.lang.String p1, long p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public SyncInfo(int p0, android.accounts.Account p1, java.lang.String p2, long p3) {}
    public SyncInfo(android.content.SyncInfo p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    SyncInfo(android.os.Parcel p0) {}
}
