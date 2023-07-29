# IdCard-Dispatcher Project

## Description

The **IdCard-Dispatcher** project is a web application built with Spring Boot, Thymeleaf, and iTextPDF. It aims to generate printable ID cards with dynamic information such as name, date of birth, address, and employee ID. The application allows users to enter their details, preview the generated ID card, and print or save it as a PDF.

![ID Card Preview](id_card_preview.png)

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Installation

### Prerequisites

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 11 or higher)
- [Maven](https://maven.apache.org/download.cgi) (version 3.6.x)

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/balajidontul/IdCard-Dispatcher.git
   cd IdCard-Dispatcher

### Usage
- Open your web browser and go to http://localhost:8080.
- You will be presented with a form to fill in your details for the ID card.
- Enter your name, date of birth, address, and employee ID in the respective fields.
- Click the "Preview ID Card" button to see a preview of your generated ID card.
- If you are satisfied with the preview, you can either print the ID card or save it as a PDF by clicking the "Print" or "Save PDF" button, respectively.


### Features
- User-friendly Form for Entering ID Card Details:
  - The web application provides a user-friendly form where users can enter their details for the ID card.
  - The form includes fields for entering the following information:
    - Name
    - Date of Birth
    - Address
    - Employee ID

- Dynamic Generation of ID Cards:
  - After users fill in their details and submit the form, the application dynamically generates an ID card based on the provided information.
  - The generated ID card includes the user's name, date of birth, address, and employee ID in a visually appealing design.

- Preview Functionality:
  - Before finalizing the ID card, users have the option to preview the generated ID card on the screen.
  - The preview displays the ID card exactly as it would appear when printed or saved as a PDF.

- Printing and Saving as PDF:
  - If users are satisfied with the preview, they can proceed to either print the ID card or save it as a PDF.

- Easy-to-Use Interface:
  - The web application features an intuitive and easy-to-use interface, making it straightforward for users to interact with the form and generate their ID cards.
  - The design and layout of the application are optimized for smooth navigation and effortless data entry.

By following these steps, users can effortlessly enter their details, preview the ID card, and either print it or save it as a PDF, all within an enjoyable user experience.


### Technologies Used
# Latest Versions of Software Components

Here are the sources to find the latest versions of each software component:

## Spring Boot
- Official Spring Boot Website: [spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
- Maven Central Repository: [search.maven.org](https://search.maven.org/)
- GitHub Repository: [github.com/spring-projects/spring-boot](https://github.com/spring-projects/spring-boot)

## Thymeleaf
- Thymeleaf Website: [www.thymeleaf.org](https://www.thymeleaf.org/)
- Maven Central Repository: [search.maven.org](https://search.maven.org/)

## iTextPDF
- iText Website: [itextpdf.com](https://itextpdf.com/)
- Maven Central Repository: [search.maven.org](https://search.maven.org/)

## Maven
- Apache Maven Website: [maven.apache.org](https://maven.apache.org/)
- Apache Maven Central Repository: [search.maven.org](https://search.maven.org/)

## Java JDK
- Official Oracle Website: [www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
- OpenJDK Website: [openjdk.java.net](https://openjdk.java.net/)

By referring to these sources, you can ensure you are using the most recent and compatible versions of these software components in your projects. Always keep an eye on updates to take advantage of new features, bug fixes, and security improvements.



### contributing.
- Fork the repository.
- Create a new branch: `git checkout -b new-feature`
- Make your changes and commit them: `git commit -m "Add some feature"`
- Push to the branch: `git push origin new-feature`
- Submit a pull request.
- License: This project is licensed under the MIT License.


### Acknowledgments
Spring Boot and Thymeleaf for providing an excellent framework for web application development.
iTextPDF for enabling PDF generation in Java-based projects.
Feel free to enhance and customize this README.md file to include specific details about your project. Add more sections, explain project architecture, usage instructions, known issues, and anything else that would help users understand and use your application better.
