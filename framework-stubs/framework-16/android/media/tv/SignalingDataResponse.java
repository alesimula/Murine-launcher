package android.media.tv;

@android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
public final class SignalingDataResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.SignalingDataResponse> CREATOR = null;
    static android.media.tv.SignalingDataResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public SignalingDataResponse(int p0, int p1, int p2, java.util.List<java.lang.String> p3, java.util.List<android.media.tv.SignalingDataInfo> p4) { super(0, (android.os.Parcel)null); }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSignalingDataTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.tv.SignalingDataInfo> getSignalingDataInfoList() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    SignalingDataResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
}
