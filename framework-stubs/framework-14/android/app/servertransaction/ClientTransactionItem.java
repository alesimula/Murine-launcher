package android.app.servertransaction;

public abstract class ClientTransactionItem implements android.app.servertransaction.BaseClientRequest, android.os.Parcelable {
    public ClientTransactionItem() {}
    public int getPostExecutionState() { return 0; }
    boolean shouldHaveDefinedPreExecutionState() { return false; }
    public int describeContents() { return 0; }
}
