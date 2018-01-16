A springboot application that demonstrates the working of Hystrix- The fault tolerance library.

Hystrix is used in scenarios where you need to have a fallback mechanism when calls to a service are failing 
and they have reached a predefined threshold. What it does is it opens the circuit, that is it routes the subsequent calls 
to the fallback method until the service is up and running.

This service registers itself to discovery server using spring cloud which in turns uses Eureka developed by netflix.


