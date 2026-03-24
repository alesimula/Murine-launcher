package android.app.slice;

public final class Slice implements android.os.Parcelable {
    public static final java.lang.String HINT_TITLE = "title";
    public static final java.lang.String HINT_LIST = "list";
    public static final java.lang.String HINT_LIST_ITEM = "list_item";
    public static final java.lang.String HINT_LARGE = "large";
    public static final java.lang.String HINT_ACTIONS = "actions";
    public static final java.lang.String HINT_SELECTED = "selected";
    public static final java.lang.String HINT_NO_TINT = "no_tint";
    public static final java.lang.String HINT_SHORTCUT = "shortcut";
    public static final java.lang.String HINT_SUMMARY = "summary";
    public static final java.lang.String HINT_TOGGLE = "toggle";
    public static final java.lang.String HINT_HORIZONTAL = "horizontal";
    public static final java.lang.String HINT_PARTIAL = "partial";
    public static final java.lang.String HINT_SEE_MORE = "see_more";
    public static final java.lang.String HINT_CALLER_NEEDED = "caller_needed";
    public static final java.lang.String HINT_KEYWORDS = "keywords";
    public static final java.lang.String HINT_ERROR = "error";
    public static final java.lang.String HINT_TTL = "ttl";
    public static final java.lang.String HINT_LAST_UPDATED = "last_updated";
    public static final java.lang.String HINT_PERMISSION_REQUEST = "permission_request";
    public static final java.lang.String SUBTYPE_LAYOUT_DIRECTION = "layout_direction";
    public static final java.lang.String EXTRA_TOGGLE_STATE = "android.app.slice.extra.TOGGLE_STATE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SLIDER_VALUE = "android.app.slice.extra.SLIDER_VALUE";
    public static final java.lang.String EXTRA_RANGE_VALUE = "android.app.slice.extra.RANGE_VALUE";
    public static final java.lang.String SUBTYPE_MESSAGE = "message";
    public static final java.lang.String SUBTYPE_SOURCE = "source";
    public static final java.lang.String SUBTYPE_COLOR = "color";
    @java.lang.Deprecated
    public static final java.lang.String SUBTYPE_SLIDER = "slider";
    public static final java.lang.String SUBTYPE_RANGE = "range";
    public static final java.lang.String SUBTYPE_MAX = "max";
    public static final java.lang.String SUBTYPE_VALUE = "value";
    public static final java.lang.String SUBTYPE_TOGGLE = "toggle";
    public static final java.lang.String SUBTYPE_PRIORITY = "priority";
    public static final java.lang.String SUBTYPE_CONTENT_DESCRIPTION = "content_description";
    public static final java.lang.String SUBTYPE_MILLIS = "millis";
    private final android.app.slice.SliceItem[] mItems = null;
    private final java.lang.String[] mHints = null;
    private android.app.slice.SliceSpec mSpec;
    private android.net.Uri mUri;
    public static final android.os.Parcelable.Creator<android.app.slice.Slice> CREATOR = null;
    Slice(java.util.ArrayList<android.app.slice.SliceItem> p0, java.lang.String[] p1, android.net.Uri p2, android.app.slice.SliceSpec p3) {}
    protected Slice(android.os.Parcel p0) {}
    public android.app.slice.SliceSpec getSpec() { return null; }
    public android.net.Uri getUri() { return null; }
    public java.util.List<android.app.slice.SliceItem> getItems() { return null; }
    public java.util.List<java.lang.String> getHints() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean hasHint(java.lang.String p0) { return false; }
    public boolean isCallerNeeded() { return false; }
    public java.lang.String toString() { return null; }
    private java.lang.String toString(java.lang.String p0) { return null; }

    public static class Builder {
        private final android.net.Uri mUri = null;
        private java.util.ArrayList<android.app.slice.SliceItem> mItems;
        private java.util.ArrayList<java.lang.String> mHints;
        private android.app.slice.SliceSpec mSpec;
        @java.lang.Deprecated
        public Builder(android.net.Uri p0) {}
        public Builder(android.net.Uri p0, android.app.slice.SliceSpec p1) {}
        public Builder(android.app.slice.Slice.Builder p0) {}
        public android.app.slice.Slice.Builder setCallerNeeded(boolean p0) { return null; }
        public android.app.slice.Slice.Builder addHints(java.util.List<java.lang.String> p0) { return null; }
        public android.app.slice.Slice.Builder setSpec(android.app.slice.SliceSpec p0) { return null; }
        public android.app.slice.Slice.Builder addSubSlice(android.app.slice.Slice p0, java.lang.String p1) { return null; }
        public android.app.slice.Slice.Builder addAction(android.app.PendingIntent p0, android.app.slice.Slice p1, java.lang.String p2) { return null; }
        public android.app.slice.Slice.Builder addText(java.lang.CharSequence p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public android.app.slice.Slice.Builder addIcon(android.graphics.drawable.Icon p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public android.app.slice.Slice.Builder addRemoteInput(android.app.RemoteInput p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public android.app.slice.Slice.Builder addInt(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        @java.lang.Deprecated
        public android.app.slice.Slice.Builder addTimestamp(long p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public android.app.slice.Slice.Builder addLong(long p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public android.app.slice.Slice.Builder addBundle(android.os.Bundle p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public android.app.slice.Slice build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SliceHint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SliceSubtype {
    }
}
