package com.example.wordlynoises.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wordlynoises.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class ChatFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";


    ArrayList<ChatItem> chatItems = new ArrayList<>();


    public static ChatFragment newInstance(int index) {
        ChatFragment fragment = new ChatFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        insertRandomChats();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chat, container, false);


        RecyclerView chatListView = root.findViewById(R.id.chatList);

        ChatListAdapter chatListAdapter = new ChatListAdapter(chatItems);

        chatListView.setAdapter(chatListAdapter);
        // Set layout manager to position the items
        chatListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }

    private void insertRandomChats () {
        int i = 0;

        while (i < 5) {
            chatItems.add(new ChatItem("https://i.redd.it/fi48haz3f5i21.jpg", "Sender " + i, "Last Message"));
            i = i + 1;
        }
    }



}