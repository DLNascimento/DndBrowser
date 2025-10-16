package com.example.DnDBrowser.business.service;

import com.example.DnDBrowser.business.dto.MonsterDTO;
import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import com.example.DnDBrowser.business.mapper.MonsterMapper;
import com.example.DnDBrowser.infrastructure.clients.DndClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonsterService {

    private final MonsterMapper monsterMapper;
    private final DndClient dndClient;

    public MonsterDTO monsterIndex(String index){
        MonsterResponse response = dndClient.getMonsterByIndex(index);
        return monsterMapper.toDto(response);
    }



}
