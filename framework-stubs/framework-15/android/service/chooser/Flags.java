package android.service.chooser;

public final class Flags {
    public static final java.lang.String FLAG_CHOOSER_ALBUM_TEXT = "android.service.chooser.chooser_album_text";
    public static final java.lang.String FLAG_CHOOSER_PAYLOAD_TOGGLING = "android.service.chooser.chooser_payload_toggling";
    public static final java.lang.String FLAG_ENABLE_CHOOSER_RESULT = "android.service.chooser.enable_chooser_result";
    public static final java.lang.String FLAG_ENABLE_SHARESHEET_METADATA_EXTRA = "android.service.chooser.enable_sharesheet_metadata_extra";
    public static final java.lang.String FLAG_FIX_RESOLVER_MEMORY_LEAK = "android.service.chooser.fix_resolver_memory_leak";
    public Flags() {}
    public static boolean chooserAlbumText() { return false; }
    public static boolean chooserPayloadToggling() { return false; }
    public static boolean enableChooserResult() { return false; }
    public static boolean enableSharesheetMetadataExtra() { return false; }
    public static boolean fixResolverMemoryLeak() { return false; }
}
