package com.wordsum.tools.dialogflow.utilities;


import com.wordsum.tools.dialogflow.model.intent.DialogflowIntent;

import java.util.*;

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

/*
 *  This simulator reads in Dialogflow intent templates and follows the intent chains to the end.
 *
 *  This intent is to unit test story changes of Dialogflow.
 */
public class IntentChainSimulator {


    private IntentChainSimulator(){};

    /**
     * A method that takes intent objects and finds the path from a given intent
     *
     * @param dialogflowIntents A list of DialogflowIntent objects of the story line undertest.
     * @param intents A beginning list of intents. This usuall is input with the beginning intent and returned a list.
     * @return The intent chain.
     */
    public static List<String> getIntentChain(List<DialogflowIntent> dialogflowIntents, List<String> intents) {

        for(DialogflowIntent dialogflowIntent: dialogflowIntents) {

            if (dialogflowIntent.getContexts().contains(intents.get(intents.size() - 1).replaceAll("\\.","-"))) {
                intents.add(dialogflowIntent.getName());
                intents = getIntentChain(dialogflowIntents, intents);
            }

        }

        return intents;
    }

}
