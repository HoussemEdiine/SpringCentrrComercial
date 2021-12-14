package org.hdev.compteservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentreComercial {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String  nom ;
    private  String adresse ;
    private  String login ;
    private  String password ;
    @OneToMany(mappedBy = "centre")
    Set<Boutique> boutique;
}
