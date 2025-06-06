package ru.itis.java.forbiddenlands.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
@Table(name = "character")
@ToString
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer strength;
    private Integer dexterity;
    private Integer mind;
    private Integer empathy;

    private Integer closeCombat;
    private Integer might;
    private Integer craft;
    private Integer stamina;

    private Integer sleightOfHand;
    private Integer accuracy;
    private Integer agility;
    private Integer stealth;

    private Integer survival;
    private Integer lore;
    private Integer insight;
    private Integer scouting;

    private Integer influence;
    private Integer training;
    private Integer performance;
    private Integer healing;

    @ManyToMany
    @JoinTable(
            name = "character_feats",
            joinColumns = {
                    @JoinColumn(name = "character_id"),
                    @JoinColumn(name = "level")
            },
            inverseJoinColumns = @JoinColumn(name = "feat_id")
    )
    private Set<FeatEntity> feats;
}
