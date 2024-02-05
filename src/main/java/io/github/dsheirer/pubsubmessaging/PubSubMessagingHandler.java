package io.github.dsheirer.pubsubmessaging;

import io.github.dsheirer.preference.PubSubMessagingPreference;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manage an interface to a publish/subscribe messaging system, such as MQTT
 */
public class PubSubMessagingHandler {

    private static final Logger mLogger = LoggerFactory.getLogger(PubSubMessagingHandler.class);

    private PubSubMessagingPreference preference;

    private MqttClient mqttClient;

    public PubSubMessagingHandler() {
        mLogger.info("Pub/Sub messaging handler initializing");
    }

    public void connect() {

        mLogger.info("Connecting to pub/sub server");

        mLogger.info("Enabled  = " + preference.getPubSubMessagingEnabled());
        mLogger.info("Hostname = " + preference.getPubSubMessagingHostname());
        mLogger.info("Port     = " + preference.getPubSubMessagingPort());
        mLogger.info("Username = " + preference.getPubSubMessagingUsername());
        mLogger.info("Password = " + preference.getPubSubMessagingPassword());
        mLogger.info("Topic    = " + preference.getPubSubMessagingTopic());

        try {

            mqttClient = new MqttClient(preference.getPubSubMessagingHostname() + ":" + preference.getPubSubMessagingPort(), "test");
            mqttClient.connect();

        } catch (MqttException e) {
            mLogger.error("Failed to connect to MQTT server at " + preference.getPubSubMessagingHostname() + ": " + e.getMessage());
        }

    }

    public void disconnect() {

        mLogger.info("Disconnecting from pub/sub server");

        try {
            mqttClient.disconnect();
        } catch (MqttException e) {
            mLogger.error("Failed to disconnect from MQTT server: " + e.getMessage());
        }

    }

    public void sendMessage(PubSubMessage message) {

        mLogger.info("Sending message");

    }

    /**
     * Attempts to connect to the messaging server and sends a message
     */
    public void testMessagingServer() {
    }

}
