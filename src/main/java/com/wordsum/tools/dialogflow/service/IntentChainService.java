package com.wordsum.tools.dialogflow.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
 * A service to check intent chains.
 */
@Service
public class IntentChainService {

    @Value("${intent.begin}")
    private String intentBegin;

    @Value("${dir.intents}")
    private String dirIntents;

    public String getIntentBegin() {
        return this.intentBegin;
    }

    public String getDirIntents() {
        return this.dirIntents;
    }

}
