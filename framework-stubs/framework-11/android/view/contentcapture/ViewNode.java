package android.view.contentcapture;

@android.annotation.SystemApi
public final class ViewNode extends android.app.assist.AssistStructure.ViewNode {
    private static final java.lang.String TAG = null;
    private static final long FLAGS_HAS_TEXT = 1L;
    private static final long FLAGS_HAS_COMPLEX_TEXT = 2L;
    private static final long FLAGS_VISIBILITY_MASK = 12L;
    private static final long FLAGS_HAS_CLASSNAME = 16L;
    private static final long FLAGS_HAS_AUTOFILL_ID = 32L;
    private static final long FLAGS_HAS_AUTOFILL_PARENT_ID = 64L;
    private static final long FLAGS_HAS_ID = 128L;
    private static final long FLAGS_HAS_LARGE_COORDS = 256L;
    private static final long FLAGS_HAS_SCROLL = 512L;
    private static final long FLAGS_ASSIST_BLOCKED = 1024L;
    private static final long FLAGS_DISABLED = 2048L;
    private static final long FLAGS_CLICKABLE = 4096L;
    private static final long FLAGS_LONG_CLICKABLE = 8192L;
    private static final long FLAGS_CONTEXT_CLICKABLE = 16384L;
    private static final long FLAGS_FOCUSABLE = 32768L;
    private static final long FLAGS_FOCUSED = 65536L;
    private static final long FLAGS_ACCESSIBILITY_FOCUSED = 131072L;
    private static final long FLAGS_CHECKABLE = 262144L;
    private static final long FLAGS_CHECKED = 524288L;
    private static final long FLAGS_SELECTED = 1048576L;
    private static final long FLAGS_ACTIVATED = 2097152L;
    private static final long FLAGS_OPAQUE = 4194304L;
    private static final long FLAGS_HAS_CONTENT_DESCRIPTION = 8388608L;
    private static final long FLAGS_HAS_EXTRAS = 16777216L;
    private static final long FLAGS_HAS_LOCALE_LIST = 33554432L;
    private static final long FLAGS_HAS_INPUT_TYPE = 67108864L;
    private static final long FLAGS_HAS_MIN_TEXT_EMS = 134217728L;
    private static final long FLAGS_HAS_MAX_TEXT_EMS = 268435456L;
    private static final long FLAGS_HAS_MAX_TEXT_LENGTH = 536870912L;
    private static final long FLAGS_HAS_TEXT_ID_ENTRY = 1073741824L;
    private static final long FLAGS_HAS_AUTOFILL_TYPE = 2147483648L;
    private static final long FLAGS_HAS_AUTOFILL_VALUE = 4294967296L;
    private static final long FLAGS_HAS_AUTOFILL_HINTS = 8589934592L;
    private static final long FLAGS_HAS_AUTOFILL_OPTIONS = 17179869184L;
    private static final long FLAGS_HAS_HINT_ID_ENTRY = 34359738368L;
    private long mFlags;
    private android.view.autofill.AutofillId mParentAutofillId;
    private android.view.autofill.AutofillId mAutofillId;
    private android.view.contentcapture.ViewNode.ViewNodeText mText;
    private java.lang.String mClassName;
    private int mId;
    private java.lang.String mIdPackage;
    private java.lang.String mIdType;
    private java.lang.String mIdEntry;
    private int mX;
    private int mY;
    private int mScrollX;
    private int mScrollY;
    private int mWidth;
    private int mHeight;
    private java.lang.CharSequence mContentDescription;
    private android.os.Bundle mExtras;
    private android.os.LocaleList mLocaleList;
    private int mInputType;
    private int mMinEms;
    private int mMaxEms;
    private int mMaxLength;
    private java.lang.String mTextIdEntry;
    private java.lang.String mHintIdEntry;
    private int mAutofillType;
    private java.lang.String[] mAutofillHints;
    private android.view.autofill.AutofillValue mAutofillValue;
    private java.lang.CharSequence[] mAutofillOptions;
    public ViewNode() { super(); }
    private ViewNode(long p0, android.os.Parcel p1) { super(); }
    public android.view.autofill.AutofillId getParentAutofillId() { return null; }
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    public java.lang.CharSequence getText() { return null; }
    public java.lang.String getClassName() { return null; }
    public int getId() { return 0; }
    public java.lang.String getIdPackage() { return null; }
    public java.lang.String getIdType() { return null; }
    public java.lang.String getIdEntry() { return null; }
    public int getLeft() { return 0; }
    public int getTop() { return 0; }
    public int getScrollX() { return 0; }
    public int getScrollY() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public boolean isAssistBlocked() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isClickable() { return false; }
    public boolean isLongClickable() { return false; }
    public boolean isContextClickable() { return false; }
    public boolean isFocusable() { return false; }
    public boolean isFocused() { return false; }
    public boolean isAccessibilityFocused() { return false; }
    public boolean isCheckable() { return false; }
    public boolean isChecked() { return false; }
    public boolean isSelected() { return false; }
    public boolean isActivated() { return false; }
    public boolean isOpaque() { return false; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getHint() { return null; }
    public java.lang.String getHintIdEntry() { return null; }
    public int getTextSelectionStart() { return 0; }
    public int getTextSelectionEnd() { return 0; }
    public int getTextColor() { return 0; }
    public int getTextBackgroundColor() { return 0; }
    public float getTextSize() { return 0.0f; }
    public int getTextStyle() { return 0; }
    public int[] getTextLineCharOffsets() { return null; }
    public int[] getTextLineBaselines() { return null; }
    public int getVisibility() { return 0; }
    public int getInputType() { return 0; }
    public int getMinTextEms() { return 0; }
    public int getMaxTextEms() { return 0; }
    public int getMaxTextLength() { return 0; }
    public java.lang.String getTextIdEntry() { return null; }
    public int getAutofillType() { return 0; }
    public java.lang.String[] getAutofillHints() { return null; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public java.lang.CharSequence[] getAutofillOptions() { return null; }
    public android.os.LocaleList getLocaleList() { return null; }
    private void writeSelfToParcel(android.os.Parcel p0, int p1) {}
    public static void writeToParcel(android.os.Parcel p0, android.view.contentcapture.ViewNode p1, int p2) {}
    public static android.view.contentcapture.ViewNode readFromParcel(android.os.Parcel p0) { return null; }

    static final class ViewNodeText {
        java.lang.CharSequence mText;
        float mTextSize;
        int mTextStyle;
        int mTextColor;
        int mTextBackgroundColor;
        int mTextSelectionStart;
        int mTextSelectionEnd;
        int[] mLineCharOffsets;
        int[] mLineBaselines;
        java.lang.String mHint;
        ViewNodeText() {}
        boolean isSimple() { return false; }
        ViewNodeText(android.os.Parcel p0, boolean p1) {}
        void writeToParcel(android.os.Parcel p0, boolean p1) {}
    }

    public static final class ViewStructureImpl extends android.view.ViewStructure {
        final android.view.contentcapture.ViewNode mNode = null;
        public ViewStructureImpl(android.view.View p0) { super(); }
        public ViewStructureImpl(android.view.autofill.AutofillId p0, long p1, int p2) { super(); }
        public android.view.contentcapture.ViewNode getNode() { return null; }
        public void setId(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        public void setDimens(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public void setTransformation(android.graphics.Matrix p0) {}
        public void setElevation(float p0) {}
        public void setAlpha(float p0) {}
        public void setVisibility(int p0) {}
        public void setAssistBlocked(boolean p0) {}
        public void setEnabled(boolean p0) {}
        public void setClickable(boolean p0) {}
        public void setLongClickable(boolean p0) {}
        public void setContextClickable(boolean p0) {}
        public void setFocusable(boolean p0) {}
        public void setFocused(boolean p0) {}
        public void setAccessibilityFocused(boolean p0) {}
        public void setCheckable(boolean p0) {}
        public void setChecked(boolean p0) {}
        public void setSelected(boolean p0) {}
        public void setActivated(boolean p0) {}
        public void setOpaque(boolean p0) {}
        public void setClassName(java.lang.String p0) {}
        public void setContentDescription(java.lang.CharSequence p0) {}
        public void setText(java.lang.CharSequence p0) {}
        public void setText(java.lang.CharSequence p0, int p1, int p2) {}
        public void setTextStyle(float p0, int p1, int p2, int p3) {}
        public void setTextLines(int[] p0, int[] p1) {}
        public void setTextIdEntry(java.lang.String p0) {}
        public void setHint(java.lang.CharSequence p0) {}
        public void setHintIdEntry(java.lang.String p0) {}
        public java.lang.CharSequence getText() { return null; }
        public int getTextSelectionStart() { return 0; }
        public int getTextSelectionEnd() { return 0; }
        public java.lang.CharSequence getHint() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public boolean hasExtras() { return false; }
        public void setChildCount(int p0) {}
        public int addChildCount(int p0) { return 0; }
        public int getChildCount() { return 0; }
        public android.view.ViewStructure newChild(int p0) { return null; }
        public android.view.ViewStructure asyncNewChild(int p0) { return null; }
        public android.view.autofill.AutofillId getAutofillId() { return null; }
        public void setAutofillId(android.view.autofill.AutofillId p0) {}
        public void setAutofillId(android.view.autofill.AutofillId p0, int p1) {}
        public void setAutofillType(int p0) {}
        public void setAutofillHints(java.lang.String[] p0) {}
        public void setAutofillValue(android.view.autofill.AutofillValue p0) {}
        public void setAutofillOptions(java.lang.CharSequence[] p0) {}
        public void setInputType(int p0) {}
        public void setMinTextEms(int p0) {}
        public void setMaxTextEms(int p0) {}
        public void setMaxTextLength(int p0) {}
        public void setDataIsSensitive(boolean p0) {}
        public void asyncCommit() {}
        public android.graphics.Rect getTempRect() { return null; }
        public void setWebDomain(java.lang.String p0) {}
        public void setLocaleList(android.os.LocaleList p0) {}
        public android.view.ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(java.lang.String p0) { return null; }
        public void setHtmlInfo(android.view.ViewStructure.HtmlInfo p0) {}
        private android.view.contentcapture.ViewNode.ViewNodeText getNodeText() { return null; }
    }
}
