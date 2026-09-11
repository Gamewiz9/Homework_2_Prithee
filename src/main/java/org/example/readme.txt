This program prints a section from a sonnet and asks the user for the next word in the sonnet.
Limitations: Program expects string inputs exactly as they are in the sonnet, punctuations included.

The program takes user input from the console.

The user has 3 chances to answer all the questions correctly.

If they get the ans right three times,
they get a "Great job!" message in the console and the program exits.

If they get the ans wrong three times,
they get a "Not quite right, try again!" message in the console and the
program exits.

Run the program by clicking run button on any java ide or using the java command in
the terminal. All inputs and print statements will go through the console.

pseudocode

Define string of words for the sonnet.

Split string into an array of strings.

check to see if count of correct or wrong words is equal to 3. If not, run program.

Use java randomize function to create a random no.

Append words from array into string builder to an index based on the random no.

Create new string from stringBuilder using toString method.

print new string and ask user for the next word in the sonnet.

grab user input.

check if user input is equal to next word in sonnet.

if true, increase count of correct words by one.

if false, increase count of wrong words by one.

if user gives 3 correct words print great job on console.

if user gives  wrong words, print not quite right, try again on console.

exit program.

