package com.example.DnDBrowser.business.service;

import com.example.DnDBrowser.business.dto.GetAllLists;
import com.example.DnDBrowser.business.dto.IndexMonsterDTO;
import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import com.example.DnDBrowser.business.dto.response.Root;
import com.example.DnDBrowser.business.mapper.MonsterMapper;
import com.example.DnDBrowser.infrastructure.clients.DndClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonsterService {

    private final MonsterMapper monsterMapper;
    private final DndClient dndClient;

    public IndexMonsterDTO monsterIndex(String index){
        MonsterResponse response = dndClient.getMonsterByIndex(index);
        return monsterMapper.toDto(response);
    }

    public GetAllLists getAllMonsters(){
        Root root = dndClient.getAllMonsters();
        return monsterMapper.toDto(root);
    }



}
