package com.example.VotingApi.repositorie;

import com.example.VotingApi.entitie.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote , Long> {
}
