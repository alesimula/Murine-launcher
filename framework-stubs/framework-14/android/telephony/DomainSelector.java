package android.telephony;

public interface DomainSelector {
    public void cancelSelection();
    public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0);
    public void finishSelection();
}
