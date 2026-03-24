package android.media;

public final class AudioMetadata {
    private static final java.lang.String TAG = "AudioMetadata";
    private static final int AUDIO_METADATA_OBJ_TYPE_NONE = 0;
    private static final int AUDIO_METADATA_OBJ_TYPE_INT = 1;
    private static final int AUDIO_METADATA_OBJ_TYPE_LONG = 2;
    private static final int AUDIO_METADATA_OBJ_TYPE_FLOAT = 3;
    private static final int AUDIO_METADATA_OBJ_TYPE_DOUBLE = 4;
    private static final int AUDIO_METADATA_OBJ_TYPE_STRING = 5;
    private static final int AUDIO_METADATA_OBJ_TYPE_BASEMAP = 6;
    private static final java.util.HashMap<java.lang.Class, java.lang.Integer> AUDIO_METADATA_OBJ_TYPES = null;
    private static final java.nio.charset.Charset AUDIO_METADATA_CHARSET = null;
    private static final java.util.HashMap<java.lang.Integer, android.media.AudioMetadata.DataPackage<?>> DATA_PACKAGES = null;
    private static final android.media.AudioMetadata.ObjectPackage OBJECT_PACKAGE = null;
    public static android.media.AudioMetadataMap createMap() { return null; }
    public static <T extends java.lang.Object> android.media.AudioMetadata.Key<T> createKey(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    public static android.media.AudioMetadata.BaseMap fromByteBuffer(java.nio.ByteBuffer p0) { return null; }
    public static java.nio.ByteBuffer toByteBuffer(android.media.AudioMetadata.BaseMap p0, java.nio.ByteOrder p1) { return null; }
    private AudioMetadata() {}

    private static class AutoGrowByteBuffer {
        private static final int INTEGER_BYTE_COUNT = 4;
        private static final int LONG_BYTE_COUNT = 8;
        private static final int FLOAT_BYTE_COUNT = 4;
        private static final int DOUBLE_BYTE_COUNT = 8;
        private java.nio.ByteBuffer mBuffer;
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
        private void ensureCapacity(int p0) {}
    }

    public static class BaseMap implements android.media.AudioMetadataMap {
        private final java.util.HashMap<android.util.Pair<java.lang.String, java.lang.Class<?>>, android.util.Pair<android.media.AudioMetadata.Key<?>, java.lang.Object>> mHashMap = null;
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
        private static <T extends java.lang.Object> android.util.Pair<java.lang.String, java.lang.Class<?>> pairFromKey(android.media.AudioMetadata.Key<T> p0) { return null; }
        private static java.lang.Object getValueFromValuePair(android.util.Pair<android.media.AudioMetadata.Key<?>, java.lang.Object> p0) { return null; }
    }

    private static class BaseMapPackage implements android.media.AudioMetadata.DataPackage<android.media.AudioMetadata.BaseMap> {
        private BaseMapPackage() {}
        public android.media.AudioMetadata.BaseMap unpack(java.nio.ByteBuffer p0) { return null; }
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, android.media.AudioMetadata.BaseMap p1) { return false; }
    }

    private static interface DataPackage<T extends java.lang.Object> {
        public T unpack(java.nio.ByteBuffer p0);
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, T p1);
        default public java.lang.Class getMyType() { return null; }
    }

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
        private Format() {}
    }

    public static interface Key<T extends java.lang.Object> {
        public java.lang.String getName();
        public java.lang.Class<T> getValueClass();
    }

    private static class ObjectPackage implements android.media.AudioMetadata.DataPackage<android.util.Pair<java.lang.Class, java.lang.Object>> {
        private ObjectPackage() {}
        public android.util.Pair<java.lang.Class, java.lang.Object> unpack(java.nio.ByteBuffer p0) { return null; }
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, android.util.Pair<java.lang.Class, java.lang.Object> p1) { return false; }
    }
}
