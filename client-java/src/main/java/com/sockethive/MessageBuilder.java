package com.sockethive;

import org.json.JSONObject;

public class MessageBuilder {
    private final JSONObject root;
    private final JSONObject data;

    public MessageBuilder(String type) {
        this.root = new JSONObject();
        this.data = new JSONObject();
        this.root.put("type", type);
        this.root.put("data", data);
    }

    public MessageBuilder add(String key, Object value) {
        data.put(key, value);
        return this;
    }

    public String build() {
        return root.toString();
    }

    public JSONObject asJson() {
        return root;
    }

    @Override
    public String toString() {
        return build();
    }
}

