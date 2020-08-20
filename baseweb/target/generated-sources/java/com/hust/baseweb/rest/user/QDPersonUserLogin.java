package com.hust.baseweb.rest.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDPersonUserLogin is a Querydsl query type for DPersonUserLogin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDPersonUserLogin extends EntityPathBase<DPersonUserLogin> {

    private static final long serialVersionUID = -329691380L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDPersonUserLogin dPersonUserLogin = new QDPersonUserLogin("dPersonUserLogin");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final DateTimePath<java.util.Date> disabledDateTime = createDateTime("disabledDateTime", java.util.Date.class);

    public final BooleanPath enabled = createBoolean("enabled");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final com.hust.baseweb.entity.QParty party;

    public final ListPath<com.hust.baseweb.entity.SecurityGroup, com.hust.baseweb.entity.QSecurityGroup> roles = this.<com.hust.baseweb.entity.SecurityGroup, com.hust.baseweb.entity.QSecurityGroup>createList("roles", com.hust.baseweb.entity.SecurityGroup.class, com.hust.baseweb.entity.QSecurityGroup.class, PathInits.DIRECT2);

    public final StringPath userLoginId = createString("userLoginId");

    public QDPersonUserLogin(String variable) {
        this(DPersonUserLogin.class, forVariable(variable), INITS);
    }

    public QDPersonUserLogin(Path<? extends DPersonUserLogin> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDPersonUserLogin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDPersonUserLogin(PathMetadata metadata, PathInits inits) {
        this(DPersonUserLogin.class, metadata, inits);
    }

    public QDPersonUserLogin(Class<? extends DPersonUserLogin> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.party = inits.isInitialized("party") ? new com.hust.baseweb.entity.QParty(forProperty("party"), inits.get("party")) : null;
    }

}

