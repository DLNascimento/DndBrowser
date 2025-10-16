package com.example.DnDBrowser.business.dto.response;

import java.util.ArrayList;
import java.util.Date;

public class MonsterResponse {
    public String index;
    public String name;
    public String size;
    public String type;
    public String alignment;
    public ArrayList<ArmorClass> armor_class;
    public int hit_points;
    public String hit_dice;
    public String hit_points_roll;
    public Speed speed;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public ArrayList<Proficiency> proficiencies;
    public ArrayList<Object> damage_vulnerabilities;
    public ArrayList<Object> damage_resistances;
    public ArrayList<Object> damage_immunities;
    public ArrayList<Object> condition_immunities;
    public Senses senses;
    public String languages;
    public int challenge_rating;
    public int proficiency_bonus;
    public int xp;
    public ArrayList<SpecialAbility> special_abilities;
    public ArrayList<Action> actions;
    public ArrayList<LegendaryAction> legendary_actions;
    public String image;
    public String url;
    public Date updated_at;
    public ArrayList<Object> forms;
    public ArrayList<Object> reactions;
}
