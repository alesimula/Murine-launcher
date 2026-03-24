package android.app;

public final class RemoteInput implements android.os.Parcelable {
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final java.lang.String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    private static final java.lang.String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    public static final int SOURCE_CHOICE = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final int FLAG_ALLOW_FREE_FORM_INPUT = 1;
    private static final int DEFAULT_FLAGS = 1;
    private final java.lang.String mResultKey = null;
    private final java.lang.CharSequence mLabel = null;
    private final java.lang.CharSequence[] mChoices = null;
    private final int mFlags = 0;
    private final int mEditChoicesBeforeSending = 0;
    private final android.os.Bundle mExtras = null;
    private final android.util.ArraySet<java.lang.String> mAllowedDataTypes = null;
    public static final android.os.Parcelable.Creator<android.app.RemoteInput> CREATOR = null;
    private RemoteInput(java.lang.String p0, java.lang.CharSequence p1, java.lang.CharSequence[] p2, int p3, int p4, android.os.Bundle p5, android.util.ArraySet<java.lang.String> p6) {}
    public java.lang.String getResultKey() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.CharSequence[] getChoices() { return null; }
    public java.util.Set<java.lang.String> getAllowedDataTypes() { return null; }
    public boolean isDataOnly() { return false; }
    public boolean getAllowFreeFormInput() { return false; }
    public int getEditChoicesBeforeSending() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    private RemoteInput(android.os.Parcel p0) {}
    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent p0, java.lang.String p1) { return null; }
    public static android.os.Bundle getResultsFromIntent(android.content.Intent p0) { return null; }
    public static void addResultsToIntent(android.app.RemoteInput[] p0, android.content.Intent p1, android.os.Bundle p2) {}
    public static void addDataResultToIntent(android.app.RemoteInput p0, android.content.Intent p1, java.util.Map<java.lang.String, android.net.Uri> p2) {}
    public static void setResultsSource(android.content.Intent p0, int p1) {}
    public static int getResultsSource(android.content.Intent p0) { return 0; }
    private static java.lang.String getExtraResultsKeyForData(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static android.content.Intent getClipDataIntentFromIntent(android.content.Intent p0) { return null; }

    public static final class Builder {
        private final java.lang.String mResultKey = null;
        private final android.util.ArraySet<java.lang.String> mAllowedDataTypes = null;
        private final android.os.Bundle mExtras = null;
        private java.lang.CharSequence mLabel;
        private java.lang.CharSequence[] mChoices;
        private int mFlags;
        private int mEditChoicesBeforeSending;
        public Builder(java.lang.String p0) {}
        public android.app.RemoteInput.Builder setLabel(java.lang.CharSequence p0) { return null; }
        public android.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] p0) { return null; }
        public android.app.RemoteInput.Builder setAllowDataType(java.lang.String p0, boolean p1) { return null; }
        public android.app.RemoteInput.Builder setAllowFreeFormInput(boolean p0) { return null; }
        public android.app.RemoteInput.Builder setEditChoicesBeforeSending(int p0) { return null; }
        public android.app.RemoteInput.Builder addExtras(android.os.Bundle p0) { return null; }
        public android.os.Bundle getExtras() { return null; }
        private void setFlag(int p0, boolean p1) {}
        public android.app.RemoteInput build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }
}
