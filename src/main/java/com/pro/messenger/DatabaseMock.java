package com.pro.messenger;

import com.pro.messenger.model.Message;
import com.pro.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 29.12.2015.
 */
public class DatabaseMock {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
