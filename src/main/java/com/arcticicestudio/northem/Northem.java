/*
+++++++++++++++++++++++++++++++++++++++++++
title     Northem                         +
project   northem-java                    +
file      Northem.java                    +
version   0.2.0                           +
author    Arctic Ice Studio               +
email     development@arcticicestudio.com +
website   http://arcticicestudio.com      +
copyright Copyright (C) 2016              +
created   2016-01-20 14:25 UTC+0100       +
modified  2016-04-09 12:17 UTC+0200       +
+++++++++++++++++++++++++++++++++++++++++++

[Description]
"Northem" color palette as enumeration for the "Northem - Java" project.

[Copyright]
Copyright (C) 2016 Arctic Ice Studio <development@arcticicestudio.com>

[References]
Northem
  (https://github.com/arcticicestudio/northem)
Java 8 API Documentation
  (https://docs.oracle.com/javase/8/docs/api/)
JavaFX 2.2 API Documentation
  (https://docs.oracle.com/javafx/2/api/)
JavaFX 2.2 Oracle Project Website
  (http://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
Arctic Versioning Specification
  (http://specs.arcticicestudio.com/arcver) (ArcVer)
*/
package com.arcticicestudio.northem;

import javafx.scene.paint.Color;
import java.util.regex.Pattern;

/**
 * <a href="https://github.com/arcticicestudio/northem">Northem</a> color palette
  * as enumeration of the <a href="https://github.com/arcticicestudio/northem-java">Northem - Java</a> project.
 * <div>
 *   <table style="display:inline-block">
 *     <thead>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(45,45,46);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(51,51,52);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(56,56,57);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(96,96,98);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(222,222,222);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(236,238,239);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(144,205,199);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(134,193,210);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(136,178,205);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(92,129,174);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(223,117,116);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(252,206,133);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(239,160,112);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(200,203,121);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(194,162,201);margin: 0"></th>
 *     </thead>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see <a href="https://github.com/arcticicestudio/northem">"Northem" GitHub Repository</a>
 * @see <a href="https://github.com/arcticicestudio/northem-java">"Northem - Java" GitHub Repository</a>
 * @since 0.1.0
 */
public enum Northem {
  /**
   * The color {@code darkest-gray} with an RGB value of {@code rgb(45,45,46)} and HEX value of {@code #2D2D2E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(45,45,46);margin: 0"></div>
   */
  DARKEST_GRAY(45,45,46),
  /**
   * The color {@code dark-gray} with an RGB value of {@code rgb(51,51,52)} and HEX value of {@code #333334}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(51,51,52);margin: 0"></div>
   */
  DARK_GRAY(51,51,52),
  /**
   * The color {@code gray} with an RGB value of {@code rgb(56,56,57)} and HEX value of {@code #383839}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(56,56,57);margin: 0"></div>
   */
  GRAY(56,56,57),
  /**
   * The color {@code light-gray} with an RGB value of {@code rgb(96,96,98)} and HEX value of {@code #606062}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(96,96,98);margin: 0"></div>
   */
  LIGHT_GRAY(96,96,98),
  /**
   * The color {@code dirty-white} with an RGB value of {@code rgb(222,222,222)} and HEX value of {@code #DEDEDE}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(222,222,222);margin: 0"></div>
   */
  DIRTY_WHITE(222,222,222),
  /**
   * The color {@code white} with an RGB value of {@code rgb(236,238,239)} and HEX value of {@code #ECEEEF}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(236,238,239);margin: 0"></div>
   */
  WHITE(236,238,239),
  /**
   * The color {@code aqua} with an RGB value of {@code rgb(144,205,199)} and HEX value of {@code #90CDC7}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(144,205,199);margin: 0"></div>
   */
  AQUA(144,205,199),
  /**
   * The color {@code light-blue} with an RGB value of {@code rgb(134,193,210)} and HEX value of {@code #86C1D2}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(134,193,210);margin: 0"></div>
   */
  LIGHT_BLUE(134,193,210),
  /**
   * The color {@code blue} with an RGB value of {@code rgb(136,178,205)} and HEX value of {@code #88B2CD}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(136,178,205);margin: 0"></div>
   */
  BLUE(136,178,205),
  /**
   * The color {@code dark-blue} with an RGB value of {@code rgb(92,129,174)} and HEX value of {@code #5C81AE}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(92,129,174);margin: 0"></div>
   */
  DARK_BLUE(92,129,174),
  /**
   * The color {@code red} with an RGB value of {@code rgb(223,117,116)} and HEX value of {@code #DF7574}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(223,117,116);margin: 0"></div>
   */
  RED(223,117,116),
  /**
   * The color {@code yellow} with an RGB value of {@code rgb(252,206,133)} and HEX value of {@code #FCCE85}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(252,206,133);margin: 0"></div>
   */
  YELLOW(252,206,133),
  /**
   * The color {@code orange} with an RGB value of {@code rgb(239,160,112)} and HEX value of {@code #EFA070}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(239,160,112);margin: 0"></div>
   */
  ORANGE(239,160,112),
  /**
   * The color {@code lime} with an RGB value of {@code rgb(200,203,121)} and HEX value of {@code #C8CB79}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(200,203,121);margin: 0"></div>
   */
  LIME(200,203,121),
  /**
   * The color {@code purple} with an RGB value of {@code rgb(194,162,201)} and HEX value of {@code #C2A2C9}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(194,162,201);margin: 0"></div>
   */
  PURPLE(194,162,201);

  /**
   * Compiled pattern to convert the RGB and HEX color values.
   */
  private static final Pattern COLOR_PREFIX = Pattern.compile("0x", Pattern.LITERAL);

  /**
   * Contains the RGB color code.
   */
  private final Color COLOR;

  /**
   * Constructs a new color object.
   *
   * @param RED The value for the additive primary color {@code red}
   * @param GREEN The value for the additive primary color {@code green}
   * @param BLUE The value for the additive primary color {@code blue}
   */
  Northem(final int RED, final int GREEN, final int BLUE) {
    COLOR = Color.rgb(RED, GREEN, BLUE);
  }

  /**
   * Converts the color to the {@code RGB} identifier.
   *
   * @param COLOR The color object
   * @return a string representation of the {@code RGB} identifier
   */
  public static String rgb(final Color COLOR) {
    String hex = COLOR_PREFIX.matcher(COLOR.toString()).replaceAll("");
    String hexRed = hex.substring(0, 2).toUpperCase();
    String hexGreen = hex.substring(2, 4).toUpperCase();
    String hexBlue = hex.substring(4, 6).toUpperCase();

    String intRed = Integer.toString(Integer.parseInt(hexRed, 16));
    String intGreen = Integer.toString(Integer.parseInt(hexGreen, 16));
    String intBlue = Integer.toString(Integer.parseInt(hexBlue, 16));

    return String.join("", "rgb(", intRed, ", ", intGreen, ", ", intBlue, ")");
  }

  /**
   * Converts the color to the {@code HEX} identifier.
   *
   * @param COLOR The color object
   * @return a string representation of the {@code HEX} identifier
   */
  public static String hex(final Color COLOR) {
    return COLOR_PREFIX.matcher(COLOR.toString()).replaceAll("#").substring(0, 7).toUpperCase();
  }

  /**
   * Returns the color object.
   *
   * @return the color object
   */
  public Color get() {
    return COLOR;
  }
}
