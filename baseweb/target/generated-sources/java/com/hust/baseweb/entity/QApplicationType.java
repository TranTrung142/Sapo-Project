package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QApplicationType is a Querydsl query type for ApplicationType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QApplicationType extends EntityPathBase<ApplicationType> {

    private static final long serialVersionUID = 1838172093L;

    public static final QApplicationType applicationType = new QApplicationType("applicationType");

    public final StringPath applicationTypeId = createString("applicationTypeId");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public QApplicationType(String variable) {
        super(ApplicationType.class, forVariable(variable));
    }

    public QApplicationType(Path<? extends ApplicationType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApplicationType(PathMetadata metadata) {
        super(ApplicationType.class, metadata);
    }

}

