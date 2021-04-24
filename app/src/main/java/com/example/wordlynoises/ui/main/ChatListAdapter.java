package com.example.wordlynoises.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wordlynoises.R;

import java.util.ArrayList;

public class ChatListAdapter extends
        RecyclerView.Adapter<ChatListAdapter.ViewHolder> {

    ArrayList<ChatItem> chats;

    ChatListAdapter(ArrayList<ChatItem> newChats) {
        this.chats = newChats;
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView senderName;
        public TextView lastMessage;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            senderName = (TextView) itemView.findViewById(R.id.senderName);
            lastMessage = (TextView) itemView.findViewById(R.id.lastMessage);
        }
    }

    @NonNull
    @Override
    public ChatListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View chatView = inflater.inflate(R.layout.chat_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(chatView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatListAdapter.ViewHolder holder, int position) {
        ChatItem chatItem = chats.get(position);
        holder.senderName.setText(chatItem.senderName);
        holder.lastMessage.setText(chatItem.lastMessage);
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
