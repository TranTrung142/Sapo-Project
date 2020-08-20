package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartyRelationship is a Querydsl query type for PartyRelationship
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPartyRelationship extends EntityPathBase<PartyRelationship> {

    private static final long serialVersionUID = 814918289L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartyRelationship partyRelationship = new QPartyRelationship("partyRelationship");

    public final DateTimePath<java.util.Date> fromDate = createDateTime("fromDate", java.util.Date.class);

    public final QParty fromParty;

    public final ComparablePath<java.util.UUID> partyRelationshipId = createComparable("partyRelationshipId", java.util.UUID.class);

    public final QRoleType roleType;

    public final DateTimePath<java.util.Date> thruDate = createDateTime("thruDate", java.util.Date.class);

    public final QParty toParty;

    public QPartyRelationship(String variable) {
        this(PartyRelationship.class, forVariable(variable), INITS);
    }

    public QPartyRelationship(Path<? extends PartyRelationship> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartyRelationship(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartyRelationship(PathMetadata metadata, PathInits inits) {
        this(PartyRelationship.class, metadata, inits);
    }

    public QPartyRelationship(Class<? extends PartyRelationship> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fromParty = inits.isInitialized("fromParty") ? new QParty(forProperty("fromParty"), inits.get("fromParty")) : null;
        this.roleType = inits.isInitialized("roleType") ? new QRoleType(forProperty("roleType")) : null;
        this.toParty = inits.isInitialized("toParty") ? new QParty(forProperty("toParty"), inits.get("toParty")) : null;
    }

}

