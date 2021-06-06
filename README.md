# JSON-YAML-Tutorial
This repository contains various folders for understanding JSON and YAML.

**json samples:** contains the json sample files

**yaml samples:** contains the yaml sample files

**pojo:** contains the java objects

**xml:** contains the xml files

**java-spring-boot:** Java spring boot application for illustrating JSON and YAML parsing

This is a JAVA application is based on Spring boot. The CoursesDemoService is the main class which instantiates the spring boot server and it listens on 8098 port by default.This is a maven based application. This is a JAVA application is based on Spring boot.

The CoursesDemoService.java is the main class which instantiates the spring boot server and it listens on 8098 port by default.This is a maven based application.

The CourseApiImpl class exposes the REST URL http://localhost:8098/course/JSON-tutorial where JSON-tutorial is the name of the course. You can also notice that we use the jackson library in pom.xml and in CourseApiImpl we parse the student json string to a object using ObjectMapper from jackson library.

The YamlParser You can build this application by mvn clean install . The generated executable jar can be built as java -jar <>

**nodejs:** Parse JSON and YAML files in node js language.

The student.js file exposes a rest service to get the list of students for a specific course name. It parses the student.json in database folder and returns the students for the matching course specified in input.

The yaml-parser.js contains code to parse the yaml file using body parser.
