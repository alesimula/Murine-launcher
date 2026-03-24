package android.service.autofill;

public final class FillEventHistory implements android.os.Parcelable {
    private static final java.lang.String TAG = "FillEventHistory";
    private final int mSessionId = 0;
    private final android.os.Bundle mClientState = null;
    java.util.List<android.service.autofill.FillEventHistory.Event> mEvents;
    public static final android.os.Parcelable.Creator<android.service.autofill.FillEventHistory> CREATOR = null;
    public int getSessionId() { return 0; }
    @java.lang.Deprecated
    public android.os.Bundle getClientState() { return null; }
    public java.util.List<android.service.autofill.FillEventHistory.Event> getEvents() { return null; }
    public void addEvent(android.service.autofill.FillEventHistory.Event p0) {}
    public FillEventHistory(int p0, android.os.Bundle p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Event {
        public static final int TYPE_DATASET_SELECTED = 0;
        public static final int TYPE_DATASET_AUTHENTICATION_SELECTED = 1;
        public static final int TYPE_AUTHENTICATION_SELECTED = 2;
        public static final int TYPE_SAVE_SHOWN = 3;
        public static final int TYPE_CONTEXT_COMMITTED = 4;
        public static final int TYPE_DATASETS_SHOWN = 5;
        private final int mEventType = 0;
        private final java.lang.String mDatasetId = null;
        private final android.os.Bundle mClientState = null;
        private final java.util.List<java.lang.String> mSelectedDatasetIds = null;
        private final android.util.ArraySet<java.lang.String> mIgnoredDatasetIds = null;
        private final java.util.ArrayList<android.view.autofill.AutofillId> mChangedFieldIds = null;
        private final java.util.ArrayList<java.lang.String> mChangedDatasetIds = null;
        private final java.util.ArrayList<android.view.autofill.AutofillId> mManuallyFilledFieldIds = null;
        private final java.util.ArrayList<java.util.ArrayList<java.lang.String>> mManuallyFilledDatasetIds = null;
        private final android.view.autofill.AutofillId[] mDetectedFieldIds = null;
        private final android.service.autofill.FieldClassification[] mDetectedFieldClassifications = null;
        public int getType() { return 0; }
        public java.lang.String getDatasetId() { return null; }
        public android.os.Bundle getClientState() { return null; }
        public java.util.Set<java.lang.String> getSelectedDatasetIds() { return null; }
        public java.util.Set<java.lang.String> getIgnoredDatasetIds() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, java.lang.String> getChangedFields() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, android.service.autofill.FieldClassification> getFieldsClassification() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, java.util.Set<java.lang.String>> getManuallyEnteredField() { return null; }
        public Event(int p0, java.lang.String p1, android.os.Bundle p2, java.util.List<java.lang.String> p3, android.util.ArraySet<java.lang.String> p4, java.util.ArrayList<android.view.autofill.AutofillId> p5, java.util.ArrayList<java.lang.String> p6, java.util.ArrayList<android.view.autofill.AutofillId> p7, java.util.ArrayList<java.util.ArrayList<java.lang.String>> p8, android.view.autofill.AutofillId[] p9, android.service.autofill.FieldClassification[] p10) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface EventIds {
        }
    }
}
