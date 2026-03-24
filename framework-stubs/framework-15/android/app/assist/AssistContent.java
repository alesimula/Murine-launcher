package android.app.assist;

public class AssistContent implements android.os.Parcelable {
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
    public android.os.Bundle getExtras() { return null; }
    AssistContent(android.os.Parcel p0) {}
    void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
