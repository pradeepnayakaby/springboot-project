FROM tomcat:latest
RUN cp -R /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps
COPY department/target/department-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/department.war

