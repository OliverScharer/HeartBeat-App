package com.example.heartbeat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder>{

    private ArrayList<ChatItem> mChatlist;
    private ChatAdapter.OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mText1;
        public ImageView mImageView2;


        public ChatViewHolder(View itemView, final OnItemClickListener listener){
            super(itemView);
            mImageView = itemView.findViewById(R.id. imageView);
            mText1 = itemView.findViewById(R.id.matchBtn);
            mImageView2 = itemView.findViewById(R.id.imageView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }

    }
    public ChatAdapter (ArrayList<ChatItem> chatlist)
    {
        mChatlist = chatlist;
    }

    @Override
    public ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout, parent, false);
        ChatViewHolder e = new ChatViewHolder(v, mListener);
        return e;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position)
    {
    ChatItem currentItem = mChatlist.get(position);
    holder.mImageView.setImageResource(currentItem.getImageResource());
    holder.mText1.setText(currentItem.getText1());
    holder.mImageView2.setImageResource(currentItem.getImageresource2());

    }

    @Override
    public int getItemCount() {
        return mChatlist.size();
    }
}

