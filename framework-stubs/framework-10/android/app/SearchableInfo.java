package android.app;

public final class SearchableInfo implements android.os.Parcelable {
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "SearchableInfo";
    private static final java.lang.String MD_LABEL_SEARCHABLE = "android.app.searchable";
    private static final java.lang.String MD_XML_ELEMENT_SEARCHABLE = "searchable";
    private static final java.lang.String MD_XML_ELEMENT_SEARCHABLE_ACTION_KEY = "actionkey";
    private static final int SEARCH_MODE_BADGE_LABEL = 4;
    private static final int SEARCH_MODE_BADGE_ICON = 8;
    private static final int SEARCH_MODE_QUERY_REWRITE_FROM_DATA = 16;
    private static final int SEARCH_MODE_QUERY_REWRITE_FROM_TEXT = 32;
    private final int mLabelId = 0;
    private final android.content.ComponentName mSearchActivity = null;
    private final int mHintId = 0;
    private final int mSearchMode = 0;
    private final int mIconId = 0;
    private final int mSearchButtonText = 0;
    private final int mSearchInputType = 0;
    private final int mSearchImeOptions = 0;
    private final boolean mIncludeInGlobalSearch = false;
    private final boolean mQueryAfterZeroResults = false;
    private final boolean mAutoUrlDetect = false;
    private final int mSettingsDescriptionId = 0;
    private final java.lang.String mSuggestAuthority = null;
    private final java.lang.String mSuggestPath = null;
    private final java.lang.String mSuggestSelection = null;
    private final java.lang.String mSuggestIntentAction = null;
    private final java.lang.String mSuggestIntentData = null;
    private final int mSuggestThreshold = 0;
    private java.util.HashMap<java.lang.Integer, android.app.SearchableInfo.ActionKeyInfo> mActionKeys;
    private final java.lang.String mSuggestProviderPackage = null;
    private static final int VOICE_SEARCH_SHOW_BUTTON = 1;
    private static final int VOICE_SEARCH_LAUNCH_WEB_SEARCH = 2;
    private static final int VOICE_SEARCH_LAUNCH_RECOGNIZER = 4;
    private final int mVoiceSearchMode = 0;
    private final int mVoiceLanguageModeId = 0;
    private final int mVoicePromptTextId = 0;
    private final int mVoiceLanguageId = 0;
    private final int mVoiceMaxResults = 0;
    public static final android.os.Parcelable.Creator<android.app.SearchableInfo> CREATOR = null;
    public java.lang.String getSuggestAuthority() { return null; }
    public java.lang.String getSuggestPackage() { return null; }
    public android.content.ComponentName getSearchActivity() { return null; }
    public boolean useBadgeLabel() { return false; }
    public boolean useBadgeIcon() { return false; }
    public boolean shouldRewriteQueryFromData() { return false; }
    public boolean shouldRewriteQueryFromText() { return false; }
    public int getSettingsDescriptionId() { return 0; }
    public java.lang.String getSuggestPath() { return null; }
    public java.lang.String getSuggestSelection() { return null; }
    public java.lang.String getSuggestIntentAction() { return null; }
    public java.lang.String getSuggestIntentData() { return null; }
    public int getSuggestThreshold() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public android.content.Context getActivityContext(android.content.Context p0) { return null; }
    private static android.content.Context createActivityContext(android.content.Context p0, android.content.ComponentName p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.content.Context getProviderContext(android.content.Context p0, android.content.Context p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private SearchableInfo(android.content.Context p0, android.util.AttributeSet p1, android.content.ComponentName p2) {}
    @android.annotation.UnsupportedAppUsage
    public android.app.SearchableInfo.ActionKeyInfo findActionKey(int p0) { return null; }
    private void addActionKey(android.app.SearchableInfo.ActionKeyInfo p0) {}
    public static android.app.SearchableInfo getActivityMetaData(android.content.Context p0, android.content.pm.ActivityInfo p1, int p2) { return null; }
    private static android.app.SearchableInfo getActivityMetaData(android.content.Context p0, org.xmlpull.v1.XmlPullParser p1, android.content.ComponentName p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getLabelId() { return 0; }
    public int getHintId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getIconId() { return 0; }
    public boolean getVoiceSearchEnabled() { return false; }
    public boolean getVoiceSearchLaunchWebSearch() { return false; }
    public boolean getVoiceSearchLaunchRecognizer() { return false; }
    public int getVoiceLanguageModeId() { return 0; }
    public int getVoicePromptTextId() { return 0; }
    public int getVoiceLanguageId() { return 0; }
    public int getVoiceMaxResults() { return 0; }
    public int getSearchButtonText() { return 0; }
    public int getInputType() { return 0; }
    public int getImeOptions() { return 0; }
    public boolean shouldIncludeInGlobalSearch() { return false; }
    public boolean queryAfterZeroResults() { return false; }
    public boolean autoUrlDetect() { return false; }
    SearchableInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class ActionKeyInfo implements android.os.Parcelable {
        private final int mKeyCode = 0;
        private final java.lang.String mQueryActionMsg = null;
        private final java.lang.String mSuggestActionMsg = null;
        private final java.lang.String mSuggestActionMsgColumn = null;
        ActionKeyInfo(android.content.Context p0, android.util.AttributeSet p1) {}
        private ActionKeyInfo(android.os.Parcel p0) {}
        public int getKeyCode() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getQueryActionMsg() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getSuggestActionMsg() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getSuggestActionMsgColumn() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
