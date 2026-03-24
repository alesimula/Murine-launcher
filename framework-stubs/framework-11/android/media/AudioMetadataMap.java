package android.media;

public interface AudioMetadataMap extends android.media.AudioMetadataReadMap {
    public <T extends java.lang.Object> T remove(android.media.AudioMetadata.Key<T> p0);
    public <T extends java.lang.Object> T set(android.media.AudioMetadata.Key<T> p0, T p1);
}
