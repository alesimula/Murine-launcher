package android.media.tv;

public final class TableResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.TableResponse> CREATOR = null;
    static android.media.tv.TableResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    @java.lang.Deprecated
    public TableResponse(int p0, int p1, int p2, android.net.Uri p3, int p4, int p5) { super(0, (android.os.Parcel)null); }
    TableResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    @android.annotation.Nullable
    public android.net.Uri getTableUri() { return null; }
    @android.annotation.Nullable
    public byte[] getTableByteArray() { return null; }
    @android.annotation.Nullable
    public android.os.SharedMemory getTableSharedMemory() { return null; }
    public int getVersion() { return 0; }
    public int getSize() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, int p2, int p3, int p4) {}
        @android.annotation.NonNull
        public android.media.tv.TableResponse.Builder setTableUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.TableResponse.Builder setTableByteArray(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.TableResponse.Builder setTableSharedMemory(android.os.SharedMemory p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.TableResponse build() { return null; }
    }
}
