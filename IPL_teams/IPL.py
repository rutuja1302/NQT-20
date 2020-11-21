'''Indian Premier League IPL Cricket Matches are organized for a few Days.
The problem is to prepare Timetable from Day1 to Day n, where n depend on the teams participating. Set A represent the names of teams participating. Set A will be input from the user.
Do not show input user message directly accept the teams names as string values and enter q to stop taking inputs.
Write a code to display Pairing of Teams and possible number of matches possible excluding Semi Final and Final.
Note: Minimum 3 Teams are required and maximum limit of Teams is 12.

Example 1

Input Values
CHENNAI
MUMBAI
KOLKATA
PATNA
Q

Output Values
TOTAL MATCHES: 6
CHENNAI-VS- MUMBAI
CHENNAI-VS-KOLKATA
CHENNAI-VS-PATNA
MUMBAI-VS-KOLKATA
MUMBAI-VS-PATNA
KOLKATA-VS-PATNA
'''

#read inputs
teams = []
while True:
    player = input().upper()
    if player == "Q":
        break
    else:
        teams.append(player)

#required number of teams : min 3 & max 12
if len(teams)<3 or len(teams)>12:
    print("INVALID INPUT")
    exit()
    
#form pairs
matches = []
for i in range(0,len(teams)-1):
    for j in range(i+1,len(teams)):
        temp = teams[i]+"-VS-"+teams[j]
        matches.append(temp)

#display output
print("TOTAL MATCHES: "+str(len(matches)))
for i in matches:
    print(i)
