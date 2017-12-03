package com.wordsum.tools.dialogflow.utilities;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.wordsum.tools.dialogflow.model.intent.DialogflowIntent;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


import static java.util.stream.Collectors.toList;

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
 * A class of utilities to read files.
 */
public class FileReader {


    protected FileReader() {
    }

    /**
     * A utility to read a resource file.
     *
     * @param file The path in the resource folder.
     * @return File object of the resource file.
     * @throws Exception
     */
    public static File readResourceFile(String file) throws Exception {

        File resourceFile = null;

        if (file.isEmpty()) {
            throw new Exception("No File for readResourceFile.");
        }

        resourceFile = new File(FileReader.class.getResource(file).getFile());

        return resourceFile;

    }

    /**
     * A utility to take json data from a Dialogflow intent an put
     * it into an object.
     *
     *
     * @param file The path of the file.
     * @return A serialized object.
     * @throws Exception
     */
    public static DialogflowIntent readJsonTextToDialogflowIntent(String file) throws Exception {

        DialogflowIntent dialogflowIntent = new DialogflowIntent();

        if(file.isEmpty() || file == null){

        } else {

            ObjectMapper objectMapper = new ObjectMapper();

            dialogflowIntent = objectMapper.readValue(file, DialogflowIntent.class);

        }

        return dialogflowIntent;
    }


    /**
     * A utility to take json data from a Dialogflow intent an put
     * it into an object.
     *
     *
     * @param dir The object we want to deserialize.
     * @return A serialized object.
     * @throws Exception
     */
    public static List<DialogflowIntent> serializeIntentJsonInDir(String dir) throws Exception {

        List<DialogflowIntent> dialogflowIntents = new ArrayList<DialogflowIntent>();

        if(dir.isEmpty() || dir == null){

        } else {

            List<Path> paths = Files.list(Paths.get(dir)).filter(f -> f.toString().contains("_usersays_") == false).map(Path::getFileName).collect(toList());

            for(Path path: paths){
                String file = FileUtils.readFileToString(new File(dir + File.separator + path.toString()));
                dialogflowIntents.add(FileReader.readJsonTextToDialogflowIntent(file));
            }

        }

        return dialogflowIntents;
    }


}
