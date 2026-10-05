package tn.esprit.autoloc.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "equipement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    @Column(nullable = false, length = 100)
    private String libelle;

    // Association : Equipement N ---- N Vehicule
    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules;
}