package android.media;

public class MediaFile {
    public MediaFile() {}
    @java.lang.Deprecated
    static void addFileType(java.lang.String p0, int p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public static boolean isAudioFileType(int p0) { return false; }
    @java.lang.Deprecated
    public static boolean isVideoFileType(int p0) { return false; }
    @java.lang.Deprecated
    public static boolean isImageFileType(int p0) { return false; }
    @java.lang.Deprecated
    public static boolean isPlayListFileType(int p0) { return false; }
    @java.lang.Deprecated
    public static boolean isDrmFileType(int p0) { return false; }
    @java.lang.Deprecated
    public static android.media.MediaFile.MediaFileType getFileType(java.lang.String p0) { return null; }
    public static boolean isDocumentMimeType(java.lang.String p0) { return false; }
    public static boolean isExifMimeType(java.lang.String p0) { return false; }
    public static boolean isAudioMimeType(java.lang.String p0) { return false; }
    public static boolean isVideoMimeType(java.lang.String p0) { return false; }
    public static boolean isImageMimeType(java.lang.String p0) { return false; }
    public static boolean isPlayListMimeType(java.lang.String p0) { return false; }
    public static boolean isDrmMimeType(java.lang.String p0) { return false; }
    @android.annotation.NonNull
    public static java.lang.String getFileTitle(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public static java.lang.String getFileExtension(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static int getFileTypeForMimeType(java.lang.String p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String getMimeType(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getMimeTypeForFile(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getMimeTypeForFormatCode(int p0) { return null; }
    public static int getFormatCode(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int getFormatCodeForFile(java.lang.String p0) { return 0; }
    public static int getFormatCodeForMimeType(java.lang.String p0) { return 0; }

    @java.lang.Deprecated
    public static class MediaFileType {
        public final int fileType = 0;
        public final java.lang.String mimeType = null;
        MediaFileType(int p0, java.lang.String p1) {}
    }
}
