package android.service.displayhash;

@android.annotation.SystemApi
public final class DisplayHashParams implements android.os.Parcelable {
    private final android.util.Size mBufferSize = null;
    private final boolean mGrayscaleBuffer = false;
    public static final android.os.Parcelable.Creator<android.service.displayhash.DisplayHashParams> CREATOR = null;
    public DisplayHashParams(android.util.Size p0, boolean p1) {}
    public android.util.Size getBufferSize() { return null; }
    public boolean isGrayscaleBuffer() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    DisplayHashParams(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    public static final class Builder {
        private android.util.Size mBufferSize;
        private boolean mGrayscaleBuffer;
        public Builder() {}
        public android.service.displayhash.DisplayHashParams.Builder setBufferSize(int p0, int p1) { return null; }
        public android.service.displayhash.DisplayHashParams.Builder setGrayscaleBuffer(boolean p0) { return null; }
        public android.service.displayhash.DisplayHashParams build() { return null; }
    }
}
