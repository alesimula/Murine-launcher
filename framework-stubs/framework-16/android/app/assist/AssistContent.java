package android.app.assist;

public class AssistContent implements android.os.Parcelable {
    @android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
    public static final java.lang.String EXTRA_APP_FUNCTION_DATA = "android.app.assist.extra.APP_FUNCTION_DATA";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.assist.AssistContent> CREATOR = null;
    public AssistContent() {}
    public AssistContent(android.os.Bundle p0) {}
    public void setDefaultIntent(android.content.Intent p0) {}
    public void setIntent(android.content.Intent p0) {}
    public android.content.Intent getIntent() { return null; }
    public boolean isAppProvidedIntent() { return false; }
    public void setClipData(android.content.ClipData p0) {}
    public android.content.ClipData getClipData() { return null; }
    public void setStructuredData(java.lang.String p0) {}
    public java.lang.String getStructuredData() { return null; }
    public void setWebUri(android.net.Uri p0) {}
    public android.net.Uri getWebUri() { return null; }
    public boolean isAppProvidedWebUri() { return false; }
    @android.annotation.FlaggedApi("com.android.window.flags.enable_desktop_windowing_app_to_web_education")
    public void setSessionTransferUri(android.net.Uri p0) {}
    @android.annotation.FlaggedApi("com.android.window.flags.enable_desktop_windowing_app_to_web_education")
    @android.annotation.Nullable
    public android.net.Uri getSessionTransferUri() { return null; }
    public android.os.Bundle getExtras() { return null; }
    AssistContent(android.os.Parcel p0) {}
    void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
