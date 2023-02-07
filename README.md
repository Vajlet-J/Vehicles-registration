# Vehicles-registration
An application that calculates total costs of vehicle registration.

Practical task text:

Create an application that calculates total costs of vehicle registration. 
Users can have one or more vehicles.
Vehicle type can be 
Car
Motorcycle
Truck
User enters the data about each vehicle.
As output user gets a report with info for each vehicle:
Car brand/model
Engine size
Horse powers
Engine type
For cars: number of doors
Amount for registration
In the bottom:
Number of vehicles
Sum of registration costs for all his vehicles

User will enter data for each of his vehicles and then get a report.

Calculating registration price:
1. Cars: 
All cars with engine type electric are paying 5000.
For diesel and gasoline engines price is 10000 
For cars with engine cubic capacity bigger than 2000 registration is 40% higher.
For all cars older than 5 years registration is 5% increased for each year.
2.Motorcycles:
For each motorcycle registration is 5000, 
The ones with engine cubic capacity less than 50 only registration in first year is 5000, for other years registration is 1000
3. Trucks: 
Each truck registration is 10000 
For each aditional trailer registration is additional 7000

Input is entered using the console.
Report example in the console:	

All vehicles: 
VEHICLE 1 :
----------------------------------------------------
Car: Ford-Mondeoga
 engine size: 2000 cc
 horse powers:150
 engine type: diesel
 number of doors:5
 AMOUNT FOR REGISTRATION: 10000
----------------------------------------------------
VEHICLE 2 :
----------------------------------------------------
Motorcycle: Suzuki-Ninja
 engine size: 57 cc
 horse powers:100
 engine type: gasoline
 AMOUNT FOR REGISTRATION: 5000
----------------------------------------------------
VEHICLE 3 :
----------------------------------------------------
Truck: FAP-Tammic
 engine size: 5000cc
 horse powers:500
 engine type: diesel
 number of trailers:3for
 AMOUNT FOR REGISTRATION: 24000
----------------------------------------------------
Amount for registration for 3 vehicles is: 39000
