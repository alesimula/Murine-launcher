package android.provider;

public final class MediaStore {
    private static final java.lang.String TAG = "MediaStore";
    public static final java.lang.String AUTHORITY = "media";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String VOLUME_INTERNAL = "internal";
    public static final java.lang.String VOLUME_EXTERNAL = "external";
    public static final java.lang.String VOLUME_EXTERNAL_PRIMARY = "external_primary";
    public static final java.lang.String SCAN_FILE_CALL = "scan_file";
    public static final java.lang.String SCAN_VOLUME_CALL = "scan_volume";
    public static final java.lang.String EXTRA_ORIGINATED_FROM_SHELL = "android.intent.extra.originated_from_shell";
    @java.lang.Deprecated
    public static final java.lang.String UNHIDE_CALL = "unhide";
    public static final java.lang.String RETRANSLATE_CALL = "update_titles";
    public static final java.lang.String GET_VERSION_CALL = "get_version";
    public static final java.lang.String GET_DOCUMENT_URI_CALL = "get_document_uri";
    public static final java.lang.String GET_MEDIA_URI_CALL = "get_media_uri";
    public static final java.lang.String GET_CONTRIBUTED_MEDIA_CALL = "get_contributed_media";
    public static final java.lang.String DELETE_CONTRIBUTED_MEDIA_CALL = "delete_contributed_media";
    public static final java.lang.String PARAM_DELETE_DATA = "deletedata";
    public static final java.lang.String PARAM_INCLUDE_PENDING = "includePending";
    public static final java.lang.String PARAM_INCLUDE_TRASHED = "includeTrashed";
    public static final java.lang.String PARAM_PROGRESS = "progress";
    public static final java.lang.String PARAM_REQUIRE_ORIGINAL = "requireOriginal";
    public static final java.lang.String PARAM_LIMIT = "limit";
    @java.lang.Deprecated
    public static final java.lang.String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER";
    public static final java.lang.String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH";
    public static final java.lang.String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";
    public static final java.lang.String INTENT_ACTION_TEXT_OPEN_FROM_SEARCH = "android.media.action.TEXT_OPEN_FROM_SEARCH";
    public static final java.lang.String INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH = "android.media.action.VIDEO_PLAY_FROM_SEARCH";
    public static final java.lang.String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";
    public static final java.lang.String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";
    public static final java.lang.String EXTRA_MEDIA_TITLE = "android.intent.extra.title";
    public static final java.lang.String EXTRA_MEDIA_GENRE = "android.intent.extra.genre";
    public static final java.lang.String EXTRA_MEDIA_PLAYLIST = "android.intent.extra.playlist";
    public static final java.lang.String EXTRA_MEDIA_RADIO_CHANNEL = "android.intent.extra.radio_channel";
    public static final java.lang.String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";
    public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation";
    public static final java.lang.String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";
    public static final java.lang.String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons";
    public static final java.lang.String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";
    public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA";
    public static final java.lang.String META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE = "android.media.still_image_camera_preview_service";
    public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE = "android.media.action.STILL_IMAGE_CAMERA_SECURE";
    public static final java.lang.String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA";
    public static final java.lang.String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";
    public static final java.lang.String ACTION_IMAGE_CAPTURE_SECURE = "android.media.action.IMAGE_CAPTURE_SECURE";
    public static final java.lang.String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";
    public static final java.lang.String ACTION_REVIEW = "android.provider.action.REVIEW";
    public static final java.lang.String ACTION_REVIEW_SECURE = "android.provider.action.REVIEW_SECURE";
    public static final java.lang.String EXTRA_BRIGHTNESS = "android.provider.extra.BRIGHTNESS";
    public static final java.lang.String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality";
    public static final java.lang.String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit";
    public static final java.lang.String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";
    public static final java.lang.String EXTRA_OUTPUT = "output";
    public static final java.lang.String UNKNOWN_STRING = "<unknown>";
    public static final java.lang.String MEDIA_SCANNER_VOLUME = "volume";
    public static final java.lang.String MEDIA_IGNORE_FILENAME = ".nomedia";
    public MediaStore() {}
    public static android.net.Uri setIncludePending(android.net.Uri p0) { return null; }
    public static android.net.Uri.Builder setIncludePending(android.net.Uri.Builder p0) { return null; }
    @java.lang.Deprecated
    public static android.net.Uri setIncludeTrashed(android.net.Uri p0) { return null; }
    public static android.net.Uri setRequireOriginal(android.net.Uri p0) { return null; }
    @java.lang.Deprecated
    public static android.net.Uri createPending(android.content.Context p0, android.provider.MediaStore.PendingParams p1) { return null; }
    @java.lang.Deprecated
    public static android.provider.MediaStore.PendingSession openPending(android.content.Context p0, android.net.Uri p1) { return null; }
    @java.lang.Deprecated
    public static void trash(android.content.Context p0, android.net.Uri p1) {}
    @java.lang.Deprecated
    public static void trash(android.content.Context p0, android.net.Uri p1, long p2) {}
    @java.lang.Deprecated
    public static void untrash(android.content.Context p0, android.net.Uri p1) {}
    public static java.lang.String getVolumeName(java.io.File p0) { return null; }
    @java.lang.Deprecated
    public static java.util.Set<java.lang.String> getAllVolumeNames(android.content.Context p0) { return null; }
    public static java.util.Set<java.lang.String> getExternalVolumeNames(android.content.Context p0) { return null; }
    public static java.lang.String getVolumeName(android.net.Uri p0) { return null; }
    public static java.lang.String checkArgumentVolumeName(java.lang.String p0) { return null; }
    public static java.io.File getVolumePath(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public static java.io.File getVolumePath(java.util.List<android.os.storage.VolumeInfo> p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public static java.util.Collection<java.io.File> getVolumeScanPaths(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    private static void addCanonicalFile(java.util.List<java.io.File> p0, java.io.File p1) {}
    public static android.net.Uri getMediaScannerUri() { return null; }
    public static java.lang.String getVersion(android.content.Context p0) { return null; }
    public static java.lang.String getVersion(android.content.Context p0, java.lang.String p1) { return null; }
    public static android.net.Uri getDocumentUri(android.content.Context p0, android.net.Uri p1) { return null; }
    public static android.net.Uri getMediaUri(android.content.Context p0, android.net.Uri p1) { return null; }
    public static long getContributedMediaSize(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2) throws java.io.IOException { return 0L; }
    public static void deleteContributedMedia(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2) throws java.io.IOException {}
    public static android.net.Uri scanFile(android.content.Context p0, java.io.File p1) { return null; }
    public static android.net.Uri scanFileFromShell(android.content.Context p0, java.io.File p1) { return null; }
    public static void scanVolume(android.content.Context p0, java.io.File p1) {}
    private static android.net.Uri scan(android.content.Context p0, java.lang.String p1, java.io.File p2, boolean p3) { return null; }

    public static final class Video {
        public static final java.lang.String DEFAULT_SORT_ORDER = "_display_name";
        public Video() {}
        @java.lang.Deprecated
        public static final android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2) { return null; }

        public static interface VideoColumns extends android.provider.MediaStore.MediaColumns {
            public static final java.lang.String DURATION = "duration";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ARTIST = "artist";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ALBUM = "album";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String RESOLUTION = "resolution";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String DESCRIPTION = "description";
            @android.provider.Column(1)
            public static final java.lang.String IS_PRIVATE = "isprivate";
            @android.provider.Column(3)
            public static final java.lang.String TAGS = "tags";
            @android.provider.Column(3)
            public static final java.lang.String CATEGORY = "category";
            @android.provider.Column(3)
            public static final java.lang.String LANGUAGE = "language";
            @java.lang.Deprecated
            @android.provider.Column(value=2, readOnly=true)
            public static final java.lang.String LATITUDE = "latitude";
            @java.lang.Deprecated
            @android.provider.Column(value=2, readOnly=true)
            public static final java.lang.String LONGITUDE = "longitude";
            public static final java.lang.String DATE_TAKEN = "datetaken";
            @java.lang.Deprecated
            @android.provider.Column(1)
            public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";
            public static final java.lang.String BUCKET_ID = "bucket_id";
            public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";
            public static final java.lang.String GROUP_ID = "group_id";
            @android.provider.Column(1)
            public static final java.lang.String BOOKMARK = "bookmark";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String COLOR_STANDARD = "color_standard";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String COLOR_TRANSFER = "color_transfer";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String COLOR_RANGE = "color_range";
        }

        @java.lang.Deprecated
        public static class Thumbnails implements android.provider.BaseColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "video_id ASC";
            @java.lang.Deprecated
            @android.provider.Column(3)
            public static final java.lang.String DATA = "_data";
            @android.provider.Column(1)
            public static final java.lang.String VIDEO_ID = "video_id";
            @android.provider.Column(1)
            public static final java.lang.String KIND = "kind";
            public static final int MINI_KIND = 1;
            public static final int FULL_SCREEN_KIND = 2;
            public static final int MICRO_KIND = 3;
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String WIDTH = "width";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String HEIGHT = "height";
            public Thumbnails() {}
            @java.lang.Deprecated
            public static void cancelThumbnailRequest(android.content.ContentResolver p0, long p1) {}
            @java.lang.Deprecated
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, long p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }
            @java.lang.Deprecated
            public static void cancelThumbnailRequest(android.content.ContentResolver p0, long p1, long p2) {}
            @java.lang.Deprecated
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, long p1, long p2, int p3, android.graphics.BitmapFactory.Options p4) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        }

        public static final class Media implements android.provider.MediaStore.Video.VideoColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/video";
            public static final java.lang.String DEFAULT_SORT_ORDER = "title";
            public Media() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
        }
    }

    public static class ThumbnailConstants {
        public static final int MINI_KIND = 1;
        public static final int FULL_SCREEN_KIND = 2;
        public static final int MICRO_KIND = 3;
        public static final android.graphics.Point MINI_SIZE = null;
        public static final android.graphics.Point FULL_SCREEN_SIZE = null;
        public static final android.graphics.Point MICRO_SIZE = null;
        public ThumbnailConstants() {}
    }

    @java.lang.Deprecated
    public static class PendingSession implements java.lang.AutoCloseable {
        private final android.content.Context mContext = null;
        private final android.net.Uri mUri = null;
        public PendingSession(android.content.Context p0, android.net.Uri p1) {}
        public android.os.ParcelFileDescriptor open() throws java.io.FileNotFoundException { return null; }
        public java.io.OutputStream openOutputStream() throws java.io.FileNotFoundException { return null; }
        public void notifyProgress(int p0) {}
        public android.net.Uri publish() { return null; }
        public void abandon() {}
        public void close() {}
    }

    @java.lang.Deprecated
    public static class PendingParams {
        public final android.net.Uri insertUri = null;
        public final android.content.ContentValues insertValues = null;
        public PendingParams(android.net.Uri p0, java.lang.String p1, java.lang.String p2) {}
        public void setPrimaryDirectory(java.lang.String p0) {}
        public void setSecondaryDirectory(java.lang.String p0) {}
        public void setDownloadUri(android.net.Uri p0) {}
        public void setRefererUri(android.net.Uri p0) {}
    }

    public static interface MediaColumns extends android.provider.BaseColumns {
        @java.lang.Deprecated
        @android.provider.Column(3)
        public static final java.lang.String DATA = "_data";
        @java.lang.Deprecated
        @android.provider.Column(value=4, readOnly=true)
        public static final java.lang.String HASH = "_hash";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String SIZE = "_size";
        @android.provider.Column(3)
        public static final java.lang.String DISPLAY_NAME = "_display_name";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String TITLE = "title";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String DATE_ADDED = "date_added";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String DATE_MODIFIED = "date_modified";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String DATE_TAKEN = "datetaken";
        @android.provider.Column(3)
        public static final java.lang.String MIME_TYPE = "mime_type";
        @java.lang.Deprecated
        public static final java.lang.String MEDIA_SCANNER_NEW_OBJECT_ID = "media_scanner_new_object_id";
        @java.lang.Deprecated
        @android.provider.Column(1)
        @android.annotation.UnsupportedAppUsage
        public static final java.lang.String IS_DRM = "is_drm";
        @android.provider.Column(1)
        public static final java.lang.String IS_PENDING = "is_pending";
        @java.lang.Deprecated
        @android.provider.Column(1)
        public static final java.lang.String IS_TRASHED = "is_trashed";
        @android.provider.Column(1)
        public static final java.lang.String DATE_EXPIRES = "date_expires";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String WIDTH = "width";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String HEIGHT = "height";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String OWNER_PACKAGE_NAME = "owner_package_name";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String VOLUME_NAME = "volume_name";
        @android.provider.Column(3)
        public static final java.lang.String RELATIVE_PATH = "relative_path";
        @android.provider.Column(3)
        @java.lang.Deprecated
        public static final java.lang.String PRIMARY_DIRECTORY = "primary_directory";
        @android.provider.Column(3)
        @java.lang.Deprecated
        public static final java.lang.String SECONDARY_DIRECTORY = "secondary_directory";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String BUCKET_ID = "bucket_id";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";
        @android.provider.Column(value=1, readOnly=true)
        @java.lang.Deprecated
        public static final java.lang.String GROUP_ID = "group_id";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String DOCUMENT_ID = "document_id";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String INSTANCE_ID = "instance_id";
        @android.provider.Column(value=3, readOnly=true)
        public static final java.lang.String ORIGINAL_DOCUMENT_ID = "original_document_id";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String DURATION = "duration";
        @android.provider.Column(value=1, readOnly=true)
        public static final java.lang.String ORIENTATION = "orientation";
    }

    @java.lang.Deprecated
    private static class InternalThumbnails implements android.provider.BaseColumns {
        private static android.util.ArrayMap<android.net.Uri, android.os.CancellationSignal> sPending;
        private InternalThumbnails() {}
        @java.lang.Deprecated
        static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, android.net.Uri p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }
        @java.lang.Deprecated
        static void cancelThumbnail(android.content.ContentResolver p0, android.net.Uri p1) {}
    }

    public static final class Images {
        public Images() {}

        @java.lang.Deprecated
        public static class Thumbnails implements android.provider.BaseColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String DEFAULT_SORT_ORDER = "image_id ASC";
            @java.lang.Deprecated
            @android.provider.Column(3)
            public static final java.lang.String DATA = "_data";
            @android.provider.Column(1)
            public static final java.lang.String IMAGE_ID = "image_id";
            @android.provider.Column(1)
            public static final java.lang.String KIND = "kind";
            public static final int MINI_KIND = 1;
            public static final int FULL_SCREEN_KIND = 2;
            public static final int MICRO_KIND = 3;
            @java.lang.Deprecated
            @android.provider.Column(4)
            public static final java.lang.String THUMB_DATA = "thumb_data";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String WIDTH = "width";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String HEIGHT = "height";
            public Thumbnails() {}
            @java.lang.Deprecated
            public static final android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2) { return null; }
            @java.lang.Deprecated
            public static final android.database.Cursor queryMiniThumbnails(android.content.ContentResolver p0, android.net.Uri p1, int p2, java.lang.String[] p3) { return null; }
            @java.lang.Deprecated
            public static final android.database.Cursor queryMiniThumbnail(android.content.ContentResolver p0, long p1, int p2, java.lang.String[] p3) { return null; }
            @java.lang.Deprecated
            public static void cancelThumbnailRequest(android.content.ContentResolver p0, long p1) {}
            @java.lang.Deprecated
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, long p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }
            @java.lang.Deprecated
            public static void cancelThumbnailRequest(android.content.ContentResolver p0, long p1, long p2) {}
            @java.lang.Deprecated
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, long p1, long p2, int p3, android.graphics.BitmapFactory.Options p4) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        }

        public static final class Media implements android.provider.MediaStore.Images.ImageColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/image";
            public static final java.lang.String DEFAULT_SORT_ORDER = "bucket_display_name";
            public Media() {}
            @java.lang.Deprecated
            public static final android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2) { return null; }
            @java.lang.Deprecated
            public static final android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4) { return null; }
            @java.lang.Deprecated
            public static final android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2, java.lang.String p3, java.lang.String[] p4, java.lang.String p5) { return null; }
            @java.lang.Deprecated
            public static final android.graphics.Bitmap getBitmap(android.content.ContentResolver p0, android.net.Uri p1) throws java.io.FileNotFoundException, java.io.IOException { return null; }
            @java.lang.Deprecated
            public static final java.lang.String insertImage(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.FileNotFoundException { return null; }
            @java.lang.Deprecated
            public static final java.lang.String insertImage(android.content.ContentResolver p0, android.graphics.Bitmap p1, java.lang.String p2, java.lang.String p3) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
        }

        public static interface ImageColumns extends android.provider.MediaStore.MediaColumns {
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String DESCRIPTION = "description";
            @java.lang.Deprecated
            @android.provider.Column(3)
            public static final java.lang.String PICASA_ID = "picasa_id";
            @android.provider.Column(1)
            public static final java.lang.String IS_PRIVATE = "isprivate";
            @java.lang.Deprecated
            @android.provider.Column(value=2, readOnly=true)
            public static final java.lang.String LATITUDE = "latitude";
            @java.lang.Deprecated
            @android.provider.Column(value=2, readOnly=true)
            public static final java.lang.String LONGITUDE = "longitude";
            public static final java.lang.String DATE_TAKEN = "datetaken";
            public static final java.lang.String ORIENTATION = "orientation";
            @java.lang.Deprecated
            @android.provider.Column(1)
            public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";
            public static final java.lang.String BUCKET_ID = "bucket_id";
            public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";
            public static final java.lang.String GROUP_ID = "group_id";
        }
    }

    public static final class Files {
        public static final java.lang.String TABLE = "files";
        public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
        public Files() {}
        public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        public static final android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.net.Uri getMtpObjectsUri(java.lang.String p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static final android.net.Uri getMtpObjectsUri(java.lang.String p0, long p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static final android.net.Uri getMtpReferencesUri(java.lang.String p0, long p1) { return null; }
        public static final android.net.Uri getDirectoryUri(java.lang.String p0) { return null; }
        public static final android.net.Uri getContentUriForPath(java.lang.String p0) { return null; }

        public static interface FileColumns extends android.provider.MediaStore.MediaColumns {
            @java.lang.Deprecated
            @android.annotation.UnsupportedAppUsage
            public static final java.lang.String STORAGE_ID = "storage_id";
            @android.provider.Column(value=1, readOnly=true)
            @android.annotation.UnsupportedAppUsage
            public static final java.lang.String FORMAT = "format";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String PARENT = "parent";
            @android.provider.Column(3)
            public static final java.lang.String MIME_TYPE = "mime_type";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String TITLE = "title";
            @android.provider.Column(1)
            public static final java.lang.String MEDIA_TYPE = "media_type";
            public static final int MEDIA_TYPE_NONE = 0;
            public static final int MEDIA_TYPE_IMAGE = 1;
            public static final int MEDIA_TYPE_AUDIO = 2;
            public static final int MEDIA_TYPE_VIDEO = 3;
            public static final int MEDIA_TYPE_PLAYLIST = 4;
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_DOWNLOAD = "is_download";
        }
    }

    public static final class Downloads implements android.provider.MediaStore.DownloadColumns {
        public static final android.net.Uri INTERNAL_CONTENT_URI = null;
        public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/download";
        public static final java.util.regex.Pattern PATTERN_DOWNLOADS_FILE = null;
        private static final java.util.regex.Pattern PATTERN_DOWNLOADS_DIRECTORY = null;
        private Downloads() {}
        public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
        public static android.net.Uri getContentUriForPath(java.lang.String p0) { return null; }
        public static boolean isDownload(java.lang.String p0) { return false; }
        public static boolean isDownloadDir(java.lang.String p0) { return false; }
    }

    public static interface DownloadColumns extends android.provider.MediaStore.MediaColumns {
        @android.provider.Column(3)
        public static final java.lang.String DOWNLOAD_URI = "download_uri";
        @android.provider.Column(3)
        public static final java.lang.String REFERER_URI = "referer_uri";
        @java.lang.Deprecated
        @android.provider.Column(3)
        public static final java.lang.String DESCRIPTION = "description";
    }

    public static final class Audio {
        public Audio() {}
        public static java.lang.String keyFor(java.lang.String p0) { return null; }

        @java.lang.Deprecated
        public static class Thumbnails implements android.provider.BaseColumns {
            @java.lang.Deprecated
            @android.provider.Column(3)
            public static final java.lang.String DATA = "_data";
            @android.provider.Column(1)
            public static final java.lang.String ALBUM_ID = "album_id";
            public Thumbnails() {}
        }

        public static final class Radio {
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/radio";
            private Radio() {}
        }

        public static interface PlaylistsColumns {
            @android.provider.Column(3)
            public static final java.lang.String NAME = "name";
            @java.lang.Deprecated
            @android.provider.Column(3)
            public static final java.lang.String DATA = "_data";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String DATE_ADDED = "date_added";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String DATE_MODIFIED = "date_modified";
        }

        public static final class Playlists implements android.provider.BaseColumns, android.provider.MediaStore.Audio.PlaylistsColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
            public static final java.lang.String DEFAULT_SORT_ORDER = "name";
            public Playlists() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }

            public static final class Members implements android.provider.MediaStore.Audio.AudioColumns {
                @android.provider.Column(1)
                public static final java.lang.String _ID = "_id";
                public static final java.lang.String CONTENT_DIRECTORY = "members";
                @android.provider.Column(1)
                public static final java.lang.String AUDIO_ID = "audio_id";
                @android.provider.Column(1)
                public static final java.lang.String PLAYLIST_ID = "playlist_id";
                @android.provider.Column(1)
                public static final java.lang.String PLAY_ORDER = "play_order";
                public static final java.lang.String DEFAULT_SORT_ORDER = "play_order";
                public Members() {}
                public static final android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
                public static final boolean moveItem(android.content.ContentResolver p0, long p1, int p2, int p3) { return false; }
            }
        }

        public static final class Media implements android.provider.MediaStore.Audio.AudioColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/audio";
            public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";
            public static final java.lang.String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";
            public static final java.lang.String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";
            public Media() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
            @java.lang.Deprecated
            public static android.net.Uri getContentUriForPath(java.lang.String p0) { return null; }
        }

        public static interface GenresColumns {
            @android.provider.Column(3)
            public static final java.lang.String NAME = "name";
        }

        public static final class Genres implements android.provider.BaseColumns, android.provider.MediaStore.Audio.GenresColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
            public static final java.lang.String DEFAULT_SORT_ORDER = "name";
            public Genres() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            public static android.net.Uri getContentUriForAudioId(java.lang.String p0, int p1) { return null; }

            public static final class Members implements android.provider.MediaStore.Audio.AudioColumns {
                public static final java.lang.String CONTENT_DIRECTORY = "members";
                public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";
                @android.provider.Column(1)
                public static final java.lang.String AUDIO_ID = "audio_id";
                @android.provider.Column(1)
                public static final java.lang.String GENRE_ID = "genre_id";
                public Members() {}
                public static final android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
            }
        }

        public static interface AudioColumns extends android.provider.MediaStore.MediaColumns {
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String TITLE_KEY = "title_key";
            public static final java.lang.String DURATION = "duration";
            @android.provider.Column(1)
            public static final java.lang.String BOOKMARK = "bookmark";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String ARTIST_ID = "artist_id";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ARTIST = "artist";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ALBUM_ARTIST = "album_artist";
            @java.lang.Deprecated
            public static final java.lang.String COMPILATION = "compilation";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ARTIST_KEY = "artist_key";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String COMPOSER = "composer";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String ALBUM_ID = "album_id";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ALBUM = "album";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ALBUM_KEY = "album_key";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String TRACK = "track";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String YEAR = "year";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_MUSIC = "is_music";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_PODCAST = "is_podcast";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_RINGTONE = "is_ringtone";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_ALARM = "is_alarm";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_NOTIFICATION = "is_notification";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String IS_AUDIOBOOK = "is_audiobook";
            @java.lang.Deprecated
            public static final java.lang.String GENRE = "genre";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String TITLE_RESOURCE_URI = "title_resource_uri";
        }

        public static final class Artists implements android.provider.BaseColumns, android.provider.MediaStore.Audio.ArtistColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
            public static final java.lang.String DEFAULT_SORT_ORDER = "artist_key";
            public Artists() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }

            public static final class Albums implements android.provider.MediaStore.Audio.AlbumColumns {
                public Albums() {}
                public static final android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
            }
        }

        public static interface ArtistColumns {
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ARTIST = "artist";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ARTIST_KEY = "artist_key";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String NUMBER_OF_ALBUMS = "number_of_albums";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String NUMBER_OF_TRACKS = "number_of_tracks";
        }

        public static final class Albums implements android.provider.BaseColumns, android.provider.MediaStore.Audio.AlbumColumns {
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
            public static final java.lang.String DEFAULT_SORT_ORDER = "album_key";
            public Albums() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        }

        public static interface AlbumColumns {
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String ALBUM_ID = "album_id";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ALBUM = "album";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String ARTIST_ID = "artist_id";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ARTIST = "artist";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String NUMBER_OF_SONGS = "numsongs";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String FIRST_YEAR = "minyear";
            @android.provider.Column(value=1, readOnly=true)
            public static final java.lang.String LAST_YEAR = "maxyear";
            @android.provider.Column(value=3, readOnly=true)
            public static final java.lang.String ALBUM_KEY = "album_key";
            @java.lang.Deprecated
            @android.provider.Column(3)
            public static final java.lang.String ALBUM_ART = "album_art";
        }
    }
}
