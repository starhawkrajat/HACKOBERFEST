import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Java 8 Program to find Odd Numbers from a List*/
public class DriverClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                              asList(1, 4, 8, 40, 11, 22, 33, 99);
        List<Integer> oddNumbers = numbers.stream().
                                    filter(o -> o % 2 != 0).
                                     collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}

Spring Boot + Angular 10 + Mongo DB CRUD Example - click here

Example 2: Java 8 program to print even numbers from a List
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Java 8 Program to find Even Numbers from a List*/
public class DriverClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                               asList(1, 4, 8, 40, 11, 22, 33, 99);
        List<Integer> evenNumbers = numbers.stream().
                                     filter(o -> o % 2 == 0).
                                      collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}

Spring Boot + ReactJS: React Table Pagination Example - click here


Example 3: Java 8 program to print even numbers from an array
import java.util.Arrays;

/*Java 8 Program to find Even Numbers from an Array*/
public class DriverClass {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
        Arrays.stream(numbers).filter(o -> o % 2 == 0).
                              forEach(System.out::println);
    }
}

Example 4: Java 8 program to print odd numbers from an array
import java.util.Arrays;

/*Java 8 Program to find Odd Numbers from an Array*/
public class DriverClass {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
        Arrays.stream(numbers).filter(o -> o % 2 != 0).
                                    forEach(System.out::println);
    }
}

Example 5: Java 8 program to print odd numbers from a Set
import java.util.Set;
import java.util.stream.Collectors;

/*Java 8 Program to find Odd Numbers from a set*/
public class DriverClass {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(1, 4, 8, 40, 11, 22, 33, 99);
        Set<Integer> oddNumbers = numbers.stream().
                                   filter(o -> o % 2 != 0).
                                    collect(Collectors.toSet());
        System.out.println(oddNumbers);
    }
}

Example 6: Java 8 program to print even numbers from a Set
import java.util.Set;
import java.util.stream.Collectors;

/*Java 8 Program to find even numbers from a set*/
public class DriverClass {
    public static void main(String[] args) {
        Set<Integer> numbers =Set.of(1, 4, 8, 40, 11, 22, 33, 99);
        Set<Integer> evenNumbers = numbers.stream().
                                    filter(o -> o % 2 == 0).
                                     collect(Collectors.toSet());
        System.out.println(evenNumbers);
    }
} 
Spring Boot | Azure
Deploying Spring Boot Application On Azure Kubernetes Service(AKS) - click here
Dockerize Spring Boot Application and Deploy Docker Image To The Azure Container Instances - click here
Dockerize Spring Boot Application and Deploy Docker Image To Azure App Service Using GitHub Actions - click here
Build REST CRUD APIs with Spring Boot, Azure Cosmos DB and Azure Cosmos DB SQL API - click here
Building Reactive REST CRUD APIs with Spring Boot, Spring WebFlux, Azure Cosmos DB and Azure Cosmos DB SQL API - click here
Deploying a Spring Boot Web Application on Azure App Service - click here
Deploy Spring Boot WAR file on Tomcat in Azure App Service - click here

How to externalize Spring Boot Properties to an Azure App Configuration Store - click here
Integrate Azure Key Vault With Springboot - click here
Azure Cosmos DB + MongoDB API + Spring Boot - Build REST CRUD APIs - click here
Upload, Download, And Delete File To Azure Blob Storage With Spring Boot - click here
Azure Blob Storage + Spring Boot + React - File Upload, Download, and Delete Example - click here
Building Reactive REST CRUD APIs with Spring Boot, Spring WebFlux, Azure Cosmos DB and Azure Cosmos DB API for MongoDB - click here
Azure SQL Database + Spring Boot - Build REST CRUD APIs
Implementing Microservices on Azure Kubernetes Service(AKS) - Architecture - click here
Azure DevOps - CI/CD pipeline for the container-based system - click here
Azure Database for PostgreSQL Single Server + Spring Boot - Build REST CRUD APIs
Azure Database for MySQL Single Server + Spring Boot - Build REST CRUD APIs
Azure SQL Database + Spring Boot + React - CRUD & Pagination Example
Spring Boot + React JS

Spring Boot + ReactJS: React Table Pagination Example
Spring Boot + ReactJS: File Upload & Download Example

Spring Boot + React - Drag and Drop File Upload & Download Example
ReactJS, Spring Boot JWT Authentication Example
React JS + Spring Boot + MongoDB CRUD example
SpringBoot + React JS + Spring Data JPA - CRUD example
Kotlin + Spring Boot + React JS + MongoDB CRUD example
Azure Blob Storage + Spring Boot + React - File Upload, Download, and Delete Example
Kotlin + Spring Boot + React JS + MongoDB CRUD example
Core Java Learn Java 8 streams with example
Popular posts from this blog
Spring boot video streaming example-HTML5
September 21, 2019
Image
Hello everyone, Today we will learn how to stream MP4 video using Spring Boot and Spring Web Flux.  The Source code download link is provided at the end of this post. New, Quarkus Practice User Interface   Project Structure: G radle(build.gradle) plugins { id 'org.springframework.boot' version '2.5.4' id 'io.spring.dependency-management' version '1.0.11.RELEASE' id 'java' } group = 'com.knf.demo' version = '0.0.1-SNAPSHOT' sourceCompatibility = '11' repositories { mavenCentral() } dependencies { implementation 'org.springframework.boot:spring-boot-starter-webflux' testImplementation 'org.springframework.boot:spring-boot-starter-test' testImplementation 'io.projectreactor:reactor-test' } test { useJUnitPlatform() } Service (VideoStreamingService.java) package  com.knf.demo.service ; import org.springframework.beans.factory.annotation. Autowired ; import org.springframew
READ MORE
Spring Boot + Mockito simple application with 100% code coverage
March 28, 2021
Image
In this article, we will show you a simple  Spring Boot example to demonstrate test methods for Controllers, Service, and Repository, And code coverage analysis using the EclEmma plugin. Technologies used: Spring Boot 2.6.4 Mockito 3.11.2 Maven 3+ EclEmma plugin Junit 5 Java 17 A quick overview of  Spring Boot, Mockito, and EclEmma plugin Spring boot: Spring boot to develop REST web services and microservices. Spring Boot has taken the Spring framework to the next level. It has drastically reduced the configuration and setup time required for spring projects. We can set up a project with almost zero configuration and start building the things that actually matter to your application. Mockito: Mockito is a mocking framework, a JAVA-predicated library that is utilized for efficacious unit testing of JAVA applications. Mockito is utilized to mock interfaces so that a dummy functionality can be integrated into a mock interface that can be utilized in unit testing. EclEmma : E
READ MORE
Registration and Login with Spring Boot + Spring Security + Thymeleaf
October 30, 2021
Image
Hello everyone, I hope you all are well, today we will learn how to create user registration and login using Spring boot,  Spring security,  Thymeleaf, JPA, and H2DB . The  GitHub repository link is provided at the end of this tutorial. You can download the source code. Technologies used: Spring Boot 2.5.5  Spring Data JPA Spring Security  Thymeleaf  Maven 3+ Java 17  H2 Database User Interface User Registration Authentication Failed Authentication success Sign out Project Structure: Maven[pom.xml]: A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details utilized by Maven to build the project. It contains default values for most projects. Some of the configurations that can be designated in the POM is the project dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists
READ MORE
Spring Boot + OpenCSV Export Data to CSV Example
December 25, 2020
Image
Hello everyone, today we will learn how to export and download the data as a CSV file in a Spring Boot project. CSV stands for Comma-Separated-Values and it's a common format for doing a bulk data transfer between systems. For creating and parsing CSV files, we will use OpenCSV 3rd-party library. A little bit of Background Spring Boot Spring Boot makes it easy to create stand-alone, production-grade Spring-based Applications that you can "just run".  More Info -  https://spring.io/projects/spring-boot OpenCSV OpenCSV is an easy-to-use CSV (comma-separated values) parser library for Java. It was developed because all the CSV parsers at the time didn’t have commercial-friendly licenses. Java 8 is currently the minimum supported version.   More Info -  http://opencsv.sourceforge.net/ Technologies used   Java 17 Spring Boot 2.7.0 OpenCSV 5.6 Spring Data JPA H2DB Maven Project directory Maven [pom.xml] A Project Object Model or POM is the fundamental unit of work in Maven. It
READ MORE
Custom Exception Handling in Quarkus REST API
October 29, 2021
Image
Hello everyone, In this article, we will learn how to handle exceptions in the Quarkus REST application using ExceptionMapper interface implementations. ExceptionMapper is a contract for a provider that will map a thrown application exception to a Response object. We will show you custom exception handling with the help of a simple application, Project Directory: application.properties knowledgefactory.custom.error.msg.usernotfound = User not found knowledgefactory.custom.error.msg.badrequest.numeric = User Id must be numeric Create Error Message package org.knf.dev.demo.exception; public class ErrorMessage { private String message; private Boolean status; public String getMessage() { return message; } public void setMessage( String message) { this .message = message; } public Boolean getStatus() { return status; } public void setStatus( Boolean status) { this .status = status; } public Erro
READ MORE
Spring Webflux File Download Example
September 21, 2021
Image
Hello everyone, Here we will show you an example of how to download files in a Spring WebFlux application. More related topics: Spring Webflux File Upload (Single/Multiple)- REST API Example Kotlin + Spring Webflux File Upload (Single/Multiple)- REST API Example Kotlin + Spring Webflux File Download - REST API Example Reactive Rest CRUD APIs using Spring Boot, WebFlux, and Reactive Mongo Technologies Used: Spring Boot 2.5.4 Spring Webflux 2.5.4 Java 11 Maven 3 Project Structure: Project Dependency Management Spring boot dependencies, no need for the extra library for file upload. <? xml version ="1.0" encoding ="UTF-8" ?> < project xmlns ="http://maven.apache.org/POM/4.0.0" xmlns: xsi ="http://www.w3.org/2001/XMLSchema-instance" xsi :schemaLocation ="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd" > < modelVersion >4.0.0</ modelVersion > < parent > &l
READ MORE
ReactJS, Spring Boot JWT Authentication Example
June 10, 2022
Image
Hello everyone, In this tutorial, we’ll create a user registration & login example using ReactJS, Spring Boot, Spring Security, and JWT authentication. You could download the source code from our Github repository, the download link is provided at the end of this tutorial. Technologies used Backend Technologies: Java 17 Spring Boot 2.7.0 Spring Security Spring Data JPA JWT H2 Database Frontend Technologies: React 17.0.1 Axios 0.27.2 Redux 4.0.5 Bootstrap 4.5.2 ReactJS - SpringBoot - JWT - Flow Backend Project Directory: Frontend Project Directory: Following is the screenshot of our application - User Registration: User Signin: Profile View: Access Resource: We will build two projects:  1. Backend:   spring-boot-security-jwt 2. Frontend: react-redux-jwt Project 1: spring-boot-security-jwt Pom.xml <?xml version = "1.0" encoding = "UTF-8" ?> <project xmlns = "http://maven.apache.org/POM/4.0.0" xmlns:xsi = "http://www.w3.org/2001/XMLSchem
READ MORE
DataTable-Pagination example with Spring boot, jQuery and ajax
September 25, 2019
Image
Hello everyone, Today we will show you the DataTable-Pagination example with Spring boot, jQuery, and ajax. The following technologies stack being used: Spring Boot 2.5.5 Java 17 Datatable jQuery javascript Ajax Project Structure pom.xml POM stands for project object model. It's the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used to build the project. It downloads required libraries easily using POM XML tags. <?xml version = "1.0" encoding = "UTF-8" ?> <project xmlns = "http://maven.apache.org/POM/4.0.0" xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation = "http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd" > <modelVersion> 4.0.0 </modelVersion> <parent> <groupId> org.springframework.boot </groupId> <a
READ MORE
Java Stream API - How to convert List of objects to another List of objects using Java streams?
February 24, 2022
Image
Hello everyone, here we will show you how to convert a List of objects to another List of objects in Java using the Java streams map(). The ‘map’ method maps each element to its corresponding result.   Java Stream API The Java Stream API provides a functional approach to processing collections of objects. The Stream in Java can be defined as a sequence of elements from a source Collection or Array. Most of the stream operations return a Stream. This helps create a chain of stream operations(stream pipe-lining). The streams also support the aggregate or terminal operations on the elements. for example, finding the minimum or maximum element or finding the average etc...Stream operations can either be executed sequentially or parallel. when performed parallelly, it is called a parallel stream. Stream map() Method The Java 8 Stream map() is an intermediate operation.It converts Stream<obj1> to Stream<obj2>. For each object of type obj1, a new object of type obj2 is created and
READ MORE
Powered by Blogger
Copyright © 2019-2022 knowledgefactory.net | All Rights Reserved

Support us

About Us

Spring Boot
Quarkus
Spring Boot | Azure
Spring Boot + React JS
Micronaut
Spring Boot - part 2
Spring WebFlux
Spring Security
React Native - tutorial
Kotlin
Kotlin - Part 2
Full stack development
ReactJS - Tutorial
Node JS
Cloud solutions
Go Language
Java
Python
Angular 10
Interview questions
Learn Java 8 with examples
Java Frameworks
Web Development
PHP
General
JHipster Examples
Labels
About Us


