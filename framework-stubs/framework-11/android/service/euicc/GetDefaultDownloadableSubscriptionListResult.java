package android.service.euicc;

@android.annotation.SystemApi
public final class GetDefaultDownloadableSubscriptionListResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.euicc.GetDefaultDownloadableSubscriptionListResult> CREATOR = null;
    @java.lang.Deprecated
    public final int result = 0;
    private final android.telephony.euicc.DownloadableSubscription[] mSubscriptions = null;
    public int getResult() { return 0; }
    public java.util.List<android.telephony.euicc.DownloadableSubscription> getDownloadableSubscriptions() { return null; }
    public GetDefaultDownloadableSubscriptionListResult(int p0, android.telephony.euicc.DownloadableSubscription[] p1) {}
    private GetDefaultDownloadableSubscriptionListResult(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
