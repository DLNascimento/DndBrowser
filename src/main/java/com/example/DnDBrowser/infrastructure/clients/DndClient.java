package com.example.DnDBrowser.infrastructure.clients;

import com.example.DnDBrowser.business.dto.MonsterDTO;
import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "DndBrowser", url = "https://www.dnd5eapi.co/")
public interface DndClient {

    @GetMapping("/api/2014/monsters/{index}")
    MonsterResponse getMonsterByIndex(@RequestParam("index") String index);

}
