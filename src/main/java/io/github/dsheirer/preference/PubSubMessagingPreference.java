package io.github.dsheirer.preference;

import io.github.dsheirer.sample.Listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.prefs.Preferences;

/**
 * User preferences for pub/sub messaging
 */
public class PubSubMessagingPreference extends Preference {

    private static final String PREFERENCE_KEY_PUBSUB_ENABLED = "pubsub.enabled";
    private static final String PREFERENCE_KEY_PUBSUB_HOSTNAME = "pubsub.hostname";
    private static final String PREFERENCE_KEY_PUBSUB_PORT = "pubsub.port";
    private static final String PREFERENCE_KEY_PUBSUB_USERNAME = "pubsub.username";
    private static final String PREFERENCE_KEY_PUBSUB_PASSWORD = "pubsub.password";
    private static final String PREFERENCE_KEY_PUBSUB_TOPIC = "pubsub.topic";
    private static final Logger mLog = LoggerFactory.getLogger(PubSubMessagingPreference.class);
    private final Preferences mPreferences = Preferences.userNodeForPackage(PubSubMessagingPreference.class);

    public PubSubMessagingPreference(Listener<PreferenceType> updateListener) {
        super(updateListener);
    }

    @Override
    public PreferenceType getPreferenceType()
    {
        return PreferenceType.PUB_SUB_MESSAGING;
    }

    public String getPubSubMessagingEnabled() {
        return mPreferences.get(PREFERENCE_KEY_PUBSUB_ENABLED, "false");
    }

    public void setPubSubMessagingEnabled(String value) {
        mPreferences.put(PREFERENCE_KEY_PUBSUB_ENABLED, value);
    }

    public String getPubSubMessagingHostname() {
        return mPreferences.get(PREFERENCE_KEY_PUBSUB_HOSTNAME, null);
    }

    public void setPubSubMessagingHostname(String setting) {
        mPreferences.put(PREFERENCE_KEY_PUBSUB_HOSTNAME, setting);
        notifyPreferenceUpdated();
    }

    public String getPubSubMessagingPort() {
        return mPreferences.get(PREFERENCE_KEY_PUBSUB_PORT, "1813");
    }

    public void setPubSubMessagingPort(String port) {
        mPreferences.put(PREFERENCE_KEY_PUBSUB_PORT, port);
        notifyPreferenceUpdated();
    }

    public String getPubSubMessagingUsername() {
        return mPreferences.get(PREFERENCE_KEY_PUBSUB_USERNAME, null);
    }

    public void setPubSubMessagingUsername(String username) {
        mPreferences.put(PREFERENCE_KEY_PUBSUB_USERNAME, username);
        notifyPreferenceUpdated();
    }

    public String getPubSubMessagingPassword() {
        return mPreferences.get(PREFERENCE_KEY_PUBSUB_PASSWORD, null);
    }

    public void setPubSubMessagingPassword(String password) {
        mPreferences.put(PREFERENCE_KEY_PUBSUB_PASSWORD, password);
        notifyPreferenceUpdated();
    }

    public String getPubSubMessagingTopic() {
        return mPreferences.get(PREFERENCE_KEY_PUBSUB_TOPIC, null);
    }

    public void setPubSubMessagingTopic(String topic) {
        mPreferences.put(PREFERENCE_KEY_PUBSUB_TOPIC, topic);
        notifyPreferenceUpdated();
    }

}
