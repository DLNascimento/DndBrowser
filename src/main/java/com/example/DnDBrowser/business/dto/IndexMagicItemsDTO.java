package com.example.DnDBrowser.business.dto;

import com.example.DnDBrowser.business.dto.response.EquipmentCategory;
import com.example.DnDBrowser.business.dto.response.Rarity;

import java.util.Date;
import java.util.List;

public record IndexMagicItemsDTO(
        String index,
        String name,
        EquipmentCategory equipmentCategory,
        Rarity rarity,
        List<Object> variants,
        boolean variant,
        List<String> desc,
        String url,
        Date updatedAt
) {
}
