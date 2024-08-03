package com.app.service;

import com.app.entity.Skill;
import java.util.List;

public interface SkillService {
    Skill addSkill(Skill skill);
    List<Skill> getAllSkills();
    Skill getSkillById(int id);
    //Skill getSkillByName(String skillName); // Add this method
}
