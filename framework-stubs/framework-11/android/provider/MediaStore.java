package android.provider;

public final class MediaStore {
    public static final java.lang.String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";
    public static final java.lang.String ACTION_IMAGE_CAPTURE_SECURE = "android.media.action.IMAGE_CAPTURE_SECURE";
    public static final java.lang.String ACTION_REVIEW = "android.provider.action.REVIEW";
    public static final java.lang.String ACTION_REVIEW_SECURE = "android.provider.action.REVIEW_SECURE";
    public static final java.lang.String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";
    public static final java.lang.String AUTHORITY = "media";
    public static final java.lang.String AUTHORITY_LEGACY = "media_legacy";
    @android.annotation.NonNull
    public static final android.net.Uri AUTHORITY_LEGACY_URI = null;
    @android.annotation.NonNull
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String EXTRA_BRIGHTNESS = "android.provider.extra.BRIGHTNESS";
    public static final java.lang.String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";
    public static final java.lang.String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";
    public static final java.lang.String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";
    public static final java.lang.String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";
    public static final java.lang.String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";
    public static final java.lang.String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";
    public static final java.lang.String EXTRA_MEDIA_GENRE = "android.intent.extra.genre";
    public static final java.lang.String EXTRA_MEDIA_PLAYLIST = "android.intent.extra.playlist";
    public static final java.lang.String EXTRA_MEDIA_RADIO_CHANNEL = "android.intent.extra.radio_channel";
    public static final java.lang.String EXTRA_MEDIA_TITLE = "android.intent.extra.title";
    public static final java.lang.String EXTRA_OUTPUT = "output";
    public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation";
    public static final java.lang.String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons";
    public static final java.lang.String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit";
    public static final java.lang.String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality";
    public static final java.lang.String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";
    public static final java.lang.String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH";
    @java.lang.Deprecated
    public static final java.lang.String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER";
    public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA";
    public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE = "android.media.action.STILL_IMAGE_CAMERA_SECURE";
    public static final java.lang.String INTENT_ACTION_TEXT_OPEN_FROM_SEARCH = "android.media.action.TEXT_OPEN_FROM_SEARCH";
    public static final java.lang.String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA";
    public static final java.lang.String INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH = "android.media.action.VIDEO_PLAY_FROM_SEARCH";
    public static final int MATCH_DEFAULT = 0;
    public static final int MATCH_EXCLUDE = 2;
    public static final int MATCH_INCLUDE = 1;
    public static final int MATCH_ONLY = 3;
    public static final java.lang.String MEDIA_IGNORE_FILENAME = ".nomedia";
    public static final java.lang.String MEDIA_SCANNER_VOLUME = "volume";
    public static final java.lang.String META_DATA_REVIEW_GALLERY_PREWARM_SERVICE = "android.media.review_gallery_prewarm_service";
    public static final java.lang.String META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE = "android.media.still_image_camera_preview_service";
    public static final java.lang.String QUERY_ARG_MATCH_FAVORITE = "android:query-arg-match-favorite";
    public static final java.lang.String QUERY_ARG_MATCH_PENDING = "android:query-arg-match-pending";
    public static final java.lang.String QUERY_ARG_MATCH_TRASHED = "android:query-arg-match-trashed";
    public static final java.lang.String QUERY_ARG_RELATED_URI = "android:query-arg-related-uri";
    public static final java.lang.String UNKNOWN_STRING = "<unknown>";
    public static final java.lang.String VOLUME_EXTERNAL = "external";
    public static final java.lang.String VOLUME_EXTERNAL_PRIMARY = "external_primary";
    public static final java.lang.String VOLUME_INTERNAL = "internal";
    public MediaStore() {}
    @java.lang.Deprecated
    @android.annotation.NonNull
    public static android.net.Uri setIncludePending(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.net.Uri setRequireOriginal(android.net.Uri p0) { return null; }
    public static boolean getRequireOriginal(android.net.Uri p0) { return false; }
    @android.annotation.NonNull
    public static android.net.Uri rewriteToLegacy(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.app.PendingIntent createWriteRequest(android.content.ContentResolver p0, java.util.Collection<android.net.Uri> p1) { return null; }
    @android.annotation.NonNull
    public static android.app.PendingIntent createTrashRequest(android.content.ContentResolver p0, java.util.Collection<android.net.Uri> p1, boolean p2) { return null; }
    @android.annotation.NonNull
    public static android.app.PendingIntent createFavoriteRequest(android.content.ContentResolver p0, java.util.Collection<android.net.Uri> p1, boolean p2) { return null; }
    @android.annotation.NonNull
    public static android.app.PendingIntent createDeleteRequest(android.content.ContentResolver p0, java.util.Collection<android.net.Uri> p1) { return null; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.String> getExternalVolumeNames(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.String> getRecentExternalVolumeNames(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getVolumeName(android.net.Uri p0) { return null; }
    public static android.net.Uri getMediaScannerUri() { return null; }
    @android.annotation.NonNull
    public static java.lang.String getVersion(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getVersion(android.content.Context p0, java.lang.String p1) { return null; }
    public static long getGeneration(android.content.Context p0, java.lang.String p1) { return 0L; }
    @android.annotation.Nullable
    public static android.net.Uri getDocumentUri(android.content.Context p0, android.net.Uri p1) { return null; }
    @android.annotation.Nullable
    public static android.net.Uri getMediaUri(android.content.Context p0, android.net.Uri p1) { return null; }
    public static void waitForIdle(android.content.ContentResolver p0) {}
    @android.annotation.NonNull
    public static android.net.Uri scanFile(android.content.ContentResolver p0, java.io.File p1) { return null; }
    public static void scanVolume(android.content.ContentResolver p0, java.lang.String p1) {}

    public static final class Audio {
        public Audio() {}
        @java.lang.Deprecated
        @android.annotation.Nullable
        public static java.lang.String keyFor(java.lang.String p0) { return null; }

        public static interface AlbumColumns {
            public static final java.lang.String ALBUM = "album";
            @java.lang.Deprecated
            public static final java.lang.String ALBUM_ART = "album_art";
            public static final java.lang.String ALBUM_ID = "album_id";
            @java.lang.Deprecated
            public static final java.lang.String ALBUM_KEY = "album_key";
            public static final java.lang.String ARTIST = "artist";
            public static final java.lang.String ARTIST_ID = "artist_id";
            @java.lang.Deprecated
            public static final java.lang.String ARTIST_KEY = "artist_key";
            public static final java.lang.String FIRST_YEAR = "minyear";
            public static final java.lang.String LAST_YEAR = "maxyear";
            public static final java.lang.String NUMBER_OF_SONGS = "numsongs";
            public static final java.lang.String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";
        }

        public static final class Albums implements android.provider.BaseColumns, android.provider.MediaStore.Audio.AlbumColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
            public static final java.lang.String DEFAULT_SORT_ORDER = "album_key";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public Albums() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        }

        public static interface ArtistColumns {
            public static final java.lang.String ARTIST = "artist";
            @java.lang.Deprecated
            public static final java.lang.String ARTIST_KEY = "artist_key";
            public static final java.lang.String NUMBER_OF_ALBUMS = "number_of_albums";
            public static final java.lang.String NUMBER_OF_TRACKS = "number_of_tracks";
        }

        public static final class Artists implements android.provider.BaseColumns, android.provider.MediaStore.Audio.ArtistColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
            public static final java.lang.String DEFAULT_SORT_ORDER = "artist_key";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public Artists() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }

            public static final class Albums implements android.provider.MediaStore.Audio.AlbumColumns {
                public Albums() {}
                public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
            }
        }

        public static interface AudioColumns extends android.provider.MediaStore.MediaColumns {
            public static final java.lang.String ALBUM_ID = "album_id";
            @java.lang.Deprecated
            public static final java.lang.String ALBUM_KEY = "album_key";
            public static final java.lang.String ARTIST_ID = "artist_id";
            @java.lang.Deprecated
            public static final java.lang.String ARTIST_KEY = "artist_key";
            public static final java.lang.String BOOKMARK = "bookmark";
            public static final java.lang.String GENRE = "genre";
            public static final java.lang.String GENRE_ID = "genre_id";
            @java.lang.Deprecated
            public static final java.lang.String GENRE_KEY = "genre_key";
            public static final java.lang.String IS_ALARM = "is_alarm";
            public static final java.lang.String IS_AUDIOBOOK = "is_audiobook";
            public static final java.lang.String IS_MUSIC = "is_music";
            public static final java.lang.String IS_NOTIFICATION = "is_notification";
            public static final java.lang.String IS_PODCAST = "is_podcast";
            public static final java.lang.String IS_RINGTONE = "is_ringtone";
            @java.lang.Deprecated
            public static final java.lang.String TITLE_KEY = "title_key";
            public static final java.lang.String TITLE_RESOURCE_URI = "title_resource_uri";
            public static final java.lang.String TRACK = "track";
            public static final java.lang.String YEAR = "year";
        }

        public static final class Genres implements android.provider.BaseColumns, android.provider.MediaStore.Audio.GenresColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
            public static final java.lang.String DEFAULT_SORT_ORDER = "name";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public Genres() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            public static android.net.Uri getContentUriForAudioId(java.lang.String p0, int p1) { return null; }

            public static final class Members implements android.provider.MediaStore.Audio.AudioColumns {
                public static final java.lang.String AUDIO_ID = "audio_id";
                public static final java.lang.String CONTENT_DIRECTORY = "members";
                public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";
                public static final java.lang.String GENRE_ID = "genre_id";
                public Members() {}
                public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
            }
        }

        public static interface GenresColumns {
            public static final java.lang.String NAME = "name";
        }

        public static final class Media implements android.provider.MediaStore.Audio.AudioColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
            public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/audio";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final java.lang.String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public static final java.lang.String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";
            public Media() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
            @java.lang.Deprecated
            @android.annotation.Nullable
            public static android.net.Uri getContentUriForPath(java.lang.String p0) { return null; }
        }

        public static final class Playlists implements android.provider.BaseColumns, android.provider.MediaStore.Audio.PlaylistsColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
            public static final java.lang.String DEFAULT_SORT_ORDER = "name";
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public Playlists() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }

            public static final class Members implements android.provider.MediaStore.Audio.AudioColumns {
                public static final java.lang.String AUDIO_ID = "audio_id";
                public static final java.lang.String CONTENT_DIRECTORY = "members";
                public static final java.lang.String DEFAULT_SORT_ORDER = "play_order";
                public static final java.lang.String PLAYLIST_ID = "playlist_id";
                public static final java.lang.String PLAY_ORDER = "play_order";
                public static final java.lang.String _ID = "_id";
                public Members() {}
                public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
                public static boolean moveItem(android.content.ContentResolver p0, long p1, int p2, int p3) { return false; }
            }
        }

        public static interface PlaylistsColumns extends android.provider.MediaStore.MediaColumns {
            @java.lang.Deprecated
            public static final java.lang.String DATA = "_data";
            public static final java.lang.String DATE_ADDED = "date_added";
            public static final java.lang.String DATE_MODIFIED = "date_modified";
            public static final java.lang.String NAME = "name";
        }

        public static final class Radio {
            public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/radio";
            private Radio() {}
        }
    }

    public static interface DownloadColumns extends android.provider.MediaStore.MediaColumns {
        public static final java.lang.String DOWNLOAD_URI = "download_uri";
        public static final java.lang.String REFERER_URI = "referer_uri";
    }

    public static final class Downloads implements android.provider.MediaStore.DownloadColumns {
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/download";
        @android.annotation.NonNull
        public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
        @android.annotation.NonNull
        public static final android.net.Uri INTERNAL_CONTENT_URI = null;
        private Downloads() {}
        @android.annotation.NonNull
        public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
    }

    public static final class Files {
        public Files() {}
        public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
        public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }

        public static interface FileColumns extends android.provider.MediaStore.MediaColumns {
            public static final java.lang.String MEDIA_TYPE = "media_type";
            public static final int MEDIA_TYPE_AUDIO = 2;
            public static final int MEDIA_TYPE_DOCUMENT = 6;
            public static final int MEDIA_TYPE_IMAGE = 1;
            public static final int MEDIA_TYPE_NONE = 0;
            public static final int MEDIA_TYPE_PLAYLIST = 4;
            public static final int MEDIA_TYPE_SUBTITLE = 5;
            public static final int MEDIA_TYPE_VIDEO = 3;
            public static final java.lang.String MIME_TYPE = "mime_type";
            public static final java.lang.String PARENT = "parent";
        }
    }

    public static final class Images {
        public Images() {}

        public static interface ImageColumns extends android.provider.MediaStore.MediaColumns {
            public static final java.lang.String DESCRIPTION = "description";
            public static final java.lang.String EXPOSURE_TIME = "exposure_time";
            public static final java.lang.String F_NUMBER = "f_number";
            public static final java.lang.String ISO = "iso";
            public static final java.lang.String IS_PRIVATE = "isprivate";
            @java.lang.Deprecated
            public static final java.lang.String LATITUDE = "latitude";
            @java.lang.Deprecated
            public static final java.lang.String LONGITUDE = "longitude";
            @java.lang.Deprecated
            public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";
            @java.lang.Deprecated
            public static final java.lang.String PICASA_ID = "picasa_id";
            public static final java.lang.String SCENE_CAPTURE_TYPE = "scene_capture_type";
        }

        public static final class Media implements android.provider.MediaStore.Images.ImageColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/image";
            public static final java.lang.String DEFAULT_SORT_ORDER = "bucket_display_name";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public Media() {}
            @java.lang.Deprecated
            public static android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2) { return null; }
            @java.lang.Deprecated
            public static android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4) { return null; }
            @java.lang.Deprecated
            public static android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2, java.lang.String p3, java.lang.String[] p4, java.lang.String p5) { return null; }
            @java.lang.Deprecated
            public static android.graphics.Bitmap getBitmap(android.content.ContentResolver p0, android.net.Uri p1) throws java.io.FileNotFoundException, java.io.IOException { return null; }
            @java.lang.Deprecated
            public static java.lang.String insertImage(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.FileNotFoundException { return null; }
            @java.lang.Deprecated
            public static java.lang.String insertImage(android.content.ContentResolver p0, android.graphics.Bitmap p1, java.lang.String p2, java.lang.String p3) { return null; }
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
        }

        @java.lang.Deprecated
        public static class Thumbnails implements android.provider.BaseColumns {
            @java.lang.Deprecated
            public static final java.lang.String DATA = "_data";
            @java.lang.Deprecated
            public static final java.lang.String DEFAULT_SORT_ORDER = "image_id ASC";
            @java.lang.Deprecated
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            @java.lang.Deprecated
            public static final int FULL_SCREEN_KIND = 2;
            @java.lang.Deprecated
            public static final java.lang.String HEIGHT = "height";
            @java.lang.Deprecated
            public static final java.lang.String IMAGE_ID = "image_id";
            @java.lang.Deprecated
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            @java.lang.Deprecated
            public static final java.lang.String KIND = "kind";
            @java.lang.Deprecated
            public static final int MICRO_KIND = 3;
            @java.lang.Deprecated
            public static final int MINI_KIND = 1;
            @java.lang.Deprecated
            public static final java.lang.String THUMB_DATA = "thumb_data";
            @java.lang.Deprecated
            public static final java.lang.String WIDTH = "width";
            @java.lang.Deprecated
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
            @java.lang.Deprecated
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            @java.lang.Deprecated
            @android.annotation.NonNull
            public static android.util.Size getKindSize(int p0) { return null; }
        }
    }

    public static interface MediaColumns extends android.provider.BaseColumns {
        public static final java.lang.String ALBUM = "album";
        public static final java.lang.String ALBUM_ARTIST = "album_artist";
        public static final java.lang.String ARTIST = "artist";
        public static final java.lang.String AUTHOR = "author";
        public static final java.lang.String BITRATE = "bitrate";
        public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";
        public static final java.lang.String BUCKET_ID = "bucket_id";
        public static final java.lang.String CAPTURE_FRAMERATE = "capture_framerate";
        public static final java.lang.String CD_TRACK_NUMBER = "cd_track_number";
        public static final java.lang.String COMPILATION = "compilation";
        public static final java.lang.String COMPOSER = "composer";
        @java.lang.Deprecated
        public static final java.lang.String DATA = "_data";
        public static final java.lang.String DATE_ADDED = "date_added";
        public static final java.lang.String DATE_EXPIRES = "date_expires";
        public static final java.lang.String DATE_MODIFIED = "date_modified";
        public static final java.lang.String DATE_TAKEN = "datetaken";
        public static final java.lang.String DISC_NUMBER = "disc_number";
        public static final java.lang.String DISPLAY_NAME = "_display_name";
        public static final java.lang.String DOCUMENT_ID = "document_id";
        public static final java.lang.String DURATION = "duration";
        public static final java.lang.String GENERATION_ADDED = "generation_added";
        public static final java.lang.String GENERATION_MODIFIED = "generation_modified";
        public static final java.lang.String GENRE = "genre";
        public static final java.lang.String HEIGHT = "height";
        public static final java.lang.String INSTANCE_ID = "instance_id";
        public static final java.lang.String IS_DOWNLOAD = "is_download";
        public static final java.lang.String IS_DRM = "is_drm";
        public static final java.lang.String IS_FAVORITE = "is_favorite";
        public static final java.lang.String IS_PENDING = "is_pending";
        public static final java.lang.String IS_TRASHED = "is_trashed";
        public static final java.lang.String MIME_TYPE = "mime_type";
        public static final java.lang.String NUM_TRACKS = "num_tracks";
        public static final java.lang.String ORIENTATION = "orientation";
        public static final java.lang.String ORIGINAL_DOCUMENT_ID = "original_document_id";
        public static final java.lang.String OWNER_PACKAGE_NAME = "owner_package_name";
        public static final java.lang.String RELATIVE_PATH = "relative_path";
        public static final java.lang.String RESOLUTION = "resolution";
        public static final java.lang.String SIZE = "_size";
        public static final java.lang.String TITLE = "title";
        public static final java.lang.String VOLUME_NAME = "volume_name";
        public static final java.lang.String WIDTH = "width";
        public static final java.lang.String WRITER = "writer";
        public static final java.lang.String XMP = "xmp";
        public static final java.lang.String YEAR = "year";
    }

    public static final class Video {
        public static final java.lang.String DEFAULT_SORT_ORDER = "_display_name";
        public Video() {}
        @java.lang.Deprecated
        public static android.database.Cursor query(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String[] p2) { return null; }

        public static final class Media implements android.provider.MediaStore.Video.VideoColumns {
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/video";
            public static final java.lang.String DEFAULT_SORT_ORDER = "title";
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            public Media() {}
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public static android.net.Uri getContentUri(java.lang.String p0, long p1) { return null; }
        }

        @java.lang.Deprecated
        public static class Thumbnails implements android.provider.BaseColumns {
            @java.lang.Deprecated
            public static final java.lang.String DATA = "_data";
            @java.lang.Deprecated
            public static final java.lang.String DEFAULT_SORT_ORDER = "video_id ASC";
            @java.lang.Deprecated
            public static final android.net.Uri EXTERNAL_CONTENT_URI = null;
            @java.lang.Deprecated
            public static final int FULL_SCREEN_KIND = 2;
            @java.lang.Deprecated
            public static final java.lang.String HEIGHT = "height";
            @java.lang.Deprecated
            public static final android.net.Uri INTERNAL_CONTENT_URI = null;
            @java.lang.Deprecated
            public static final java.lang.String KIND = "kind";
            @java.lang.Deprecated
            public static final int MICRO_KIND = 3;
            @java.lang.Deprecated
            public static final int MINI_KIND = 1;
            @java.lang.Deprecated
            public static final java.lang.String VIDEO_ID = "video_id";
            @java.lang.Deprecated
            public static final java.lang.String WIDTH = "width";
            @java.lang.Deprecated
            public Thumbnails() {}
            @java.lang.Deprecated
            public static void cancelThumbnailRequest(android.content.ContentResolver p0, long p1) {}
            @java.lang.Deprecated
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, long p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }
            @java.lang.Deprecated
            public static void cancelThumbnailRequest(android.content.ContentResolver p0, long p1, long p2) {}
            @java.lang.Deprecated
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver p0, long p1, long p2, int p3, android.graphics.BitmapFactory.Options p4) { return null; }
            @java.lang.Deprecated
            public static android.net.Uri getContentUri(java.lang.String p0) { return null; }
            @java.lang.Deprecated
            @android.annotation.NonNull
            public static android.util.Size getKindSize(int p0) { return null; }
        }

        public static interface VideoColumns extends android.provider.MediaStore.MediaColumns {
            public static final java.lang.String BOOKMARK = "bookmark";
            public static final java.lang.String CATEGORY = "category";
            public static final java.lang.String COLOR_RANGE = "color_range";
            public static final java.lang.String COLOR_STANDARD = "color_standard";
            public static final java.lang.String COLOR_TRANSFER = "color_transfer";
            public static final java.lang.String DESCRIPTION = "description";
            public static final java.lang.String IS_PRIVATE = "isprivate";
            public static final java.lang.String LANGUAGE = "language";
            @java.lang.Deprecated
            public static final java.lang.String LATITUDE = "latitude";
            @java.lang.Deprecated
            public static final java.lang.String LONGITUDE = "longitude";
            @java.lang.Deprecated
            public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";
            public static final java.lang.String TAGS = "tags";
        }
    }
}
