FROM tomcat:latest
RUN cp -R /usr/local/tomact/webapps.dist/* /usr/local/tomcat/webapps
COPY webapp/target/webapp.war /usr/local/tomcat/webapps

