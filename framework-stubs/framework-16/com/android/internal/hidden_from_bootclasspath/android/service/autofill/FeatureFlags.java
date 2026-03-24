package com.android.internal.hidden_from_bootclasspath.android.service.autofill;

public interface FeatureFlags {
    public boolean addAccessibilityTitleForAugmentedAutofillDropdown();
    public boolean addLastFocusedIdToClientState();
    public boolean addLastFocusedIdToFillEventHistory();
    public boolean addSessionIdToClientState();
    public boolean autofillCredmanDevIntegration();
    public boolean autofillCredmanIntegration();
    public boolean autofillCredmanIntegrationPhase2();
    public boolean autofillSessionDestroyed();
    public boolean autofillWMetrics();
    public boolean fillDialogImprovements();
    public boolean fillDialogImprovementsImpl();
    public boolean fillFieldsFromCurrentSessionOnly();
    public boolean fixGetAutofillComponent();
    public boolean highlightAutofillSingleField();
    public boolean improveFillDialogAconfig();
    public boolean includeInvisibleViewGroupInAssistStructure();
    public boolean logAugmentedServiceUid();
    public boolean metricsFixes();
    public boolean multipleFillHistory();
    public boolean relayout();
    public boolean relayoutFix();
    public boolean remoteFillServiceUseWeakReference();
    public boolean test();
    public boolean testFlag();
}
