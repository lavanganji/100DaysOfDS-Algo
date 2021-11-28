# Top Interview Questions of JAVA -- Updated 11/27/2021

## What is Choreogrphy vs Orchestration :

> In case of orchestration, all micro services will get instructions from a conductor, and they act accordingly. It means if the conductor is down, all micro services are down. One more disadvantage with orchetsration is tight coupling. Because geenrally it uses Rest web service to interact with Micro services.  so calling the service logic should be  there which is tightly coupled. If the service is down or if you want to remove the service
its not easy.. Performance will also be effected  because it has to make a call to every micro service over network everytime. But in case of choreography,  the message is published to some queue. and all micro services will be listening to the queue and they act accordingly. because of this asynchronous nature,
the performance will be improved and  also you can remove few servcies or add few services when you need..
