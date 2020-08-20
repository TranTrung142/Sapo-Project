package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStatusType is a Querydsl query type for StatusType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStatusType extends EntityPathBase<StatusType> {

    private static final long serialVersionUID = 1999356761L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStatusType statusType = new QStatusType("statusType");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final QStatusType parentType;

    public QStatusType(String variable) {
        this(StatusType.class, forVariable(variable), INITS);
    }

    public QStatusType(Path<? extends StatusType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStatusType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStatusType(PathMetadata metadata, PathInits inits) {
        this(StatusType.class, metadata, inits);
    }

    public QStatusType(Class<? extends StatusType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parentType = inits.isInitialized("parentType") ? new QStatusType(forProperty("parentType"), inits.get("parentType")) : null;
    }

}

