'''An organization is conducting eye check up camp, number of people allowed for Registration is 10,
A Person is supposed to enter his age for registration. If an senior citizen above 60yrs age registers then he is shifted to another queue which will be 2nd queue, now two separate queues are created for checkup. 
2nd queue will be for senior citizens. If number of people in 2nd queue becomes 5 then shifting of senior citizens from 1 queue to 2nd queue is stopped.
Suppose eye check up takes approximately 15 mins per person, then calculate the total number of time taken for checkup by first queue and second queue respectively.
Number of Person Registrations 'N' for check up. 1<=N<=10 
Age of Person, 'A' 10<=A-=100
Note:
1.Output should be in the format:
QUEUE1 TIME: <integer> mins
QUEUE2 TIME: <integer> mins
2. If age is below 10 or above 100 display "INVALID INPUT" '''

#list to store n ages 
n = []
#read n inputs
while True:
    age = input()
    if age == "":
        break
    else:
        n.append(int(age))

# 1<=len(n)<=10
if len(n)<1 or len(n)>10:
    print("INVALID INPUT")
    exit()

# if age is below 10 or above 100 display "INVALID INPUT"
for i in n:
    if i<10 or i>100:
        print("INVALID INPUT")
        exit()

#segregate n members into queue1 and queue2
queue1 = []
queue2 = []
for i in n:
    if i>60:
        if len(queue2)<5:
            queue2.append(i)
        else:
            queue1.append(i)
    else:
        queue1.append(i)

#time taken by queue1:
time = 15 * len(queue1)
print("QUEUE1 TIME: "+str(time)+"mins")

#time taken by queue2:
time = 15 * len(queue2)
print("QUEUE2 TIME: "+str(time)+"mins")
