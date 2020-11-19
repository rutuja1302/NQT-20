'''Fibonacci series should start with 1.
Total count of even numbers should be displayed in first row and odd numbers should be displayed in next row.
Number given by user for Fibonacci series should be greater than 5 and less than or equal to 20, otherwise display "INVALID INPUT"
If number given by user is space, character or empty display "INVALID INPUT"
The text message displayed should b be in exact format as it is case sensitive.

In below example, 2 is for count of even numbers that is (2.8) and 4 is count of odd numbers that is (1,1,3,5).
Example:
Input:
7
Output:
1 1 2 3 5 8 13
2
5'''

#read input from user
num = input()

#if input is not a digit display 'invalid input'
#Similarly, if num is less than or equal to 5 & greater then 20, display 'invalid input'
count = 0
if not(num.isdigit()):
    count += 1
    if int(num)<=5 or int(num)>20:
        count += 1

if count>0:
    print("INVALID INPUT")
else:
    fibo = [1,1]
    num = int(num)
    for i in range(2,num):
        temp = fibo[i-1] + fibo[i-2]
        fibo.append(temp)
    #print the list
    for i in range(len(fibo)):
        print(fibo[i],end=" ")
    print()
    #print number of even & odd numbers
    even = 0
    odd = 0
    for i in range(len(fibo)):
        if fibo[i]%2==0:
            even += 1
        else:
            odd += 1
    print(even)
    print(odd)
