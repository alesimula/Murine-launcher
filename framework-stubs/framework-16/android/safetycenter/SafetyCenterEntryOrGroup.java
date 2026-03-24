package android.safetycenter;

public final class SafetyCenterEntryOrGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterEntryOrGroup> CREATOR = null;
    public SafetyCenterEntryOrGroup(android.safetycenter.SafetyCenterEntry p0) {}
    public SafetyCenterEntryOrGroup(android.safetycenter.SafetyCenterEntryGroup p0) {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.safetycenter.SafetyCenterEntry getEntry() { return null; }
    @android.annotation.Nullable
    public android.safetycenter.SafetyCenterEntryGroup getEntryGroup() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
