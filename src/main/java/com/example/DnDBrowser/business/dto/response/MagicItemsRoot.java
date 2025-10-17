package com.example.DnDBrowser.business.dto.response;

import java.util.ArrayList;
import java.util.Date;

public class MagicItemsRoot{
    public String index;
    public String name;
    public EquipmentCategory equipment_category;
    public Rarity rarity;
    public ArrayList<Object> variants;
    public boolean variant;
    public ArrayList<String> desc;
    public String url;
    public Date updated_at;
}
