package com.treehouse.monkeybug34.shelteroverseer;

import java.io.Serializable;

public class Dweller implements Serializable{

    private int level, statS, statP, statE, statC, statI, statA, statL;
    private String name;
    private char trainingSkill;

    //constructors
    public Dweller() {
        this(0, "<Unnamed>", 0, 0, 0, 0, 0, 0, 0, 'S');
    }
    public Dweller(int level, String name, int statS, int statP, int statE, int statC, int statI, int statA, int statL, char training) {
        this.level = level;
        this.name = name;
        this.statS = statS;
        this.statP = statP;
        this.statE = statE;
        this.statC = statC;
        this.statI = statI;
        this.statA = statA;
        this.statL = statL;
        this.trainingSkill = training;
    }

    //getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for major level
    public int getMajorLevel() {
        return level;
    }
    public void setMajorLevel(int level) throws RuntimeException {
        if (level > 50 || level < 0) {
            throw new RuntimeException("Level out of range(0-50): " + level);
        }
        this.level = level;
    }

    //getter and setter for skills
    public int getSkillLevel(char skill) throws RuntimeException {
        switch (skill) {
            case 'S':
            case 's':
                return statS;
            case 'P':
            case 'p':
                return statP;
            case 'E':
            case 'e':
                return statE;
            case 'C':
            case 'c':
                return statC;
            case 'I':
            case 'i':
                return statI;
            case 'A':
            case 'a':
                return statA;
            case 'L':
            case 'l':
                return statL;
            default:
                throw new RuntimeException("Invalid level key: " + skill);
        }
    }
    public void setSkillLevel(char skill, int level){
        if (level < 0 || level > 10) {
            throw new RuntimeException("Level out of range(0-10): " + level);
        }

        switch (skill) {
            case 'S':
            case 's':
                statS = level;
                break;
            case 'P':
            case 'p':
                statP = level;
                break;
            case 'E':
            case 'e':
                statE = level;
                break;
            case 'C':
            case 'c':
                statC = level;
                break;
            case 'I':
            case 'i':
                statI = level;
                break;
            case 'A':
            case 'a':
                statA = level;
                break;
            case 'L':
            case 'l':
                statL = level;
                break;
            default:
                throw new RuntimeException("Invalid level key: " + skill);
        }
    }

    public char getTraining() {
        return trainingSkill;
    }
    public void setTraining(char trainingSkill) {
        char valid[] = {'S', 'P', 'E', 'C', 'I', 'A', 'L'};
        for (char c : valid) {
            if (trainingSkill == c) {
                this.trainingSkill = trainingSkill;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dweller))
            return false;
        if (super.equals(obj))
            return true;
        Dweller objD = (Dweller) obj;
        return (objD.name.equals(name) && objD.level == level && objD.statS == statS && objD.statP == statP && objD.statE == statE && objD.statC == statC && objD.statI == statI && objD.statA == statA && objD.statL == statL);
    }

    @Override
    public String toString(){
        return "Dweller: " + name + " (" + level + ")"
                + "\nS\tP\tE\tC\tI\tA\tL\n"
                + statS + "\t" + statP + "\t" + statE + "\t" + statC + "\t" + statI + "\t" + statA + "\t" + statL + "\n";
    }
}
