package android.media;

public interface AudioMetadataReadMap {
    public <T extends java.lang.Object> boolean containsKey(android.media.AudioMetadata.Key<T> p0);
    public android.media.AudioMetadataMap dup();
    public <T extends java.lang.Object> T get(android.media.AudioMetadata.Key<T> p0);
    public java.util.Set<android.media.AudioMetadata.Key<?>> keySet();
    public int size();
}
