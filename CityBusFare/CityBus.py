'''
A City Bus is a Ring Route Bus which runs in circular fashion.
That is, Bus once starts at the Source Bus Stop, halts at each Bus Stop in its Route and at the end it reaches the Source Bus Stop again.
If there are n  number of Stops and if the bus starts at Bus Stop 1, then after nth Bus Stop, the next stop in the Route will be Bus Stop number 1 always.
If there are n stops, there will be n paths. One path connects two stops. Distances (in meters) for all paths in Ring Route is given in array Path[] as given below:
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
Fare is determined based on the distance covered from source to destination stop as  Distance between Input Source and Destination Stops can be measured by looking at values in array Path[] and fare can be calculated as per following criteria:
  •   If d =1000 metres, then fare=5 INR
  •   (When calculating fare for others, the calculated fare containing any fraction value should be ceiled. For example, for distance 900 when fare initially calculated is 4.5 which must be ceiled to 5)

Path is circular in function. Value at each index indicates distance till current stop from the previous one. 
And each index position can be mapped with values at same index in BusStops [] array, which is a string array holding abbreviation of names for all stops as-
“THANERAILWAYSTN” = ”TH”, “GAONDEVI” = “GA”, “ICEFACTROY” = “IC”, “HARINIWASCIRCLE” = “HA”, “TEENHATHNAKA” = “TE”, “LUISWADI” = “LU”, “NITINCOMPANYJUNCTION” = “NI”, “CADBURRYJUNCTION” = “CA”
Given, n=8, where n is number of total BusStops.
BusStops = [ “TH”, ”GA”, ”IC”, ”HA”, ”TE”, ”LU”, ”NI”,”CA” ]
 
 Write a code with function getFare(String Source, String Destination) which take Input as source and destination stops(in the format containing first two characters of the Name of the Bus Stop) and calculate and return travel fare.
Example 1:
Input Values
ca
Ca
Output Values
INVALID OUTPUT

Example 2:
Input Values
NI
HA
Output Values
23.0 INR
Note: Input and Output should be in format given in example.
Input should not be case sensitive and output should be in the format  <FLOAT>  INR
'''

import math
def getFare(source,destination):
    path = [800,600,750,900,1400,1200,1100,1500]  #list path[] will determine the distance travelled
    BusStops = ["TH","GA","IC","HA","TE","LU","NI","CA"]  #list busstops[] will contain all the stops the bus stops to compare with input source and destination points
    #index of source and destination for iteration
    s = BusStops.index(source)
    d = BusStops.index(destination)
    #incrementing source index by 1 because the point where the journey starts is never considered i.e., source is considered as distance = 0
    s += 1
    distance = 0  #initializing distance travelled
    fare = 0.0 #initializing fare amount
    if s<d:
        #calculating distance travelled
        for i in range(s,d+1):
            distance += path[i]
        #calculating fare: for each 1000 meters fare = 5Rs. Hence, if less than 1000 fare 2.5Rs. is considered
        while distance >=1000:
            fare += 5.0
            distance -= 1000
        if distance > 0:
            fare += 2.5
        #rounding off the value to a bigger value near to the result & as the ceil() method returns an int we convert it to float() as per program statement requirement
        fare = float(math.ceil(fare))
        print(str(fare)+" INR")
    else:
        #calculating distance travelled
        for i in range(s,len(BusStops)):
            distance += path[i]
        for i in range(0,d+1):
            distance += path[i]
        #calculating fare
        while distance >=1000:
            fare += 5.0
            distance -= 1000
        if distance>0:
            fare += 2.5
        fare = float(math.ceil(fare))
        print(str(fare)+" INR")

#driver code
#read inputs source and destination stops
source = input().upper()
destination = input().upper()
#calculate the fare and print the output
if source == destination:
    print("INVALID INPUT")
else:
    getFare(source,destination)
