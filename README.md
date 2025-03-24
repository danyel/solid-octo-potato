# Solid Octo Potato

## Introduction

### Architecture

The decision has been made to have an onion layer architecture aka hexagonal architecture.

Various software design patterns has been decided like port and adapters, proxy, factory, DDD, TDD and builders.
And we are developing a micro service

### Tech stack
- java 21
- spring boot 3.3.5

## Online Bookstore Recommendation System

Overview: An online bookstore wants to improve its customer experience by providing personalized book recommendations. The goal is to enhance user satisfaction by suggesting books based on their browsing and purchase history.

*Actors:*

Customer: The user who browses and purchases books on the platform.

System: The online bookstore platform that processes data and generates recommendations.

Use Case:

Title: Personalized Book Recommendation

Primary Actor: Customer

Stakeholders:

Customer: Wants relevant and personalized book recommendations to enhance their shopping experience.

Business: Wants to increase sales by suggesting books that are more likely to be bought.

Preconditions:

The customer has created an account and logged in to the platform.

The customer has at least one purchase or browsing history available.

Post conditions:

The customer is presented with a list of personalized book recommendations on their homepage.

The system records feedback (e.g., customer purchases or "likes") to improve future recommendations.

Main Flow:

Customer logs into the online bookstore and navigates to the homepage.

System analyzes the customer's browsing history, purchases, and ratings.

System generates a list of recommended books based on the customer's preferences and historical data.

Customer is presented with the recommendations on the homepage.

Customer browses the recommendations and selects a book to view more details.

Customer decides to purchase the book, adding it to their cart.

Alternative Flow:

If the customer has no history or the system can't find personalized suggestions, the system shows general bestsellers or popular books.

Exceptions:

If the recommendation system fails to load, an error message is displayed, and the user is prompted to try again later.



