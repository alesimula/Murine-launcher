package android.provider;

public final class MetadataReader {
    private static final java.lang.String[] DEFAULT_EXIF_TAGS = null;
    private static final int TYPE_INT = 0;
    private static final int TYPE_DOUBLE = 1;
    private static final int TYPE_STRING = 2;
    private static final java.util.Map<java.lang.String, java.lang.Integer> TYPE_MAPPING = null;
    private static final java.lang.String JPG_MIME_TYPE = "image/jpg";
    private static final java.lang.String JPEG_MIME_TYPE = "image/jpeg";
    private MetadataReader() {}
    public static boolean isSupportedMimeType(java.lang.String p0) { return false; }
    public static void getMetadata(android.os.Bundle p0, java.io.InputStream p1, java.lang.String p2, java.lang.String[] p3) throws java.io.IOException {}
    private static android.os.Bundle getExifData(java.io.InputStream p0, java.lang.String[] p1) throws java.io.IOException { return null; }
}
