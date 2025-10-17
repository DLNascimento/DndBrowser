package com.example.DnDBrowser.infrastructure.clients;

import com.example.DnDBrowser.business.dto.response.MagicItemsRoot;
import com.example.DnDBrowser.business.dto.response.MonsterResponse;
import com.example.DnDBrowser.business.dto.response.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "DndBrowser", url = "https://www.dnd5eapi.co/")
public interface DndClient {

    @GetMapping("/api/2014/monsters/{index}")
    MonsterResponse getMonsterByIndex(@PathVariable("index") String index);

    @GetMapping("/api/2014/monsters")
    Root getAllMonsters();

    @GetMapping("/api/2014/magic-items/{index}")
    MagicItemsRoot getMagicItemByIndex(@PathVariable("index")String index);

    @GetMapping("api/2014/magic-items")
    Root getAllMagicItems();

}
