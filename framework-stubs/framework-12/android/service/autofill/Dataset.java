package android.service.autofill;

public final class Dataset implements android.os.Parcelable {
    private final java.util.ArrayList<android.view.autofill.AutofillId> mFieldIds = null;
    private final java.util.ArrayList<android.view.autofill.AutofillValue> mFieldValues = null;
    private final java.util.ArrayList<android.widget.RemoteViews> mFieldPresentations = null;
    private final java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlinePresentations = null;
    private final java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlineTooltipPresentations = null;
    private final java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> mFieldFilters = null;
    private final android.content.ClipData mFieldContent = null;
    private final android.widget.RemoteViews mPresentation = null;
    private final android.service.autofill.InlinePresentation mInlinePresentation = null;
    private final android.service.autofill.InlinePresentation mInlineTooltipPresentation = null;
    private final android.content.IntentSender mAuthentication = null;
    java.lang.String mId;
    public static final android.os.Parcelable.Creator<android.service.autofill.Dataset> CREATOR = null;
    private Dataset(android.service.autofill.Dataset.Builder p0) {}
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public java.util.ArrayList<android.view.autofill.AutofillId> getFieldIds() { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public java.util.ArrayList<android.view.autofill.AutofillValue> getFieldValues() { return null; }
    public android.widget.RemoteViews getFieldPresentation(int p0) { return null; }
    public android.service.autofill.InlinePresentation getFieldInlinePresentation(int p0) { return null; }
    public android.service.autofill.InlinePresentation getFieldInlineTooltipPresentation(int p0) { return null; }
    public android.service.autofill.Dataset.DatasetFieldFilter getFilter(int p0) { return null; }
    public android.content.ClipData getFieldContent() { return null; }
    public android.content.IntentSender getAuthentication() { return null; }
    public boolean isEmpty() { return false; }
    public java.lang.String toString() { return null; }
    public java.lang.String getId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.ArrayList<android.view.autofill.AutofillId> mFieldIds;
        private java.util.ArrayList<android.view.autofill.AutofillValue> mFieldValues;
        private java.util.ArrayList<android.widget.RemoteViews> mFieldPresentations;
        private java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlinePresentations;
        private java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlineTooltipPresentations;
        private java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> mFieldFilters;
        private android.content.ClipData mFieldContent;
        private android.widget.RemoteViews mPresentation;
        private android.service.autofill.InlinePresentation mInlinePresentation;
        private android.service.autofill.InlinePresentation mInlineTooltipPresentation;
        private android.content.IntentSender mAuthentication;
        private boolean mDestroyed;
        private java.lang.String mId;
        public Builder(android.widget.RemoteViews p0) {}
        @android.annotation.SystemApi
        public Builder(android.service.autofill.InlinePresentation p0) {}
        public Builder() {}
        public android.service.autofill.Dataset.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0) { return null; }
        public android.service.autofill.Dataset.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0, android.service.autofill.InlinePresentation p1) { return null; }
        public android.service.autofill.Dataset.Builder setAuthentication(android.content.IntentSender p0) { return null; }
        public android.service.autofill.Dataset.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.service.autofill.Dataset.Builder setContent(android.view.autofill.AutofillId p0, android.content.ClipData p1) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4, android.service.autofill.InlinePresentation p5) { return null; }
        @android.annotation.SystemApi
        public android.service.autofill.Dataset.Builder setFieldInlinePresentation(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.service.autofill.InlinePresentation p3) { return null; }
        private void setLifeTheUniverseAndEverything(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.Dataset.DatasetFieldFilter p4) {}
        private void setLifeTheUniverseAndEverything(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4, android.service.autofill.Dataset.DatasetFieldFilter p5) {}
        public android.service.autofill.Dataset build() { return null; }
        private void throwIfDestroyed() {}
    }

    public static final class DatasetFieldFilter implements android.os.Parcelable {
        public final java.util.regex.Pattern pattern = null;
        public static final android.os.Parcelable.Creator<android.service.autofill.Dataset.DatasetFieldFilter> CREATOR = null;
        private DatasetFieldFilter(java.util.regex.Pattern p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
