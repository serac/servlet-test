# servlet-test

Simple project that demonstrates that, yes, the Java servlet API does
indeed handle querystring parameter decoding internally.

I keep forgetting :(

Simply execute the following to get a running Jetty container that accepts
requests on localhost:

    mvn clean package

Then you can test easily by providing URLs like the following:

    http://localhost:8080/?meta=foo%3Dbar%3F

