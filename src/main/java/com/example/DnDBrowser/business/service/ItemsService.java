package com.example.DnDBrowser.business.service;

import com.example.DnDBrowser.business.dto.GetAllLists;
import com.example.DnDBrowser.business.dto.response.Root;
import com.example.DnDBrowser.business.mapper.MonsterMapper;
import com.example.DnDBrowser.infrastructure.clients.DndClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemsService {

    private final MonsterMapper mapper;
    private final DndClient dndClient;


    public GetAllLists getAllMagicItems(){
        Root root = dndClient.getAllMagicItems();
        return mapper.toDto(root);
    }

}
