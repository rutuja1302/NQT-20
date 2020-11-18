'''An string or character array containing five Mobile numbers is provided.
Verify these five mobile numbers and identify valid as well as invalid numbers.
Any mobile number less than or greater than 10 digits or any characyers is considered as invalid.

Write a code which will generate report on count of total number of invalid mobile numbers.

A valid Mobile number 'M' hsould be digit of length 10 with all numeric digits.
Donot use any input message. Directly accept Mobile Numbers one after other as input and enter "q" or "Q" to stop taking input.

Example 1:
9892568790
989A2568790
9992568790
999256879099
989256879B
Q

Output:
3

Note:
1)Output should be in format <integer>
2)If user enter set of Mobile Numbers containing less than 5 or more than 5 values, display "INPUT LIMIT IS 5" and quit.'''

mobileNumbers = []  #list to hold all input mobile numbers

#read input from user until user enters 'q' or 'Q'
while True:
    num = input()
    if num=="q" or num=="Q":
        break
    else:
        mobileNumbers.append(num)


#if user enter set of Mobile Numbers containing less than 5 or more than 5 values, display "INPUT LIMIT IS 5"
if len(mobileNumbers)!=5:
    print("INPUT LIMIT IS 5")
else:
    #count the number of invalid mobile numbers
    count = 0
    for i in range(len(mobileNumbers)):
        if not(mobileNumbers[i].isdigit()) or len(mobileNumbers[i])!=10:
            count += 1
    #print output
    print(count)
