package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParty is a Querydsl query type for Party
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParty extends EntityPathBase<Party> {

    private static final long serialVersionUID = -749818439L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParty party = new QParty("party");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final StringPath description = createString("description");

    public final BooleanPath isUnread = createBoolean("isUnread");

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath name = createString("name");

    public final StringPath partyCode = createString("partyCode");

    public final ComparablePath<java.util.UUID> partyId = createComparable("partyId", java.util.UUID.class);

    public final QStatus partyStatus;

    public final QPartyType type;

    public final QUserLogin userLogin;

    public QParty(String variable) {
        this(Party.class, forVariable(variable), INITS);
    }

    public QParty(Path<? extends Party> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QParty(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QParty(PathMetadata metadata, PathInits inits) {
        this(Party.class, metadata, inits);
    }

    public QParty(Class<? extends Party> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.partyStatus = inits.isInitialized("partyStatus") ? new QStatus(forProperty("partyStatus"), inits.get("partyStatus")) : null;
        this.type = inits.isInitialized("type") ? new QPartyType(forProperty("type"), inits.get("type")) : null;
        this.userLogin = inits.isInitialized("userLogin") ? new QUserLogin(forProperty("userLogin"), inits.get("userLogin")) : null;
    }

}

