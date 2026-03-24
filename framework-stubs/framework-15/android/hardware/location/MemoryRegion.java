package android.hardware.location;

@android.annotation.SystemApi
public class MemoryRegion implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.location.MemoryRegion> CREATOR = null;
    public int getCapacityBytes() { return 0; }
    public int getFreeCapacityBytes() { return 0; }
    public boolean isReadable() { return false; }
    public boolean isWritable() { return false; }
    public boolean isExecutable() { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public MemoryRegion(android.os.Parcel p0) {}
}
