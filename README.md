# Congestion Tax Calculator

This solution is in Java 11 with Spring Boot added for REST API. 
Please ensure a jdk is installed on your local machine. 


# Installation

Clone the repo and run the congestion-0.0.1.jar 

# Running the web application

On the command line enter the following command

```
java -jar congestion-0.0.1.jar

```

A Spring Boot application will launched on Tomcat. 

Url:

```
http://localhost:9090
```
Please note the port number is **9090**

The above url will give you an error because there was no default html file for loading webpage. Rest assured, this REST API will still work. 

Test the application is working.
```
http://localhost:9090/gettax/test
```
If you see a *Test successfully completed* message, that mean the application is work. 


# APIs

The below api will calculate toll for vehicle type and time of day.

```
http://localhost:9090/gettax/{vehicle}
```
Example:
*http://localhost:9090/gettax/suv* will return a toll (if not on holiday and weekend).

*http://localhost:9090/gettax/emergency* will return zero toll.

```
http://localhost:9090/gettax/{vehicle}/{epochtime}
```

Example: 
http://localhost:9090/gettax/minivan/1666154660000

Epoch time 1666154660000 is 
Date and time (GMT): Wednesday, October 19, 2022 4:44:20 AM

# Challenges and Future Improvements
1. Too many calculation are  hard coded. They should stored in database tables to make them easier to change(i.e. yearly poll increase)
2. Store date and time as UTC ISO 8601.
3. Java Date class is deprecated.
4. Unsure if each vehicle type needs to have a separate class.
5. I found logical error in GetTollFee method
6. getTax method appears to be OK but didn't have enough test data to confirm.
7. This needs to have location data (GPS) in the future to calculate rate for each area.




