package com.ironhack.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player playerA;
    Player playerB;
    Player playerC;

    @BeforeEach
    public void setUp() {
        playerA = new Warrior("Adria", 150, 20, 3);
        playerB = new Elf("Adam", 150, 20, 3);
        playerC = new Wizard("Anna", 150, 20, 3);
    }

    @Test
    void reduceLive_none_liveReducedByOne() {
        Assertions.assertEquals(2, playerA.reduceLive());
    }

    @Test
    void reduceLive_none_liveReducedUntilZero() {
        Assertions.assertEquals(2, playerA.reduceLive());
        Assertions.assertEquals(playerA.getInitHealth(), playerA.getHealth());
        Assertions.assertEquals(1, playerA.reduceLive());
        Assertions.assertEquals(0, playerA.reduceLive());
        Assertions.assertEquals(0, playerA.reduceLive());
    }

    @Test
    void reduceLive_none_restoreHealth() {
        playerA.setHealth(100);
        playerA.reduceLive();
        Assertions.assertEquals(playerA.getInitHealth(), playerA.getHealth());
    }

    @Test
    void attackPlayer_none_healthReduced() {
        System.out.println("Player A has " + playerA.getStrength() + " strength points.");
        System.out.println("Player B has " + playerB.getHealth() + " health points.");
        int healthReduction = playerB.getHealth() - playerA.getStrength();
        playerA.attackPlayer(playerB);
        Assertions.assertEquals(healthReduction, playerB.getHealth());
    }


    @Test
    void transformToElf_warrior_elf() {
        Player playerATransformed = Player.transformToElf(playerA);
        Assertions.assertTrue(playerATransformed instanceof Elf);
        Assertions.assertEquals(playerB.getInitHealth(), playerATransformed.getInitHealth());
        Assertions.assertEquals(playerA.getName(), playerATransformed.getName());
        Assertions.assertEquals(playerB.getHealth(), playerATransformed.getHealth());
        Assertions.assertEquals(playerA.getLives(), playerATransformed.getLives());
    }

    @Test
    void transformToElf_wizard_elf() {
        Player playerCTransformed = Player.transformToElf(playerC);
        Assertions.assertTrue(playerCTransformed instanceof Elf);
        Assertions.assertEquals(playerB.getInitHealth(), playerCTransformed.getInitHealth());
        Assertions.assertEquals(playerC.getName(), playerCTransformed.getName());
        Assertions.assertEquals(playerB.getHealth(), playerCTransformed.getHealth());
        Assertions.assertEquals(playerC.getLives(), playerCTransformed.getLives());
    }

    @Test
    void transformToElf_elf_elf() {
        Player playerBTransformed = Player.transformToElf(playerB);
        Assertions.assertTrue(playerBTransformed instanceof Elf);
        Assertions.assertEquals(playerB.getInitHealth(), playerBTransformed.getInitHealth());
        Assertions.assertEquals(playerB.getName(), playerBTransformed.getName());
        Assertions.assertEquals(playerB.getHealth(), playerBTransformed.getHealth());
        Assertions.assertEquals(playerB.getLives(), playerBTransformed.getLives());
    }

    @Test
    void checkHealth_none_healthReducedAndLiveReduced() {
        int initLives = playerB.getLives();
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        Assertions.assertEquals(playerB.getInitHealth(), playerB.getHealth());
        Assertions.assertEquals(initLives - 1, playerB.getLives());
    }
}