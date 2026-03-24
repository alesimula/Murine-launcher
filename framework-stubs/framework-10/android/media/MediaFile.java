package android.media;

public class MediaFile {
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    private static final int FIRST_AUDIO_FILE_TYPE = 1;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    private static final int LAST_AUDIO_FILE_TYPE = 10;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    private static final java.util.HashMap<java.lang.String, android.media.MediaFile.MediaFileType> sFileTypeMap = null;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> sFileTypeToFormatMap = null;
    @android.annotation.UnsupportedAppUsage
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> sMimeTypeToFormatMap = null;
    @android.annotation.UnsupportedAppUsage
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> sFormatToMimeTypeMap = null;
    public MediaFile() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    static void addFileType(java.lang.String p0, int p1, java.lang.String p2) {}
    private static void addFileType(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isAudioFileType(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isVideoFileType(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isImageFileType(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isPlayListFileType(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isDrmFileType(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static android.media.MediaFile.MediaFileType getFileType(java.lang.String p0) { return null; }
    public static boolean isExifMimeType(java.lang.String p0) { return false; }
    public static boolean isAudioMimeType(java.lang.String p0) { return false; }
    public static boolean isVideoMimeType(java.lang.String p0) { return false; }
    public static boolean isImageMimeType(java.lang.String p0) { return false; }
    public static boolean isPlayListMimeType(java.lang.String p0) { return false; }
    public static boolean isDrmMimeType(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getFileTitle(java.lang.String p0) { return null; }
    public static java.lang.String getFileExtension(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static int getFileTypeForMimeType(java.lang.String p0) { return 0; }
    public static java.lang.String getMimeType(java.lang.String p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getMimeTypeForFile(java.lang.String p0) { return null; }
    public static java.lang.String getMimeTypeForFormatCode(int p0) { return null; }
    public static int getFormatCode(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int getFormatCodeForFile(java.lang.String p0) { return 0; }
    public static int getFormatCodeForMimeType(java.lang.String p0) { return 0; }
    private static java.lang.String normalizeMimeType(java.lang.String p0) { return null; }

    @java.lang.Deprecated
    public static class MediaFileType {
        @android.annotation.UnsupportedAppUsage
        public final int fileType = 0;
        @android.annotation.UnsupportedAppUsage
        public final java.lang.String mimeType = null;
        MediaFileType(int p0, java.lang.String p1) {}
    }
}
