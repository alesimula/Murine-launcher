package android.service.autofill;

public final class FillRequest implements android.os.Parcelable {
    public static final int FLAG_MANUAL_REQUEST = 1;
    public static final int FLAG_COMPATIBILITY_MODE_REQUEST = 2;
    public static final int INVALID_REQUEST_ID = -2147483648;
    private final int mId = 0;
    private final int mFlags = 0;
    private final java.util.ArrayList<android.service.autofill.FillContext> mContexts = null;
    private final android.os.Bundle mClientState = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.FillRequest> CREATOR = null;
    private FillRequest(android.os.Parcel p0) {}
    public FillRequest(int p0, java.util.ArrayList<android.service.autofill.FillContext> p1, android.os.Bundle p2, int p3) {}
    public int getId() { return 0; }
    public int getFlags() { return 0; }
    public java.util.List<android.service.autofill.FillContext> getFillContexts() { return null; }
    public java.lang.String toString() { return null; }
    public android.os.Bundle getClientState() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface RequestFlags {
    }
}
