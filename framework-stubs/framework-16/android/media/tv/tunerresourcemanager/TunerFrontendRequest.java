package android.media.tv.tunerresourcemanager;

public class TunerFrontendRequest implements android.os.Parcelable {
    public int clientId;
    public int frontendType;
    public int desiredId;
    public static final android.os.Parcelable.Creator<android.media.tv.tunerresourcemanager.TunerFrontendRequest> CREATOR = null;
    public static final int DEFAULT_DESIRED_ID = -1;
    public TunerFrontendRequest() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
