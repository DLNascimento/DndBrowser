package com.example.DnDBrowser.controller;

import com.example.DnDBrowser.business.dto.MonsterDTO;
import com.example.DnDBrowser.business.service.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("monsters")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService service;


    @GetMapping("/{index}")
    public ResponseEntity<MonsterDTO> getAllMonsters(@PathVariable("index")String index){
        MonsterDTO getMonsterByIndex = service.monsterIndex(index);
        return ResponseEntity.ok(getMonsterByIndex);
    }

}
