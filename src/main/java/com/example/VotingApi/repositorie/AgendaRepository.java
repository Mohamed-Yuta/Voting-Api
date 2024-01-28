package com.example.VotingApi.repositorie;

import com.example.VotingApi.entitie.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda , Long> {
}
