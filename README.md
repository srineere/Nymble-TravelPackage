# Nymble Software Design Task (JAVA) -Travel Agency Management System

## Overview

This project is part of Nymble's Software Design Task. The Java project implements a Travel Agency Management System. It allows travel agencies to maintain their travel packages' itinerary and passengers.

## Project Structure

The project consists of the following main classes:

- `TravelPackage`: Represents a travel package with a name, passenger capacity, itinerary, and list of passengers.
- `Destination`: Represents a destination with a name and a list of activities available.
- `Activity`: Represents an activity with a name, description, cost, and capacity. Each activity is available at one destination.
- `Passenger`: Represents a passenger with a name, passenger number, and membership type (standard, gold, premium).

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed
- IntelliJ IDEA with Gradle support

### Importing the Project

1. Open IntelliJ IDEA.

2. Select "File" -> "Open" and navigate to the project directory.

3. Open the `build.gradle` file.

4. Choose "Open as Project."

### Running the Application

1. Open the `MainClass` file.

2. Right-click on the `main` method.

3. Select "Run 'MainClass.main()'."

### Running Tests

1. Right-click on the `src/test/java` directory.

2. Select "Run 'All Tests'."

