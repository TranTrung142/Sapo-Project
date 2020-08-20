package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPerson is a Querydsl query type for Person
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPerson extends EntityPathBase<Person> {

    private static final long serialVersionUID = -1765842206L;

    public static final QPerson person = new QPerson("person");

    public final DatePath<java.sql.Date> birthDate = createDate("birthDate", java.sql.Date.class);

    public final StringPath firstName = createString("firstName");

    public final StringPath gender = createString("gender");

    public final StringPath lastName = createString("lastName");

    public final StringPath middleName = createString("middleName");

    public final ComparablePath<java.util.UUID> partyId = createComparable("partyId", java.util.UUID.class);

    public QPerson(String variable) {
        super(Person.class, forVariable(variable));
    }

    public QPerson(Path<? extends Person> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPerson(PathMetadata metadata) {
        super(Person.class, metadata);
    }

}

