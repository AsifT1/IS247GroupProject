Project Name: Coffee Shop Ordering System

Members/Roles: 

Omar - Quality Assurance (g80-m3)

Mara - Project Manager (mandrei1)

Asif - Programmer (AsifT1)

Anukulan - Debugger (Anukulan)

Hala - Business Analyst (hmalik590)

Ishan - System Admin (brownlantern01)

Project Description:
Our project is a Coffee Shop Ordering System Program where customers can choose food and drinks from a menu.Customers earn one point for every dollar spent, and points can be redeemed for discounts if enough have been accumulated. This program automates the ordering process while allowing customers to use their rewards, helping employees fulfill orders more quickly and reducing wait times.

Use of Docker: 
In this project we implemented a docker-file which makes it so that in runs the same way everywhere, such as different team-members devices and it contains all the libraries, and settings on intelliJ. The Docker setup uses a Dockerfile script separate from the Java code which specifies the base image (openjdk:23), copies the compiled Java classes into the container, sets the working directory, and runs the Java program using the command java Main; the Java code itself simply prints messages to demonstrate the app running inside the Docker container. 

Use of Docker and Github Action: 
Docker packages our cafe ordering system’s Java application and all its dependencies into a portable container, ensuring it runs consistently anywhere. GitHub Actions automates building and pushing our Docker container to Docker Hub whenever code is pushed to the master branch, enabling continuous integration and deployment. This GitHub Actions workflow automatically checks out the code, logs into Docker Hub using stored secrets, builds a Docker image from the project’s Dockerfile, and pushes the image to Docker Hub tagged with the current run number whenever code is pushed to the master branch.

Use of JavaDocs:
In this project we added JavaDoc comments to all key classes and methods and generated the HTML documentation, which is hosted using GitHub Pages for easy access to our team and instructor. JavaDocs are used to explain the purpose and functionality of classes and methods, clarify input parameters and return values, as well as improve code readability and maintainability. Alongside the comments we have generated HTML documentation that can be easily viewed in web browsers. 

