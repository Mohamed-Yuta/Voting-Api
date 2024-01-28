package com.example.VotingApi.entitie;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @OneToOne
    private Vote vote;

}
