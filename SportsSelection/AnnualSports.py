'''For Annual Sports events, College is selecting members in Teams for a national level games.
For one of the games, Team selection criterion is height. Candidate who wish to part of that team for any game fill the registration form.
So, for a game A, from N number of registered candidates only first M number of Candidates will be selected based on their Heights.
Height[] is array of float representing heights of registered candidates whose names are maintained in an string array Candidates[] at the same index position as of Height[].
The problem is to identify the Members selected for Team for Game A. (Display the Names of selected Candidates)
Inputs are as follows
1. number of required players to from team-
<Integer>
2. names of registered participants. User can enter N number of Names. Names should be string values.
3. heights[] of candidates whose names are taken above maintaining the mapping with names and heights Number of inputs of heights should be equal to number of names.
4. Q or q should be pressed to stop taking input of names.
5. Non integer values should be pressed to stop taking input of heights

Example 1
Input Values
8
PRATIK
JOY
NIMESH
NIKHIL
SURESH
RAMESH
JITU
ASHISH
SAYAM
HARSH
LARA
MITESH
SANTOSH
RAJ
q

5.6
5.4
5.5
5.5
5.5
5.6
5.4
5.7
5.9
6.1
6.2
6.5
6.8
7.1
6.8

Output Values
SANTOSH
RAJ
MITESH
LARA
HARSH
SAYAM
ASHISH
JITU'''

n = int(input())  #no. of required candidates in the team

candidates = []  #string list to store participant's names
height = [] #float list to store height's of participants
selected = [] #list of selected candidates

#take inputs for names
while True:
    name = input()
    if name=='q' or name=='Q':
        break
    else:
        candidates.append(name)

print()
#take inputs for heights
while True:
    h = input()
    if h=="" or h.isalpha():
        break
    else:
        height.append(float(h))

#no. of names should be equal to no. of heights input
if len(candidates) != len(height):
    print("INVALID INPUT")
    exit()

#maximum n heights to be selected for team
for i in range(n):
    tallest = max(height)
    index = height.index(tallest)
    sc = candidates[index]
    selected.append(sc)
    height.remove(tallest)
    candidates.remove(sc)

#PRINT OUTPUT
for i in selected:
    print(i)
