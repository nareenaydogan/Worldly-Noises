package com.example.wordlynoises.ui.main;

public class ChatItem {

    String senderProfileImageUrl;
    String senderName;
    String lastMessage;

    ChatItem (String senderProfileImageUrl, String senderName, String newlastMessage) {
        this.senderName = senderName;
        this.lastMessage = newlastMessage;
        this.senderProfileImageUrl = senderProfileImageUrl;
    }
}