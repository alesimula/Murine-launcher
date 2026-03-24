package android.safetycenter;

public final class SafetyCenterEntryOrGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterEntryOrGroup> CREATOR = null;
    public SafetyCenterEntryOrGroup(android.safetycenter.SafetyCenterEntry p0) {}
    public SafetyCenterEntryOrGroup(android.safetycenter.SafetyCenterEntryGroup p0) {}
    @android.annotation.Nullable
    public android.safetycenter.SafetyCenterEntry getEntry() { return null; }
    @android.annotation.Nullable
    public android.safetycenter.SafetyCenterEntryGroup getEntryGroup() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
