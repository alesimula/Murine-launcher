package android.service.autofill;

public final class SaveRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.SaveRequest> CREATOR = null;
    public SaveRequest(java.util.ArrayList<android.service.autofill.FillContext> p0, android.os.Bundle p1, java.util.ArrayList<java.lang.String> p2) {}
    @android.annotation.NonNull
    public java.util.List<android.service.autofill.FillContext> getFillContexts() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getClientState() { return null; }
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getDatasetIds() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
