package com.dunbar.daniel.dunbaresume.Fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dunbar.daniel.dunbaresume.Data.EducationData;
import com.dunbar.daniel.dunbaresume.Fragments.EducationFragment.OnListFragmentInteractionListener;
import com.dunbar.daniel.dunbaresume.Fragments.dummy.DummyContent.DummyItem;
import com.dunbar.daniel.dunbaresume.R;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyEducationRecyclerViewAdapter extends RecyclerView.Adapter<MyEducationRecyclerViewAdapter.ViewHolder> {

    private final List<EducationData.EducationItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyEducationRecyclerViewAdapter(List<EducationData.EducationItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_education, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        EducationData.EducationItem item = mValues.get(position);
        holder.mItem = item;
        holder.mIdView.setText(item.getUniversity());
        holder.mContentView.setText(item.getDegree() + ": " + item.getMajor());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public EducationData.EducationItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
