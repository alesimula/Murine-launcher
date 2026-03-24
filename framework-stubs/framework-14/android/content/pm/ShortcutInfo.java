package android.content.pm;

public final class ShortcutInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "Shortcut";
    public static final int RANK_CHANGED_BIT = -2147483648;
    public static final int RANK_NOT_SET = 2147483647;
    public static final int FLAG_DYNAMIC = 1;
    public static final int FLAG_PINNED = 2;
    public static final int FLAG_HAS_ICON_RES = 4;
    public static final int FLAG_HAS_ICON_FILE = 8;
    public static final int FLAG_KEY_FIELDS_ONLY = 16;
    public static final int FLAG_MANIFEST = 32;
    public static final int FLAG_DISABLED = 64;
    public static final int FLAG_STRINGS_RESOLVED = 128;
    public static final int FLAG_IMMUTABLE = 256;
    public static final int FLAG_ADAPTIVE_BITMAP = 512;
    public static final int FLAG_RETURNED_BY_SERVICE = 1024;
    public static final int FLAG_ICON_FILE_PENDING_SAVE = 2048;
    public static final int FLAG_SHADOW = 4096;
    public static final int FLAG_LONG_LIVED = 8192;
    public static final int FLAG_CACHED_NOTIFICATIONS = 16384;
    public static final int FLAG_HAS_ICON_URI = 32768;
    public static final int FLAG_CACHED_PEOPLE_TILE = 536870912;
    public static final int FLAG_CACHED_BUBBLES = 1073741824;
    public static final int FLAG_CACHED_ALL = 1610629120;
    public static final int CLONE_REMOVE_NON_KEY_INFO = 4;
    public static final int CLONE_REMOVE_RES_NAMES = 8;
    public static final int CLONE_REMOVE_PERSON = 16;
    public static final int CLONE_REMOVE_FOR_CREATOR = 9;
    public static final int CLONE_REMOVE_FOR_LAUNCHER = 27;
    public static final int CLONE_REMOVE_FOR_LAUNCHER_APPROVAL = 26;
    public static final int CLONE_REMOVE_FOR_APP_PREDICTION = 9;
    public static final int DISABLED_REASON_NOT_DISABLED = 0;
    public static final int DISABLED_REASON_BY_APP = 1;
    public static final int DISABLED_REASON_APP_CHANGED = 2;
    public static final int DISABLED_REASON_UNKNOWN = 3;
    public static final int DISABLED_REASON_VERSION_LOWER = 100;
    public static final int DISABLED_REASON_BACKUP_NOT_SUPPORTED = 101;
    public static final int DISABLED_REASON_SIGNATURE_MISMATCH = 102;
    public static final int DISABLED_REASON_OTHER_RESTORE_ISSUE = 103;
    public static final int MAX_ID_LENGTH = 1000;
    public static final int SURFACE_LAUNCHER = 1;
    public static final java.lang.String SHORTCUT_CATEGORY_CONVERSATION = "android.shortcut.conversation";
    public static final int VERSION_CODE_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.content.pm.ShortcutInfo> CREATOR = null;
    public static java.lang.String getDisabledReasonDebugString(int p0) { return null; }
    public static java.lang.String getDisabledReasonForRestoreIssue(android.content.Context p0, int p1) { return null; }
    public static boolean isDisabledForRestoreIssue(int p0) { return false; }
    public void enforceMandatoryFields(boolean p0) {}
    public static android.content.pm.ShortcutInfo createFromGenericDocument(android.content.Context p0, android.app.appsearch.GenericDocument p1) { return null; }
    public static android.content.pm.ShortcutInfo createFromGenericDocument(int p0, android.app.appsearch.GenericDocument p1) { return null; }
    public void resolveResourceStrings(android.content.res.Resources p0) {}
    public static java.lang.String lookUpResourceName(android.content.res.Resources p0, int p1, boolean p2, java.lang.String p3) { return null; }
    public static java.lang.String getResourcePackageName(java.lang.String p0) { return null; }
    public static java.lang.String getResourceTypeName(java.lang.String p0) { return null; }
    public static java.lang.String getResourceTypeAndEntryName(java.lang.String p0) { return null; }
    public static java.lang.String getResourceEntryName(java.lang.String p0) { return null; }
    public static int lookUpResourceId(android.content.res.Resources p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return 0; }
    public void lookupAndFillInResourceNames(android.content.res.Resources p0) {}
    public void lookupAndFillInResourceIds(android.content.res.Resources p0) {}
    public android.content.pm.ShortcutInfo clone(int p0) { return null; }
    public void ensureUpdatableWith(android.content.pm.ShortcutInfo p0, boolean p1) {}
    public void copyNonNullFieldsFrom(android.content.pm.ShortcutInfo p0) {}
    public static android.graphics.drawable.Icon validateIcon(android.graphics.drawable.Icon p0) { return null; }
    public static java.lang.IllegalArgumentException getInvalidIconException() { return null; }
    public java.lang.String getId() { return null; }
    public android.content.LocusId getLocusId() { return null; }
    public java.lang.String getPackage() { return null; }
    public android.content.ComponentName getActivity() { return null; }
    public void setActivity(android.content.ComponentName p0) {}
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.String getStartingThemeResName() { return null; }
    @java.lang.Deprecated
    public java.lang.CharSequence getTitle() { return null; }
    @java.lang.Deprecated
    public int getTitleResId() { return 0; }
    @java.lang.Deprecated
    public java.lang.CharSequence getText() { return null; }
    @java.lang.Deprecated
    public int getTextResId() { return 0; }
    public java.lang.CharSequence getShortLabel() { return null; }
    public int getShortLabelResourceId() { return 0; }
    public java.lang.CharSequence getLongLabel() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public int getLongLabelResourceId() { return 0; }
    public java.lang.CharSequence getDisabledMessage() { return null; }
    public int getDisabledMessageResourceId() { return 0; }
    public void setDisabledReason(int p0) {}
    public int getDisabledReason() { return 0; }
    public java.util.Set<java.lang.String> getCategories() { return null; }
    public android.content.Intent getIntent() { return null; }
    public android.content.Intent[] getIntents() { return null; }
    public android.content.Intent[] getIntentsNoExtras() { return null; }
    @android.annotation.SystemApi
    public android.app.Person[] getPersons() { return null; }
    public android.os.PersistableBundle[] getIntentPersistableExtrases() { return null; }
    public int getRank() { return 0; }
    public boolean hasRank() { return false; }
    public void setRank(int p0) {}
    public void clearImplicitRankAndRankChangedFlag() {}
    public void setImplicitRank(int p0) {}
    public int getImplicitRank() { return 0; }
    public void setRankChanged() {}
    public boolean isRankChanged() { return false; }
    public android.os.PersistableBundle getExtras() { return null; }
    public int getUserId() { return 0; }
    public android.os.UserHandle getUserHandle() { return null; }
    public long getLastChangedTimestamp() { return 0L; }
    public int getFlags() { return 0; }
    public void replaceFlags(int p0) {}
    public void addFlags(int p0) {}
    public void clearFlags(int p0) {}
    public boolean hasFlags(int p0) { return false; }
    public boolean isReturnedByServer() { return false; }
    public void setReturnedByServer() {}
    public boolean isLongLived() { return false; }
    public void setLongLived() {}
    public void setCached(int p0) {}
    public boolean isCached() { return false; }
    public boolean isDynamic() { return false; }
    public boolean isPinned() { return false; }
    public boolean isDeclaredInManifest() { return false; }
    @java.lang.Deprecated
    public boolean isManifestShortcut() { return false; }
    public boolean isFloating() { return false; }
    public boolean isOriginallyFromManifest() { return false; }
    public boolean isDynamicVisible() { return false; }
    public boolean isPinnedVisible() { return false; }
    public boolean isManifestVisible() { return false; }
    public boolean isNonManifestVisible() { return false; }
    public boolean isImmutable() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isAlive() { return false; }
    public boolean usesQuota() { return false; }
    public boolean hasIconResource() { return false; }
    public boolean hasIconUri() { return false; }
    public boolean hasStringResources() { return false; }
    public boolean hasAnyResources() { return false; }
    public boolean hasIconFile() { return false; }
    public boolean hasAdaptiveBitmap() { return false; }
    public boolean isIconPendingSave() { return false; }
    public void setIconPendingSave() {}
    public void clearIconPendingSave() {}
    public boolean isVisibleToPublisher() { return false; }
    public boolean hasKeyFieldsOnly() { return false; }
    public boolean hasStringResourcesResolved() { return false; }
    public void updateTimestamp() {}
    public void setTimestamp(long p0) {}
    public void clearIcon() {}
    public void setIconResourceId(int p0) {}
    public int getIconResourceId() { return 0; }
    public void setIconUri(java.lang.String p0) {}
    public java.lang.String getIconUri() { return null; }
    public java.lang.String getBitmapPath() { return null; }
    public void setBitmapPath(java.lang.String p0) {}
    public void setDisabledMessageResId(int p0) {}
    public void setDisabledMessage(java.lang.String p0) {}
    public java.lang.String getTitleResName() { return null; }
    public void setTitleResName(java.lang.String p0) {}
    public java.lang.String getTextResName() { return null; }
    public void setTextResName(java.lang.String p0) {}
    public java.lang.String getDisabledMessageResName() { return null; }
    public void setDisabledMessageResName(java.lang.String p0) {}
    public java.lang.String getIconResName() { return null; }
    public void setIconResName(java.lang.String p0) {}
    public void setIntents(android.content.Intent[] p0) throws java.lang.IllegalArgumentException {}
    public static android.content.Intent setIntentExtras(android.content.Intent p0, android.os.PersistableBundle p1) { return null; }
    public void setCategories(java.util.Set<java.lang.String> p0) {}
    public boolean isExcludedFromSurfaces(int p0) { return false; }
    public int getExcludedFromSurfaces() { return 0; }
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> getCapabilityBindingsInternal() { return null; }
    public java.util.List<android.content.pm.Capability> getCapabilities() { return null; }
    public java.util.List<android.content.pm.CapabilityParams> getCapabilityParams(android.content.pm.Capability p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toInsecureString() { return null; }
    public java.lang.String toDumpString(java.lang.String p0) { return null; }
    public ShortcutInfo(int p0, java.lang.String p1, java.lang.String p2, android.content.ComponentName p3, android.graphics.drawable.Icon p4, java.lang.CharSequence p5, int p6, java.lang.String p7, java.lang.CharSequence p8, int p9, java.lang.String p10, java.lang.CharSequence p11, int p12, java.lang.String p13, java.util.Set<java.lang.String> p14, android.content.Intent[] p15, int p16, android.os.PersistableBundle p17, long p18, int p19, int p20, java.lang.String p21, java.lang.String p22, java.lang.String p23, int p24, android.app.Person[] p25, android.content.LocusId p26, java.lang.String p27, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> p28) {}

    public static class Builder {
        @java.lang.Deprecated
        public Builder(android.content.Context p0) {}
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setId(java.lang.String p0) { return null; }
        public Builder(android.content.Context p0, java.lang.String p1) {}
        public android.content.pm.ShortcutInfo.Builder setLocusId(android.content.LocusId p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setActivity(android.content.ComponentName p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setStartingTheme(int p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setShortLabelResId(int p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setShortLabel(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setLongLabelResId(int p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setLongLabel(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setTitle(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setTitleResId(int p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setText(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setTextResId(int p0) { return null; }
        @java.lang.Deprecated
        public android.content.pm.ShortcutInfo.Builder setDisabledMessageResId(int p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setDisabledMessage(java.lang.CharSequence p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setCategories(java.util.Set<java.lang.String> p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setIntent(android.content.Intent p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setIntents(android.content.Intent[] p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setPerson(android.app.Person p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setPersons(android.app.Person[] p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setLongLived(boolean p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setRank(int p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.content.pm.ShortcutInfo.Builder addCapabilityBinding(android.content.pm.Capability p0, android.content.pm.CapabilityParams p1) { return null; }
        public android.content.pm.ShortcutInfo.Builder setExcludedFromSurfaces(int p0) { return null; }
        public android.content.pm.ShortcutInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CloneFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisabledReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShortcutFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Surface {
    }
}
