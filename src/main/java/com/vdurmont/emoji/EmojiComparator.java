package com.vdurmont.emoji;

import java.util.Comparator;

public class EmojiComparator implements Comparator<Emoji> {
    public int compare(Emoji o1, Emoji o2) {
        if (o1.getHtmlHexadecimal().length() > o2.getHtmlHexadecimal().length()) {
            return -1;
        }
        else if (o1.getHtmlHexadecimal().length() == o2.getHtmlHexadecimal().length()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
