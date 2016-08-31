# servlet-test

Simple project that demonstrates that yes, the Java servlet API does handle
querystring parameter decoding internally. I keep forgetting :(

Simply execute the following to get a running Jetty container that accepts
requests at http://localhost:8080:

    mvn clean package

Then you can test easily by providing URLs like the following:

    http://localhost:8080/?meta=foo%3Dbar%3F

