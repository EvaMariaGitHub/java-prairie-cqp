# java-prairie-cqp


### Calculator
Implement a Calculator that allows to calculate two number.


### Library

A Book has a title and pages.<br/>
A CD has a title and a time.<br/>
A DVD has a kind, a title, an indication of it is in 3D and time.<br/>
There are 4 kind of movie: horror, fun, action, musical.<br/>

The Library must have these methods only:
* ArrayList<Book> putBooks(ArrayList<Book> books);
* ArrayList<DVD> putDvds(ArrayList<DVD> dvds);
* ArrayList<CD> putCDs(ArrayList<CD> cds);
* boolean isOpen(int hour);

The Library can put a lot of books and cds. It's open between 1pm and 7pm.<br/>
The Library can storage 3 DVDs only.<br/>
If there are already 3 DVDs and the user want to give more. The library doesn't accept these dvds.<br/>
If there are already some DVDs and the user try to give a dvd that the library already has. The library doesn't accept these dvds.<br/>

For example:<br/>
The library has 3 DVDs and the user give 4 DVDs. The library doesn't accept it. So the library has 3 DVD.<br/>
The library have 1 DVD like DVD dvd = new DVD("dvd", 120, Movie.HORROR, false) and the user give the same DVD. The library doesn't accept it.<br/>

Implement library and create unit test


### UniqueChar
Implement an algorithm to determine if a string on ascii has all unique characters. Create unit test too<br/>
example:<br/>
* abcdefg => ok
* abcdafg => ko


### Mower
The company X wants to develop an auto­mower for square surfaces.<br/>

The mower can be programmed to go throughout the whole surface.<br/>
Mower's position is represented by coordinates (X,Y) and a characters indicate the orientation according to cardinal notations (N,E,W,S).<br/>
The lawn is divided in grid to simplify navigation.<br/>

For example, the position can be 0,0,N, meaning the mower is in the lower left of the lawn, and oriented to the north.<br/>

To control the mower, we send a simple sequence of characters.<br/>
Possibles characters are L,R,F. L and R turn the mower at 90° on the left or right without moving the mower.<br/>
F means the mower move forward from one space in the direction in which it faces and without changing the orientation.<br/>


If the position after moving is outside the lawn, mower keep it's position. Retains its orientation and go to the next command.<br/>
We assume the position directly to the north of (X,Y) is (X,Y+1).<br/>

To program the mower, we can provide an input file constructed as follows:<br/>
The first line correspond to the coordinate of the upper right corner of the lawn. the bottom left corner is assumed as (0,0).<br/>

The rest of the file can control multiple mowers deployed on the lawn. Each mower has 2 next lines :<br/>

The first line give mower's starting position and orientation as "X Y O". X and Y being the position and O the orientation.<br/>
The second line give instructions to the mower to go throughout the lawn. Instructions are characters without spaces.<br/>

Each mower move sequentially, meaning that the second mower moves only when the first has fully performed its series of instructions.<br/>
When a mower has finished, it give the final position and orientation.<br/>

Example:<br/>
input file<br/>
55<br/>
12N<br/>
LFLFLFLFF<br/>
33E<br/>
FFRFFRFRRF<br/>

result<br/>
13N 51E

Implement mower and create unit test.

### String Calculator (DOJO)
Implement and test a StringCalculator that allows to calculate with String.

### LetterCompress
Implement and test a method to perform basic string compression using the counts of repeated characters.<br/>
For example, the string aabcccccaaa would become a5b1c5.

### LowerUpperString
Define toAlternativeString(String) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.<br/>
For example:<br/>
altERnaTIng cAsE <=> ALTerNAtiNG CaSe

Implement and test it

### Sum of the first nth term of Series
Your task is to write a function which returns the sum of following series upto nth term(parameter).<br/>

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

Rules:<br/>
You need to round the answer upto 2 decimal places and return it as String.<br/>
If the given value is 0 then it should return 0.00.<br/>
You will only be given Natural Numbers as arguments.<br/>
Examples:<br/>

SeriesSum(1) => 1 = "1"<br/>
SeriesSum(2) => 1 + 1/4 = "1.25"<br/>
SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"<br/>

Implement and test NthSeries<br/>


### GIT
PART 0:<br/>
Create a git projet<br/>
Create a file Readme.txt and first.txt<br/>
Commit and push it on your repo<br/>

PART 1:<br/>
You have worked hard and the result is beautiful.<br/>
But somehow there's a bug.<br/>

It's late, your partner wants you to go home.<br/>

Hell, maybe a good night sleep (or a good night something else)<br/>
will help you find that stupid bug.<br/>

So you want to go home, but you don't want to leave the work unsaved,<br/>
that would be unprofessional. And you're a pro.<br/>

So, as the code cannot be merged into master yet, you decide to create a branch<br/>

- Create a file second.txt with the text "A B C D F G"<br/>
- Create and checkout a new branch named "second"<br/>
- Commit the current state<br/>
- Push itv<br/>

PART 2:<br/>
Your mind is clear and ready to tackle that nasty bug.<br/>
As you march to your desk like the conquerant you are, your boss stops you.<br/>

There's an urgent fix that needs to go out in prod just. right. now.<br/>

- Checkout the branch master<br/>
- Pull it to get the last version<br/>
- Add a "three" to the file first.txt<br/>
- Commit and push the changes to that new file<br/>

PART 3:<br/>
Now is the time to tackle the problem, let's get back to your work.<br/>

- Checkout the branch second<br/>

PART 4:<br/>
Of couuuuurse !<br/>
You found it, the 'E' is missing between 'D' and 'F'<br/>

After fixing the bug, the awesomeness can be merged into master.<br/>

- Modify the file so that it's beauty is complete<br/>
- Commit the difference<br/>
- Push it<br/>
- Merge it into master<br/>
- Push master<br/>


PART 5:<br/>
You are a good citizen (or at least in this story we assume you are).<br/>
You are not working anymore on the branch file-second<br/>

- Delete the branch fsecond both localy and on github<br/>

PART 6:<br/>
Now, you work on a new evolution.<br/>

-Create a branch "three"<br/>
-Create a file three.txt<br/>
-Commit and push it<br/>
-Create a file four.txt<br/>
-Commit and push it<br/>

PART 7:<br/>
There is a urgent fix (again), we need the file four.txt only on prod<br/>

-Cherry pick this file on master<br/>
-Add the text "G H I J K M"<br/>
-Commit and Push it<br/>

PART 8:<br/>
You have a time to work on the branch three<br/>

-Add "G H I J K L M" on the four.txt<br/>
-Commit and Push it<br/>

PART 9:<br/>
You want to merge the four.txt on your master<br/>

-Merge it<br/>
-if there is some conflict, correct it<br/>
-Commit and Push it<br/>