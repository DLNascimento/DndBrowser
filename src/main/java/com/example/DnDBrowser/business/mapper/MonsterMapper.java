package com.example.DnDBrowser.business.mapper;

import com.example.DnDBrowser.business.dto.GetAllLists;
import com.example.DnDBrowser.business.dto.IndexMagicItemsDTO;
import com.example.DnDBrowser.business.dto.IndexMonsterDTO;
import com.example.DnDBrowser.business.dto.response.MagicItemsRoot;
import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import com.example.DnDBrowser.business.dto.response.Root;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MonsterMapper {

    @Mapping(source = "hit_points", target = "hitPoints")
    @Mapping(source = "hit_dice", target = "hitDice")
    @Mapping(source = "proficiency_bonus", target = "proficiencyBonus")
    @Mapping(source = "challenge_rating", target = "challengeRating")
    @Mapping(source = "special_abilities", target = "specialAbilities")
    @Mapping(source = "legendary_actions", target = "legendaryActions")
    IndexMonsterDTO toDto(MonsterResponse monsterResponse);

    @Mapping(source = "equipment_category", target = "equipmentCategory")
    @Mapping(source = "updated_at", target = "updatedAt")
    IndexMagicItemsDTO toDto(MagicItemsRoot magicItemsRoot);


    GetAllLists toDto(Root root);
}
