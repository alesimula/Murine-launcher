package android.hardware.cas;

public final class DestinationBuffer implements android.os.Parcelable {
    public static final int nonsecureMemory = 0;
    public static final int secureMemory = 1;
    public static final android.os.Parcelable.Creator<android.hardware.cas.DestinationBuffer> CREATOR = null;
    public DestinationBuffer() {}
    public int getTag() { return 0; }
    public static android.hardware.cas.DestinationBuffer nonsecureMemory(android.hardware.cas.SharedBuffer p0) { return null; }
    public android.hardware.cas.SharedBuffer getNonsecureMemory() { return null; }
    public void setNonsecureMemory(android.hardware.cas.SharedBuffer p0) {}
    public static android.hardware.cas.DestinationBuffer secureMemory(android.hardware.common.NativeHandle p0) { return null; }
    public android.hardware.common.NativeHandle getSecureMemory() { return null; }
    public void setSecureMemory(android.hardware.common.NativeHandle p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int nonsecureMemory = 0;
        public static final int secureMemory = 1;
    }
}
