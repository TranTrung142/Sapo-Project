package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartyType is a Querydsl query type for PartyType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPartyType extends EntityPathBase<PartyType> {

    private static final long serialVersionUID = 210185363L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartyType partyType = new QPartyType("partyType");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final StringPath description = createString("description");

    public final BooleanPath hasTable = createBoolean("hasTable");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final QPartyType parentType;

    public final StringPath partyTypeId = createString("partyTypeId");

    public QPartyType(String variable) {
        this(PartyType.class, forVariable(variable), INITS);
    }

    public QPartyType(Path<? extends PartyType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartyType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartyType(PathMetadata metadata, PathInits inits) {
        this(PartyType.class, metadata, inits);
    }

    public QPartyType(Class<? extends PartyType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parentType = inits.isInitialized("parentType") ? new QPartyType(forProperty("parentType"), inits.get("parentType")) : null;
    }

}

