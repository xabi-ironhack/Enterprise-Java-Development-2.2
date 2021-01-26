# Lab 2.2
Labs are mandatory and must be completed before the start of the next class.

You make work collaboratively with your classmates, but you may not copy and paste another students code.

## Instructions
Create a new github repository named Enterprise-Java-Development-1.2

Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assigment.

If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.

Upload the code for all of the following prompts to your repository.

## Specifications
1. Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n. Write your tests first!

2. Java has certain words that are considered "Java Keywords". Keywords are reserved and cannot be used as variable names. Employing TDD, create a method that takes in a String and returns true if the String contains any Java Keywords. For example, break is a Java keyword. The String "Don't break my heart" should return true. The String "I love to breakdance" should return false. You will need to use Google to find a list of all Java Keywords.

3. Create a Student class to represent the students in your course. Add all relevant properties and behaviors that you might need. Don't forget to add getters and setters.

4. Create a Book class for users who want to track Books that they have read.

5. Create a Task List class where users can track Tasks. Tasks should be a separate class with a boolean property that tracks whether or not the task has been completed.

6. Create a Player class for a video game. Track the players stats (health, strength, lives, etc). Create 3 subclasses Warrior, Elf, Wizard. Provide at least one specialized behavior for each.

7. Employing TDD, create a method that decrements the lives of a player. The method should reduce the number of lives by one and restore the player's health to its original state.

8. Employing TDD, create a method that allows one player to attack another. When a player attacks another the attecked players health should decrease by the attacking players strength. For example, if playerA has strength = 5 and playerB has health = 20, then when playerA attacks playerB, playerB's new health will be 15. Hint: the attack method will take a Player object as an argument

9. Employing TDD, create a transformToElf method that changes a Warrior or Wizard to an Elf. All the players stats should remain intact during the transformation. Hint: Your test should test to ensure that the new object has all the same stats and is of type Elf. You will likely need to use Google to determine how to accomplish this.

10. Employing TDD, create a checkHealth method. If the player's health is at or below zero, the method should call the method that decrements lives. checkHealth should be called each time a player is attacked.
