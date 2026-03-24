package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
@android.annotation.SuppressLint("ParcelNotFinal")
public class BaseTemplateData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.BaseTemplateData> CREATOR = null;
    BaseTemplateData(android.os.Parcel p0) {}
    BaseTemplateData(int p0, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p1, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p3, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p4, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p5, int p6) {}
    public int getTemplateType() { return 0; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getPrimaryItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleSupplementalItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalLineItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalAlarmItem() { return null; }
    public int getLayoutWeight() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    @android.annotation.SuppressLint("StaticFinalBuilder")
    public static class Builder {
        public Builder(int p0) {}
        @android.annotation.SuppressLint("GetterOnBuilder")
        int getTemplateType() { return 0; }
        @android.annotation.SuppressLint("GetterOnBuilder")
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getPrimaryItem() { return null; }
        @android.annotation.SuppressLint("GetterOnBuilder")
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleItem() { return null; }
        @android.annotation.SuppressLint("GetterOnBuilder")
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleSupplemtnalItem() { return null; }
        @android.annotation.SuppressLint("GetterOnBuilder")
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalLineItem() { return null; }
        @android.annotation.SuppressLint("GetterOnBuilder")
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalAlarmItem() { return null; }
        @android.annotation.SuppressLint("GetterOnBuilder")
        int getLayoutWeight() { return 0; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setPrimaryItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSubtitleItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSubtitleSupplementalItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSupplementalLineItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSupplementalAlarmItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setLayoutWeight(int p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData build() { return null; }
    }

    public static final class SubItemInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo> CREATOR = null;
        SubItemInfo(android.os.Parcel p0) {}
        public android.app.smartspace.uitemplatedata.Text getText() { return null; }
        public android.app.smartspace.uitemplatedata.Icon getIcon() { return null; }
        public android.app.smartspace.uitemplatedata.TapAction getTapAction() { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo getLoggingInfo() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @android.annotation.SystemApi
        public static final class Builder {
            public Builder() {}
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setIcon(android.app.smartspace.uitemplatedata.Icon p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setTapAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setLoggingInfo(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo build() { return null; }
        }
    }

    public static final class SubItemLoggingInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo> CREATOR = null;
        SubItemLoggingInfo(android.os.Parcel p0) {}
        public int getInstanceId() { return 0; }
        public int getFeatureType() { return 0; }
        public java.lang.CharSequence getPackageName() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @android.annotation.SystemApi
        public static final class Builder {
            public Builder(int p0, int p1) {}
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo.Builder setPackageName(java.lang.CharSequence p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo build() { return null; }
        }
    }
}
