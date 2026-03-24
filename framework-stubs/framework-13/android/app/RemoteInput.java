package android.app;

public final class RemoteInput implements android.os.Parcelable {
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    public static final int SOURCE_CHOICE = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final android.os.Parcelable.Creator<android.app.RemoteInput> CREATOR = null;
    public java.lang.String getResultKey() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.CharSequence[] getChoices() { return null; }
    public java.util.Set<java.lang.String> getAllowedDataTypes() { return null; }
    public boolean isDataOnly() { return false; }
    public boolean getAllowFreeFormInput() { return false; }
    public int getEditChoicesBeforeSending() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent p0, java.lang.String p1) { return null; }
    public static android.os.Bundle getResultsFromIntent(android.content.Intent p0) { return null; }
    public static void addResultsToIntent(android.app.RemoteInput[] p0, android.content.Intent p1, android.os.Bundle p2) {}
    public static void addDataResultToIntent(android.app.RemoteInput p0, android.content.Intent p1, java.util.Map<java.lang.String, android.net.Uri> p2) {}
    public static void setResultsSource(android.content.Intent p0, int p1) {}
    public static int getResultsSource(android.content.Intent p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public android.app.RemoteInput.Builder setLabel(java.lang.CharSequence p0) { return null; }
        public android.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] p0) { return null; }
        public android.app.RemoteInput.Builder setAllowDataType(java.lang.String p0, boolean p1) { return null; }
        public android.app.RemoteInput.Builder setAllowFreeFormInput(boolean p0) { return null; }
        public android.app.RemoteInput.Builder setEditChoicesBeforeSending(int p0) { return null; }
        public android.app.RemoteInput.Builder addExtras(android.os.Bundle p0) { return null; }
        public android.os.Bundle getExtras() { return null; }
        public android.app.RemoteInput build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }
}
