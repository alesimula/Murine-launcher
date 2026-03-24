package android.provider;

public final class CloudMediaProviderContract {
    public static final java.lang.String EXTRA_ALBUM_ID = "android.provider.extra.ALBUM_ID";
    public static final java.lang.String EXTRA_LOOPING_PLAYBACK_ENABLED = "android.provider.extra.LOOPING_PLAYBACK_ENABLED";
    public static final java.lang.String EXTRA_MEDIA_COLLECTION_ID = "android.provider.extra.MEDIA_COLLECTION_ID";
    public static final java.lang.String EXTRA_PAGE_TOKEN = "android.provider.extra.PAGE_TOKEN";
    public static final java.lang.String EXTRA_PREVIEW_THUMBNAIL = "android.provider.extra.PREVIEW_THUMBNAIL";
    public static final java.lang.String EXTRA_SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED = "android.provider.extra.SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED";
    public static final java.lang.String EXTRA_SYNC_GENERATION = "android.provider.extra.SYNC_GENERATION";
    public static final java.lang.String MANAGE_CLOUD_MEDIA_PROVIDERS_PERMISSION = "com.android.providers.media.permission.MANAGE_CLOUD_MEDIA_PROVIDERS";
    public static final java.lang.String PROVIDER_INTERFACE = "android.content.action.CLOUD_MEDIA_PROVIDER";

    public static final class AlbumColumns {
        public static final java.lang.String DATE_TAKEN_MILLIS = "date_taken_millis";
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String ID = "id";
        public static final java.lang.String MEDIA_COUNT = "album_media_count";
        public static final java.lang.String MEDIA_COVER_ID = "album_media_cover_id";
    }

    public static final class MediaCollectionInfo {
        public static final java.lang.String ACCOUNT_CONFIGURATION_INTENT = "account_configuration_intent";
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String LAST_MEDIA_SYNC_GENERATION = "last_media_sync_generation";
        public static final java.lang.String MEDIA_COLLECTION_ID = "media_collection_id";
    }

    public static final class MediaColumns {
        public static final java.lang.String DATE_TAKEN_MILLIS = "date_taken_millis";
        public static final java.lang.String DURATION_MILLIS = "duration_millis";
        public static final java.lang.String ID = "id";
        public static final java.lang.String IS_FAVORITE = "is_favorite";
        public static final java.lang.String MEDIA_STORE_URI = "media_store_uri";
        public static final java.lang.String MIME_TYPE = "mime_type";
        public static final java.lang.String SIZE_BYTES = "size_bytes";
        public static final java.lang.String STANDARD_MIME_TYPE_EXTENSION = "standard_mime_type_extension";
        public static final int STANDARD_MIME_TYPE_EXTENSION_ANIMATED_WEBP = 3;
        public static final int STANDARD_MIME_TYPE_EXTENSION_GIF = 1;
        public static final int STANDARD_MIME_TYPE_EXTENSION_MOTION_PHOTO = 2;
        public static final int STANDARD_MIME_TYPE_EXTENSION_NONE = 0;
        public static final java.lang.String SYNC_GENERATION = "sync_generation";
    }
}
