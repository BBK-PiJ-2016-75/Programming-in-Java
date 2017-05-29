package com.github.bbkpij201675.programminginjava.day10.ex02;

/**
 * Program which calculates the number of moves necessary to move a tower of n
 * Hanoi disks from the initial post to the third post.
 */
public class HanoiTowers {
  private static final int TOWER_SIZE = 10;
  private int moves = 0;

  public static void main(String[] args) {
    HanoiTowers myTowers = new HanoiTowers();
    myTowers.launch();
  }

  /**
   * Recursive method that calculates how many moves it would take to move
   * disks from the starting tower to the final one.
   *
   * @param disks the number of disks remaining in the tower
   */
  private void moveTowers(int disks) {
    if (disks == 1) {
      moves++;
    } else {
      moveTowers(disks - 1);
      moves++;
      moveTowers(disks - 1);
    }
  }

  private void launch() {
    System.out.println("Number of moves required to move " + TOWER_SIZE + " "
        + "disks from the first to the third post:");
    moveTowers(TOWER_SIZE);
    System.out.println(moves);
  }
}
