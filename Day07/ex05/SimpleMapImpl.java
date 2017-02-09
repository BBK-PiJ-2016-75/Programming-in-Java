package ex05;

/**
 * An implementation of a simple map, associating a string to an integer key.
 */
public class SimpleMapImpl implements SimpleMap {
  private static final int MAP_SIZE = 20;
  private String[] map = new String[MAP_SIZE];

  @Override
  public void put(int key, String name) {
    if (key < 0 || key > MAP_SIZE) {
      System.out.println("That is an invalid entry for the dictionary, sorry.");
    } else if (map[key] == null) {
      map[key] = name;
    } else {
      System.out.println("That key has already been taken, sorry.");
    }
  }

  @Override
  public String get(int key) {
    return map[key];
  }

  @Override
  public void remove(int key) {
    map[key] = null;
  }

  @Override
  public boolean isEmpty() {
    boolean empty = true;
    for (int i = 0; i < MAP_SIZE; i++) {
      if (map[i] != null) {
        empty = false;
      }
    }
    return empty;
  }
}
