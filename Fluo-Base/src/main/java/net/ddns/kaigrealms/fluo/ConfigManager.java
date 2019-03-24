package net.ddns.kaigrealms.fluo;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

/**
 * .
 * @author herbykit
 */
public class ConfigManager {
  
  private static YamlConfiguration config;
  
  /**
   * Returns the YamlConfiguration
   * @return The YAMLConfiguration
   */
  public static YamlConfiguration loadConfig() {
    // take a parameter and read it into config
    config = YamlConfiguration.loadConfiguration(new File("Fluo-Base/config.yml"));
    return config;
  }
  
  /**
   * Saves the config file and closes it
   */
  public static void saveConfig() {
    try {
      config.save("Fluo-Base/config.yml");
      config = null;
    } catch (IOException e) {
      System.out.println("Config cannot be saved to");
    }
  }
  
  public static YamlConfiguration getConfig() {
    if(config == null) return loadConfig();
    return config;
  }
  
  /**
   * Reloads the config file so that it can be refreshed without restarting the server
   * @return The YAMLConfiguration when refreshed
   */
  public static YamlConfiguration refreshConfig() {
    saveConfig();
    return loadConfig();
  }
}
