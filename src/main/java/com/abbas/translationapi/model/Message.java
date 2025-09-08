package com.abbas.translationapi.model;

import lombok.Data;

@Data
public class Message {
    private String locale;
    private String content;
    private String key;
}
