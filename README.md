# wordsum-dialogflow

A wordsum command line tool to begin to visualize and test Dialogflow.

Currently, it tests a wordsum-intentchain programmed within the context of Dialogflow.

For more information about the wordsum-intentchain please read the unpublished documentation.

If use of Dialogflow by the wordsum group increases then more features will be added.

### Build and Unit Test

1. Download source.

2. cd wordsum-dialogflow

3. ./gradlew clean build


### Integration Test

1. Build and Unit Test.

2. java -jar build/libs/wordsum-dialogflow-cli-0.0.1-SNAPSHOT.jar --intent.begin=buy --dir.intents=./src/test/resources/intentChainSuccess/


3. Expect output:

        Beginning intent: buy
        Directory of Dialogflow serialized intents: ./src/test/resources/intentChainSuccess/
        Found intent chain: [buy, buy.item, buy.item.quantity, buy.item.cost]


### Copyright

 Open Story License

 Story: wordsum
 Writer: Kalab J. Oster(TM)
 
 Copyright Holders: Kalab J. Oster(TM)
 
 copyright (C) 2017 Kalab J. Oster(TM)
 
 Permission is granted by the Copyright Holders for humans or other intelligent agents to read, write, edit, publish
 and critique the Story if the humans or intelligent agents keep this Open Story License with the Story,
 and if another writer writes or edits the Story then the writer's name needs to be appended to the end of the Writer
 list of this Open Story License.
 
