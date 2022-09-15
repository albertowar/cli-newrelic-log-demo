build:
	mvn clean install

run:
	cp newrelic.yml target/newrelic.yml;
	java -jar -javaagent:target/newrelic/newrelic.jar target/app.jar