package com.antobevi.SpringBootPetsWebApp.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor // necesario para el ORM
@AllArgsConstructor
@Getter
@Setter
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String license; // matricula
    private String email;
    @OneToMany(mappedBy = "Vet")
    private List<Pet> attendedPets; // petsCaredOf: mascotas cuidadas o atendidas

}
