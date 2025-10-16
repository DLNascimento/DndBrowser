package com.example.DnDBrowser.business.dto;

import com.example.DnDBrowser.business.dto.response.*;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public record MonsterDTO(String name,
                         String size,
                         String type,
                         String alignment,
                         String hitPoints,
                         String hitDice,
                         int strength,
                         int dexterity,
                         int constitution,
                         int intelligence,
                         int wisdom,
                         int charisma,
                         String languages,
                         Speed speed,
                         List<Proficiency> proficiencies,
                         int challengeRating,
                         int proficiencyBonus,
                         int xp,
                         List<SpecialAbility> specialAbilities,
                         List<Action> actions,
                         List<LegendaryAction> legendaryActions,
                         String image,
                         String url){
}
