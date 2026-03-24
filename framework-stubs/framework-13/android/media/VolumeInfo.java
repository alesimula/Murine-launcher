package android.media;

public final class VolumeInfo implements android.os.Parcelable {
    public static final int INDEX_NOT_SET = -100;
    public static final android.os.Parcelable.Creator<android.media.VolumeInfo> CREATOR = null;
    public boolean hasStreamType() { return false; }
    public int getStreamType() { return 0; }
    public boolean hasVolumeGroup() { return false; }
    public android.media.audiopolicy.AudioVolumeGroup getVolumeGroup() { return null; }
    public boolean hasMuteCommand() { return false; }
    public boolean isMuted() { return false; }
    public int getVolumeIndex() { return 0; }
    public int getMinVolumeIndex() { return 0; }
    public int getMaxVolumeIndex() { return 0; }
    public static android.media.VolumeInfo getDefaultVolumeInfo() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.media.audiopolicy.AudioVolumeGroup p0) {}
        public Builder(android.media.VolumeInfo p0) {}
        public android.media.VolumeInfo.Builder setMuted(boolean p0) { return null; }
        public android.media.VolumeInfo.Builder setVolumeIndex(int p0) { return null; }
        public android.media.VolumeInfo.Builder setMinVolumeIndex(int p0) { return null; }
        public android.media.VolumeInfo.Builder setMaxVolumeIndex(int p0) { return null; }
        public android.media.VolumeInfo build() { return null; }
    }
}
