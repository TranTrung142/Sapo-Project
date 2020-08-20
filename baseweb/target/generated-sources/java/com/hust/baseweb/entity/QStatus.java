package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStatus is a Querydsl query type for Status
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStatus extends EntityPathBase<Status> {

    private static final long serialVersionUID = -1666607233L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStatus status = new QStatus("status");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final StringPath sequenceId = createString("sequenceId");

    public final StringPath statusCode = createString("statusCode");

    public final QStatusType type;

    public QStatus(String variable) {
        this(Status.class, forVariable(variable), INITS);
    }

    public QStatus(Path<? extends Status> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStatus(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStatus(PathMetadata metadata, PathInits inits) {
        this(Status.class, metadata, inits);
    }

    public QStatus(Class<? extends Status> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.type = inits.isInitialized("type") ? new QStatusType(forProperty("type"), inits.get("type")) : null;
    }

}

