package net.ddns.kaigrealms.fluo;

import org.bukkit.configuration.file.YamlConfiguration;

/**
 * .
 * @author herbykit
 */
public class ConfigManager {
  
  /**
   * .
   * @return The YAMLConfiguration
   */
  public static YamlConfiguration loadConfig() {
    // take a parameter and read it into config
    return new YamlConfiguration();
  }
  
  /**
   * .
   */
  public static void saveConfig() {
    
  }
  
  /**
   * .
   * @return The YAMLConfiguration when refreshed
   */
  public static YamlConfiguration refreshConfig() {
    saveConfig();
    return loadConfig();
  }
}
