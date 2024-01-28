package com.example.VotingApi.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class StatusService {

        private final RestTemplate restTemplate; // Use RestTemplate or WebClient for HTTP requests

        @Value("${external.api.url}") // Define this property in application.properties
        private String externalApiUrl;


        public String checkMemberVotingStatus(Long memberId) {
            String apiUrl = externalApiUrl + "/users/" + memberId;

            try {
                ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

                if (response.getStatusCode() == HttpStatus.OK) {
                    return response.getBody();
                } else {
                    // Handle other status codes
                    return "UNABLE_TO_VOTE";
                }
            } catch (RestClientException e) {
                // Handle exceptions (e.g., connection issues)
                return "UNABLE_TO_VOTE";
            }
        }


}
