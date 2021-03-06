
/*
  File: GridBagGroup.java 
  
  Copyright (c) 2006, The Cytoscape Consortium (www.cytoscape.org)
  
  The Cytoscape Consortium is: 
  - Institute for Systems Biology
  - University of California San Diego
  - Memorial Sloan-Kettering Cancer Center
  - Institut Pasteur
  - Agilent Technologies
  
  This library is free software; you can redistribute it and/or modify it
  under the terms of the GNU Lesser General Public License as published
  by the Free Software Foundation; either version 2.1 of the License, or
  any later version.
  
  This library is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
  MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
  documentation provided hereunder is on an "as is" basis, and the
  Institute for Systems Biology and the Whitehead Institute 
  have no obligations to provide maintenance, support,
  updates, enhancements or modifications.  In no event shall the
  Institute for Systems Biology and the Whitehead Institute 
  be liable to any party for direct, indirect, special,
  incidental or consequential damages, including lost profits, arising
  out of the use of this software and its documentation, even if the
  Institute for Systems Biology and the Whitehead Institute 
  have been advised of the possibility of such damage.  See
  the GNU Lesser General Public License for more details.
  
  You should have received a copy of the GNU Lesser General Public License
  along with this library; if not, write to the Free Software Foundation,
  Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/

// GridBagGroup.java:  more GridBagLayout utilities


//--------------------------------------------------------------------------------------
// $Revision: 7760 $
// $Date: 2006-06-26 09:28:49 -0700 (Mon, 26 Jun 2006) $
// $Author: mes $
//--------------------------------------------------------------------------------------
package cytoscape.dialogs;
//--------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

//------------------------------------------------------------------------------
public class GridBagGroup {
    public JPanel panel;
    public GridBagLayout gridbag;
    public GridBagConstraints constraints;
    public GridBagGroup() {
	panel = new JPanel();
	init();
    }
    public GridBagGroup(JPanel panel) {
	this.panel = panel;
	init();
    }
    private void init() {
	gridbag = new GridBagLayout();
	constraints = new GridBagConstraints();
	panel.setLayout(gridbag);
    }
    public GridBagGroup(String title) {
	panel = new JPanel();
	init();
	Border border = BorderFactory.createLineBorder (Color.black);
	Border titledBorder = 
	    BorderFactory.createTitledBorder (border,
					      title,
					      TitledBorder.CENTER, 
					      TitledBorder.DEFAULT_POSITION);
	panel.setBorder (titledBorder);
    }
}



