package com.wordsum.tools.dialogflow.utilities;

import com.wordsum.tools.dialogflow.model.intent.DialogflowIntent;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
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
 * Test to test file reading.
 */
public class FileReaderTests {

    @Test
    public void testReadResourceFile() throws Exception {


        File file = FileReader.readResourceFile("/testSimpleDialogflowObject.json");

        assertTrue(file.exists());


    }

    @Test
    public void testReadSimpleJsonTextToObject() throws Exception {

        DialogflowIntent dialogflowIntent = new DialogflowIntent();

        String file = FileUtils.readFileToString(FileReader.readResourceFile("/intentChainSuccess/buy.json"));

        try {
            dialogflowIntent = FileReader.readJsonTextToDialogflowIntent(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("5a8f9624-2dc4-42d6-8031-cb1dd5808cfb", dialogflowIntent.getId());

    }

    @Test
    public void testReadCompleteJsonTextToObject1() throws Exception {

        DialogflowIntent dialogflowIntent = new DialogflowIntent();

        String file = FileUtils.readFileToString(FileReader.readResourceFile("/intentChainSuccess/buy.json"));

        try {
            dialogflowIntent = FileReader.readJsonTextToDialogflowIntent(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("5a8f9624-2dc4-42d6-8031-cb1dd5808cfb", dialogflowIntent.getId());

    }

    @Test
    public void testReadCompleteJsonTextToObject2() throws Exception {

        DialogflowIntent dialogflowIntent = null;

        String file = FileUtils.readFileToString(FileReader.readResourceFile("/intentChainSuccess/buy.item.json"));


        try {
            dialogflowIntent = FileReader.readJsonTextToDialogflowIntent(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("f40d8ac2-5439-4fd7-af47-bccd9a2cb345", dialogflowIntent.getId());

    }

    @Test
    public void testSerializeJsonInDir(){

        List<DialogflowIntent> dialogflowIntents = new ArrayList<DialogflowIntent>();

        String path = FileReader.class.getResource("/intentChainSuccess").getPath();

        try {
            dialogflowIntents = FileReader.serializeIntentJsonInDir(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("6d2ba372-57ea-4045-a359-f05f26a00110", dialogflowIntents.get(0).getId());

    }

}
