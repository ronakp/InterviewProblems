package com.ronakp.basic;

import com.ronakp.basic.helper.TrieNode;

public class Trie {
    private TrieNode root;

    public void insert(String word) {
        TrieNode current = root;
    
        for (char l: word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
        }
        current.setIsWord(true);
    }

    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            TrieNode node = current.getChildren().get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.getIsWord();
    }

    public void delete(String word) {
        deleteRecursive(root, word, 0);
    }
    
    private boolean deleteRecursive(TrieNode current, String word, int index) {

        if (index == word.length()) {
            if (!current.getIsWord()) {
                return false;
            }
            current.setIsWord(false);

            return current.getChildren().isEmpty();
        }

        char ch = word.charAt(index);

        TrieNode node = current.getChildren().get(ch);

        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = deleteRecursive(node, word, index + 1) && !node.getIsWord();
    
        if (shouldDeleteCurrentNode) {
            current.getChildren().remove(ch);
            return current.getChildren().isEmpty();
        }
        return false;
    }
}
