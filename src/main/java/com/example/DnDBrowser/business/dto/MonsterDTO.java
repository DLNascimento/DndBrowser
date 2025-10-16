package com.example.DnDBrowser.business.dto;

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
                         int proficiencyBonus,
                         int xp,
                         String image,
                         String url){
}
