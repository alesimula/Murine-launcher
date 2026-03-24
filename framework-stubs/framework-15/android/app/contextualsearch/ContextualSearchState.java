package android.app.contextualsearch;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.contextualsearch.flags.enable_service")
public final class ContextualSearchState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contextualsearch.ContextualSearchState> CREATOR = null;
    public ContextualSearchState(android.app.assist.AssistStructure p0, android.app.assist.AssistContent p1, android.os.Bundle p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public android.app.assist.AssistContent getContent() { return null; }
    @android.annotation.Nullable
    public android.app.assist.AssistStructure getStructure() { return null; }
    public android.os.Bundle getExtras() { return null; }
}
