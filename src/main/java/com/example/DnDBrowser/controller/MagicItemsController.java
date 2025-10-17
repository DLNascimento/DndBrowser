package com.example.DnDBrowser.controller;

import com.example.DnDBrowser.business.dto.GetAllLists;
import com.example.DnDBrowser.business.dto.IndexMagicItemsDTO;
import com.example.DnDBrowser.business.service.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/magic-items")
@RequiredArgsConstructor
public class MagicItemsController {

    private final ItemsService itemsService;

    @GetMapping("/{index}")
    ResponseEntity<IndexMagicItemsDTO> getAllMagicItemsByIndex(@PathVariable("index")String index){
        IndexMagicItemsDTO indexMagicItemsDTO = itemsService.getMagicItemByIndex(index);
        return ResponseEntity.ok(indexMagicItemsDTO);
    }


    @GetMapping
    public ResponseEntity<GetAllLists> getAllMagicItems(){
        GetAllLists getAllLists = itemsService.getAllMagicItems();
        return ResponseEntity.ok(getAllLists);
    }

}
