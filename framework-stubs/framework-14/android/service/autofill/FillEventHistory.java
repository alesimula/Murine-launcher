package android.service.autofill;

public final class FillEventHistory implements android.os.Parcelable {
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
        public static final int TYPE_VIEW_REQUESTED_AUTOFILL = 6;
        public static final int NO_SAVE_UI_REASON_NONE = 0;
        public static final int NO_SAVE_UI_REASON_NO_SAVE_INFO = 1;
        public static final int NO_SAVE_UI_REASON_WITH_DELAY_SAVE_FLAG = 2;
        public static final int NO_SAVE_UI_REASON_HAS_EMPTY_REQUIRED = 3;
        public static final int NO_SAVE_UI_REASON_NO_VALUE_CHANGED = 4;
        public static final int NO_SAVE_UI_REASON_FIELD_VALIDATION_FAILED = 5;
        public static final int NO_SAVE_UI_REASON_DATASET_MATCH = 6;
        public static final int UI_TYPE_UNKNOWN = 0;
        public static final int UI_TYPE_MENU = 1;
        public static final int UI_TYPE_INLINE = 2;
        public static final int UI_TYPE_DIALOG = 3;
        public int getType() { return 0; }
        public java.lang.String getDatasetId() { return null; }
        public android.os.Bundle getClientState() { return null; }
        public java.util.Set<java.lang.String> getSelectedDatasetIds() { return null; }
        public java.util.Set<java.lang.String> getIgnoredDatasetIds() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, java.lang.String> getChangedFields() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, android.service.autofill.FieldClassification> getFieldsClassification() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, java.util.Set<java.lang.String>> getManuallyEnteredField() { return null; }
        public int getNoSaveUiReason() { return 0; }
        public int getUiType() { return 0; }
        public Event(int p0, java.lang.String p1, android.os.Bundle p2, java.util.List<java.lang.String> p3, android.util.ArraySet<java.lang.String> p4, java.util.ArrayList<android.view.autofill.AutofillId> p5, java.util.ArrayList<java.lang.String> p6, java.util.ArrayList<android.view.autofill.AutofillId> p7, java.util.ArrayList<java.util.ArrayList<java.lang.String>> p8, android.view.autofill.AutofillId[] p9, android.service.autofill.FieldClassification[] p10) {}
        public Event(int p0, java.lang.String p1, android.os.Bundle p2, java.util.List<java.lang.String> p3, android.util.ArraySet<java.lang.String> p4, java.util.ArrayList<android.view.autofill.AutofillId> p5, java.util.ArrayList<java.lang.String> p6, java.util.ArrayList<android.view.autofill.AutofillId> p7, java.util.ArrayList<java.util.ArrayList<java.lang.String>> p8, android.view.autofill.AutofillId[] p9, android.service.autofill.FieldClassification[] p10, int p11) {}
        public Event(int p0, java.lang.String p1, android.os.Bundle p2, java.util.List<java.lang.String> p3, android.util.ArraySet<java.lang.String> p4, java.util.ArrayList<android.view.autofill.AutofillId> p5, java.util.ArrayList<java.lang.String> p6, java.util.ArrayList<android.view.autofill.AutofillId> p7, java.util.ArrayList<java.util.ArrayList<java.lang.String>> p8, android.view.autofill.AutofillId[] p9, android.service.autofill.FieldClassification[] p10, int p11, int p12) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface EventIds {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface NoSaveReason {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UiType {
        }
    }
}
