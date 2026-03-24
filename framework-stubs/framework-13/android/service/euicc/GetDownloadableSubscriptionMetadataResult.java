package android.service.euicc;

@android.annotation.SystemApi
public final class GetDownloadableSubscriptionMetadataResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.euicc.GetDownloadableSubscriptionMetadataResult> CREATOR = null;
    @java.lang.Deprecated
    public final int result = 0;
    public int getResult() { return 0; }
    public android.telephony.euicc.DownloadableSubscription getDownloadableSubscription() { return null; }
    public GetDownloadableSubscriptionMetadataResult(int p0, android.telephony.euicc.DownloadableSubscription p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
