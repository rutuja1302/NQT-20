'''At an exam center, M number of students are allocated for one classroom as per the University Rules.
The Examination staff has made sitting arrangements where the classroom contains N number of benches arranged in columns separated by a suitable distance occupying room space from the left to the right wall.
Given, M=10, N=5
Students from class "TY" can sit one after the other from 1st bench starting at the left wall in the order of their Roll Numbers.
And students from class "SY" are allowed to sit beside the students from class "TY" in the order of their Roll Numbers one after another.
All students enter in the classroom in a random order as Input in String Array Students[]. Few students may remain absent.
Assume the Roll Numbers are in continuous range with no drop, and Class Name("TY","SY")should be prefixed for every Roll Number.
For example, you can pass input with values like:
Students = ["TY01","TY02","SY01","SY05","SY04","TY03","SY02","TY04","SY03","TY05"]
Display the sitting arrangement status at the exam time. "ABSENT" should be marked at the place of the Roll Numbers missing or absent students.
 
Example 1:
Input Values(Input format should be same as below)
TY01
TY02
SY01
SY05
SY04
TY03
SY02
TY04
SY03
 
Output Values
[TY01][SY01]
[TY02][SY02]
[TY03][SY03]
[TY04][SY04]
[ABSENT][SY05]
 
Note: Output should be in the format given in above example. If input values are more than M, display INVALID INPUT.
If input value contains other than class SY or TY display INVALID INPUT'''

Students = []  #list to store all input values

#read all input values
while True:
    temp = input()
    if temp == "":
        break
    else:
        Students.append(temp)

#if M>10 print invalid input
count = 0
if len(Students)>10:
    count += 1

#if any value contain other than SY and TY display invalid input
for i in range(0,len(Students)):
    temp = Students[i]
    if not(temp.startswith("SY") or temp.startswith("TY")):
        count +=1

if count>0:
    print("INVALID INPUT")
else:
    TY = []  #list to store TY students roll numbers
    SY = []  #list to store SY students roll numbers

    #split the students list into sy & ty students
    for i in range(0,len(Students)):
        temp = Students[i]
        if temp.startswith("SY"):
            SY.append(temp[2:])
        else:
            TY.append(temp[2:])
    
    #assuming the roll numbers are in continuous range with no drop we sort the list & compare elements to determine who is absent
    #sorting list
    SY.sort()
    TY.sort()
    #declare variable l which will store the length of missing student's list
    if len(SY)<len(TY):
        l = len(SY)
    else:
        l = len(TY)
    #comparing elements
    for i in range(0,l):
        if SY[i] == TY[i]:
            pass
        elif TY[i]<SY[i]:
            SY.insert(i,"ABSENT")
        elif SY[i]<TY[i]:
            TY.insert(i,"ABSENT")
    #if one of the last roll number is absent
    if len(TY) < 5:
        TY.append("ABSENT")
    if len(SY) < 5:
        SY.append("ABSENT")
    #final printing of seating arrangement
    for i in range(0,5):
        if TY[i].isdigit() and SY[i].isdigit():
            print("[TY"+TY[i]+"]",end="")
            print("[SY"+SY[i]+"]")
        elif TY[i].isdigit() and SY[i].isaplha():
            print("[TY"+TY[i]+"]",end="")
            print("["+SY[i]+"]")
        elif TY[i].isalpha() and SY[i].isdigit():
            print("["+TY[i]+"]",end="")
            print("[SY"+SY[i]+"]")
