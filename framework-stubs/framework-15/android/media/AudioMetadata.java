package android.media;

public final class AudioMetadata {
    @android.annotation.NonNull
    public static android.media.AudioMetadataMap createMap() { return null; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object> android.media.AudioMetadata.Key<T> createKey(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    @android.annotation.Nullable
    public static android.media.AudioMetadata.BaseMap fromByteBuffer(java.nio.ByteBuffer p0) { return null; }
    @android.annotation.Nullable
    public static java.nio.ByteBuffer toByteBuffer(android.media.AudioMetadata.BaseMap p0, java.nio.ByteOrder p1) { return null; }

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
        @android.annotation.NonNull
        public android.media.AudioMetadataMap dup() { return null; }
        @android.annotation.Nullable
        public <T extends java.lang.Object> T get(android.media.AudioMetadata.Key<T> p0) { return null; }
        @android.annotation.NonNull
        public java.util.Set<android.media.AudioMetadata.Key<?>> keySet() { return null; }
        @android.annotation.Nullable
        public <T extends java.lang.Object> T remove(android.media.AudioMetadata.Key<T> p0) { return null; }
        @android.annotation.Nullable
        public <T extends java.lang.Object> T set(android.media.AudioMetadata.Key<T> p0, T p1) { return null; }
        public int size() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class BaseMapPackage implements android.media.AudioMetadata.DataPackage<android.media.AudioMetadata.BaseMap> {
        @android.annotation.Nullable
        public android.media.AudioMetadata.BaseMap unpack(java.nio.ByteBuffer p0) { return null; }
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, android.media.AudioMetadata.BaseMap p1) { return false; }
    }

    private static interface DataPackage<T extends java.lang.Object> {
        @android.annotation.Nullable
        public T unpack(java.nio.ByteBuffer p0);
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, T p1);
        default public java.lang.Class getMyType() { return null; }
    }

    public static class Format {
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_BIT_RATE = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_CHANNEL_MASK = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.String> KEY_MIME = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_SAMPLE_RATE = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_BIT_WIDTH = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Boolean> KEY_ATMOS_PRESENT = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_HAS_ATMOS = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_AUDIO_ENCODING = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_PRESENTATION_ID = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_PROGRAM_ID = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.Integer> KEY_PRESENTATION_CONTENT_CLASSIFIER = null;
        @android.annotation.NonNull
        public static final android.media.AudioMetadata.Key<java.lang.String> KEY_PRESENTATION_LANGUAGE = null;
    }

    public static interface Key<T extends java.lang.Object> {
        @android.annotation.NonNull
        public java.lang.String getName();
        @android.annotation.NonNull
        public java.lang.Class<T> getValueClass();
    }

    private static class ObjectPackage implements android.media.AudioMetadata.DataPackage<android.util.Pair<java.lang.Class, java.lang.Object>> {
        @android.annotation.Nullable
        public android.util.Pair<java.lang.Class, java.lang.Object> unpack(java.nio.ByteBuffer p0) { return null; }
        public boolean pack(android.media.AudioMetadata.AutoGrowByteBuffer p0, android.util.Pair<java.lang.Class, java.lang.Object> p1) { return false; }
    }
}
