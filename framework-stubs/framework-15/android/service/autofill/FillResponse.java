package android.service.autofill;

public final class FillResponse implements android.os.Parcelable {
    public static final int FLAG_TRACK_CONTEXT_COMMITED = 1;
    public static final int FLAG_DISABLE_ACTIVITY_ONLY = 2;
    public static final int FLAG_DELAY_FILL = 4;
    public static final int FLAG_CREDENTIAL_MANAGER_RESPONSE = 8;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.FillResponse> CREATOR = null;
    public static android.service.autofill.FillResponse shallowCopy(android.service.autofill.FillResponse p0, java.util.List<android.service.autofill.Dataset> p1, android.service.autofill.SaveInfo p2) { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.service.assist.classification.FieldClassification> getDetectedFieldClassifications() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getClientState() { return null; }
    @android.annotation.Nullable
    public java.util.List<android.service.autofill.Dataset> getDatasets() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.SaveInfo getSaveInfo() { return null; }
    @android.annotation.Nullable
    public android.widget.RemoteViews getPresentation() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.InlinePresentation getInlinePresentation() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.InlinePresentation getInlineTooltipPresentation() { return null; }
    @android.annotation.Nullable
    public android.widget.RemoteViews getDialogPresentation() { return null; }
    @android.annotation.Nullable
    public android.widget.RemoteViews getDialogHeader() { return null; }
    @android.annotation.Nullable
    public android.widget.RemoteViews getHeader() { return null; }
    @android.annotation.Nullable
    public android.widget.RemoteViews getFooter() { return null; }
    @android.annotation.Nullable
    public android.content.IntentSender getAuthentication() { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId[] getAuthenticationIds() { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId[] getFillDialogTriggerIds() { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId[] getIgnoredIds() { return null; }
    public long getDisableDuration() { return 0L; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId[] getFieldClassificationIds() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.UserData getUserData() { return null; }
    public int getIconResourceId() { return 0; }
    public int getServiceDisplayNameResourceId() { return 0; }
    public boolean getShowFillDialogIcon() { return false; }
    public boolean getShowSaveDialogIcon() { return false; }
    public int getFlags() { return 0; }
    public void setRequestId(int p0) {}
    public int getRequestId() { return 0; }
    @android.annotation.Nullable
    public int[] getCancelIds() { return null; }
    public boolean supportsInlineSuggestions() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setDetectedFieldClassifications(java.util.Set<android.service.assist.classification.FieldClassification> p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.service.autofill.Presentations p2) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setIgnoredIds(android.view.autofill.AutofillId... p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder addDataset(android.service.autofill.Dataset p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setDatasets(java.util.ArrayList<android.service.autofill.Dataset> p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setSaveInfo(android.service.autofill.SaveInfo p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setClientState(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setFieldClassificationIds(android.view.autofill.AutofillId... p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder disableAutofill(long p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setIconResourceId(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setServiceDisplayNameResourceId(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setShowFillDialogIcon(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setShowSaveDialogIcon(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setHeader(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setFooter(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setUserData(android.service.autofill.UserData p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setPresentationCancelIds(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setDialogHeader(android.widget.RemoteViews p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setFillDialogTriggerIds(android.view.autofill.AutofillId... p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse.Builder setDialogPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.FillResponse build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface FillResponseFlags {
    }
}
