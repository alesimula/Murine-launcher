package android.view;

public final class ContentInfo implements android.os.Parcelable {
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_PROCESS_TEXT = 5;
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    private final android.content.ClipData mClip = null;
    private final int mSource = 0;
    private final int mFlags = 0;
    private final android.net.Uri mLinkUri = null;
    private final android.os.Bundle mExtras = null;
    private final android.view.inputmethod.InputContentInfo mInputContentInfo = null;
    private final android.view.DragAndDropPermissions mDragAndDropPermissions = null;
    public static final android.os.Parcelable.Creator<android.view.ContentInfo> CREATOR = null;
    static java.lang.String sourceToString(int p0) { return null; }
    static java.lang.String flagsToString(int p0) { return null; }
    private ContentInfo(android.view.ContentInfo.Builder p0) {}
    public void releasePermissions() {}
    public java.lang.String toString() { return null; }
    public android.content.ClipData getClip() { return null; }
    public int getSource() { return 0; }
    public int getFlags() { return 0; }
    public android.net.Uri getLinkUri() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public android.os.Bundle getExtras() { return null; }
    public android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> partition(java.util.function.Predicate<android.content.ClipData.Item> p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.ClipData mClip;
        private int mSource;
        private int mFlags;
        private android.net.Uri mLinkUri;
        private android.os.Bundle mExtras;
        private android.view.inputmethod.InputContentInfo mInputContentInfo;
        private android.view.DragAndDropPermissions mDragAndDropPermissions;
        public Builder(android.view.ContentInfo p0) {}
        public Builder(android.content.ClipData p0, int p1) {}
        public android.view.ContentInfo.Builder setClip(android.content.ClipData p0) { return null; }
        public android.view.ContentInfo.Builder setSource(int p0) { return null; }
        public android.view.ContentInfo.Builder setFlags(int p0) { return null; }
        public android.view.ContentInfo.Builder setLinkUri(android.net.Uri p0) { return null; }
        public android.view.ContentInfo.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.ContentInfo.Builder setInputContentInfo(android.view.inputmethod.InputContentInfo p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.ContentInfo.Builder setDragAndDropPermissions(android.view.DragAndDropPermissions p0) { return null; }
        public android.view.ContentInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }
}
