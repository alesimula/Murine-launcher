package android.media;

public abstract class DrmInitData {
    DrmInitData() {}
    public abstract android.media.DrmInitData.SchemeInitData get(java.util.UUID p0);

    public static final class SchemeInitData {
        public final java.lang.String mimeType = null;
        public final byte[] data = null;
        public SchemeInitData(java.lang.String p0, byte[] p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
