package com.google.android.mms.util;

public class DownloadDrmHelper {
    public static final java.lang.String MIMETYPE_DRM_MESSAGE = "application/vnd.oma.drm.message";
    public static final java.lang.String EXTENSION_DRM_MESSAGE = ".dm";
    public static final java.lang.String EXTENSION_INTERNAL_FWDL = ".fl";
    public DownloadDrmHelper() {}
    public static boolean isDrmMimeType(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean isDrmConvertNeeded(java.lang.String p0) { return false; }
    public static java.lang.String modifyDrmFwLockFileExtension(java.lang.String p0) { return null; }
    public static java.lang.String getOriginalMimeType(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return null; }
}
