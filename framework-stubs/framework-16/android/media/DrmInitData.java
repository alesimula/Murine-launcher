package android.media;

public abstract class DrmInitData {
    DrmInitData() {}
    @java.lang.Deprecated
    public abstract android.media.DrmInitData.SchemeInitData get(java.util.UUID p0);
    public int getSchemeInitDataCount() { return 0; }
    @android.annotation.NonNull
    public android.media.DrmInitData.SchemeInitData getSchemeInitDataAt(int p0) { return null; }

    public static final class SchemeInitData {
        @android.annotation.NonNull
        public static final java.util.UUID UUID_NIL = null;
        @android.annotation.NonNull
        public final java.util.UUID uuid = null;
        public final java.lang.String mimeType = null;
        public final byte[] data = null;
        public SchemeInitData(java.util.UUID p0, java.lang.String p1, byte[] p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
