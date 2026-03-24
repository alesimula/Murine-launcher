package android.text;

public class ClientFlags {
    public ClientFlags() {}
    public static boolean noBreakNoHyphenationSpan() { return false; }
    public static boolean phraseStrictFallback() { return false; }
    public static boolean useBoundsForWidth() { return false; }
    public static boolean fixLineHeightForLocale() { return false; }
    public static boolean icuBidiMigration() { return false; }
    public static boolean fixMisalignedContextMenu() { return false; }
}
