package android.service.displayhash;

@android.annotation.SystemApi
public final class DisplayHashParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.displayhash.DisplayHashParams> CREATOR = null;
    public DisplayHashParams(android.util.Size p0, boolean p1) {}
    @android.annotation.Nullable
    public android.util.Size getBufferSize() { return null; }
    public boolean isGrayscaleBuffer() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    DisplayHashParams(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.service.displayhash.DisplayHashParams.Builder setBufferSize(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.service.displayhash.DisplayHashParams.Builder setGrayscaleBuffer(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.displayhash.DisplayHashParams build() { return null; }
    }
}
