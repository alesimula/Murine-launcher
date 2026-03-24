package android.service.autofill;

public final class Dataset implements android.os.Parcelable {
    private final java.util.ArrayList<android.view.autofill.AutofillId> mFieldIds = null;
    private final java.util.ArrayList<android.view.autofill.AutofillValue> mFieldValues = null;
    private final java.util.ArrayList<android.widget.RemoteViews> mFieldPresentations = null;
    private final java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> mFieldFilters = null;
    private final android.widget.RemoteViews mPresentation = null;
    private final android.content.IntentSender mAuthentication = null;
    java.lang.String mId;
    public static final android.os.Parcelable.Creator<android.service.autofill.Dataset> CREATOR = null;
    private Dataset(android.service.autofill.Dataset.Builder p0) {}
    public java.util.ArrayList<android.view.autofill.AutofillId> getFieldIds() { return null; }
    public java.util.ArrayList<android.view.autofill.AutofillValue> getFieldValues() { return null; }
    public android.widget.RemoteViews getFieldPresentation(int p0) { return null; }
    public android.service.autofill.Dataset.DatasetFieldFilter getFilter(int p0) { return null; }
    public android.content.IntentSender getAuthentication() { return null; }
    public boolean isEmpty() { return false; }
    public java.lang.String toString() { return null; }
    public java.lang.String getId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class DatasetFieldFilter implements android.os.Parcelable {
        public final java.util.regex.Pattern pattern = null;
        public static final android.os.Parcelable.Creator<android.service.autofill.Dataset.DatasetFieldFilter> CREATOR = null;
        private DatasetFieldFilter(java.util.regex.Pattern p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Builder {
        private java.util.ArrayList<android.view.autofill.AutofillId> mFieldIds;
        private java.util.ArrayList<android.view.autofill.AutofillValue> mFieldValues;
        private java.util.ArrayList<android.widget.RemoteViews> mFieldPresentations;
        private java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> mFieldFilters;
        private android.widget.RemoteViews mPresentation;
        private android.content.IntentSender mAuthentication;
        private boolean mDestroyed;
        private java.lang.String mId;
        public Builder(android.widget.RemoteViews p0) {}
        public Builder() {}
        public android.service.autofill.Dataset.Builder setAuthentication(android.content.IntentSender p0) { return null; }
        public android.service.autofill.Dataset.Builder setId(java.lang.String p0) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2) { return null; }
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3) { return null; }
        private void setLifeTheUniverseAndEverything(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.Dataset.DatasetFieldFilter p3) {}
        public android.service.autofill.Dataset build() { return null; }
        private void throwIfDestroyed() {}
    }
}
