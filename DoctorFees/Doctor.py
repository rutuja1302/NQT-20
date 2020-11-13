'''
A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients depending on their age.
If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. If patient’s age is above 40, fees is 300 INR.
Write a code to calculate earnings in a day for which one array/List of values representing age of patients visited on that day is passed as input.
Note:
Age should not be zero or less than zero or above 120
Doctor consults a maximum of 20 patients a day
Enter age value (press Enter without a value to stop)

Example 1:
Input
20
30
40
50
2
3
14
Output
Total Income 2000 INR 
Note: Input and Output Format should be same as given in the above example. For any wrong input display INVALID INPUT
Output Format
Total Income <Integer> INR
'''

ages = [] #a list to store the age of patients

#read inputs from user
while True:
    a = input()
    if a == "":
        break
    else:
        ages.append(int(a))

#Maximum patients doctor consult a day is 20
count = 0
if len(ages)>20:
    count +=1
#Ages should be not zero or less then zero or above 120
for i in range(0,len(ages)):
    if ages[i]==0 or ages[i]<0 or ages[i]>120:
        count += 1

#If count>0 print INVALID INPUT otherwise print the doctor's earnings for the day
if count>0:
    print("INVALID INPUT")
else:
    earning = 0
    for i in range(0,len(ages)):
        if ages[i]<17:
            earning += 200 #fees for patients of age below 17 = 200INR
        elif ages[i]>=17 and ages[i]<40:
            earning += 400 #fees for patients of age between 17 and 40 = 400 INR
        elif ages[i]>=40:
            earning += 300 #fees for patients of age above 40 = 300 INR
    #print the total earnings
    print("Total Income "+str(earning)+" INR")
