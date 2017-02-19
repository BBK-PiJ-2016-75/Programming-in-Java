package com.github.bbkpij201675.programminginjava.day07.ex05;

/**
 * Map from integer to Strings.
 */
public interface SimpleMap {

  /**
   * Puts a new String in the map.
   * If the key is already in the map, nothing is done.
   * @param key the key location to add.
   * @param name the string to link to the key.
   */
  void put(int key, String name);

  /**
   * Returns the name associated with that key, or null if there is none.
   * @param key the key location to retrieve.
   * @return the value of the given key location.
   */
  String get(int key);

  /**
   * Removes a name from the map. Future calls to get(key) will return null
   * for this key unless another name is added with the same key.
   * @param key the key location to remove from the map.
   */
  void remove(int key);

  /**
   * Checks if the map is empty or not.
   * @return true if there are no workers in the map, false otherwise.
   */
  boolean isEmpty();
}
