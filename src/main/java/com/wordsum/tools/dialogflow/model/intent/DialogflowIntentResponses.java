package com.wordsum.tools.dialogflow.model.intent;

import java.util.List;

/*
 * Open Story License
 *
 * Story: wordsum
 * Writer: Kalab J. Oster(TM)
 * Copyright Holders: Kalab J. Oster(TM)
 * copyright (C) 2017 Kalab J. Oster(TM)
 *
 * Permission is granted by the Copyright Holders for humans or other intelligent agents to read, write, edit, publish
 * and critique the Story if the humans or intelligent agents keep this Open Story License with the Story,
 * and if another writer writes or edits the Story then the writer's name needs to be appended to the end of the Writer
 * list of this Open Story License.
 */

/**
 * A defined model of Dialogflow Intents used to deserialize.
 */
public class DialogflowIntentResponses {

    private boolean resetContexts;
    private List<DialogflowAffectedContexts> affectedContexts;
    private List<DialogflowIntentReponsesParameters> parameters;
    private List<DialogflowIntentMessages> messages;
    private DefaultResponsePlatforms defaultResponsePlatforms;
    private List<String> speech;

    public boolean isResetContexts() {
        return resetContexts;
    }

    public void setResetContexts(boolean resetContexts) {
        this.resetContexts = resetContexts;
    }

    public List<DialogflowAffectedContexts> getAffectedContexts() {
        return affectedContexts;
    }

    public void setAffectedContexts(List<DialogflowAffectedContexts> affectedContexts) {
        this.affectedContexts = affectedContexts;
    }

    public List<DialogflowIntentReponsesParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<DialogflowIntentReponsesParameters> parameters) {
        this.parameters = parameters;
    }

    public List<DialogflowIntentMessages> getMessages() {
        return messages;
    }

    public void setMessages(List<DialogflowIntentMessages> messages) {
        this.messages = messages;
    }

    public DefaultResponsePlatforms getDefaultResponsePlatforms() {
        return defaultResponsePlatforms;
    }

    public void setDefaultResponsePlatforms(DefaultResponsePlatforms defaultResponsePlatforms) {
        this.defaultResponsePlatforms = defaultResponsePlatforms;
    }

    public List<String> getSpeech() {
        return speech;
    }

    public void setSpeech(List<String> speech) {
        this.speech = speech;
    }
}
