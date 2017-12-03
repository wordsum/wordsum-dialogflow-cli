package com.wordsum.tools.dialogflow.model.intent;

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
public class DialogflowAffectedContexts {

    private String name;
    private DialogflowIntentReponsesParameters parameters;
    private Integer lifespan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DialogflowIntentReponsesParameters getParameters() {
        return parameters;
    }

    public void setParameters(DialogflowIntentReponsesParameters parameters) {
        this.parameters = parameters;
    }

    public Integer getLifespan() {
        return lifespan;
    }

    public void setLifespan(Integer integer) {
        this.lifespan = integer;
    }



}
