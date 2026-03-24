package android.widget;

public class QuickContactBadge extends android.widget.ImageView implements android.view.View.OnClickListener {
    private android.net.Uri mContactUri;
    private java.lang.String mContactEmail;
    private java.lang.String mContactPhone;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mOverlay;
    private android.widget.QuickContactBadge.QueryHandler mQueryHandler;
    private android.graphics.drawable.Drawable mDefaultAvatar;
    private android.os.Bundle mExtras;
    private java.lang.String mPrioritizedMimeType;
    protected java.lang.String[] mExcludeMimes;
    private static final int TOKEN_EMAIL_LOOKUP = 0;
    private static final int TOKEN_PHONE_LOOKUP = 1;
    private static final int TOKEN_EMAIL_LOOKUP_AND_TRIGGER = 2;
    private static final int TOKEN_PHONE_LOOKUP_AND_TRIGGER = 3;
    private static final java.lang.String EXTRA_URI_CONTENT = "uri_content";
    static final java.lang.String[] EMAIL_LOOKUP_PROJECTION = null;
    static final int EMAIL_ID_COLUMN_INDEX = 0;
    static final int EMAIL_LOOKUP_STRING_COLUMN_INDEX = 1;
    static final java.lang.String[] PHONE_LOOKUP_PROJECTION = null;
    static final int PHONE_ID_COLUMN_INDEX = 0;
    static final int PHONE_LOOKUP_STRING_COLUMN_INDEX = 1;
    public QuickContactBadge(android.content.Context p0) { super((android.content.Context)null); }
    public QuickContactBadge(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public QuickContactBadge(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public QuickContactBadge(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    public void setMode(int p0) {}
    public void setPrioritizedMimeType(java.lang.String p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    private boolean isAssigned() { return false; }
    public void setImageToDefault() {}
    public void assignContactUri(android.net.Uri p0) {}
    public void assignContactFromEmail(java.lang.String p0, boolean p1) {}
    public void assignContactFromEmail(java.lang.String p0, boolean p1, android.os.Bundle p2) {}
    public void assignContactFromPhone(java.lang.String p0, boolean p1) {}
    public void assignContactFromPhone(java.lang.String p0, boolean p1, android.os.Bundle p2) {}
    public void setOverlay(android.graphics.drawable.Drawable p0) {}
    private void onContactUriChanged() {}
    public void onClick(android.view.View p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void setExcludeMimes(java.lang.String[] p0) {}

    private class QueryHandler extends android.content.AsyncQueryHandler {
        public QueryHandler(android.widget.QuickContactBadge p0, android.content.ContentResolver p1) { super(null); }
        protected void onQueryComplete(int p0, java.lang.Object p1, android.database.Cursor p2) {}
    }
}
