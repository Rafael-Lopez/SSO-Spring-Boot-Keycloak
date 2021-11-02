# SSO with Spring Boot + Keycloak

A demo project to demonstrate how to use Spring Boot, Keycloak, Thymeleaf and Spring Security to implement Single Sign-on (SSO)

## Description

There are two Spring Boot applications that emulate different apps running under the same organization: 

| Application  | Port |
| --- | --- |
| student-app  | 8081  |
| professor-app  | 8082  |

These are meant to use SSO via Keycloack, which runs on port 8089.
