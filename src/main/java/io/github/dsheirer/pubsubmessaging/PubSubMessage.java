package io.github.dsheirer.pubsubmessaging;

import java.time.ZonedDateTime;

/**
 * A decoded message sent to a pub/sub interface.
 *
 * @author pwh
 */
public class PubSubMessage {

    private final ZonedDateTime timestamp;
    private final String messageType;
    private final String message;

    public PubSubMessage(ZonedDateTime timestamp, String messageType, String message) {
        this.timestamp = timestamp;
        this.messageType = messageType;
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getMessage() {
        return message;
    }

}
