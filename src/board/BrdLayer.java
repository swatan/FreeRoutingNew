/*
 *  Copyright (C) 2014  Alfons Wirtz  
 *   website www.freerouting.net
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License at <http://www.gnu.org/licenses/> 
 *   for more details.
 *
 * Layer.java
 *
 * Created on 26. Mai 2004, 06:31
 */

package board;

/**
 * Describes the structure of a board layer.
 * One issue in mergin info int this object is that the "creation time" is not consistent, meaning that some info are aquired
 * at some point in time and others at another point...
 * @author alfons
 */
public final class BrdLayer implements java.io.Serializable, Comparable<BrdLayer>
   {
   private static final long serialVersionUID = 1L;

   public final int layer_no;
   public final String name;
   // True, if this is a signal layer, which can be used for routing. Otherwise it may be for example a power ground layer.
   public final boolean is_signal;

   
   public BrdLayer(int p_layer_no, String p_name, boolean p_is_signal)
      {
      layer_no  = p_layer_no;
      name      = p_name;
      is_signal = p_is_signal;
      }

   public int get_no ()
      {
      return layer_no;
      }

   @Override
   public String toString()
      {
      return name;
      }

   @Override
   public int compareTo(BrdLayer p_layer)
      {
      if ( p_layer == null ) return -1;
      
      return layer_no - p_layer.layer_no;
      }

   }
