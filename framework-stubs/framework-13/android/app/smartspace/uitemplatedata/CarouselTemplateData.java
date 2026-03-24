package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class CarouselTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.CarouselTemplateData> CREATOR = null;
    CarouselTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> getCarouselItems() { return null; }
    public android.app.smartspace.uitemplatedata.TapAction getCarouselAction() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        public Builder(java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> p0) { super(0); }
        public android.app.smartspace.uitemplatedata.CarouselTemplateData.Builder setCarouselAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
        public android.app.smartspace.uitemplatedata.CarouselTemplateData build() { return null; }
    }

    public static final class CarouselItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> CREATOR = null;
        CarouselItem(android.os.Parcel p0) {}
        public android.app.smartspace.uitemplatedata.Text getUpperText() { return null; }
        public android.app.smartspace.uitemplatedata.Icon getImage() { return null; }
        public android.app.smartspace.uitemplatedata.Text getLowerText() { return null; }
        public android.app.smartspace.uitemplatedata.TapAction getTapAction() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @android.annotation.SystemApi
        public static final class Builder {
            public Builder() {}
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setUpperText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setImage(android.app.smartspace.uitemplatedata.Icon p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setLowerText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setTapAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem build() { return null; }
        }
    }
}
