public class Character {
    //base 
    String name;
    int health; 
    int maxHealthPoints;
    
    //Character stats
    int strength; 
    int defence; 
    int intelligence; 
    int initiative;   //character turn order 
    
    //Status effect 
    boolean wounded; 
    boolean poisoned; 

    //arraylist to hold Equipment 
    // Armour Armour;  
    // Weapon Weapon; 
    


    //Character Constructor Method 
    public Character (String name,int health, int strength,int defence,int intelligence,int initiative){
        this.name= name;
        this.health = health; 

        this.strength = strength; 
        this.defence = defence; 
        this.intelligence = intelligence; 
        this.initiative = initiative; 

        this.wounded = false; 
        this.poisoned = false; 

    }

    //Methods (get and set) character stats 
    public String getName(){
        return name; 
    }

    public int getHealth(){
        return health; 
    }

    public void setHealth (){
        this.health = Math.max(0,Math.min(health,maxHealthPoints));
    }

    public int getStrength(){
        return strength; 
    }

    public int getDefence(){
        return defence; 
    }
 
    public int getIntelligence() {
        return intelligence;
    }
    
    public int getInitiative() {
        return initiative;
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    

}
