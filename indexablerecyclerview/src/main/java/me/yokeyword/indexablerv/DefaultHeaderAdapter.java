package me.yokeyword.indexablerv;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * 该HeaderAdapter 接收一个IndexableAdapter, 使其布局以及点击事件和IndexableAdapter一致
 * Created by YoKey on 16/10/8.
 */
public class DefaultHeaderAdapter<T> extends IndexableHeaderAdapter<T> {
    private IndexableAdapter<T> mAdapter;

    public DefaultHeaderAdapter(IndexableAdapter<T> adapter, String index, String indexTitle, List<T> datas) {
        super(index, indexTitle, datas);
        this.mAdapter = adapter;
    }

    @Override
    public int getItemViewType() {
        return EntityWrapper.TYPE_CONTENT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateContentView(ViewGroup parent) {
        return mAdapter.onCreateContentView(parent);
    }

    @Override
    public void onBindContentViewHolder(RecyclerView.ViewHolder holder, T entity) {
        mAdapter.onBindContentViewHolder(holder, entity);
    }
}