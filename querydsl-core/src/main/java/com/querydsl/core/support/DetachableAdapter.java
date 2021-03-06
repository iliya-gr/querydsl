/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.querydsl.core.support;

import javax.annotation.Nullable;

import com.querydsl.core.Detachable;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.expr.BooleanExpression;
import com.querydsl.core.types.expr.ComparableExpression;
import com.querydsl.core.types.expr.DateExpression;
import com.querydsl.core.types.expr.DateTimeExpression;
import com.querydsl.core.types.expr.NumberExpression;
import com.querydsl.core.types.expr.StringExpression;
import com.querydsl.core.types.expr.TimeExpression;
import com.querydsl.core.types.query.BooleanSubQuery;
import com.querydsl.core.types.query.ComparableSubQuery;
import com.querydsl.core.types.query.DateSubQuery;
import com.querydsl.core.types.query.DateTimeSubQuery;
import com.querydsl.core.types.query.ListSubQuery;
import com.querydsl.core.types.query.NumberSubQuery;
import com.querydsl.core.types.query.SimpleSubQuery;
import com.querydsl.core.types.query.StringSubQuery;
import com.querydsl.core.types.query.TimeSubQuery;

/**
 * DetachableAdapter is an apadater implementation for the Detachable interface
 * 
 * @author tiwe
 *
 */
public class DetachableAdapter implements Detachable{

    @Nullable
    private Detachable detachable;

    public DetachableAdapter() {}
    
    public DetachableAdapter(Detachable detachable) {
        this.detachable = detachable;
    }
    
    public NumberSubQuery<Long> count() {
        return detachable.count();
    }

    public BooleanExpression exists() {
        return detachable.exists();
    }

    public Detachable getDetachable() {
        return detachable;
    }

    public ListSubQuery<Tuple> list(Expression<?> first, Expression<?> second, 
            Expression<?>... rest) {
        return detachable.list(first, second, rest);
    }

    public ListSubQuery<Tuple> list(Expression<?>... args) {
        return detachable.list(args);
    }

    public <RT> ListSubQuery<RT> list(Expression<RT> projection) {
        return detachable.list(projection);
    }

    @Override
    public ListSubQuery<Tuple> list(Object... args) {
        return detachable.list(args);
    }

    public BooleanExpression notExists() {
        return detachable.notExists();
    }

    protected void setDetachable(Detachable detachable) {
        this.detachable = detachable;
    }

    public <RT extends Comparable<?>> ComparableSubQuery<RT> unique(ComparableExpression<RT> projection) {
        return detachable.unique(projection);
    }

    public <RT extends Comparable<?>> DateSubQuery<RT> unique(DateExpression<RT> projection) {
        return detachable.unique(projection);
    }

    public <RT extends Comparable<?>> DateTimeSubQuery<RT> unique(DateTimeExpression<RT> projection) {
        return detachable.unique(projection);
    }

    public SimpleSubQuery<Tuple> unique(Expression<?> first, Expression<?> second, Expression<?>... rest) {
        return detachable.unique(first, second, rest);
    }

    public SimpleSubQuery<Tuple> unique(Expression<?>... args) {
        return detachable.unique(args);
    }

    public <RT> SimpleSubQuery<RT> unique(Expression<RT> projection) {
        return detachable.unique(projection);
    }

    public <RT extends Number & Comparable<?>> NumberSubQuery<RT> unique(NumberExpression<RT> projection) {
        return detachable.unique(projection);
    }

    public BooleanSubQuery unique(Predicate projection) {
        return detachable.unique(projection);
    }
    
    public StringSubQuery unique(StringExpression projection) {
        return detachable.unique(projection);
    }

    public <RT extends Comparable<?>> TimeSubQuery<RT> unique(TimeExpression<RT> projection) {
        return detachable.unique(projection);
    }

    @Override
    public SimpleSubQuery<Tuple> unique(Object... args) {
        return detachable.unique(args);
    }

}
