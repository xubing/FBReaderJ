/*
 * Copyright (C) 2007-2012 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.formats.fb2;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.image.ZLImage;

import org.geometerplus.fbreader.bookmodel.BookModel;
import org.geometerplus.fbreader.bookmodel.BookReadingException;
import org.geometerplus.fbreader.library.Book;
import org.geometerplus.fbreader.formats.*;

public class FB2ZipExternalPlugin extends ExternalFormatPlugin {

	public FB2ZipExternalPlugin() {
		super("fb2.zip", new FB2ZipPlugin());
	}

	public ZLFile prepareFile(ZLFile f) {
		return super.prepareFile(FB2ZipPlugin.getTrueFile(f));
	}
}