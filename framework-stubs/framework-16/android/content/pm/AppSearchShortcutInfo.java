package android.content.pm;

public class AppSearchShortcutInfo extends android.app.appsearch.GenericDocument {
    public static final long SHORTCUT_TTL = Long.valueOf(0L);
    public static final java.lang.String SCHEMA_TYPE = "Shortcut";
    public static final int SCHEMA_VERSION = 3;
    public static final java.lang.String KEY_ACTIVITY = "activity";
    public static final java.lang.String KEY_SHORT_LABEL = "shortLabel";
    public static final java.lang.String KEY_LONG_LABEL = "longLabel";
    public static final java.lang.String KEY_DISABLED_MESSAGE = "disabledMessage";
    public static final java.lang.String KEY_CATEGORIES = "categories";
    public static final java.lang.String KEY_INTENTS = "intents";
    public static final java.lang.String KEY_INTENT_PERSISTABLE_EXTRAS = "intentPersistableExtras";
    public static final java.lang.String KEY_PERSON = "person";
    public static final java.lang.String KEY_LOCUS_ID = "locusId";
    public static final java.lang.String KEY_EXTRAS = "extras";
    public static final java.lang.String KEY_FLAGS = "flags";
    public static final java.lang.String KEY_ICON_RES_ID = "iconResId";
    public static final java.lang.String KEY_ICON_RES_NAME = "iconResName";
    public static final java.lang.String KEY_ICON_URI = "iconUri";
    public static final java.lang.String KEY_DISABLED_REASON = "disabledReason";
    public static final java.lang.String KEY_CAPABILITY = "capability";
    public static final java.lang.String KEY_CAPABILITY_BINDINGS = "capabilityBindings";
    public static final android.app.appsearch.AppSearchSchema SCHEMA = null;
    public static final java.lang.String IS_DYNAMIC = "Dyn";
    public static final java.lang.String NOT_DYNAMIC = "nDyn";
    public static final java.lang.String IS_MANIFEST = "Man";
    public static final java.lang.String NOT_MANIFEST = "nMan";
    public static final java.lang.String IS_DISABLED = "Dis";
    public static final java.lang.String NOT_DISABLED = "nDis";
    public static final java.lang.String IS_IMMUTABLE = "Im";
    public static final java.lang.String NOT_IMMUTABLE = "nIm";
    public AppSearchShortcutInfo(android.app.appsearch.GenericDocument p0) { super(null); }
    @android.annotation.NonNull
    public static android.content.pm.AppSearchShortcutInfo instance(android.content.pm.ShortcutInfo p0) { return null; }
    @android.annotation.NonNull
    public android.content.pm.ShortcutInfo toShortcutInfo(int p0) { return null; }
    @android.annotation.NonNull
    public static java.util.List<android.app.appsearch.GenericDocument> toGenericDocuments(java.util.Collection<android.content.pm.ShortcutInfo> p0) { return null; }

    public static class Builder extends android.app.appsearch.GenericDocument.Builder<android.content.pm.AppSearchShortcutInfo.Builder> {
        public Builder(java.lang.String p0, java.lang.String p1) { super((android.app.appsearch.GenericDocument)null); }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setLocusId(android.content.LocusId p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setActivity(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setShortLabel(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setLongLabel(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setDisabledMessage(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setCategories(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setIntent(android.content.Intent p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setIntents(android.content.Intent[] p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setPerson(android.app.Person p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setPersons(android.app.Person[] p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo.Builder setIconResId(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIconResName(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setIconUri(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setDisabledReason(int p0) { return null; }
        public android.content.pm.AppSearchShortcutInfo.Builder setCapabilityBindings(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.AppSearchShortcutInfo build() { return null; }
    }
}
