package android.media;

public final class AudioMetadata {
    public static android.media.AudioMetadataMap createMap() { return null; }
    public static <T extends java.lang.Object> android.media.AudioMetadata.Key<T> createKey(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    public static android.media.AudioMetadata.BaseMap fromByteBuffer(java.nio.ByteBuffer p0) { return null; }
    public static java.nio.ByteBuffer toByteBuffer(android.media.AudioMetadata.BaseMap p0, java.nio.ByteOrder p1) { return null; }

    public static class Format {
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_BIT_RATE = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_CHANNEL_MASK = null;
        public static final android.media.AudioMetadata.Key<java.lang.String> KEY_MIME = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_SAMPLE_RATE = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_BIT_WIDTH = null;
        public static final android.media.AudioMetadata.Key<java.lang.Boolean> KEY_ATMOS_PRESENT = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_HAS_ATMOS = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_AUDIO_ENCODING = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_PRESENTATION_ID = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_PROGRAM_ID = null;
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_PRESENTATION_CONTENT_CLASSIFIER = null;
        public static final android.media.AudioMetadata.Key<java.lang.String> KEY_PRESENTATION_LANGUAGE = null;
    }

    public static interface Key<T extends java.lang.Object> {
        public java.lang.String getName();
        public java.lang.Class<T> getValueClass();
    }

    private static class AutoGrowByteBuffer {
        AutoGrowByteBuffer() {}
        AutoGrowByteBuffer(int p0) {}
        public java.nio.ByteBuffer getRawByteBuffer() { return null; }
        public java.nio.ByteOrder order() { return null; }
        public int position() { return 0; }
        public android.media.AudioMetadata.AutoGrowByteBuffer position(int p0) { return null; }
        public android.media.AudioMetadata.AutoGrowByteBuffer order(java.nio.ByteOrder p0) { return null; }
        public android.media.AudioMetadata.AutoGrowByteBuffer putInt(int p0) { return null; }
        public android.media.AudioMetadata.AutoGrowByteBuffer putLong(long p0) { return null; }
        public android.media.AudioMetadata.AutoGrowByteBuffer putFloat(float p0) { return null; }
        public android.media.AudioMetadata.AutoGrowByteBuffer putDouble(double p0) { return null; }
        public android.media.AudioMetadata.AutoGrowByteBuffer put(byte[] p0) { return null; }
    }

    public static class BaseMap implements android.media.AudioMetadataMap {
        public BaseMap() {}
        public <T extends java.lang.Object> boolean containsKey(android.media.AudioMetadata.Key<T> p0) { return false; }
        public android.media.AudioMetadataMap dup() { return null; }
        public <T extends java.lang.Object> T get(android.media.AudioMetadata.Key<T> p0) { return null; }
        public java.util.Set<android.media.AudioMetadata.Key<?>> keySet() { return null; }
        public <T extends java.lang.Object> T remove(android.media.AudioMetadata.Key<T> p0) { return null; }
        public <T extends java.lang.Object> T set(android.media.AudioMetadata.Key<T> p0, T p1) { return null; }
        public int size() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class BaseMapPackage implements android.media.AudioMetadata.DataPackage<android.media.AudioMetadata.BaseMap> {
        public android.media.AudioMetadata.BaseMap unpack(java.nio.ByteBuffer p0) { return null; }
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, android.media.AudioMetadata.BaseMap p1) { return false; }
    }

    private static interface DataPackage<T extends java.lang.Object> {
        public T unpack(java.nio.ByteBuffer p0);
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, T p1);
        default public java.lang.Class getMyType() { return null; }
    }

    private static class ObjectPackage implements android.media.AudioMetadata.DataPackage<android.util.Pair<java.lang.Class, java.lang.Object>> {
        public android.util.Pair<java.lang.Class, java.lang.Object> unpack(java.nio.ByteBuffer p0) { return null; }
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, android.util.Pair<java.lang.Class, java.lang.Object> p1) { return false; }
    }
}
