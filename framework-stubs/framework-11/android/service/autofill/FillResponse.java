package android.service.autofill;

public final class FillResponse implements android.os.Parcelable {
    public static final int FLAG_TRACK_CONTEXT_COMMITED = 1;
    public static final int FLAG_DISABLE_ACTIVITY_ONLY = 2;
    private final android.content.pm.ParceledListSlice<android.service.autofill.Dataset> mDatasets = null;
    private final android.service.autofill.SaveInfo mSaveInfo = null;
    private final android.os.Bundle mClientState = null;
    private final android.widget.RemoteViews mPresentation = null;
    private final android.service.autofill.InlinePresentation mInlinePresentation = null;
    private final android.widget.RemoteViews mHeader = null;
    private final android.widget.RemoteViews mFooter = null;
    private final android.content.IntentSender mAuthentication = null;
    private final android.view.autofill.AutofillId[] mAuthenticationIds = null;
    private final android.view.autofill.AutofillId[] mIgnoredIds = null;
    private final long mDisableDuration = 0L;
    private final android.view.autofill.AutofillId[] mFieldClassificationIds = null;
    private final int mFlags = 0;
    private int mRequestId;
    private final android.service.autofill.UserData mUserData = null;
    private final int[] mCancelIds = null;
    private final boolean mSupportsInlineSuggestions = false;
    public static final android.os.Parcelable.Creator<android.service.autofill.FillResponse> CREATOR = null;
    private FillResponse(android.service.autofill.FillResponse.Builder p0) {}
    public android.os.Bundle getClientState() { return null; }
    public java.util.List<android.service.autofill.Dataset> getDatasets() { return null; }
    public android.service.autofill.SaveInfo getSaveInfo() { return null; }
    public android.widget.RemoteViews getPresentation() { return null; }
    public android.service.autofill.InlinePresentation getInlinePresentation() { return null; }
    public android.widget.RemoteViews getHeader() { return null; }
    public android.widget.RemoteViews getFooter() { return null; }
    public android.content.IntentSender getAuthentication() { return null; }
    public android.view.autofill.AutofillId[] getAuthenticationIds() { return null; }
    public android.view.autofill.AutofillId[] getIgnoredIds() { return null; }
    public long getDisableDuration() { return 0L; }
    public android.view.autofill.AutofillId[] getFieldClassificationIds() { return null; }
    public android.service.autofill.UserData getUserData() { return null; }
    public int getFlags() { return 0; }
    public void setRequestId(int p0) {}
    public int getRequestId() { return 0; }
    public int[] getCancelIds() { return null; }
    public boolean supportsInlineSuggestions() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.ArrayList<android.service.autofill.Dataset> mDatasets;
        private android.service.autofill.SaveInfo mSaveInfo;
        private android.os.Bundle mClientState;
        private android.widget.RemoteViews mPresentation;
        private android.service.autofill.InlinePresentation mInlinePresentation;
        private android.widget.RemoteViews mHeader;
        private android.widget.RemoteViews mFooter;
        private android.content.IntentSender mAuthentication;
        private android.view.autofill.AutofillId[] mAuthenticationIds;
        private android.view.autofill.AutofillId[] mIgnoredIds;
        private long mDisableDuration;
        private android.view.autofill.AutofillId[] mFieldClassificationIds;
        private int mFlags;
        private boolean mDestroyed;
        private android.service.autofill.UserData mUserData;
        private int[] mCancelIds;
        private boolean mSupportsInlineSuggestions;
        public Builder() {}
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2) { return null; }
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) { return null; }
        public android.service.autofill.FillResponse.Builder setIgnoredIds(android.view.autofill.AutofillId... p0) { return null; }
        public android.service.autofill.FillResponse.Builder addDataset(android.service.autofill.Dataset p0) { return null; }
        public android.service.autofill.FillResponse.Builder setSaveInfo(android.service.autofill.SaveInfo p0) { return null; }
        public android.service.autofill.FillResponse.Builder setClientState(android.os.Bundle p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFieldClassificationIds(android.view.autofill.AutofillId... p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFlags(int p0) { return null; }
        public android.service.autofill.FillResponse.Builder disableAutofill(long p0) { return null; }
        public android.service.autofill.FillResponse.Builder setHeader(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFooter(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.FillResponse.Builder setUserData(android.service.autofill.UserData p0) { return null; }
        public android.service.autofill.FillResponse.Builder setPresentationCancelIds(int[] p0) { return null; }
        public android.service.autofill.FillResponse build() { return null; }
        private void throwIfDestroyed() {}
        private void throwIfDisableAutofillCalled() {}
        private void throwIfAuthenticationCalled() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface FillResponseFlags {
    }
}
