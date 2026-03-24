package android.view;

public abstract class ViewStructure {
    public ViewStructure() {}
    public abstract void setId(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
    public abstract void setDimens(int p0, int p1, int p2, int p3, int p4, int p5);
    public abstract void setTransformation(android.graphics.Matrix p0);
    public abstract void setElevation(float p0);
    public abstract void setAlpha(float p0);
    public abstract void setVisibility(int p0);
    public abstract void setAssistBlocked(boolean p0);
    public abstract void setEnabled(boolean p0);
    public abstract void setClickable(boolean p0);
    public abstract void setLongClickable(boolean p0);
    public abstract void setContextClickable(boolean p0);
    public abstract void setFocusable(boolean p0);
    public abstract void setFocused(boolean p0);
    public abstract void setAccessibilityFocused(boolean p0);
    public abstract void setCheckable(boolean p0);
    public abstract void setChecked(boolean p0);
    public abstract void setSelected(boolean p0);
    public abstract void setActivated(boolean p0);
    public abstract void setOpaque(boolean p0);
    public abstract void setClassName(java.lang.String p0);
    public abstract void setContentDescription(java.lang.CharSequence p0);
    public abstract void setText(java.lang.CharSequence p0);
    public abstract void setText(java.lang.CharSequence p0, int p1, int p2);
    public abstract void setTextStyle(float p0, int p1, int p2, int p3);
    public abstract void setTextLines(int[] p0, int[] p1);
    public void setTextIdEntry(java.lang.String p0) {}
    public abstract void setHint(java.lang.CharSequence p0);
    public void setHintIdEntry(java.lang.String p0) {}
    public abstract java.lang.CharSequence getText();
    public abstract int getTextSelectionStart();
    public abstract int getTextSelectionEnd();
    public abstract java.lang.CharSequence getHint();
    public abstract android.os.Bundle getExtras();
    public abstract boolean hasExtras();
    public abstract void setChildCount(int p0);
    public abstract int addChildCount(int p0);
    public abstract int getChildCount();
    public abstract android.view.ViewStructure newChild(int p0);
    public abstract android.view.ViewStructure asyncNewChild(int p0);
    public abstract android.view.autofill.AutofillId getAutofillId();
    public abstract void setAutofillId(android.view.autofill.AutofillId p0);
    public abstract void setAutofillId(android.view.autofill.AutofillId p0, int p1);
    public abstract void setAutofillType(int p0);
    public abstract void setAutofillHints(java.lang.String[] p0);
    public abstract void setAutofillValue(android.view.autofill.AutofillValue p0);
    public abstract void setAutofillOptions(java.lang.CharSequence[] p0);
    public void setImportantForAutofill(int p0) {}
    public void setReceiveContentMimeTypes(java.lang.String[] p0) {}
    public abstract void setInputType(int p0);
    public abstract void setDataIsSensitive(boolean p0);
    public void setMinTextEms(int p0) {}
    public void setMaxTextEms(int p0) {}
    public void setMaxTextLength(int p0) {}
    public abstract void asyncCommit();
    public abstract android.graphics.Rect getTempRect();
    public abstract void setWebDomain(java.lang.String p0);
    public abstract void setLocaleList(android.os.LocaleList p0);
    public abstract android.view.ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(java.lang.String p0);
    public abstract void setHtmlInfo(android.view.ViewStructure.HtmlInfo p0);

    public static abstract class HtmlInfo {
        public HtmlInfo() {}
        public abstract java.lang.String getTag();
        public abstract java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttributes();

        public static abstract class Builder {
            public Builder() {}
            public abstract android.view.ViewStructure.HtmlInfo.Builder addAttribute(java.lang.String p0, java.lang.String p1);
            public abstract android.view.ViewStructure.HtmlInfo build();
        }
    }
}
