package android.service.voice;

public final class HotwordAudioStream implements android.os.Parcelable {
    public static final java.lang.String KEY_AUDIO_STREAM_COPY_BUFFER_LENGTH_BYTES = "android.service.voice.key.AUDIO_STREAM_COPY_BUFFER_LENGTH_BYTES";
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordAudioStream> CREATOR = null;
    public android.service.voice.HotwordAudioStream.Builder buildUpon() { return null; }
    HotwordAudioStream(android.media.AudioFormat p0, android.os.ParcelFileDescriptor p1, android.media.AudioTimestamp p2, android.os.PersistableBundle p3, byte[] p4) {}
    public android.media.AudioFormat getAudioFormat() { return null; }
    public android.os.ParcelFileDescriptor getAudioStreamParcelFileDescriptor() { return null; }
    public android.media.AudioTimestamp getTimestamp() { return null; }
    public android.os.PersistableBundle getMetadata() { return null; }
    public byte[] getInitialAudio() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    HotwordAudioStream(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.media.AudioFormat p0, android.os.ParcelFileDescriptor p1) {}
        public android.service.voice.HotwordAudioStream.Builder setAudioFormat(android.media.AudioFormat p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setAudioStreamParcelFileDescriptor(android.os.ParcelFileDescriptor p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setTimestamp(android.media.AudioTimestamp p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setMetadata(android.os.PersistableBundle p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setInitialAudio(byte[] p0) { return null; }
        public android.service.voice.HotwordAudioStream build() { return null; }
    }
}
