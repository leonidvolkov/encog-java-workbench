/*
 * Encog(tm) Workbanch v3.1 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2012 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.workbench.tabs.files;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.encog.workbench.EncogWorkBench;
import org.encog.workbench.frames.document.tree.ProjectFile;
import org.encog.workbench.tabs.files.text.BasicTextTab;
import org.encog.workbench.util.EncogFonts;
import org.encog.workbench.util.FileUtil;

public class TextFileTab extends BasicTextTab {
		
	public TextFileTab(ProjectFile file) {
		super(file);
	
	}	
}
