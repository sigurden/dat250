# DAT250: Software Technology Experiment Assignment 4 
## REST API for TODO-items

This assignment was focused on creating CRUD-actions in a rest api for todo-items. Most of the work was centered
around making the necessary end points to make the tests pass.

During the experiment, I encountered some issues where some test passed only some times. First I thought it was some sort of concurrency problem,
but it happend to be the id check that didn't support negative numbers correctly. Next time I would make the ID-generator different.

After commiting to Github, Github actions had some problems in the building step. I used String.formatted, but got some maven errors I didn't understand.
Replacing it with simple string concatenation, it build and ran the test green.

Link to code: https://github.com/sigurden/dat250-sparkjava-counter
