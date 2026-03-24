package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class SubCardTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.SubCardTemplateData> CREATOR = null;
    SubCardTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public android.app.smartspace.uitemplatedata.Icon getSubCardIcon() { return null; }
    public android.app.smartspace.uitemplatedata.Text getSubCardText() { return null; }
    public android.app.smartspace.uitemplatedata.TapAction getSubCardAction() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        public Builder(android.app.smartspace.uitemplatedata.Icon p0) { super(0); }
        public android.app.smartspace.uitemplatedata.SubCardTemplateData.Builder setSubCardText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
        public android.app.smartspace.uitemplatedata.SubCardTemplateData.Builder setSubCardAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
        public android.app.smartspace.uitemplatedata.SubCardTemplateData build() { return null; }
    }
}
