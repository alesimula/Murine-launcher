package android.content;

public class ClipData implements android.os.Parcelable {
    static final java.lang.String[] MIMETYPES_TEXT_PLAIN = null;
    static final java.lang.String[] MIMETYPES_TEXT_HTML = null;
    static final java.lang.String[] MIMETYPES_TEXT_URILIST = null;
    static final java.lang.String[] MIMETYPES_TEXT_INTENT = null;
    final android.content.ClipDescription mClipDescription = null;
    final android.graphics.Bitmap mIcon = null;
    final java.util.ArrayList<android.content.ClipData.Item> mItems = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.ClipData> CREATOR = null;
    public ClipData(java.lang.CharSequence p0, java.lang.String[] p1, android.content.ClipData.Item p2) {}
    public ClipData(android.content.ClipDescription p0, android.content.ClipData.Item p1) {}
    public ClipData(android.content.ClipDescription p0, java.util.ArrayList<android.content.ClipData.Item> p1) {}
    public ClipData(android.content.ClipData p0) {}
    public android.content.ClipData copyForTransferWithActivityInfo() { return null; }
    public boolean willParcelWithActivityInfo() { return false; }
    public static android.content.ClipData newPlainText(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public static android.content.ClipData newHtmlText(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.String p2) { return null; }
    public static android.content.ClipData newIntent(java.lang.CharSequence p0, android.content.Intent p1) { return null; }
    public static android.content.ClipData newUri(android.content.ContentResolver p0, java.lang.CharSequence p1, android.net.Uri p2) { return null; }
    public static android.content.ClipData newRawUri(java.lang.CharSequence p0, android.net.Uri p1) { return null; }
    public android.content.ClipDescription getDescription() { return null; }
    public void addItem(android.content.ClipData.Item p0) {}
    public void addItem(android.content.ContentResolver p0, android.content.ClipData.Item p1) {}
    public android.graphics.Bitmap getIcon() { return null; }
    public int getItemCount() { return 0; }
    public android.content.ClipData.Item getItemAt(int p0) { return null; }
    public void setItemAt(int p0, android.content.ClipData.Item p1) {}
    public void prepareToLeaveProcess(boolean p0) {}
    public void prepareToLeaveProcess(boolean p0, int p1) {}
    public void prepareToLeaveProcess$ravenwood(boolean p0, int p1) {}
    public void prepareToEnterProcess(android.content.AttributionSource p0) {}
    public void fixUris(int p0) {}
    public void fixUrisLight(int p0) {}
    public java.lang.String toString() { return null; }
    public void toShortString(java.lang.StringBuilder p0, boolean p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void collectUris(java.util.List<android.net.Uri> p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    ClipData(android.os.Parcel p0) {}

    public static class Item {
        final java.lang.CharSequence mText = null;
        final java.lang.String mHtmlText = null;
        final android.content.Intent mIntent = null;
        final android.content.IntentSender mIntentSender = null;
        android.net.Uri mUri;
        public Item(android.content.ClipData.Item p0) {}
        public Item(java.lang.CharSequence p0) {}
        public Item(java.lang.CharSequence p0, java.lang.String p1) {}
        public Item(android.content.Intent p0) {}
        public Item(android.net.Uri p0) {}
        public Item(java.lang.CharSequence p0, android.content.Intent p1, android.net.Uri p2) {}
        public Item(java.lang.CharSequence p0, java.lang.String p1, android.content.Intent p2, android.net.Uri p3) {}
        public java.lang.CharSequence getText() { return null; }
        public java.lang.String getHtmlText() { return null; }
        public android.content.Intent getIntent() { return null; }
        @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
        @android.annotation.Nullable
        public android.content.IntentSender getIntentSender() { return null; }
        public android.net.Uri getUri() { return null; }
        public android.content.pm.ActivityInfo getActivityInfo() { return null; }
        public void setActivityInfo(android.content.pm.ActivityInfo p0) {}
        @android.annotation.Nullable
        public android.view.textclassifier.TextLinks getTextLinks() { return null; }
        public void setTextLinks(android.view.textclassifier.TextLinks p0) {}
        public java.lang.CharSequence coerceToText(android.content.Context p0) { return null; }
        public java.lang.CharSequence coerceToStyledText(android.content.Context p0) { return null; }
        public java.lang.String coerceToHtmlText(android.content.Context p0) { return null; }
        public java.lang.String toString() { return null; }
        public void toShortString(java.lang.StringBuilder p0, boolean p1) {}
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

        @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
        public static final class Builder {
            public Builder() {}
            @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
            @android.annotation.NonNull
            public android.content.ClipData.Item.Builder setText(java.lang.CharSequence p0) { return null; }
            @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
            @android.annotation.NonNull
            public android.content.ClipData.Item.Builder setHtmlText(java.lang.String p0) { return null; }
            @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
            @android.annotation.NonNull
            public android.content.ClipData.Item.Builder setIntent(android.content.Intent p0) { return null; }
            @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
            @android.annotation.NonNull
            public android.content.ClipData.Item.Builder setIntentSender(android.content.IntentSender p0) { return null; }
            @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
            @android.annotation.NonNull
            public android.content.ClipData.Item.Builder setUri(android.net.Uri p0) { return null; }
            @android.annotation.FlaggedApi("com.android.window.flags.delegate_unhandled_drags")
            @android.annotation.NonNull
            public android.content.ClipData.Item build() { return null; }
        }
    }
}
