package android.graphics.pdf.models;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_form_filling")
public final class FormEditRecord implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.pdf.models.FormEditRecord> CREATOR = null;
    public static final int EDIT_TYPE_CLICK = 0;
    public static final int EDIT_TYPE_SET_INDICES = 1;
    public static final int EDIT_TYPE_SET_TEXT = 2;
    FormEditRecord() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.graphics.Point getClickPoint() { return null; }
    public int getPageNumber() { return 0; }
    @android.annotation.NonNull
    public int[] getSelectedIndices() { return null; }
    @android.annotation.Nullable
    public java.lang.String getText() { return null; }
    public int getType() { return 0; }
    public int getWidgetIndex() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, int p2) {}
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormEditRecord build() { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormEditRecord.Builder setClickPoint(android.graphics.Point p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormEditRecord.Builder setSelectedIndices(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.models.FormEditRecord.Builder setText(java.lang.String p0) { return null; }
    }
}
