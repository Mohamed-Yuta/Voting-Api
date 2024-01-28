package com.example.VotingApi.entitie;


import com.example.VotingApi.enums.VoteEnum;
import jakarta.persistence.*;

@Entity
public class Vote {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Enumerated(EnumType.STRING)
    private  VoteEnum voteEnum ;
    @ManyToOne
    private Agenda agenda ;
    @OneToOne
    private Member member ;
}
