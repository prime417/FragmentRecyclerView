package com.example.pankaj.fragmentrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pankaj on 17-01-2018.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.RecyclerViewHolder>{




    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.list_item,parent,false);
        return new RecyclerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.imageId.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView mImageView;
        TextView mTextView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imgView);
            mTextView = itemView.findViewById(R.id.txtView);
            itemView.setOnClickListener(this);
        }
      public  void bindView (int position){

            mTextView.setText(OurData.nameId[position]);
            mImageView.setImageResource(OurData.imageId[position]);
      }

        @Override
        public void onClick(View v) {

        }
    }
}
