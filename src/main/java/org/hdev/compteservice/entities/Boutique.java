package org.hdev.compteservice.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hdev.compteservice.enums.Category;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boutique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String nom ;
    @Enumerated(EnumType.STRING)
    private Category category ;
    @ManyToOne
     CentreComercial centre;
    @ManyToMany
    Set<Client> client;
}
