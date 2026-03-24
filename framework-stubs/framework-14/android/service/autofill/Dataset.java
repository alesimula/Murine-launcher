package android.service.autofill;

public final class Dataset implements android.os.Parcelable {
    public static final int PICK_REASON_UNKNOWN = 0;
    public static final int PICK_REASON_NO_PCC = 1;
    public static final int PICK_REASON_PROVIDER_DETECTION_ONLY = 2;
    public static final int PICK_REASON_PROVIDER_DETECTION_PREFERRED_WITH_PCC = 3;
    public static final int PICK_REASON_PCC_DETECTION_ONLY = 4;
    public static final int PICK_REASON_PCC_DETECTION_PREFERRED_WITH_PROVIDER = 5;
    java.lang.String mId;
    public static final android.os.Parcelable.Creator<android.service.autofill.Dataset> CREATOR = null;
    public Dataset(java.util.ArrayList<android.view.autofill.AutofillId> p0, java.util.ArrayList<android.view.autofill.AutofillValue> p1, java.util.ArrayList<android.widget.RemoteViews> p2, java.util.ArrayList<android.widget.RemoteViews> p3, java.util.ArrayList<android.service.autofill.InlinePresentation> p4, java.util.ArrayList<android.service.autofill.InlinePresentation> p5, java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> p6, java.util.ArrayList<java.lang.String> p7, android.content.ClipData p8, android.widget.RemoteViews p9, android.widget.RemoteViews p10, android.service.autofill.InlinePresentation p11, android.service.autofill.InlinePresentation p12, java.lang.String p13, android.content.IntentSender p14) {}
    public Dataset(android.service.autofill.Dataset p0, java.util.ArrayList<android.view.autofill.AutofillId> p1) {}
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public java.util.ArrayList<java.lang.String> getAutofillDatatypes() { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public java.util.ArrayList<android.view.autofill.AutofillId> getFieldIds() { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public java.util.ArrayList<android.view.autofill.AutofillValue> getFieldValues() { return null; }
    public android.widget.RemoteViews getFieldPresentation(int p0) { return null; }
    public android.widget.RemoteViews getFieldDialogPresentation(int p0) { return null; }
    public android.service.autofill.InlinePresentation getFieldInlinePresentation(int p0) { return null; }
    public android.service.autofill.InlinePresentation getFieldInlineTooltipPresentation(int p0) { return null; }
    public android.service.autofill.Dataset.DatasetFieldFilter getFilter(int p0) { return null; }
    public android.content.ClipData getFieldContent() { return null; }
    public android.content.IntentSender getAuthentication() { return null; }
    public boolean isEmpty() { return false; }
    public java.lang.String toString() { return null; }
    public java.lang.String getId() { return null; }
    public void setEligibleReasonReason(int p0) {}
    public int getEligibleReason() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        @java.lang.Deprecated
        public Builder(android.widget.RemoteViews p0) {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public Builder(android.service.autofill.InlinePresentation p0) {}
        public Builder(android.service.autofill.Presentations p0) {}
        public Builder() {}
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0, android.service.autofill.InlinePresentation p1) { return null; }
        public android.service.autofill.Dataset.Builder setAuthentication(android.content.IntentSender p0) { return null; }
        public android.service.autofill.Dataset.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.service.autofill.Dataset.Builder setContent(android.view.autofill.AutofillId p0, android.content.ClipData p1) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4, android.service.autofill.InlinePresentation p5) { return null; }
        public android.service.autofill.Dataset.Builder setField(android.view.autofill.AutofillId p0, android.service.autofill.Field p1) { return null; }
        public android.service.autofill.Dataset.Builder setField(java.lang.String p0, android.service.autofill.Field p1) { return null; }
        public android.service.autofill.Dataset.Builder setFieldForAllHints(android.service.autofill.Field p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.SystemApi
        public android.service.autofill.Dataset.Builder setFieldInlinePresentation(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.service.autofill.InlinePresentation p3) { return null; }
        public android.service.autofill.Dataset build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatasetEligibleReason {
    }

    public static final class DatasetFieldFilter implements android.os.Parcelable {
        public final java.util.regex.Pattern pattern = null;
        public static final android.os.Parcelable.Creator<android.service.autofill.Dataset.DatasetFieldFilter> CREATOR = null;
        DatasetFieldFilter(java.util.regex.Pattern p0) {}
        public java.util.regex.Pattern getPattern() { return null; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
