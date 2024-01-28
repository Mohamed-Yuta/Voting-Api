package com.example.VotingApi.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Agenda {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String title ;
    private String Description ;
    private Date openTime ;
    private Date closingTime ;
    @OneToMany(mappedBy = "agenda",fetch = FetchType.LAZY)
    private List<Vote> voteList ;

}
