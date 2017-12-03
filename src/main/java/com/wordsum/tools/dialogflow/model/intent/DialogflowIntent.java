package com.wordsum.tools.dialogflow.model.intent;

import java.util.Date;
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
 * Root model of DialogflowIntent
 *
 * A defined model of Dialogflow Intents used to deserialize.
 */
public class DialogflowIntent {


    private String id;
    private String name;
    private boolean auto;
    private List<String> contexts;
    private List<DialogflowIntentResponses> responses;
    private Long priority;
    private boolean webhookUsed;
    private boolean webhookForSlotFilling;
    private Date lastUpdate;
    private boolean fallbackIntent;
    private List<String> events;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public List<String> getContexts() {
        return contexts;
    }

    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    public List<DialogflowIntentResponses> getResponses() {
        return responses;
    }

    public void setResponses(List<DialogflowIntentResponses> responses) {
        this.responses = responses;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public boolean isWebhookUsed() {
        return webhookUsed;
    }

    public void setWebhookUsed(boolean webhookUsed) {
        this.webhookUsed = webhookUsed;
    }

    public boolean isWebhookForSlotFilling() {
        return webhookForSlotFilling;
    }

    public void setWebhookForSlotFilling(boolean webhookForSlotFilling) {
        this.webhookForSlotFilling = webhookForSlotFilling;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isFallbackIntent() {
        return fallbackIntent;
    }

    public void setFallbackIntent(boolean fallbackIntent) {
        this.fallbackIntent = fallbackIntent;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}
