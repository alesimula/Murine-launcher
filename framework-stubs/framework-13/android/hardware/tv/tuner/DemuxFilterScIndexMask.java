package android.hardware.tv.tuner;

public final class DemuxFilterScIndexMask implements android.os.Parcelable {
    public static final int scIndex = 0;
    public static final int scAvc = 1;
    public static final int scHevc = 2;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterScIndexMask> CREATOR = null;
    public DemuxFilterScIndexMask() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterScIndexMask scIndex(int p0) { return null; }
    public int getScIndex() { return 0; }
    public void setScIndex(int p0) {}
    public static android.hardware.tv.tuner.DemuxFilterScIndexMask scAvc(int p0) { return null; }
    public int getScAvc() { return 0; }
    public void setScAvc(int p0) {}
    public static android.hardware.tv.tuner.DemuxFilterScIndexMask scHevc(int p0) { return null; }
    public int getScHevc() { return 0; }
    public void setScHevc(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int scIndex = 0;
        public static final int scAvc = 1;
        public static final int scHevc = 2;
    }
}
