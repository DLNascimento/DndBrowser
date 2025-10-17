package com.example.DnDBrowser.controller;

import com.example.DnDBrowser.business.dto.AllMonstersDTO;
import com.example.DnDBrowser.business.dto.IndexMonsterDTO;
import com.example.DnDBrowser.business.service.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("monsters")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService service;


    @GetMapping("/{index}")
    public ResponseEntity<IndexMonsterDTO> getMonsterByIndex(@PathVariable("index")String index){
        IndexMonsterDTO getMonsterByIndex = service.monsterIndex(index);
        return ResponseEntity.ok(getMonsterByIndex);
    }

    @GetMapping
    public ResponseEntity<AllMonstersDTO> getAllMonsters(){
       AllMonstersDTO getAllMonsters = service.getAllMonsters();
        return ResponseEntity.ok(getAllMonsters);
    }

}
