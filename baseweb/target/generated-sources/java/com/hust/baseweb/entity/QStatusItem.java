package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStatusItem is a Querydsl query type for StatusItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStatusItem extends EntityPathBase<StatusItem> {

    private static final long serialVersionUID = 1999023922L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStatusItem statusItem = new QStatusItem("statusItem");

    public final StringPath description = createString("description");

    public final StringPath statusCode = createString("statusCode");

    public final StringPath statusId = createString("statusId");

    public final QStatusType type;

    public QStatusItem(String variable) {
        this(StatusItem.class, forVariable(variable), INITS);
    }

    public QStatusItem(Path<? extends StatusItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStatusItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStatusItem(PathMetadata metadata, PathInits inits) {
        this(StatusItem.class, metadata, inits);
    }

    public QStatusItem(Class<? extends StatusItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.type = inits.isInitialized("type") ? new QStatusType(forProperty("type"), inits.get("type")) : null;
    }

}

