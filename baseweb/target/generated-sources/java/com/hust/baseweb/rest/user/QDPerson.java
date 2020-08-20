package com.hust.baseweb.rest.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDPerson is a Querydsl query type for DPerson
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDPerson extends EntityPathBase<DPerson> {

    private static final long serialVersionUID = -283096206L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDPerson dPerson = new QDPerson("dPerson");

    public final StringPath createdBy = createString("createdBy");

    public final DatePath<java.sql.Date> createdDate = createDate("createdDate", java.sql.Date.class);

    public final DatePath<java.sql.Date> createdStamp = createDate("createdStamp", java.sql.Date.class);

    public final StringPath description = createString("description");

    public final BooleanPath isUnread = createBoolean("isUnread");

    public final DatePath<java.sql.Date> lastUpdatedStamp = createDate("lastUpdatedStamp", java.sql.Date.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath partyCode = createString("partyCode");

    public final ComparablePath<java.util.UUID> partyId = createComparable("partyId", java.util.UUID.class);

    public final com.hust.baseweb.entity.QPerson person;

    public final com.hust.baseweb.entity.QStatus status;

    public final com.hust.baseweb.entity.QPartyType type;

    public final QDPersonUserLogin userLogin;

    public QDPerson(String variable) {
        this(DPerson.class, forVariable(variable), INITS);
    }

    public QDPerson(Path<? extends DPerson> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDPerson(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDPerson(PathMetadata metadata, PathInits inits) {
        this(DPerson.class, metadata, inits);
    }

    public QDPerson(Class<? extends DPerson> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.person = inits.isInitialized("person") ? new com.hust.baseweb.entity.QPerson(forProperty("person")) : null;
        this.status = inits.isInitialized("status") ? new com.hust.baseweb.entity.QStatus(forProperty("status"), inits.get("status")) : null;
        this.type = inits.isInitialized("type") ? new com.hust.baseweb.entity.QPartyType(forProperty("type"), inits.get("type")) : null;
        this.userLogin = inits.isInitialized("userLogin") ? new QDPersonUserLogin(forProperty("userLogin"), inits.get("userLogin")) : null;
    }

}

