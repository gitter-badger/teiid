/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teiid.language;

import java.util.Iterator;
import java.util.List;

import org.teiid.language.visitor.LanguageObjectVisitor;

/**
 * Represents an UPDATE command in the language objects.
 */
public class Update extends BaseLanguageObject implements BulkCommand {

    private NamedTable table;
    private List<SetClause> changes;
    private Condition where;
    private Iterator<? extends List<?>> parameterValues;

    public Update(NamedTable group, List<SetClause> changes, Condition criteria) {
        this.table = group;
        this.changes = changes;
        this.where = criteria;
    }

    public NamedTable getTable() {
        return table;
    }

    public List<SetClause> getChanges() {
        return changes;
    }

    public Condition getWhere() {
        return where;
    }

    public void acceptVisitor(LanguageObjectVisitor visitor) {
        visitor.visit(this);
    }

    public void setTable(NamedTable group) {
        this.table = group;
    }

    public void setChanges(List<SetClause> changes) {
        this.changes = changes;
    }

    public void setWhere(Condition criteria) {
        this.where = criteria;
    }

    @Override
    public Iterator<? extends List<?>> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Iterator<? extends List<?>> parameterValues) {
        this.parameterValues = parameterValues;
    }

}
