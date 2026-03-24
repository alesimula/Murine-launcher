package com.google.android.mms;

public class ContentType {
    public static final java.lang.String MMS_MESSAGE = "application/vnd.wap.mms-message";
    public static final java.lang.String MMS_GENERIC = "application/vnd.wap.mms-generic";
    public static final java.lang.String MULTIPART_MIXED = "application/vnd.wap.multipart.mixed";
    public static final java.lang.String MULTIPART_RELATED = "application/vnd.wap.multipart.related";
    public static final java.lang.String MULTIPART_ALTERNATIVE = "application/vnd.wap.multipart.alternative";
    public static final java.lang.String TEXT_PLAIN = "text/plain";
    public static final java.lang.String TEXT_HTML = "text/html";
    public static final java.lang.String TEXT_VCALENDAR = "text/x-vCalendar";
    public static final java.lang.String TEXT_VCARD = "text/x-vCard";
    public static final java.lang.String IMAGE_UNSPECIFIED = "image/*";
    public static final java.lang.String IMAGE_JPEG = "image/jpeg";
    public static final java.lang.String IMAGE_JPG = "image/jpg";
    public static final java.lang.String IMAGE_GIF = "image/gif";
    public static final java.lang.String IMAGE_WBMP = "image/vnd.wap.wbmp";
    public static final java.lang.String IMAGE_PNG = "image/png";
    public static final java.lang.String IMAGE_X_MS_BMP = "image/x-ms-bmp";
    public static final java.lang.String AUDIO_UNSPECIFIED = "audio/*";
    public static final java.lang.String AUDIO_AAC = "audio/aac";
    public static final java.lang.String AUDIO_AMR = "audio/amr";
    public static final java.lang.String AUDIO_IMELODY = "audio/imelody";
    public static final java.lang.String AUDIO_MID = "audio/mid";
    public static final java.lang.String AUDIO_MIDI = "audio/midi";
    public static final java.lang.String AUDIO_MP3 = "audio/mp3";
    public static final java.lang.String AUDIO_MPEG3 = "audio/mpeg3";
    public static final java.lang.String AUDIO_MPEG = "audio/mpeg";
    public static final java.lang.String AUDIO_MPG = "audio/mpg";
    public static final java.lang.String AUDIO_MP4 = "audio/mp4";
    public static final java.lang.String AUDIO_X_MID = "audio/x-mid";
    public static final java.lang.String AUDIO_X_MIDI = "audio/x-midi";
    public static final java.lang.String AUDIO_X_MP3 = "audio/x-mp3";
    public static final java.lang.String AUDIO_X_MPEG3 = "audio/x-mpeg3";
    public static final java.lang.String AUDIO_X_MPEG = "audio/x-mpeg";
    public static final java.lang.String AUDIO_X_MPG = "audio/x-mpg";
    public static final java.lang.String AUDIO_3GPP = "audio/3gpp";
    public static final java.lang.String AUDIO_X_WAV = "audio/x-wav";
    public static final java.lang.String AUDIO_OGG = "application/ogg";
    public static final java.lang.String AUDIO_OGG2 = "audio/ogg";
    public static final java.lang.String VIDEO_UNSPECIFIED = "video/*";
    public static final java.lang.String VIDEO_3GPP = "video/3gpp";
    public static final java.lang.String VIDEO_3G2 = "video/3gpp2";
    public static final java.lang.String VIDEO_H263 = "video/h263";
    public static final java.lang.String VIDEO_MP4 = "video/mp4";
    public static final java.lang.String APP_SMIL = "application/smil";
    public static final java.lang.String APP_WAP_XHTML = "application/vnd.wap.xhtml+xml";
    public static final java.lang.String APP_XHTML = "application/xhtml+xml";
    public static final java.lang.String APP_DRM_CONTENT = "application/vnd.oma.drm.content";
    public static final java.lang.String APP_DRM_MESSAGE = "application/vnd.oma.drm.message";
    private static final java.util.ArrayList<java.lang.String> sSupportedContentTypes = null;
    private static final java.util.ArrayList<java.lang.String> sSupportedImageTypes = null;
    private static final java.util.ArrayList<java.lang.String> sSupportedAudioTypes = null;
    private static final java.util.ArrayList<java.lang.String> sSupportedVideoTypes = null;
    private ContentType() {}
    public static boolean isSupportedType(java.lang.String p0) { return false; }
    public static boolean isSupportedImageType(java.lang.String p0) { return false; }
    public static boolean isSupportedAudioType(java.lang.String p0) { return false; }
    public static boolean isSupportedVideoType(java.lang.String p0) { return false; }
    public static boolean isTextType(java.lang.String p0) { return false; }
    public static boolean isImageType(java.lang.String p0) { return false; }
    public static boolean isAudioType(java.lang.String p0) { return false; }
    public static boolean isVideoType(java.lang.String p0) { return false; }
    public static boolean isDrmType(java.lang.String p0) { return false; }
    public static boolean isUnspecified(java.lang.String p0) { return false; }
    public static java.util.ArrayList<java.lang.String> getImageTypes() { return null; }
    public static java.util.ArrayList<java.lang.String> getAudioTypes() { return null; }
    public static java.util.ArrayList<java.lang.String> getVideoTypes() { return null; }
    public static java.util.ArrayList<java.lang.String> getSupportedTypes() { return null; }
}
