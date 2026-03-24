package android.hardware.radio;

public final class UniqueProgramIdentifier implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.radio.UniqueProgramIdentifier> CREATOR = null;
    public static boolean requireCriticalSecondaryIds(int p0) { return false; }
    public UniqueProgramIdentifier(android.hardware.radio.ProgramSelector p0) {}
    public UniqueProgramIdentifier(android.hardware.radio.ProgramSelector.Identifier p0) {}
    @android.annotation.NonNull
    public android.hardware.radio.ProgramSelector.Identifier getPrimaryId() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.radio.ProgramSelector.Identifier> getCriticalSecondaryIds() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
