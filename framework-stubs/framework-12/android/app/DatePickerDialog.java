package android.app;

public class DatePickerDialog extends android.app.AlertDialog implements android.content.DialogInterface.OnClickListener, android.widget.DatePicker.OnDateChangedListener {
    private static final java.lang.String YEAR = "year";
    private static final java.lang.String MONTH = "month";
    private static final java.lang.String DAY = "day";
    private final android.widget.DatePicker mDatePicker = null;
    private android.app.DatePickerDialog.OnDateSetListener mDateSetListener;
    private final android.widget.DatePicker.ValidationCallback mValidationCallback = null;
    public DatePickerDialog(android.content.Context p0) { super((android.content.Context)null); }
    public DatePickerDialog(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public DatePickerDialog(android.content.Context p0, android.app.DatePickerDialog.OnDateSetListener p1, int p2, int p3, int p4) { super((android.content.Context)null); }
    public DatePickerDialog(android.content.Context p0, int p1, android.app.DatePickerDialog.OnDateSetListener p2, int p3, int p4, int p5) { super((android.content.Context)null); }
    private DatePickerDialog(android.content.Context p0, int p1, android.app.DatePickerDialog.OnDateSetListener p2, java.util.Calendar p3, int p4, int p5, int p6) { super((android.content.Context)null); }
    static int resolveDialogTheme(android.content.Context p0, int p1) { return 0; }
    public void onDateChanged(android.widget.DatePicker p0, int p1, int p2, int p3) {}
    public void setOnDateSetListener(android.app.DatePickerDialog.OnDateSetListener p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public android.widget.DatePicker getDatePicker() { return null; }
    public void updateDate(int p0, int p1, int p2) {}
    public android.os.Bundle onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Bundle p0) {}

    public static interface OnDateSetListener {
        public void onDateSet(android.widget.DatePicker p0, int p1, int p2, int p3);
    }
}
