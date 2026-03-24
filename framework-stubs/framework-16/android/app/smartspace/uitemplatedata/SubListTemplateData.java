package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class SubListTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.SubListTemplateData> CREATOR = null;
    SubListTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    @android.annotation.Nullable
    public android.app.smartspace.uitemplatedata.Icon getSubListIcon() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.smartspace.uitemplatedata.Text> getSubListTexts() { return null; }
    @android.annotation.Nullable
    public android.app.smartspace.uitemplatedata.TapAction getSubListAction() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        public Builder(java.util.List<android.app.smartspace.uitemplatedata.Text> p0) { super(0); }
        @android.annotation.NonNull
        public android.app.smartspace.uitemplatedata.SubListTemplateData.Builder setSubListIcon(android.app.smartspace.uitemplatedata.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.app.smartspace.uitemplatedata.SubListTemplateData.Builder setSubListAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
        @android.annotation.NonNull
        public android.app.smartspace.uitemplatedata.SubListTemplateData build() { return null; }
    }
}
