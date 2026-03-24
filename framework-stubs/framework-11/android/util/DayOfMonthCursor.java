package android.util;

public class DayOfMonthCursor extends android.util.MonthDisplayHelper {
    private int mRow;
    private int mColumn;
    public DayOfMonthCursor(int p0, int p1, int p2, int p3) { super(0, 0); }
    public int getSelectedRow() { return 0; }
    public int getSelectedColumn() { return 0; }
    public void setSelectedRowColumn(int p0, int p1) {}
    public int getSelectedDayOfMonth() { return 0; }
    public int getSelectedMonthOffset() { return 0; }
    public void setSelectedDayOfMonth(int p0) {}
    public boolean isSelected(int p0, int p1) { return false; }
    public boolean up() { return false; }
    public boolean down() { return false; }
    public boolean left() { return false; }
    public boolean right() { return false; }
}
