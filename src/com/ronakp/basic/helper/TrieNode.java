package com.ronakp.basic.helper;

import java.util.HashMap;

public class TrieNode {
    private HashMap<Character, TrieNode> children;
    private String content;
    private boolean isWord;

    public HashMap<Character, TrieNode> getChildren() {
        return this.children;
    }

    public String getContent() {
        return this.content;
    }

    public boolean getIsWord() {
        return this.isWord;
    }

    public void setIsWord(boolean value) {
        this.isWord = value;
    }
}
