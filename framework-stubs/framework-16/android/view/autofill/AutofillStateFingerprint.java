package android.view.autofill;

public final class AutofillStateFingerprint {
    java.util.ArrayList<android.view.autofill.AutofillId> mPriorAutofillIds;
    java.util.ArrayList<java.lang.Integer> mViewHashCodes;
    boolean mHideHighlight;
    java.util.Map<java.lang.Integer, android.view.autofill.AutofillId> mHashToAutofillIdMap;
    java.util.Map<android.view.autofill.AutofillId, android.view.autofill.AutofillId> mOldIdsToCurrentAutofillIdMap;
    public static android.view.autofill.AutofillStateFingerprint createInstance() { return null; }
    void setSessionId(int p0) {}
    void setUseRelativePosition(boolean p0) {}
    void storeStatePriorToAuthentication(android.view.autofill.AutofillManager.AutofillClient p0, java.util.Set<android.view.autofill.AutofillId> p1) {}
    void storeFailedIdsAndValues(java.util.ArrayList<android.view.autofill.AutofillId> p0, java.util.ArrayList<android.view.autofill.AutofillValue> p1, boolean p2) {}
    boolean attemptRefill(java.util.List<android.view.View> p0, android.view.autofill.AutofillManager p1) { return false; }
    android.util.ArrayMap<java.lang.Integer, android.view.View> getFingerprintIds(java.util.List<android.view.View> p0) { return null; }
    public int getEphemeralFingerprintId(android.view.View p0, int p1) { return 0; }
}
