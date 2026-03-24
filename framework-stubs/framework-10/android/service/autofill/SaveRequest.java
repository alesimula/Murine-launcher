package android.service.autofill;

public final class SaveRequest implements android.os.Parcelable {
    private final java.util.ArrayList<android.service.autofill.FillContext> mFillContexts = null;
    private final android.os.Bundle mClientState = null;
    private final java.util.ArrayList<java.lang.String> mDatasetIds = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.SaveRequest> CREATOR = null;
    public SaveRequest(java.util.ArrayList<android.service.autofill.FillContext> p0, android.os.Bundle p1, java.util.ArrayList<java.lang.String> p2) {}
    private SaveRequest(android.os.Parcel p0) {}
    public java.util.List<android.service.autofill.FillContext> getFillContexts() { return null; }
    public android.os.Bundle getClientState() { return null; }
    public java.util.List<java.lang.String> getDatasetIds() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
