/**
 * mycollab-reporting - Parent pom providing dependency and plugin management for applications
		built with Maven
 * Copyright © ${project.inceptionYear} MyCollab (support@mycollab.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.reporting;

import com.mycollab.core.MyCollabException;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
public enum ReportExportType {
    CSV, EXCEL, PDF, DOCX;

    public String getDefaultFileName() {
        switch (this) {
            case CSV:
                return "export.csv";
            case PDF:
                return "export.pdf";
            case EXCEL:
                return "export.xlsx";
            case DOCX:
                return "docx";
            default:
                throw new MyCollabException("Do not support export type " + this);
        }
    }
}
