package android.content.pm;

public class AppSearchShortcutInfo extends android.app.appsearch.GenericDocument {
    public static final java.lang.String SCHEMA_TYPE = "Shortcut";
    public static final int SCHEMA_VERSION = 2;
    public static final java.lang.String KEY_ACTIVITY = "activity";
    public static final java.lang.String KEY_SHORT_LABEL = "shortLabel";
    public static final java.lang.String KEY_SHORT_LABEL_RES_ID = "shortLabelResId";
    public static final java.lang.String KEY_SHORT_LABEL_RES_NAME = "shortLabelResName";
    public static final java.lang.String KEY_LONG_LABEL = "longLabel";
    public static final java.lang.String KEY_LONG_LABEL_RES_ID = "longLabelResId";
    public static final java.lang.String KEY_LONG_LABEL_RES_NAME = "longLabelResName";
    public static final java.lang.String KEY_DISABLED_MESSAGE = "disabledMessage";
    public static final java.lang.String KEY_DISABLED_MESSAGE_RES_ID = "disabledMessageResId";
    public static final java.lang.String KEY_DISABLED_MESSAGE_RES_NAME = "disabledMessageResName";
    public static final java.lang.String KEY_CATEGORIES = "categories";
    public static final java.lang.String KEY_INTENTS = "intents";
    public static final java.lang.String KEY_INTENT_PERSISTABLE_EXTRAS = "intentPersistableExtras";
    public static final java.lang.String KEY_PERSON = "person";
    public static final java.lang.String KEY_LOCUS_ID = "locusId";
    public static final java.lang.String KEY_RANK = "rank";
    public static final java.lang.String KEY_IMPLICIT_RANK = "implicitRank";
    public static final java.lang.String KEY_EXTRAS = "extras";
    public static final java.lang.String KEY_FLAGS = "flags";
    public static final java.lang.String KEY_ICON_RES_ID = "iconResId";
    public static final java.lang.String KEY_ICON_RES_NAME = "iconResName";
    public static final java.lang.String KEY_ICON_URI = "iconUri";
    public static final java.lang.String KEY_BITMAP_PATH = "bitmapPath";
    public static final java.lang.String KEY_DISABLED_REASON = "disabledReason";
    public static final android.app.appsearch.AppSearchSchema SCHEMA = null;
    private static final java.lang.String IS_DYNAMIC = "Dyn";
    private static final java.lang.String NOT_DYNAMIC = "nDyn";
    private static final java.lang.String IS_PINNED = "Pin";
    private static final java.lang.String NOT_PINNED = "nPin";
    private static final java.lang.String HAS_ICON_RES = "IcR";
    private static final java.lang.String NO_ICON_RES = "nIcR";
    private static final java.lang.String HAS_ICON_FILE = "IcF";
    private static final java.lang.String NO_ICON_FILE = "nIcF";
    private static final java.lang.String IS_KEY_FIELD_ONLY = "Key";
    private static final java.lang.String NOT_KEY_FIELD_ONLY = "nKey";
    private static final java.lang.String IS_MANIFEST = "Man";
    private static final java.lang.String NOT_MANIFEST = "nMan";
    private static final java.lang.String IS_DISABLED = "Dis";
    private static final java.lang.String NOT_DISABLED = "nDis";
    private static final java.lang.String ARE_STRINGS_RESOLVED = "Str";
    private static final java.lang.String NOT_STRINGS_RESOLVED = "nStr";
    private static final java.lang.String IS_IMMUTABLE = "Im";
    private static final java.lang.String NOT_IMMUTABLE = "nIm";
    private static final java.lang.String HAS_ADAPTIVE_BITMAP = "IcA";
    private static final java.lang.String NO_ADAPTIVE_BITMAP = "nIcA";
    private static final java.lang.String IS_RETURNED_BY_SERVICE = "Rets";
    private static final java.lang.String NOT_RETURNED_BY_SERVICE = "nRets";
    private static final java.lang.String HAS_ICON_FILE_PENDING_SAVE = "Pens";
    private static final java.lang.String NO_ICON_FILE_PENDING_SAVE = "nPens";
    private static final java.lang.String IS_SHADOW = "Sdw";
    private static final java.lang.String NOT_SHADOW = "nSdw";
    private static final java.lang.String IS_LONG_LIVED = "Liv";
    private static final java.lang.String NOT_LONG_LIVED = "nLiv";
    private static final java.lang.String HAS_ICON_URI = "IcU";
    private static final java.lang.String NO_ICON_URI = "nIcU";
    private static final java.lang.String IS_CACHED_NOTIFICATION = "CaN";
    private static final java.lang.String NOT_CACHED_NOTIFICATION = "nCaN";
    private static final java.lang.String IS_CACHED_BUBBLE = "CaB";
    private static final java.lang.String NOT_CACHED_BUBBLE = "nCaB";
    private static final java.lang.String IS_CACHED_PEOPLE_TITLE = "CaPT";
    private static final java.lang.String NOT_CACHED_PEOPLE_TITLE = "nCaPT";
    private static final java.lang.String HAS_BITMAP_PATH = "hBiP";
    private static final java.lang.String HAS_STRING_RESOURCE = "hStr";
    private static final java.lang.String HAS_NON_ZERO_RANK = "hRan";
    public static final java.lang.String QUERY_IS_DYNAMIC = "flags:Dyn";
    public static final java.lang.String QUERY_IS_NOT_DYNAMIC = "flags:nDyn";
    public static final java.lang.String QUERY_IS_PINNED = "flags:Pin";
    public static final java.lang.String QUERY_IS_NOT_PINNED = "flags:nPin";
    public static final java.lang.String QUERY_IS_MANIFEST = "flags:Man";
    public static final java.lang.String QUERY_IS_NOT_MANIFEST = "flags:nMan";
    public static final java.lang.String QUERY_IS_PINNED_AND_ENABLED = "(flags:Pin flags:nDis)";
    public static final java.lang.String QUERY_IS_CACHED = "(flags:CaN OR flags:CaB OR flags:CaPT)";
    public static final java.lang.String QUERY_IS_NOT_CACHED = "(flags:nCaN flags:nCaB flags:nCaPT)";
    public static final java.lang.String QUERY_IS_FLOATING = "((Pin OR (flags:CaN OR flags:CaB OR flags:CaPT)) flags:nDyn flags:nMan)";
    public static final java.lang.String QUERY_IS_NOT_FLOATING = "((flags:nPin (flags:nCaN flags:nCaB flags:nCaPT)) OR flags:Dyn OR flags:Man)";
    public static final java.lang.String QUERY_IS_VISIBLE_TO_PUBLISHER = "(disabledReason:0 OR disabledReason:1 OR disabledReason:2 OR disabledReason:3)";
    public static final java.lang.String QUERY_DISABLED_REASON_VERSION_LOWER = "disabledReason:100";
    public static final java.lang.String QUERY_IS_NON_MANIFEST_VISIBLE = "(flags:nMan (disabledReason:0 OR disabledReason:1 OR disabledReason:2 OR disabledReason:3) (flags:Pin OR (flags:CaN OR flags:CaB OR flags:CaPT) OR flags:Dyn))";
    public static final java.lang.String QUERY_IS_VISIBLE_CACHED_OR_PINNED = "((disabledReason:0 OR disabledReason:1 OR disabledReason:2 OR disabledReason:3) flags:Dyn ((flags:CaN OR flags:CaB OR flags:CaPT) OR flags:Pin))";
    public static final java.lang.String QUERY_IS_VISIBLE_PINNED_ONLY = "((disabledReason:0 OR disabledReason:1 OR disabledReason:2 OR disabledReason:3) flags:Pin (flags:nCaN flags:nCaB flags:nCaPT) flags:nDyn flags:nMan)";
    public static final java.lang.String QUERY_HAS_BITMAP_PATH = "flags:hBiP";
    public static final java.lang.String QUERY_HAS_STRING_RESOURCE = "flags:hStr";
    public static final java.lang.String QUERY_HAS_NON_ZERO_RANK = "flags:hRan";
    public static final java.lang.String QUERY_IS_FLOATING_AND_HAS_RANK = "(((Pin OR (flags:CaN OR flags:CaB OR flags:CaPT)) flags:nDyn flags:nMan) flags:hRan)";
    public AppSearchShortcutInfo(android.app.appsearch.GenericDocument p0) { super((android.os.Bundle)null); }
    public static android.content.pm.AppSearchShortcutInfo instance(android.content.pm.ShortcutInfo p0) { return null; }
    public android.content.pm.ShortcutInfo toShortcutInfo(int p0) { return null; }
    public static java.util.List<android.app.appsearch.GenericDocument> toGenericDocuments(java.util.Collection<android.content.pm.ShortcutInfo> p0) { return null; }
    private static byte[] transformToByteArray(android.os.PersistableBundle p0) { return null; }
    private android.os.Bundle transformToBundle(byte[] p0) { return null; }
    private android.os.PersistableBundle transformToPersistableBundle(byte[] p0) { return null; }
    private static java.lang.String[] flattenFlags(int p0) { return null; }
    private static java.lang.String flagToString(int p0, int p1) { return null; }
    private static int parseFlags(java.lang.String[] p0) { return 0; }
    private static int parseFlag(java.lang.String p0) { return 0; }
    private static android.app.Person[] parsePerson(android.app.appsearch.GenericDocument[] p0) { return null; }

    public static class Builder extends android.app.appsearch.GenericDocument.Builder<android.content.pm.AppSearchShortcutInfo.Builder> {
        private java.util.List<java.lang.String> mFlags;
        private boolean mHasStringResource;
        public Builder(java.lang.String p0, java.lang.String p1) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
        public android.content.pm.AppSearchShortcutInfo.Builder setLocusId(android.content.LocusId p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setActivity(android.content.ComponentName p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setShortLabel(java.lang.CharSequence p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setShortLabelResId(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setShortLabelResName(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setLongLabel(java.lang.CharSequence p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setLongLabelResId(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setLongLabelResName(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setDisabledMessage(java.lang.CharSequence p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setDisabledMessageResId(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setDisabledMessageResName(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setCategories(java.util.Set<java.lang.String> p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIntent(android.content.Intent p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIntents(android.content.Intent[] p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setPerson(android.app.Person p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setPersons(android.app.Person[] p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setRank(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setImplicitRank(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setFlags(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIconResId(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIconResName(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setBitmapPath(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIconUri(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setDisabledReason(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo build() { return null; }
    }
}
