package com.example.VotingApi.repositorie;

import com.example.VotingApi.entitie.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member , Long> {
}
