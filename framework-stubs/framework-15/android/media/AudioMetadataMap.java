package android.media;

public interface AudioMetadataMap extends android.media.AudioMetadataReadMap {
    @android.annotation.Nullable
    public <T extends java.lang.Object> T remove(android.media.AudioMetadata.Key<T> p0);
    @android.annotation.Nullable
    public <T extends java.lang.Object> T set(android.media.AudioMetadata.Key<T> p0, T p1);
}
