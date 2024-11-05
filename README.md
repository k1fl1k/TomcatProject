# TomcatProject

This is a Java web application deployed on Apache Tomcat, built with Java EE and JSP technology. The application demonstrates how to handle requests, interact with session attributes, and display product information dynamically.

## Project Setup

### Prerequisites

- **JDK 22+**: Ensure you have Java 8 or higher installed on your system.
- **Apache Tomcat 10+**: The application is designed to run on Apache Tomcat. Make sure you have Tomcat 9 or later.
- **Maven**: The project uses Maven for dependency management. Ensure you have Maven installed for building the project.

### Installation

1. Clone or download this repository.

   ```bash
   git clone https://github.com/k1fl1k/TomcatProject.git
   ```

2. Navigate to the project directory.

   ```bash
   cd TomcatProject
   ```

3. If you're using Maven, build the project by running:

   ```bash
   mvn clean install
   ```

4. Deploy the `.war` file (generated in the `target` folder) to your Tomcat server.
   
5. Start your Tomcat server.

   If using IntelliJ IDEA or Eclipse, you can run it directly from your IDE.

### Directory Structure

The directory structure of the project looks like this:

```
TomcatProject
│
├── src
│   └── main
│       ├── java                # Java classes (Servlets, Models, etc.)
│       │   └── com/k1fl1k/tomcatproject
│       │
│       ├── resources           # Static resources (CSS, JS, etc.)
│       │
│       └── webapp
│           ├── WEB-INF
│           │   ├── web.xml     # Deployment descriptor
│           │   └── views
│           └──     └── products.jsp # JSP page for displaying product list
└── pom.xml                     # Maven build file
```

### Configuration

1. **web.xml**: The `web.xml` file contains the servlet mappings and configuration for the web application.

2. **ProductServlet**: A simple servlet to handle requests for displaying products and managing session data like a visit counter.

### Application Features

- **Product List Display**: The application generates a list of products dynamically using a servlet and displays them on a JSP page.
- **Session Management**: The application tracks the number of visits by the user and displays this information on each page load.
- **JSTL Integration**: The application uses JSTL tags (like `<c:forEach>`) for iterating over the product list in the JSP file.

### Example Usage

1. After deploying the application to Tomcat, open the following URL in your browser:

   ```
   http://localhost:8080/TomcatProject/simple
   ```

   This will display the servlet's response, including the context path, servlet path, user agent, session counter, and any query parameters (`param1`, `param2`).

2. To view the product list, visit:

   ```
   http://localhost:8080/TomcatProject/products
   ```
3. To view info about request.
   ```
   http://localhost:8080/TomcatProject_war_exploded/request-info
   ```

### Technologies Used

- **Java EE**: For building the servlet and managing session and request data.
- **JSP**: To display dynamic content in the web pages.
- **JSTL**: JavaServer Pages Standard Tag Library to simplify the creation of dynamic pages.
- **Tomcat**: The web server used to deploy and run the application.
- **Bootstrap**: Front-end framework used to style the web pages.

### Troubleshooting

- **NoClassDefFoundError**: If you encounter `NoClassDefFoundError`, ensure that the necessary libraries (`javax.servlet.jsp`, `jstl`, `tomcat-embed-jasper`) are included in your `WEB-INF/lib` or `pom.xml` (If you have them try another version).
- **JSP Tag Library Issues**: Make sure your `taglib` directive in the JSP page is correct and that the `jstl` library is present.

---

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
