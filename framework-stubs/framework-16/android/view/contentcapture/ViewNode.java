package android.view.contentcapture;

@android.annotation.SystemApi
public final class ViewNode extends android.app.assist.AssistStructure.ViewNode {
    public ViewNode() { super(); }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId getParentAutofillId() { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getText() { return null; }
    @android.annotation.Nullable
    public java.lang.String getClassName() { return null; }
    public int getId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getIdPackage() { return null; }
    @android.annotation.Nullable
    public java.lang.String getIdType() { return null; }
    @android.annotation.Nullable
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
    @android.annotation.Nullable
    public java.lang.CharSequence getContentDescription() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.Nullable
    public java.lang.String getHint() { return null; }
    @android.annotation.Nullable
    public java.lang.String getHintIdEntry() { return null; }
    public int getTextSelectionStart() { return 0; }
    public int getTextSelectionEnd() { return 0; }
    public int getTextColor() { return 0; }
    public int getTextBackgroundColor() { return 0; }
    public float getTextSize() { return 0.0f; }
    public int getTextStyle() { return 0; }
    @android.annotation.Nullable
    public int[] getTextLineCharOffsets() { return null; }
    @android.annotation.Nullable
    public int[] getTextLineBaselines() { return null; }
    public int getVisibility() { return 0; }
    public int getInputType() { return 0; }
    public int getMinTextEms() { return 0; }
    public int getMaxTextEms() { return 0; }
    public int getMaxTextLength() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTextIdEntry() { return null; }
    public int getAutofillType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String[] getAutofillHints() { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence[] getAutofillOptions() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getReceiveContentMimeTypes() { return null; }
    @android.annotation.Nullable
    public android.os.LocaleList getLocaleList() { return null; }
    public void setTextIdEntry(java.lang.String p0) {}
    public static void writeToParcel(android.os.Parcel p0, android.view.contentcapture.ViewNode p1, int p2) {}
    @android.annotation.Nullable
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
        public void setReceiveContentMimeTypes(java.lang.String[] p0) {}
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
    }
}
