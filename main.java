/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codex;

/**
 *
 * @author mproxas
 */
public class Warrior {
    String name;
    int level;
    WarriorType type;
    double hitPoints;
    double hpRegenPerSec;
    double damageReduction;
    double energy;
    double attackCoolDown;
    double baseAttackCooldown;
    double damage;
    Damage baseDamage;
    int toughness;
    int dexterity;
    int smartness;
    int baseToughness;
    int baseDexterity;
    ArrayList<inventory> item;
    ArrayList<EquippedItems> eItems;
    
    public void setWarrior(String name, int level, WarriorType type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public int getLevel() {
        return level;
    }
    
    public WarriorType getType() {
        return type;
    }
    
    public double getHitPoints() {
        return hitPoints;
    }
    
    public double getHpRegenPerSec() {
        return hpRegenPerSec;
    }
    
    public double getDamageReduction() {
        return damageReduction;
    }
    
    public double getEnergy() {
        return energy;
    }
    
    public double getAttackCooldown() {
        return attackCoolDown;
    }

}

