package app.murinelauncher.settings.common;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Set;

/**
 * Manages sticky-header behaviour for a preference RecyclerView.
 * <p>
 * When a sticky item scrolls past the top edge, a duplicate ViewHolder is created and placed in the
 * provided overlay container. When another sticky item approaches, it pushes the current one upward
 */
public class StickyHeaderDecoration extends RecyclerView.OnScrollListener {

    private final RecyclerView recyclerView;
    private final Set<Integer> stickyPositions;
    private final FrameLayout stickyContainer;

    private int currentPinnedPos = -1;
    private RecyclerView.ViewHolder pinnedHolder;

    /**
     * @param recyclerView the preference list
     * @param stickyPositions adapter positions that should behave as sticky headers
     * @param container a FrameLayout already added to the view hierarchy, overlaying the top of the RecyclerView
     */
    public StickyHeaderDecoration(@NonNull RecyclerView recyclerView, @NonNull Set<Integer> stickyPositions, @NonNull FrameLayout container) {
        this.recyclerView = recyclerView;
        this.stickyPositions = stickyPositions;
        this.stickyContainer = container;
        recyclerView.addOnScrollListener(this);
    }

    @Override
    public void onScrolled(@NonNull RecyclerView rv, int dx, int dy) {
        updateStickyHeader();
    }

    private void updateStickyHeader() {
        int topEdge = recyclerView.getPaddingTop();

        // Find the latest sticky position whose item has scrolled past the top
        int shouldPin = -1;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View child = recyclerView.getChildAt(i);
            int pos = recyclerView.getChildAdapterPosition(child);
            if (pos != RecyclerView.NO_POSITION
                    && stickyPositions.contains(pos)
                    && child.getTop() < topEdge) {
                shouldPin = Math.max(shouldPin, pos);
            }
        }

        // Check for sticky items that already scrolled completely off-screen
        if (shouldPin < 0) {
            int firstVisible = Integer.MAX_VALUE;
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                int pos = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i));
                if (pos != RecyclerView.NO_POSITION) firstVisible = Math.min(firstVisible, pos);
            }
            for (int sp : stickyPositions) {
                if (sp < firstVisible) shouldPin = Math.max(shouldPin, sp);
            }
        }

        // Hide overlay when there is nothing to pin
        if (shouldPin < 0) {
            unpinCurrent();
            return;
        }

        // Pin (or re-pin) if the position changed.
        if (shouldPin != currentPinnedPos) pinPosition(shouldPin);
        // Push-up effect from the next approaching sticky.
        updatePushEffect();
        // Hide the original item so it doesn't show behind the overlay.
        hideOriginalItem();
    }

    @SuppressWarnings("unchecked")
    private void pinPosition(int position) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) return;
        int viewType = adapter.getItemViewType(position);

        stickyContainer.removeAllViews();
        pinnedHolder = adapter.createViewHolder(recyclerView, viewType);
        stickyContainer.addView(pinnedHolder.itemView,
                new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        adapter.bindViewHolder(pinnedHolder, position);
        stickyContainer.setVisibility(View.VISIBLE);
        stickyContainer.setTranslationY(0);
        currentPinnedPos = position;

        // Force measure/layout so the container has proper dimensions immediately, rather than waiting for the next layout pass
        int width = recyclerView.getWidth();
        if (width > 0) {
            int wSpec = View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY);
            int hSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
            stickyContainer.measure(wSpec, hSpec);
            stickyContainer.layout(0, 0, stickyContainer.getMeasuredWidth(), stickyContainer.getMeasuredHeight());
        }
    }

    private void unpinCurrent() {
        if (currentPinnedPos >= 0) {
            restoreOriginalItem();
            stickyContainer.setVisibility(View.GONE);
            stickyContainer.setTranslationY(0);
            currentPinnedPos = -1;
        }
    }

    private void hideOriginalItem() {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View child = recyclerView.getChildAt(i);
            int pos = recyclerView.getChildAdapterPosition(child);
            child.setAlpha(pos == currentPinnedPos ? 0f : 1f);
        }
    }

    private void restoreOriginalItem() {
        for (int i = 0; i < recyclerView.getChildCount(); i++)
            recyclerView.getChildAt(i).setAlpha(1f);
    }

    private void updatePushEffect() {
        if (currentPinnedPos < 0 || stickyContainer.getVisibility() != View.VISIBLE) return;
        int stickyHeight = stickyContainer.getHeight();
        if (stickyHeight <= 0) return;

        // Convert the next sticky child's top into the same coordinate space as the stickyContainer (relative to common parent).
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View child = recyclerView.getChildAt(i);
            int pos = recyclerView.getChildAdapterPosition(child);
            if (pos != RecyclerView.NO_POSITION && stickyPositions.contains(pos) && pos > currentPinnedPos) {
                int nextTopInParent = child.getTop() + recyclerView.getTop();
                if (nextTopInParent < stickyHeight) stickyContainer.setTranslationY(nextTopInParent - stickyHeight);
                else stickyContainer.setTranslationY(0);
                return;
            }
        }
        stickyContainer.setTranslationY(0);
    }
}
