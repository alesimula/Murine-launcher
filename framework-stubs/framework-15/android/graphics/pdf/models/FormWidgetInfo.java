package android.graphics.pdf.models;

public final class FormWidgetInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.pdf.models.FormWidgetInfo> CREATOR = null;
    public static final int WIDGET_TYPE_CHECKBOX = 2;
    public static final int WIDGET_TYPE_COMBOBOX = 4;
    public static final int WIDGET_TYPE_LISTBOX = 5;
    public static final int WIDGET_TYPE_PUSHBUTTON = 1;
    public static final int WIDGET_TYPE_RADIOBUTTON = 3;
    public static final int WIDGET_TYPE_SIGNATURE = 7;
    public static final int WIDGET_TYPE_TEXTFIELD = 6;
    public static final int WIDGET_TYPE_UNKNOWN = 0;
    FormWidgetInfo() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getAccessibilityLabel() { return null; }
    public float getFontSize() { return 0.0f; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.pdf.models.ListItem> getListItems() { return null; }
    public int getMaxLength() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTextValue() { return null; }
    public int getWidgetIndex() { return 0; }
    @android.annotation.NonNull
    public android.graphics.Rect getWidgetRect() { return null; }
    public int getWidgetType() { return 0; }
    public boolean isEditableText() { return false; }
    public boolean isMultiLineText() { return false; }
    public boolean isMultiSelect() { return false; }
    public boolean isReadOnly() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, android.graphics.Rect p2, java.lang.String p3, java.lang.String p4) {}
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo build() { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setEditableText(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setFontSize(float p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setListItems(java.util.List<android.graphics.pdf.models.ListItem> p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setMaxLength(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setMultiLineText(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setMultiSelect(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormWidgetInfo.Builder setReadOnly(boolean p0) { return null; }
    }
}
