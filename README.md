
# Voting-Api
 

Voting-Api is a backend solution developed using Spring Boot to facilitate decision-making through voting in cooperative organizations. In cooperativism, each member has one vote, and decisions are made collectively during meetings through voting. This application provides a REST API for managing voting sessions, allowing users to register agendas, open voting sessions, receive votes from members, and count the votes to determine the outcome of the agenda.


# Key Features:

Agenda Registration:

Users can register new agendas by providing a title and description.
Agendas are stored persistently in the database, ensuring data integrity and availability across application restarts.
Voting Session Management:

Users can open a voting session on a specific agenda, specifying the duration of the session.
The voting session remains open for the specified duration, allowing members to cast their votes within the specified time frame.
Vote Submission:

Members can submit their votes for agendas using the REST API.
Each member is identified by a unique ID and can only vote once per agenda.
Votes are recorded and associated with the corresponding agenda in the database.
Vote Counting:

The system provides functionality to count the votes received for each agenda.
Votes are categorized as 'Yes' or 'No,' and the total count for each category is calculated to determine the outcome of the vote.
## Tech Stack



Java: The primary programming language.

Spring Boot , Maven , Lombok , Spring Data JPA , Spring Web .
RestTemplate/ WebClient: Used for making HTTP requests to external APIs.


## Conclusion

This application provides a reliable and efficient solution for managing voting sessions in cooperative organizations. By leveraging modern technologies and integrating with external systems, it enhances the voting process, ensuring fairness, transparency, and accuracy in decision-making.