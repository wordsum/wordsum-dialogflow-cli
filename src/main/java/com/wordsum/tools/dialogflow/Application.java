package com.wordsum.tools.dialogflow;

import com.wordsum.tools.dialogflow.model.intent.DialogflowIntent;
import com.wordsum.tools.dialogflow.service.IntentChainService;
import com.wordsum.tools.dialogflow.utilities.FileReader;
import com.wordsum.tools.dialogflow.utilities.IntentChainSimulator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

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
 * A command line tool to test Dialogflow.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private IntentChainService intentChainService;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		if (args.length > 1) {
			System.out.println("Beginning intent: " + intentChainService.getIntentBegin());
			System.out.println("Directory of Dialogflow serialized intents: " + intentChainService.getDirIntents());

			//Read the directory of DialogflowIntents serialized in json files.
            List<DialogflowIntent> dialogflowIntentList = FileReader.serializeIntentJsonInDir(intentChainService.getDirIntents());
            //Use the beginning intent to make the array return.
            List<String> intents = new ArrayList<>();
            intents.add(intentChainService.getIntentBegin());

            //Simulate intent chain at beginning of...
            intents = IntentChainSimulator.getIntentChain(dialogflowIntentList, intents);

            //Print to do something.
            System.out.println("Found intent chain: " + intents.toString());

		} else {
			logger.info("Not enough command line parameters.");
		}

		exit(0);
	}
}

