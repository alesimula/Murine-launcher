package android.provider;

public final class CloudMediaProviderContract {
    public static final java.lang.String EXTRA_ALBUM_ID = "android.provider.extra.ALBUM_ID";
    public static final java.lang.String EXTRA_LOOPING_PLAYBACK_ENABLED = "android.provider.extra.LOOPING_PLAYBACK_ENABLED";
    public static final java.lang.String EXTRA_MEDIA_COLLECTION_ID = "android.provider.extra.MEDIA_COLLECTION_ID";
    public static final java.lang.String EXTRA_PAGE_SIZE = "android.provider.extra.PAGE_SIZE";
    public static final java.lang.String EXTRA_PAGE_TOKEN = "android.provider.extra.PAGE_TOKEN";
    public static final java.lang.String EXTRA_PREVIEW_THUMBNAIL = "android.provider.extra.PREVIEW_THUMBNAIL";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String EXTRA_SORT_ORDER = "android.provider.extra.SORT_ORDER";
    public static final java.lang.String EXTRA_SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED = "android.provider.extra.SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED";
    public static final java.lang.String EXTRA_SYNC_GENERATION = "android.provider.extra.SYNC_GENERATION";
    public static final java.lang.String MANAGE_CLOUD_MEDIA_PROVIDERS_PERMISSION = "com.android.providers.media.permission.MANAGE_CLOUD_MEDIA_PROVIDERS";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String MEDIA_CATEGORY_TYPE_PEOPLE_AND_PETS = "com.android.providers.media.MEDIA_CATEGORY_TYPE_PEOPLE_AND_PETS";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_provider_albums_as_category_api")
    public static final java.lang.String MEDIA_CATEGORY_TYPE_USER_ALBUMS = "com.android.providers.media.MEDIA_CATEGORY_TYPE_USER_ALBUMS";
    public static final java.lang.String PROVIDER_INTERFACE = "android.content.action.CLOUD_MEDIA_PROVIDER";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String SEARCH_SUGGESTION_ALBUM = "com.android.providers.media.SEARCH_SUGGESTION_ALBUM";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String SEARCH_SUGGESTION_DATE = "com.android.providers.media.SEARCH_SUGGESTION_DATE";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String SEARCH_SUGGESTION_FACE = "com.android.providers.media.SEARCH_SUGGESTION_FACE";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String SEARCH_SUGGESTION_LOCATION = "com.android.providers.media.SEARCH_SUGGESTION_LOCATION";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final java.lang.String SEARCH_SUGGESTION_TEXT = "com.android.providers.media.SEARCH_SUGGESTION_TEXT";
    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final int SORT_ORDER_DESC_DATE_TAKEN = 1;
    CloudMediaProviderContract() {}

    public static final class AlbumColumns {
        public static final java.lang.String DATE_TAKEN_MILLIS = "date_taken_millis";
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String ID = "id";
        public static final java.lang.String MEDIA_COUNT = "album_media_count";
        public static final java.lang.String MEDIA_COVER_ID = "album_media_cover_id";
        AlbumColumns() {}
    }

    @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_cloud_media_provider_capabilities")
    public static final class Capabilities implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.provider.CloudMediaProviderContract.Capabilities> CREATOR = null;
        Capabilities() {}
        public int describeContents() { return 0; }
        @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_provider_albums_as_category_api")
        public boolean isAlbumsAsCategoryEnabled() { return false; }
        @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
        public boolean isMediaCategoriesEnabled() { return false; }
        @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
        public boolean isSearchEnabled() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_cloud_media_provider_capabilities")
        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.provider.CloudMediaProviderContract.Capabilities build() { return null; }
            @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_provider_albums_as_category_api")
            @android.annotation.NonNull
            public android.provider.CloudMediaProviderContract.Capabilities.Builder setAlbumsAsCategoryEnabled(boolean p0) { return null; }
            @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
            @android.annotation.NonNull
            public android.provider.CloudMediaProviderContract.Capabilities.Builder setMediaCategoriesEnabled(boolean p0) { return null; }
            @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
            @android.annotation.NonNull
            public android.provider.CloudMediaProviderContract.Capabilities.Builder setSearchEnabled(boolean p0) { return null; }
        }
    }

    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final class MediaCategoryColumns {
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String ID = "id";
        public static final java.lang.String MEDIA_CATEGORY_TYPE = "media_category_type";
        public static final java.lang.String MEDIA_COVER_ID1 = "media_cover_id1";
        public static final java.lang.String MEDIA_COVER_ID2 = "media_cover_id2";
        public static final java.lang.String MEDIA_COVER_ID3 = "media_cover_id3";
        public static final java.lang.String MEDIA_COVER_ID4 = "media_cover_id4";
        MediaCategoryColumns() {}
    }

    public static final class MediaCollectionInfo {
        public static final java.lang.String ACCOUNT_CONFIGURATION_INTENT = "account_configuration_intent";
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String LAST_MEDIA_SYNC_GENERATION = "last_media_sync_generation";
        public static final java.lang.String MEDIA_COLLECTION_ID = "media_collection_id";
        MediaCollectionInfo() {}
    }

    public static final class MediaColumns {
        public static final java.lang.String DATE_TAKEN_MILLIS = "date_taken_millis";
        public static final java.lang.String DURATION_MILLIS = "duration_millis";
        public static final java.lang.String HEIGHT = "height";
        public static final java.lang.String ID = "id";
        public static final java.lang.String IS_FAVORITE = "is_favorite";
        public static final java.lang.String MEDIA_STORE_URI = "media_store_uri";
        public static final java.lang.String MIME_TYPE = "mime_type";
        public static final java.lang.String ORIENTATION = "orientation";
        public static final java.lang.String SIZE_BYTES = "size_bytes";
        public static final java.lang.String STANDARD_MIME_TYPE_EXTENSION = "standard_mime_type_extension";
        public static final int STANDARD_MIME_TYPE_EXTENSION_ANIMATED_WEBP = 3;
        public static final int STANDARD_MIME_TYPE_EXTENSION_GIF = 1;
        public static final int STANDARD_MIME_TYPE_EXTENSION_MOTION_PHOTO = 2;
        public static final int STANDARD_MIME_TYPE_EXTENSION_NONE = 0;
        public static final java.lang.String SYNC_GENERATION = "sync_generation";
        public static final java.lang.String WIDTH = "width";
        MediaColumns() {}
    }

    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final class MediaSetColumns {
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String ID = "id";
        public static final java.lang.String MEDIA_COUNT = "media_count";
        public static final java.lang.String MEDIA_COVER_ID = "media_cover_id";
        MediaSetColumns() {}
    }

    @android.annotation.FlaggedApi("com.android.providers.media.flags.cloud_media_provider_search")
    public static final class SearchSuggestionColumns {
        public static final java.lang.String DISPLAY_TEXT = "display_text";
        public static final java.lang.String MEDIA_COVER_ID = "media_cover_id";
        public static final java.lang.String MEDIA_SET_ID = "media_set_id";
        public static final java.lang.String TYPE = "type";
        SearchSuggestionColumns() {}
    }
}
