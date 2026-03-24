package android.app;

public final class SearchableInfo implements android.os.Parcelable {
    @android.annotation.NonNull
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
    public android.content.Context getActivityContext(android.content.Context p0) { return null; }
    public android.content.Context getProviderContext(android.content.Context p0, android.content.Context p1) { return null; }
    public android.app.SearchableInfo.ActionKeyInfo findActionKey(int p0) { return null; }
    public static android.app.SearchableInfo getActivityMetaData(android.content.Context p0, android.content.pm.ActivityInfo p1, int p2) { return null; }
    public int getLabelId() { return 0; }
    public int getHintId() { return 0; }
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
        public static final android.os.Parcelable.Creator<android.app.SearchableInfo.ActionKeyInfo> CREATOR = null;
        ActionKeyInfo(android.content.Context p0, android.util.AttributeSet p1) {}
        public int getKeyCode() { return 0; }
        public java.lang.String getQueryActionMsg() { return null; }
        public java.lang.String getSuggestActionMsg() { return null; }
        public java.lang.String getSuggestActionMsgColumn() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
