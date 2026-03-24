package android.telephony;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
public interface DomainSelector {
    public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0);
    public void finishSelection();
}
