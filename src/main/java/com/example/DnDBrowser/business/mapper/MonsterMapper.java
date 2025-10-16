package com.example.DnDBrowser.business.mapper;

import com.example.DnDBrowser.business.dto.MonsterDTO;
import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MonsterMapper {

    @Mapping(source = "hit_points", target = "hitPoints")
    @Mapping(source = "hit_dice", target = "hitDice")
    @Mapping(source = "proficiency_bonus", target = "proficiencyBonus")
    MonsterDTO toDto(MonsterResponse monsterResponse);
    List<MonsterDTO> toListDto(List<MonsterResponse> listMonsterResponse);
}
