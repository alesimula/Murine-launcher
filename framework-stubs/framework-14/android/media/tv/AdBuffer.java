package android.media.tv;

public final class AdBuffer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.AdBuffer> CREATOR = null;
    public AdBuffer(int p0, java.lang.String p1, android.os.SharedMemory p2, int p3, int p4, long p5, int p6) {}
    public static android.media.tv.AdBuffer dupAdBuffer(android.media.tv.AdBuffer p0) throws java.io.IOException { return null; }
    public int getId() { return 0; }
    public java.lang.String getMimeType() { return null; }
    public android.os.SharedMemory getSharedMemory() { return null; }
    public int getOffset() { return 0; }
    public int getLength() { return 0; }
    public long getPresentationTimeUs() { return 0L; }
    public int getFlags() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
