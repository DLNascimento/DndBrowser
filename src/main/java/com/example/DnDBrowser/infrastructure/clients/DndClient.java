package com.example.DnDBrowser.infrastructure.clients;

import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import com.example.DnDBrowser.business.dto.response.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "DndBrowser", url = "https://www.dnd5eapi.co/")
public interface DndClient {

    @GetMapping("/api/2014/monsters/{index}")
    MonsterResponse getMonsterByIndex(@RequestParam("index") String index);

    @GetMapping("/api/2014/monsters")
    Root getAllMonsters();

}
