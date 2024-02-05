/*
 * *****************************************************************************
 * Copyright (C) 2024 Peter Hicks
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

package io.github.dsheirer.gui.preference.pubsubmessaging;

import io.github.dsheirer.gui.preference.directory.DirectoryPreferenceEditor;
import io.github.dsheirer.preference.PubSubMessagingPreference;
import io.github.dsheirer.preference.UserPreferences;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import org.controlsfx.control.ToggleSwitch;
import org.controlsfx.control.textfield.TextFields;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PubSubMessagingPreferenceEditor extends HBox {

    private final static Logger mLog = LoggerFactory.getLogger(DirectoryPreferenceEditor.class);

    public static final String PUBSUB_SERVER_TEXT = """
             Events and messages can be streamed to a messaging server supporting the MQTT protocol.
             
             Enter the hostname, TCP port and topic below, optionally adding a username and password if
             required by your server.
                                                    
             Click the 'Test' button to attempt to connect to the server and send a test message.
                                                    
             Note that only decoded messages are sent, and specifically no audio is sent.
            """;

    private final PubSubMessagingPreference mPubSubMessagingPreference;
    private GridPane mEditorPane;

    /**
     * Constructs an instance
     *
     * @param userPreferences for obtaining reference to preference.
     */
    public PubSubMessagingPreferenceEditor(UserPreferences userPreferences) {
        mPubSubMessagingPreference = userPreferences.getPubSubPreference();
        getChildren().add(getPubSubMessagingDetails());
    }

    private GridPane getPubSubMessagingDetails() {

        if (mEditorPane == null) {

            int row = 0;
            mEditorPane = new GridPane();
            mEditorPane.setPadding(new Insets(10, 10, 10, 10));
            mEditorPane.setHgap(10);
            mEditorPane.setVgap(10);

            var infoLabel = new Label(PUBSUB_SERVER_TEXT);
            infoLabel.setWrapText(true);
            GridPane.setConstraints(infoLabel, 0, ++row, 4, 1);
            mEditorPane.getChildren().add(infoLabel);

            /* Enabled */

            var pubSubMessagingEnabledCheckbox = new ToggleSwitch("Enabled");
            pubSubMessagingEnabledCheckbox.setSelected(mPubSubMessagingPreference.getPubSubMessagingEnabled().equals("1"));

            pubSubMessagingEnabledCheckbox.selectedProperty()
                    .addListener((observable, oldValue, newValue) -> {
                        System.out.println("NEW = " + newValue);
                        mPubSubMessagingPreference.setPubSubMessagingEnabled(newValue == Boolean.TRUE ? "1" : "0");
                    });


            GridPane.setConstraints(pubSubMessagingEnabledCheckbox, 0, ++row, 2, 1);
            mEditorPane.getChildren().add(pubSubMessagingEnabledCheckbox);

            /* Protocol */

            // TODO: Add protocol field dropdown

            /* Hostname */

            var pubSubMessagingHostnameLabel = new Label("Hostname");
            GridPane.setConstraints(pubSubMessagingHostnameLabel, 0, ++row, 2, 1);
            mEditorPane.getChildren().add(pubSubMessagingHostnameLabel);

            var pubSubHostnameField = TextFields.createClearableTextField();
            pubSubHostnameField.textProperty().setValue(mPubSubMessagingPreference.getPubSubMessagingHostname());
            pubSubHostnameField.textProperty().addListener((observable, oldValue, newValue) -> mPubSubMessagingPreference.setPubSubMessagingHostname(newValue));
            GridPane.setConstraints(pubSubHostnameField, 3, row, 2, 1);
            mEditorPane.getChildren().add(pubSubHostnameField);

            /* Port */

            var pubSubPortLabel = new Label("TCP port");
            GridPane.setConstraints(pubSubPortLabel, 0, ++row, 2, 1);
            mEditorPane.getChildren().add(pubSubPortLabel);

            var pubSubPortField = TextFields.createClearableTextField();
            pubSubPortField.textProperty().setValue(mPubSubMessagingPreference.getPubSubMessagingPort());
            pubSubPortField.textProperty().addListener((observable, oldValue, newValue) -> mPubSubMessagingPreference.setPubSubMessagingPort(newValue));
            GridPane.setConstraints(pubSubPortField, 3, row, 2, 1);
            mEditorPane.getChildren().add(pubSubPortField);

            /* Username */

            var pubSubUsernameLabel = new Label("Username");
            GridPane.setConstraints(pubSubUsernameLabel, 0, ++row, 2, 1);
            mEditorPane.getChildren().add(pubSubUsernameLabel);

            var pubSubUsernameField = TextFields.createClearableTextField();
            pubSubUsernameField.textProperty().setValue(mPubSubMessagingPreference.getPubSubMessagingUsername());
            pubSubUsernameField.textProperty().addListener((observable, oldValue, newValue) -> mPubSubMessagingPreference.setPubSubMessagingUsername(newValue));
            GridPane.setConstraints(pubSubUsernameField, 3, row, 2, 1);
            mEditorPane.getChildren().add(pubSubUsernameField);

            /* Password */

            var pubSubPasswordLabel = new Label("Password");
            GridPane.setConstraints(pubSubPasswordLabel, 0, ++row, 2, 1);
            mEditorPane.getChildren().add(pubSubPasswordLabel);

            var pubSubPasswordField = TextFields.createClearablePasswordField();
            pubSubPasswordField.textProperty().setValue(mPubSubMessagingPreference.getPubSubMessagingPassword());
            pubSubPasswordField.textProperty().addListener((observable, oldValue, newValue) -> mPubSubMessagingPreference.setPubSubMessagingPassword(newValue));
            GridPane.setConstraints(pubSubPasswordField, 3, row, 2, 1);
            mEditorPane.getChildren().add(pubSubPasswordField);

            /* Topic */

            var pubSubTopicLabel = new Label("Topic");
            GridPane.setConstraints(pubSubTopicLabel, 0, ++row, 2, 1);
            mEditorPane.getChildren().add(pubSubTopicLabel);

            var pubSubTopicField = TextFields.createClearableTextField();
            pubSubTopicField.textProperty().setValue(mPubSubMessagingPreference.getPubSubMessagingTopic());
            pubSubTopicField.textProperty().addListener((observable, oldValue, newValue) -> mPubSubMessagingPreference.setPubSubMessagingTopic(newValue));
            GridPane.setConstraints(pubSubTopicField, 3, row, 2, 1);
            mEditorPane.getChildren().add(pubSubTopicField);

            /* Test Button */

            var testButton = new Button("Test connection");
            GridPane.setConstraints(testButton, 3, ++row, 2, 1);
            testButton.setOnAction(event -> {
                // TEST
            });
            mEditorPane.getChildren().add(testButton);

            /* Apply Button */

            var applyButton = new Button("Connect");
            GridPane.setConstraints(applyButton, 3, ++row, 2, 1);
            applyButton.setOnAction(event -> {
                // CONNECT
            });
            mEditorPane.getChildren().add(applyButton);

        }

        return mEditorPane;

    }

}
