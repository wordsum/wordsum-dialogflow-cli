package com.wordsum.tools.dialogflow.utilities;

import com.wordsum.tools.dialogflow.model.intent.DialogflowIntent;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IntentChainSimulatorTests {


    @Test
    public void testGetIntentChain(){

        List<DialogflowIntent> dialogflowIntents = new ArrayList<DialogflowIntent>();
        String path = FileReader.class.getResource("/intentChainSuccess").getPath();
        try {
            dialogflowIntents = FileReader.serializeIntentJsonInDir(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> intents = new ArrayList<>();
        intents.add("buy");

        List<String> intentChain = IntentChainSimulator.getIntentChain(dialogflowIntents, intents);


        Assert.assertEquals(intentChain.toString(), "[buy, buy.item, buy.item.quantity, buy.item.cost]");

    }


}
